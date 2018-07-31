
package com.oop.bambooB;
import com.oop.bambooC.Person;


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
