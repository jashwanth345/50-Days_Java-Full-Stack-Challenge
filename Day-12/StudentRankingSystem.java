import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentRankingSystem {

    static List<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    // Add Student
    public static void addStudent() {

        System.out.println("\n---------- ADD STUDENT ----------");

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        // Check duplicate ID
        for (Student student : students) {
            if (student.getStudentId() == id) {
                System.out.println("❌ Student ID already exists!");
                return;
            }
        }

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        if (marks < 0 || marks > 100) {
            System.out.println("❌ Marks must be between 0 and 100.");
            return;
        }

        students.add(new Student(id, name, course, marks));

        System.out.println("✅ Student added successfully!");
    }

    // Display Students
    public static void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("\n❌ No students available.");
            return;
        }

        System.out.println("\n========================================");
        System.out.println("           STUDENT DETAILS");
        System.out.println("========================================");

        System.out.printf(
            "%-6s %-10s %-12s %s%n",
            "ID", "Name", "Course", "Marks"
        );

        System.out.println("----------------------------------------");

        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Sort by Marks
    public static void sortByMarks() {

        Collections.sort(students);

        System.out.println("\n========================================");
        System.out.println("            SORTED BY MARKS");
        System.out.println("========================================");

        displayStudents();
    }

    // Sort by Name
    public static void sortByName() {

        students.sort(
            Comparator.comparing(Student::getName)
        );

        System.out.println("\n========================================");
        System.out.println("             SORTED BY NAME");
        System.out.println("========================================");

        displayStudents();
    }

    // Sort by Student ID
    public static void sortById() {

        students.sort(
            Comparator.comparingInt(Student::getStudentId)
        );

        System.out.println("\n========================================");
        System.out.println("              SORTED BY ID");
        System.out.println("========================================");

        displayStudents();
    }

    // Display Top Student
    public static void displayTopStudent() {

        if (students.isEmpty()) {
            System.out.println("\n❌ No students available.");
            return;
        }

        Student topStudent = Collections.max(
            students,
            Comparator.comparingDouble(Student::getMarks)
        );

        System.out.println("\n========================================");
        System.out.println("             TOP STUDENT");
        System.out.println("========================================");

        System.out.println("Name   : " + topStudent.getName());
        System.out.println("Course : " + topStudent.getCourse());
        System.out.println("Marks  : " + topStudent.getMarks());
    }

    // Main Menu
    public static void main(String[] args) {

        // Sample students
        students.add(new Student(101, "Jashu", "CSE", 91.5));
        students.add(new Student(102, "Rahul", "AI & ML", 88.0));
        students.add(new Student(103, "Pavan", "ECE", 76.5));
        students.add(new Student(104, "Yashu", "CSE", 95.0));

        int choice;

        do {

            System.out.println("\n========================================");
            System.out.println("        STUDENT RANKING SYSTEM");
            System.out.println("========================================");

            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Sort by Marks");
            System.out.println("4. Sort by Name");
            System.out.println("5. Sort by Student ID");
            System.out.println("6. Display Top Student");
            System.out.println("7. Exit");

            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    sortByMarks();
                    break;

                case 4:
                    sortByName();
                    break;

                case 5:
                    sortById();
                    break;

                case 6:
                    displayTopStudent();
                    break;

                case 7:
                    System.out.println(
                        "\n========================================"
                    );
                    System.out.println(
                        "       PROGRAM COMPLETED!"
                    );
                    System.out.println(
                        "========================================"
                    );
                    break;

                default:
                    System.out.println("❌ Invalid choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}