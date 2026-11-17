
import java.util.HashMap;
import java.util.Scanner;

class StudentManager {

    HashMap<Integer, String> students = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    // ADD STUDENTS
    public void addStudents() {
        System.out.println("ADD STUDENTS");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            students.put(id, name);
        }
    }

    // DISPLAY ALL STUDENTS
    public void displayStudents() {
        System.out.println("\nAll Students:");
        System.out.println(students);
    }

    // DISPLAY A SPECIFIC STUDENT
    public void searchStudent() {
        System.out.print("\nEnter Student ID to search: ");
        int id = sc.nextInt();

        System.out.println("Student Name: " + students.get(id));
    }

    // UPDATE A STUDENT
    public void updateStudent() {
        System.out.print("\nEnter Student ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (students.containsKey(id)) {
            System.out.print("Enter New Student Name: ");
            String name = sc.nextLine();

            students.put(id, name);
            System.out.println("Student Updated!");
        } else {
            System.out.println("Student ID not found!");
        }

        displayStudents();
    }

    // REMOVE A STUDENT
    public void removeStudent() {
        System.out.print("\nEnter Student ID to remove: ");
        int id = sc.nextInt();

        students.remove(id);

        System.out.println("After Removing Student:");
        displayStudents();
    }

    // CHECK IF A KEY EXISTS
    public void checkStudent() {
        System.out.print("\nEnter Student ID to check: ");
        int id = sc.nextInt();

        System.out.println("Is Student ID existing?");
        System.out.println(students.containsKey(id));
    }

    // DISPLAY NUMBER OF STUDENTS
    public void countStudents() {
        System.out.println("\nTotal Students:");
        System.out.println(students.size());
    }

    // CLEAR ALL ELEMENTS
    public void clearStudents() {
        students.clear();

        System.out.println("\nAfter Clearing All Students:");
        displayStudents();
    }
}

public class Main {

    public static void main(String[] args) {

        StudentManager manager = new StudentManager();

        manager.addStudents();
        manager.displayStudents();
        manager.searchStudent();
        manager.updateStudent();
        manager.removeStudent();
        manager.checkStudent();
        manager.countStudents();
        manager.clearStudents();
    }
}
