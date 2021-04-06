/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.myhello.itmentor.Person.Exception;

/**
 *
 * @author alenk
 */
public class DublicatePerson extends Exception {

    public DublicatePerson() {
        super("Dublicate person! The same age and name");
    }
    
}
