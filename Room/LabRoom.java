/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DOLPHIN
 */
public class LabRoom extends Room{
    private String attendantName;
    private String[] courseList = new String[100];

    public LabRoom(String attendantName, String roomNo) {
        super(roomNo);
        this.attendantName = attendantName;
    }

    public String getAttendantName() {
        return attendantName;
    }

    public void setAttendantName(String attendantName) {
        this.attendantName = attendantName;
    }

    public String[] getCourseList() {
        return courseList;
    }

    public void setCourseList(String[] courseList) {
        this.courseList = courseList;
    }
    public boolean checkCourseInLab(String course){
        for(int i = 0; i < courseList.length; i ++){
            if(courseList[i] == course){
                return true;
            }
        }
        return false;
    }
    
    
}
