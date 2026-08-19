# 🚀 Day 17/50 — Stream API in Java

## 📚 Topics Covered

- Stream API
- Creating Streams
- `filter()`
- `map()`
- `sorted()`
- `forEach()`
- `collect()`
- `count()`
- `limit()`
- `distinct()`
- Intermediate Operations
- Terminal Operations
- Lambda Expressions with Streams
- Method References with Streams

---

# 🌊 What is Stream API?

Stream API was introduced in Java 8 to process collections of data in a clean and functional programming style.

Streams allow us to perform operations such as:

- Filtering
- Sorting
- Mapping
- Counting
- Collecting
- Limiting

### Basic Stream Flow

```text
Collection
    ↓
  Stream
    ↓
filter()
    ↓
 map()
    ↓
sorted()
    ↓
collect()
    ↓
 Result
```

---

# 🔹 Important Stream Methods

## 1. filter()

Used to filter elements based on a condition.

```java
students.stream()
        .filter(student -> student.getMarks() >= 40)
        .forEach(System.out::println);
```

---

## 2. map()

Used to transform elements into another value.

```java
students.stream()
        .map(student -> student.getMarks())
        .forEach(System.out::println);
```

---

## 3. sorted()

Used to sort elements.

```java
students.stream()
        .sorted()
        .forEach(System.out::println);
```

---

## 4. forEach()

Used to perform an operation on every element.

```java
students.stream()
        .forEach(System.out::println);
```

---

## 5. count()

Used to count the number of elements.

```java
long count = students.stream()
        .filter(student -> student.getMarks() >= 40)
        .count();
```

---

## 6. collect()

Used to collect the processed elements into a collection.

```java
List<Student> passedStudents = students.stream()
        .filter(student -> student.getMarks() >= 40)
        .collect(Collectors.toList());
```

---

## 7. limit()

Used to limit the number of elements.

```java
students.stream()
        .limit(3)
        .forEach(System.out::println);
```

---

## 8. distinct()

Used to remove duplicate elements.

```java
numbers.stream()
       .distinct()
       .forEach(System.out::println);
```

---

# 🔄 Intermediate Operations

Intermediate operations return another Stream and can be chained.

Examples:

```text
filter()
map()
sorted()
distinct()
limit()
skip()
```

Example:

```java
students.stream()
        .filter(student -> student.getMarks() >= 40)
        .sorted()
        .limit(3);
```

---

# ✅ Terminal Operations

Terminal operations produce the final result.

Examples:

```text
forEach()
collect()
count()
```

Example:

```java
students.stream()
        .filter(student -> student.getMarks() >= 40)
        .count();
```

---

# 🎓 Mini Project

## Student Result Processing System

For Day 17, I built a **Student Result Processing System using Java Stream API**.

The project processes student information using different Stream API operations.

---

# ✨ Features

- 👨‍🎓 Display all students
- ✅ Filter passed students
- ❌ Count failed students
- 🔢 Count passed students
- 🏆 Sort students by marks
- 🥇 Find Top 3 students
- 📊 Calculate grades
- 📋 Collect passed students into a List

---

# 👨‍🎓 Student Data

| ID | Name | Marks |
|----|------|-------|
| 310 | Jashu | 92 |
| 300 | Pavan | 52 |
| 298 | Yashu | 32 |
| 329 | Yuvraj | 72 |
| 294 | Tej | 22 |
| 290 | Rohit | 82 |
| 317 | Hema | 62 |
| 313 | Jeevan | 42 |

---

# 🔄 Project Flow

```text
              STUDENT LIST
                   │
                   ▼
                 STREAM
                   │
        ┌──────────┼──────────┐
        ▼          ▼          ▼
     filter()    map()     sorted()
        │          │          │
        ▼          ▼          ▼
     Passed      Grades     Ranking
     Students
        │
        ▼
     collect()
        │
        ▼
  Result Processing
```

---

# 💻 Project Structure

```text
Day-17/
│
├── Student.java
├── StudentResultSystem.java
└── README.md
```

---

# 🖥️ Sample Output

```text
-----All Students-----

ID: 310, Name: Jashu, Marks: 92.0
ID: 300, Name: Pavan, Marks: 52.0
ID: 298, Name: Yashu, Marks: 32.0
ID: 329, Name: Yuvraj, Marks: 72.0
ID: 294, Name: Tej, Marks: 22.0
ID: 290, Name: Rohit, Marks: 82.0
ID: 317, Name: Hema, Marks: 62.0
ID: 313, Name: Jeevan, Marks: 42.0


-----Passed Students-----

ID: 310, Name: Jashu, Marks: 92.0
ID: 300, Name: Pavan, Marks: 52.0
ID: 329, Name: Yuvraj, Marks: 72.0
ID: 290, Name: Rohit, Marks: 82.0
ID: 317, Name: Hema, Marks: 62.0
ID: 313, Name: Jeevan, Marks: 42.0


-----Count Passed Students-----

Passed Students : 6


-----Count Failed Students-----

Failed Students : 2


-----Student Ranking-----

ID: 310, Name: Jashu, Marks: 92.0
ID: 290, Name: Rohit, Marks: 82.0
ID: 329, Name: Yuvraj, Marks: 72.0
ID: 317, Name: Hema, Marks: 62.0
ID: 300, Name: Pavan, Marks: 52.0
ID: 313, Name: Jeevan, Marks: 42.0
ID: 298, Name: Yashu, Marks: 32.0
ID: 294, Name: Tej, Marks: 22.0


-----Top 3 Students-----

ID: 310, Name: Jashu, Marks: 92.0
ID: 290, Name: Rohit, Marks: 82.0
ID: 329, Name: Yuvraj, Marks: 72.0


-----Student Grades-----

92.0 -> A+
52.0 -> D
32.0 -> F
72.0 -> B
22.0 -> F
82.0 -> A
62.0 -> C
42.0 -> D


Total Passed Students: 6
```

---

# 🧠 Key Learnings

Through this project, I learned:

- How Stream API works
- How to create Streams
- How to filter collection data
- How to transform data using `map()`
- How to sort objects using `sorted()`
- How to count elements using `count()`
- How to limit results using `limit()`
- How to collect results using `collect()`
- How Lambda Expressions work with Streams
- How Method References work with Streams
- Difference between intermediate and terminal operations

---

# 🛠️ Technologies Used

```text
☕ Java
🌊 Stream API
λ Lambda Expressions
🔗 Method References
📦 Collections
📊 Comparator
💻 Eclipse IDE
🐙 GitHub
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
```

## 🔥 17 / 50 Days Completed

### 📊 Progress: 34%

```text
█████████████████░░░░░░░░░░░░░░░░░░░░░░░░░
```

---

# 🎯 Conclusion

Day 17 helped me understand how the **Java Stream API** makes collection processing cleaner, shorter, and more readable.

By combining:

```text
Lambda Expressions
        +
Functional Interfaces
        +
Method References
        +
Stream API
        ↓
Clean & Efficient Java Code
```

---

# 🚀 Next Step

Continuing my **50 Days Java Full Stack Development Challenge**.

**17 Days Completed → 33 Days To Go! 🔥**

---

## 🔗 GitHub Repository

https://github.com/jashwanth345/50-Days_Java-Full-Stack-Challenge

---

#Java #JavaDeveloper #JavaFullStack #StreamAPI #JavaStreams #LambdaExpressions #FunctionalProgramming #Collections #CodingChallenge #50DaysChallenge #LearningInPublic
