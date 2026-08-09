
public class Student {
	private String name;
	private int studentId;
	private String course;
	private double marks;
	public Student(int studentId, String name,
			String course, double marks) {
		this.studentId=studentId;
		this.name=name;
		this.course=course;
		this.marks=marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	//Display Student Details
	public void displayStudent() {
		System.out.println("-----Student Details-----");
		System.out.println("Student ID   : "+studentId);
		System.out.println("Student Name : "+name);
		System.out.println("Course       : "+ course);
		System.out.println("Marks        : "+ marks);
		System.out.println("<----------------->");
	}
	
}
