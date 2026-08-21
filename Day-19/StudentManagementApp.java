import java.util.Scanner;

public class StudentManagementApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentDAO dao = new StudentDAO();

        while (true) {

            System.out.println("\n================================");
            System.out.println("     STUDENT MANAGEMENT SYSTEM");
            System.out.println("================================");

            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                // =========================
                // ADD
                // =========================
                case 1:

                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Student Marks: ");
                    double marks = sc.nextDouble();

                    Student student =
                            new Student(id, name, marks);

                    dao.addStudent(student);

                    break;


                // =========================
                // VIEW
                // =========================
                case 2: 

                    dao.viewStudent();

                    break;


                // =========================
                // UPDATE
                // =========================
                case 3:

                    System.out.print("Enter Student ID: ");
                    int updateId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter New Marks: ");
                    double newMarks = sc.nextDouble();

                    Student updatedStudent =
                            new Student(
                                    updateId,
                                    newName,
                                    newMarks
                            );

                    dao.updateStudent(updatedStudent);

                    break;


                // =========================
                // DELETE
                // =========================
                case 4:

                    System.out.print("Enter Student ID: ");
                    int deleteId = sc.nextInt();

                    dao.deleteStudent(deleteId);

                    break;


                // =========================
                // EXIT
                // =========================
                case 5:

                    System.out.println(
                            "Thank you for using Student Management System!"
                    );

                    sc.close();

                    return;


                default:

                    System.out.println(
                            "Invalid choice! Please try again."
                    );
            }
        }
    }
}