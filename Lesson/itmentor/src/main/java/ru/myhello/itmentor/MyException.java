/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.myhello.itmentor;

/**
 *
 * @author alenk
 */
public class MyException extends IllegalArgumentException{

    public MyException() {
        super("Отрицательный аргумент!");
    }
    
}
