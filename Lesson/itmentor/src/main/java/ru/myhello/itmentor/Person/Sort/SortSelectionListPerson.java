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
public class SortSelectionListPerson implements SortPersonListInterface {

    List<Person> sortList;

    public SortSelectionListPerson(List<Person> sortList) {
        this.sortList = sortList;
    }

    @Override
    public void sort() {
        Person temp;
        for (int i = 0; i < sortList.size() - 1; i++) {
            for (int j = i + 1; j < sortList.size(); j++) {
                try {
                    if (sortList.get(j).compareTo(sortList.get(i)) == 0) {
                        throw new DublicatePerson();
                    } else if(sortList.get(j).compareTo(sortList.get(i)) > 0) {
                        temp = sortList.get(i);
                        sortList.set(i, sortList.get(j));
                        sortList.set(j, temp);
                    }
                } catch (DublicatePerson ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }

}
