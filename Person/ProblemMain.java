/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oop.bambooA;

import com.oop.bambooB.Student;
import com.oop.bambooC.Person;

/**
 *
 * @author DOLPHIN
 */
public class ProblemMain {
    public static void main(String[] args) {
    Student student= new Student("011151");
    Person person = student;
    ClubMember clubMember = new ClubMember("","");
    person.printInfo();
    System.out.println(Person.name);
    }

}
