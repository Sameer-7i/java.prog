import java.util.Scanner;

class Student {
    int rollNum;
    String name;
    int age;
    String course;
    String email;

    void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Roll Number: " + rollNum);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Email: " + email);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.print("Enter Roll Number: ");
        s.rollNum = sc.nextInt();

        System.out.print("Enter Name: ");
        s.name = sc.next();

        System.out.print("Enter Age: ");
        s.age = sc.nextInt();

        System.out.print("Enter Course: ");
        s.course = sc.next();

        System.out.print("Enter Email: ");
        s.email = sc.next();

        s.displayDetails();

        sc.close();
    }
}