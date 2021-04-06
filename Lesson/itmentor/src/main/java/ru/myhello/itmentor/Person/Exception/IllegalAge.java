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
public class IllegalAge extends Exception {

    public IllegalAge() {
        super("Illegal age. Age must be between 0 to 100!");
    }
    
}
