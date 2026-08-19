import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class StudentResultSystem {
	public static void main(String[] args) {
		List<Student> students=Arrays.asList(
				new Student(310,"Jashu  ",92),
				new Student(300,"Pavan  ",52),
				new Student(298,"Yashu  ",32),
				new Student(329,"yuvraj ",72),
				new Student(294,"Tej    ",22),
				new Student(290,"Rohit  ",82),
				new Student(317,"Hema   ",62),
				new Student(313,"Jeevan ",42)
				);
		//1.Display all student
		System.out.println("\n----All Students----");
		students.stream()
				.forEach(System.out::println);
		
		// 2. Filter passed students
		System.out.println("\n-----Passed Students-----");
		students.stream()
				.filter(student ->student.getMarks()>=40)
				.forEach(System.out::println);
		
		// 3. Count passed students
		System.out.println("\n-----Count Passed Students-----");
		long passedCount=students.stream()
								.filter(student -> student.getMarks()>=40)
								.count();
		System.out.println("\nPassed Students : "+passedCount);
		
		// 4. Count Failed students
				System.out.println("\n-----Count Passed Students-----");
				long failedCount=students.stream()
										.filter(student -> student.getMarks()<=40)
										.count();
				System.out.println("\nFailed Students : "+failedCount);
		
		// 5. Sort students by marks - descending
				System.out.println("\n-----Student Ranking-----");
				students.stream()
					.sorted(Comparator.comparingDouble(Student::getMarks).reversed())
					.forEach(System.out::println);
				
		// 6. Top 3 students
				System.out.println("\n-----Student Ranking-----");
				students.stream()
					.sorted(Comparator.comparingDouble(Student::getMarks).reversed())
					.limit(3)
					.forEach(System.out::println);		
		// 7. Calculate grades
				System.out.println("\n-----Student Grades");
				students.stream()
				.map(student -> {
					String grade;
					if (student.getMarks()>=90)
						grade="A+";
					else if(student.getMarks()>=80)
						grade="A";
					else if(student.getMarks()>=70)
						grade="B";
					else if(student.getMarks()>=60)
						grade="C";
					else if(student.getMarks()>=40)
						grade="D";
					else
						grade="F";
					return student.getMarks() + " -> "+grade;
				})
				.forEach(System.out::println);
				
		// 8. Collect passed students into List
				List<Student> passesStudents=students.stream()
												.filter(student -> student.getMarks()>=40)
												.collect(Collectors.toList());
				System.out.println("\n Total Passed Students: "+ passesStudents.size());
	}
}
