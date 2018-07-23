
public class Votertest {
    public static void main(String[] args) {
    Voter v1 = new Voter("Hasan", "001227593", 70);
    Voter v2 = new Voter("Mahmud", "001227593", 70);
    boolean isSamePerson = v1.id == v2.id && v1.age == v2.age;
    System.out.println(isSamePerson);
    }
}
