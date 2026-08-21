import java.sql.*;
public class StudentDAO {
//ADD student
	public void addStudent(Student student) {
		String sql="insert into student (id,name,marks) values(?,?,?)";
		try(Connection con=DBConnection.getConnection();
			PreparedStatement ps=con.prepareStatement(sql)) {
			ps.setInt(1,student.getId());
			ps.setString(2, student.getName());
			ps.setDouble(3, student.getMarks());
			
			int rows=ps.executeUpdate();
			if(rows>0) {
				System.out.println("Students add successfully!!");
			}
			
		} catch (Exception e) {
			System.out.println("Error adding student: "
                    + e.getMessage());
		}
	}
//View Student
	public void viewStudent() {
		String sql="select * from student";
		try (Connection con=DBConnection.getConnection();
				PreparedStatement ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();) {
			 System.out.println("\n================================");
	         System.out.println("        STUDENT LIST");
	         System.out.println("================================");
	         boolean found=false;
	         while(rs.next()) {
	        	 found=true;
	        	 int id=rs.getInt("id");
	        	 String name=rs.getString("name");
	        	 double marks=rs.getDouble("marks");
	        	 System.out.println(
	                        "ID: " + id +
	                        " | Name: " + name +
	                        " | Marks: " + marks
	                );
	            }

	            if (!found) {
	                System.out.println("No students found.");
	            }
		} catch (Exception e) {
			System.out.println("Error viewing students: "
                    + e.getMessage());
		}
	}
//Update student
	public void updateStudent(Student student) {
		String sql =
                "UPDATE student SET name = ?, marks = ? WHERE id = ?";

        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setString(1, student.getName());
            ps.setDouble(2, student.getMarks());
            ps.setInt(3, student.getId());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student updated successfully!");
            } else {
                System.out.println("Student not found.");
            }

        } catch (SQLException e) {
            System.out.println("Error updating student: "
                    + e.getMessage());
        }
	}
//Delete Student
	public void deleteStudent(int id) {

        String sql =
                "DELETE FROM student WHERE id = ?";

        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student deleted successfully!");
            } else {
                System.out.println("Student not found.");
            }

        } catch (SQLException e) {
            System.out.println("Error deleting student: "
                    + e.getMessage());
        }
    }
	
	
	
}

