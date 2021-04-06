/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.myhello.itmentor.Person.PersonGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import ru.myhello.itmentor.Person.Exception.IllegalAge;
import ru.myhello.itmentor.Person.Model.Person;
import ru.myhello.itmentor.Person.Model.Sex;
import ru.myhello.itmentor.Person.Sort.SortPersonListInterface;

/**
 *
 * @author alenk
 */
public class PersonGenerator {

    // поля с мужскими и женскими именами
    private static final String[] nameManGenerator = {"Tom", "Alex", "Bob", "Ben", "Carl", "Andrew"};
    private static final String[] nameWomanGenerator = {"Alice", "Helen", "Anna", "Marry", "Lucy", "Kodi"};

    public static List<Person> generatePersonList(int size) {
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            try {
                byte age = (byte) Math.abs(new Random().nextInt() % 100);
                Sex sex = new Random().nextInt() > 0 ? Sex.MAN : Sex.WOMAN;
                String name;
                int indexOfName = Math.abs(new Random().nextInt()) % nameManGenerator.length;
                name = sex == Sex.MAN ? nameManGenerator[indexOfName] : nameWomanGenerator[indexOfName];
                people.add(new Person(age, sex, name));
            } catch(IllegalAge ex){
                System.out.println(ex.getMessage());
            }
        }
        return people;
    }
}
