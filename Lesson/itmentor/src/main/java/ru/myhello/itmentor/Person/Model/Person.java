/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.myhello.itmentor.Person.Model;

import java.util.Objects;
import ru.myhello.itmentor.Person.Exception.DublicatePerson;
import ru.myhello.itmentor.Person.Exception.IllegalAge;

/**
 *
 * @author alenk
 */
public class Person {
    private byte age;
    private Sex sex;
    private String name;
   
    // возраст должен быть >=0 и <=100, иначе exception
    public Person(byte age, Sex sex, String name) throws IllegalAge {
        if(age < 0 || age > 100){
            throw new IllegalAge();
        }
        this.age = age;
        this.sex = sex;
        this.name = name;
    }

    public byte getAge() {
        return age;
    }
// возраст должен быть >=0 и <=100, иначе exception
    public void setAge(byte age) throws IllegalAge {
        if(age < 0 || age > 100){
            throw new IllegalAge();
        }
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.age;
        hash = 23 * hash + Objects.hashCode(this.sex);
        hash = 23 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.sex != other.sex) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Person{age = " + getAge() + " ,sex = " + getSex() + " ,name = " + getName() + " }";
    }
    
    public int compareTo(Person person){
        if (this.equals(person)) {
                return 0;
        }
        if ((this.getSex() == Sex.MAN && person.getSex() == Sex.WOMAN)) {
            return 1;
        } else if ((this.getAge() > person.getAge() && (this.getSex() == person.getSex()))) {
            return 1;
        } else if((this.getAge() >= person.getAge() && this.getSex() == person.getSex() && this.getName().compareTo(person.getName()) <= -1)) {
            return 1;
        }
        return -1;
    }
    
}
