/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.myhello.itmentor.Person;

import java.util.List;
import ru.myhello.itmentor.Person.Exception.DublicatePerson;
import ru.myhello.itmentor.Person.Model.Person;
import ru.myhello.itmentor.Person.PersonGenerator.PersonGenerator;
import ru.myhello.itmentor.Person.Sort.SortBubbleListPerson;
import ru.myhello.itmentor.Person.Sort.SortPersonListInterface;
import ru.myhello.itmentor.Person.Sort.SortSelectionListPerson;

/**
 *
 * @author alenk
 */
public class Application {
    public static void main(String[] args) throws DublicatePerson {
        SortPersonListInterface sortList;
        System.out.println("--------------------------------------------");
        long start = System.currentTimeMillis();
        List<Person> people = PersonGenerator.generatePersonList(10);
        sortList = new SortBubbleListPerson(people);
        sortList.sort();
        for (Person person : people) {
            System.out.println(person);
        }
        long finish = System.currentTimeMillis();
        System.out.println("Время выполнения: " + (finish - start) + "ms");
        start = System.currentTimeMillis();
        people = PersonGenerator.generatePersonList(10);
        sortList = new SortSelectionListPerson(people);
        sortList.sort();
        for (Person person : people) {
            System.out.println(person);
        }
        finish = System.currentTimeMillis();
        System.out.println("Время выполнения: " + (finish - start) + "ms");
    }
    
}
