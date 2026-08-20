import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.Period;
public class EmployeeAttendanceSystem {

    public static void main(String[] args) {
        // Employee Details
        String employeeName = "Jashwanth";
        int employeeId = 310;
        String department = "CSM";
        // Joining Date
        LocalDate joiningDate =
                LocalDate.of(2023, 7, 14);
        // Current Date
        LocalDate currentDate =
                LocalDate.now();
        // Check-in and Check-out
        LocalTime checkIn =
                LocalTime.of(9, 30);
        LocalTime checkOut =
                LocalTime.of(18, 15);
        // Calculate Working Duration
        Duration workingDuration =
                Duration.between(checkIn, checkOut);
        long totalMinutes =
                workingDuration.toMinutes();
        long hours =
                totalMinutes / 60;
        long minutes =
                totalMinutes % 60;
        // Calculate Employee Experience
        Period experience =
                Period.between(
                        joiningDate,
                        currentDate
                );
        // Date Formatter
        DateTimeFormatter dateFormatter =
                DateTimeFormatter.ofPattern(
                        "dd-MM-yyyy"
                );
        // Time Formatter
        DateTimeFormatter timeFormatter =
                DateTimeFormatter.ofPattern(
                        "hh:mm a"
                );
        // Display Report
        System.out.println(
                "======================================"
        );
        System.out.println(
                "       EMPLOYEE ATTENDANCE SYSTEM"
        );
        System.out.println(
                "======================================"
        );
        System.out.println(
                "Employee ID      : " + employeeId
        );
        System.out.println(
                "Employee Name    : " + employeeName
        );
        System.out.println(
                "Department       : " + department
        );
        System.out.println(
                "Joining Date     : "
                + joiningDate.format(dateFormatter)
        );
        System.out.println(
                "Current Date     : "
                + currentDate.format(dateFormatter)
        );
        System.out.println(
                "Check-In Time    : "
                + checkIn.format(timeFormatter)
        );
        System.out.println(
                "Check-Out Time   : "
                + checkOut.format(timeFormatter)
        );
        System.out.println(
                "Working Duration : "
                + hours + " Hours "
                + minutes + " Minutes"
        );
        System.out.println(
                "Experience       : "
                + experience.getYears() + " Years "
                + experience.getMonths() + " Months "
                + experience.getDays() + " Days"
        );
        System.out.println(
                "======================================"
        );
    }
}
