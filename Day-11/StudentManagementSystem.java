import java.util.Scanner;
import java.util.ArrayList;
public class StudentManagementSystem {
	static ArrayList<Student> students=new ArrayList<>();
	static Scanner sc=new Scanner(System.in);
	public static void addStudent() {
		System.out.println("\n---- Add Student ----");
		System.out.println("Enter Student ID :");
		int id=sc.nextInt();
		sc.nextLine();
		for(Student student: students) {
			if(student.getStudentId()==id) {
				System.out.println("❌ Student ID already exists!");
                return;
			}
		}
		System.out.println("Enter Student Name : ");
		String name=sc.next();
		System.out.println("Enter Course : ");
		String course=sc.next();
		System.out.println("Enter Student Marks :");
		Double marks=sc.nextDouble();
		Student student=new Student(id,name,course,marks);
		students.add(student);
		System.out.println("✅ Student added successfully!");
	}
	//display students
	public static void displayStudents() {

        System.out.println("\n---------- STUDENT LIST ----------");

        if (students.isEmpty()) {
            System.out.println("❌ No students found.");
            return;
        }

        for (Student student : students) {
            student.displayStudent();
        }
    }

	//Search student
	public static void searchStudent() {
		System.out.println("\n--------- Search Student --------- ");
		System.out.println("Enter Student ID : ");
		int id=sc.nextInt();
		for(Student student:students) {
			if(student.getStudentId()==id) {
				System.out.println("✅ Student Found!");
				student.displayStudent();
				return;
			}
		}
		System.out.println("❌ Student not found.");
	}
	//Update Student
	public static void updateStudent() {
		System.out.println("\n--------- Update Student --------- ");
		System.out.println("Enter Student ID : ");
		int id=sc.nextInt();
		for(Student student:students) {
			if(student.getStudentId()==id) {
				System.out.print("Enter New Name : ");
                String name = sc.nextLine();

                System.out.print("Enter New Course : ");
                String course = sc.nextLine();

                System.out.print("Enter New Marks : ");
                double marks = sc.nextDouble();

                student.setName(name);
                student.setCourse(course);
                student.setMarks(marks);

                System.out.println("✅ Student updated successfully!");
                return;
			}
		}
		System.out.println("❌ Student not found.");
	}
	// Delete Student
    public static void deleteStudent() {

        System.out.println("\n---------- DELETE STUDENT ----------");

        System.out.print("Enter Student ID : ");
        int id = sc.nextInt();

        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).getStudentId() == id) {

                students.remove(i);

                System.out.println("✅ Student deleted successfully!");
                return;
            }
        }

        System.out.println("❌ Student not found.");
    }
 // Display Marks
    public static void displayMarks() {

        System.out.println("\n---------- STUDENT MARKS ----------");

        if (students.isEmpty()) {
            System.out.println("❌ No students found.");
            return;
        }

        for (Student student : students) {

            System.out.println(
                student.getStudentId()
                + " | "
                + student.getName()
                + " | Marks: "
                + student.getMarks()
            );
        }
    }
    
    // Main Method
    public static void main(String[] args) {

        while (true) {

            System.out.println("\n==========================================");
            System.out.println("       STUDENT MANAGEMENT SYSTEM");
            System.out.println("==========================================");

            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Display Marks");
            System.out.println("7. Exit");

            System.out.println("------------------------------------------");

            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateStudent();
                    break;

                case 5:
                    deleteStudent();
                    break;

                case 6:
                    displayMarks();
                    break;

                case 7:
                    System.out.println("\nThank you for using Student Management System! 👋");
                    sc.close();
                    return;

                default:
                    System.out.println("❌ Invalid choice!");
            }
        }
    }
}
