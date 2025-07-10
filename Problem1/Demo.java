package Problem1;

public class Demo {
    public static void main(String[] args) {
        try {
            Person bob = new Person("Bob Ross", 52, "M");
            System.out.println(bob);

            Student justin = new Student("Justin Greenslade", 33, "M", "12345", 3.5);
            System.out.println(justin);

            Teacher nicolas = new Teacher("Nicolas Cage", 61, "M", "National Treasure", 500000);
            System.out.println(nicolas);

            CollegeStudent jackie = new CollegeStudent("Jackie Chan", 71, "M", "222222", 3.5, 1998, "History of Kung Fu");
            System.out.println(jackie);
        } catch (Exception e) {
            System.out.println("An error occurred during object creation: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
