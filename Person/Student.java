/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oop.bambooB;
import com.oop.bambooC.Person;

/**
 *
 * @author DOLPHIN
 */
public class Student extends Person{
    public String id;
     public Student(String id) {
     this.id = id;
    }
    public final void printInfo(){
        System.out.println(id);
        System.out.println(name);
    }
}
