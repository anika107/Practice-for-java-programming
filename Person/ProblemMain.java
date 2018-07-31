
package com.oop.bambooA;

import com.oop.bambooB.Student;
import com.oop.bambooC.Person;

public class ProblemMain {
    public static void main(String[] args) {
    Student student= new Student("011151");
    Person person = student;
    ClubMember clubMember = new ClubMember("","");
    person.printInfo();
    System.out.println(Person.name);
    }

}
