/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oop.bambooA;

import com.oop.bambooB.Student;

/**
 *
 * @author DOLPHIN
 */
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
