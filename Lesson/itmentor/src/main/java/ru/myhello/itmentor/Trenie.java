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
public class Trenie {
    public static void main(String[] args){
        try{
            String str = null;
            if(str.equals("message")){
                System.out.println(str);
            }
        } catch (NullPointerException npe){
            System.out.println("NPE");
            return;
        } catch (ArithmeticException are){
            System.out.println("ARE");
        } catch (Exception ex){
            System.out.println("EX");
        } finally {
            System.out.println("Finally");
        }
    }
}
