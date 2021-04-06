/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.myhello.itmentor;


public class HelloWordItMentorLesson2  {
    public static void main(String[] argc){
        String strNull = null;
        int[] arr = {1, 2};
        // NPE
       boolean equals = strNull.equals("MyString");
        //ArrayIndexOutOfBoundsException
        int z = arr[2];
        //throw MyException
        int someVariable = 0;
        if(someVariable == 0){
            throw new MyException();
        }
    }
    
}
