
package animalhereditytest;

public class Cat extends Animal{
    private String color;

    public Cat(String color, String vegetarian, String eats, int noOfLegs) {
        super(vegetarian, eats, noOfLegs);
        this.color = color;
    }

    public String getColor() {
        return color;
    }  
}
