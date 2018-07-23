
package animalhereditytest;

import java.util.Scanner;
public class AnimalHeredityTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vegetarian = sc.nextLine();
        String eats = sc.nextLine();
        int noOfLegs = sc.nextInt();
        sc.nextLine();
        String color = sc.nextLine();
     
        
        Cat c1 = new Cat(color, vegetarian, eats, noOfLegs);
        System.out.println(c1.getVegetarian());
        System.out.println(c1.getEats());
        System.out.println(c1.getNoOfLegs());
        System.out.println(c1.getColor());
        
    }
    
}
