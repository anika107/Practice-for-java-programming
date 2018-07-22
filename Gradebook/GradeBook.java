
import java.util.Scanner;
public class GradeBook {
     private String courseName;

    public GradeBook(String name) {
        courseName = name;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }
    public void displayMessage(){
        System.out.println("Welcome to the gradebook for\n"+ getCourseName());
    }
    public void determineClassAverage(){
        Scanner sc = new Scanner(System.in);
        
        int total, gradecounter, grade, average;
        
        total = 0;
        gradecounter = 1;
        while(gradecounter <= 10){
            System.out.println("Enter grade: ");
            grade = sc.nextInt();
            total += grade;
            gradecounter ++;
        }
        average = total / 10;
        
        System.out.println("Total of all 10 grades is " + total);
        System.out.println("Class average is " + average);
         
    }
    
     
}
