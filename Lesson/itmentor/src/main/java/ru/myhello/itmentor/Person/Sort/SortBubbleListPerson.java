/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.myhello.itmentor.Person.Sort;

import java.util.List;
import ru.myhello.itmentor.Person.Exception.DublicatePerson;
import ru.myhello.itmentor.Person.Model.Person;

/**
 *
 * @author alenk
 */
public class SortBubbleListPerson implements SortPersonListInterface {

    List<Person> sortList;

    public SortBubbleListPerson(List<Person> sortList) {
        this.sortList = sortList;
    }

    @Override
    public void sort() {
        Person temp;
        for (int i = sortList.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                try {
                    if (sortList.get(j).compareTo(sortList.get(j + 1)) == 0) {
                        throw new DublicatePerson();
                    } else if(sortList.get(j).compareTo(sortList.get(j + 1)) < 0) {
                        temp = sortList.get(j + 1);
                        sortList.set(j + 1, sortList.get(j));
                        sortList.set(j, temp);
                    }
                } catch (DublicatePerson ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }

}
