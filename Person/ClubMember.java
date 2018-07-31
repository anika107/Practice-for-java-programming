
package com.oop.bambooA;

import com.oop.bambooB.Student;


final class ClubMember extends Student{
    public String status;

    public ClubMember(String status, String id) {
        super(id);
        this.status = status;
    }
    public void printStatus(){
        System.out.println(status);
    }
}
