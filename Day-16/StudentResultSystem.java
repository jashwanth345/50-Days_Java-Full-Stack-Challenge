import java.util.*;
import java.util.function.*;

public class StudentResultSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        // ==============================
        // 1. ADD STUDENTS
        // ==============================

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter Student " + (i + 1) + " details:");

            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();

            students.add(new Student(id, name, marks));
        }

        // ==============================
        // PREDICATE
        // ==============================

        Predicate<Student> passedStudent =
                student -> student.getMarks() >= 40;

        // ==============================
        // FUNCTION
        // ==============================

        Function<Student, String> calculateGrade =
                student -> {

                    int marks = student.getMarks();

                    if (marks >= 90)
                        return "A+";
                    else if (marks >= 80)
                        return "A";
                    else if (marks >= 70)
                        return "B";
                    else if (marks >= 60)
                        return "C";
                    else if (marks >= 40)
                        return "D";
                    else
                        return "F";
                };

        // ==============================
        // CONSUMER
        // ==============================

        Consumer<Student> displayStudent =
                student -> System.out.println(student);

        // ==============================
        // MENU
        // ==============================

        while (true) {

            System.out.println("\n========== STUDENT RESULT SYSTEM ==========");
            System.out.println("1. Display All Students");
            System.out.println("2. Display Passed Students");
            System.out.println("3. Calculate Grades");
            System.out.println("4. Display Complete Results");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                // ==================================
                // DISPLAY ALL STUDENTS
                // ==================================

                case 1:

                    System.out.println("\n----- ALL STUDENTS -----");

                    students.forEach(System.out::println);

                    break;

                // ==================================
                // FILTER PASSED STUDENTS
                // ==================================

                case 2:

                    System.out.println("\n----- PASSED STUDENTS -----");

                    students.stream()
                            .filter(passedStudent)
                            .forEach(System.out::println);

                    break;

                // ==================================
                // CALCULATE GRADES
                // ==================================

                case 3:

                    System.out.println("\n----- STUDENT GRADES -----");

                    students.forEach(student -> {

                        String grade = calculateGrade.apply(student);

                        System.out.println(
                                student.getName() +
                                " → Marks: " +
                                student.getMarks() +
                                " → Grade: " +
                                grade
                        );
                    });

                    break;

                // ==================================
                // COMPLETE RESULTS
                // ==================================

                case 4:

                    System.out.println("\n========== COMPLETE RESULTS ==========");

                    students.stream()
                            .forEach(student -> {

                                String result =
                                        passedStudent.test(student)
                                                ? "PASS"
                                                : "FAIL";

                                String grade =
                                        calculateGrade.apply(student);

                                System.out.println(
                                        "ID: " + student.getId() +
                                        " | Name: " + student.getName() +
                                        " | Marks: " + student.getMarks() +
                                        " | Grade: " + grade +
                                        " | Result: " + result
                                );
                            });

                    break;

                // ==================================
                // EXIT
                // ==================================

                case 5:

                    System.out.println("\nThank you for using Student Result System!");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid choice!");
            }
        }
    }
}