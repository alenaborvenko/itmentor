/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.myhello.itmentor;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alenk
 */
public class GenerateRandom {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter N: ");
        n = input.nextInt();
        int k,z;
        double q;
        for(int i = 0; i < n; i++){
            try{
                k = new Random().nextInt();
                if( k < 0){
                    throw new MyException();
                }
                q = Math.sqrt((double)k);
                z = (int) q;
                if( z * z ==  k){
                    System.out.println(q);
                }
            } catch(MyException e){
                System.out.println(e.getMessage());
            }
        }
    }    
}
