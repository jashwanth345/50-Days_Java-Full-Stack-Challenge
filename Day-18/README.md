# 🚀 Day 18/50 — Date & Time API in Java

## 📅 50 Days Java Full Stack Development Challenge

Day 18 of my **50 Days Java Full Stack Development Challenge** is completed! ✅

Today I learned and practiced the **Date & Time API in Java** using the modern `java.time` package.

---

# 📚 Topics Covered

- `LocalDate`
- `LocalTime`
- `LocalDateTime`
- Creating Custom Date & Time
- Date Operations
- Time Operations
- `Period`
- `Duration`
- `DateTimeFormatter`
- Parsing Date & Time
- Comparing Dates & Times

---

# 1️⃣ LocalDate

`LocalDate` is used to represent a date without time.

### Example

```java
LocalDate today = LocalDate.now();

System.out.println(today);
```

### Output

```text
2026-08-20
```

---

# 2️⃣ LocalTime

`LocalTime` is used to represent time without a date.

### Example

```java
LocalTime currentTime = LocalTime.now();

System.out.println(currentTime);
```

### Output

```text
18:30:25
```

---

# 3️⃣ LocalDateTime

`LocalDateTime` represents both date and time.

### Example

```java
LocalDateTime now = LocalDateTime.now();

System.out.println(now);
```

### Output

```text
2026-08-20T18:30:25
```

---

# 4️⃣ Creating Custom Date & Time

We can create our own date and time using `of()`.

```java
LocalDate date =
        LocalDate.of(2026, 8, 20);

LocalTime time =
        LocalTime.of(10, 30);

LocalDateTime dateTime =
        LocalDateTime.of(
                2026,
                8,
                20,
                10,
                30
        );
```

---

# 5️⃣ Date Operations

We can add or subtract days, months, and years.

### Add Days

```java
LocalDate futureDate =
        date.plusDays(10);
```

### Subtract Days

```java
LocalDate previousDate =
        date.minusDays(5);
```

### Add Months

```java
date.plusMonths(2);
```

### Subtract Months

```java
date.minusMonths(1);
```

### Add Years

```java
date.plusYears(1);
```

### Subtract Years

```java
date.minusYears(1);
```

---

# 6️⃣ Time Operations

We can also add or subtract time.

```java
time.plusHours(2);

time.minusHours(1);

time.plusMinutes(30);

time.minusMinutes(15);

time.plusSeconds(20);

time.minusSeconds(10);
```

---

# 7️⃣ Period

`Period` is used to calculate the difference between two dates.

It works with:

- Years
- Months
- Days

### Example

```java
LocalDate startDate =
        LocalDate.of(2025, 1, 1);

LocalDate endDate =
        LocalDate.of(2026, 1, 1);

Period period =
        Period.between(startDate, endDate);

System.out.println(period);
```

### Output

```text
P1Y
```

This represents a difference of **1 year**.

---

# 8️⃣ Duration

`Duration` is used to calculate the difference between two time-based values.

It works with:

- Hours
- Minutes
- Seconds
- Nanoseconds

### Example

```java
LocalTime startTime =
        LocalTime.of(9, 0);

LocalTime endTime =
        LocalTime.of(17, 30);

Duration duration =
        Duration.between(
                startTime,
                endTime
        );

System.out.println(duration);
```

### Output

```text
PT8H30M
```

---

# 9️⃣ DateTimeFormatter

`DateTimeFormatter` is used to format dates and times into a custom readable format.

### Example

```java
DateTimeFormatter formatter =
        DateTimeFormatter.ofPattern(
                "dd-MM-yyyy"
        );

String formattedDate =
        date.format(formatter);

System.out.println(formattedDate);
```

### Output

```text
20-08-2026
```

---

# 🔟 Comparing Dates

Java provides useful methods to compare dates.

### isBefore()

```java
date1.isBefore(date2);
```

### isAfter()

```java
date1.isAfter(date2);
```

### isEqual()

```java
date1.isEqual(date2);
```

---

# 🎓 Day 18 Mini Project

## 👨‍💼 Employee Attendance & Work Schedule System

For Day 18, I designed an **Employee Attendance & Work Schedule System** using Java Date & Time API.

The project demonstrates how Java can be used to manage employee attendance, working hours, and date/time information.

---

# 🎯 Mini Project Question

### Build an Employee Attendance & Work Schedule System using Java Date & Time API.

Create a console-based application that stores employee information and manages attendance using Java's modern Date & Time API.

The application should:

1. Store employee ID, name, department, and joining date.
2. Display the current date.
3. Record employee check-in time.
4. Record employee check-out time.
5. Calculate the total working duration.
6. Display employee attendance details.
7. Calculate working hours using `Duration`.
8. Calculate employee service period using `Period`.
9. Format dates and times using `DateTimeFormatter`.
10. Compare dates and times where required.

---

# ✨ Mini Project Features

```text
Employee Details
      │
      ▼
Joining Date
      │
      ▼
Check-in Time
      │
      ▼
Check-out Time
      │
      ▼
Working Duration
      │
      ▼
Attendance Report
```

### Features

- 👤 Employee Information
- 📅 Joining Date
- 🕘 Check-in Time
- 🕔 Check-out Time
- ⏱️ Working Duration
- 📆 Service Period
- 📊 Attendance Summary
- 📝 Formatted Date & Time

---

# 🏗️ Project Structure

```text
Day-18/
│
├── Employee.java
├── EmployeeAttendanceSystem.java
└── README.md
```

---

# 💻 Technologies Used

```text
☕ Java
📅 java.time
📆 LocalDate
⏰ LocalTime
🕐 LocalDateTime
📊 Period
⏱️ Duration
📝 DateTimeFormatter
💻 Eclipse IDE
🐙 GitHub
```

---

# 🧠 Key Learnings

Through Day 18, I learned:

- How to work with dates using `LocalDate`
- How to work with time using `LocalTime`
- How to work with date and time using `LocalDateTime`
- How to create custom dates and times
- How to add and subtract date/time values
- How to calculate date differences using `Period`
- How to calculate time differences using `Duration`
- How to format dates using `DateTimeFormatter`
- How to compare dates and times
- Why the modern Java Date & Time API is useful for application development

---

# 🔄 Date & Time API Overview

```text
                  java.time
                     │
        ┌────────────┼────────────┐
        ▼            ▼            ▼
   LocalDate     LocalTime   LocalDateTime
        │            │            │
        └────────────┼────────────┘
                     ▼
              Date & Time
              Operations
                     │
        ┌────────────┼────────────┐
        ▼            ▼            ▼
     Period       Duration   Formatter
        │            │            │
        ▼            ▼            ▼
 Date Difference  Time Difference  Formatting
```

---

# 📈 50 Days Java Full Stack Challenge

```text
Day 01  ✅
Day 02  ✅
Day 03  ✅
Day 04  ✅
Day 05  ✅
Day 06  ✅
Day 07  ✅
Day 08  ✅
Day 09  ✅
Day 10  ✅
Day 11  ✅
Day 12  ✅
Day 13  ✅
Day 14  ✅
Day 15  ✅
Day 16  ✅
Day 17  ✅
Day 18  ✅
```

## 🔥 18 / 50 Days Completed

### 📊 Progress: 36%

```text
██████████████████░░░░░░░░░░░░░░░░░░░░░░░░░░░░
```

---

# 🎯 Conclusion

Day 18 helped me understand the modern **Java Date & Time API** and how it can be used in real-world applications.

The main concepts covered were:

```text
LocalDate
    +
LocalTime
    +
LocalDateTime
    +
Period
    +
Duration
    +
DateTimeFormatter
    ↓
Powerful Date & Time Handling
```

---

# 🚀 Challenge Progress

**18 Days Completed → 32 Days To Go! 🔥**

Continuing the journey of learning Java, building projects, and improving my Full Stack Development skills.

---

# 🔗 GitHub Repository

https://github.com/jashwanth345/50-Days_Java-Full-Stack-Challenge

---

# ☕ Keep Learning. Keep Building. Keep Growing. 🚀

#Java #JavaDeveloper #JavaFullStack #DateAndTimeAPI #JavaTime #Programming #CodingChallenge #50DaysChallenge #LearningInPublic #DeveloperJourney #FullStackDevelopment
