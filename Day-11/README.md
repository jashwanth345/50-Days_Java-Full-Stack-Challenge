# 🚀 Day 11/50 — Java Collections Framework

![Java](https://img.shields.io/badge/Java-22-orange?style=for-the-badge&logo=openjdk)
![Collections](https://img.shields.io/badge/Java-Collections-blue?style=for-the-badge)
![Challenge](https://img.shields.io/badge/50%20Days-Day%2011-success?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)

---

# ☕ 50 Days Java Full Stack Development Challenge

## 📅 Day 11 — Java Collections Framework

🎉 **Day 11 Completed!**

Today's focus was the **Java Collections Framework**, which provides powerful and reusable data structures for storing and manipulating groups of objects.

> 💡 **Collections help us store, access, search, update and manage multiple objects efficiently.**

---

# 🧠 What is Java Collections Framework?

The **Java Collections Framework (JCF)** is a set of interfaces, classes and methods provided by Java to store and manipulate collections of objects.

Instead of manually managing multiple variables or fixed-size arrays, collections allow us to work with dynamic and flexible data structures.

### Without Collections

```java
Student s1;
Student s2;
Student s3;
Student s4;
```

This becomes difficult when the number of students increases.

### With Collections

```java
ArrayList<Student> students = new ArrayList<>();
```

Now we can dynamically add and remove students.

---

# 🏗️ Collections Framework Structure

```text
                         Iterable
                            │
                            ▼
                       Collection
                            │
            ┌───────────────┼───────────────┐
            │               │               │
           List             Set            Queue
            │               │               │
       ┌────┼────┐      ┌───┼────┐          │
       │    │    │      │        │          │
 ArrayList │ Vector  HashSet  TreeSet  PriorityQueue
           │
      LinkedList


                         Map
                          │
             ┌────────────┼────────────┐
             │            │            │
          HashMap    LinkedHashMap   TreeMap
```

---

# 📚 Collections Covered

## 1️⃣ ArrayList

`ArrayList` is a dynamic array that can grow or shrink automatically.

```java
ArrayList<String> names = new ArrayList<>();

names.add("Jashu");
names.add("Rahul");
names.add("Pavan");
```

Output:

```text
[Jashu, Rahul, Pavan]
```

### Common Methods

```java
add()
get()
set()
remove()
contains()
size()
clear()
isEmpty()
```

---

# 2️⃣ LinkedList

`LinkedList` stores elements using linked nodes.

```java
LinkedList<String> names = new LinkedList<>();

names.add("Jashu");
names.add("Rahul");

names.addFirst("Pavan");
names.addLast("Yashu");
```

Useful methods:

```java
addFirst()
addLast()
removeFirst()
removeLast()
```

---

# 3️⃣ HashSet

`HashSet` stores **unique elements** and does not allow duplicates.

```java
HashSet<Integer> numbers = new HashSet<>();

numbers.add(10);
numbers.add(20);
numbers.add(10);
```

Output:

```text
[10, 20]
```

The duplicate `10` is ignored.

---

# 4️⃣ TreeSet

`TreeSet` stores unique elements in **sorted order**.

```java
TreeSet<Integer> numbers = new TreeSet<>();

numbers.add(50);
numbers.add(10);
numbers.add(30);
```

Output:

```text
[10, 30, 50]
```

---

# 5️⃣ HashMap

`HashMap` stores data in **key-value pairs**.

```java
HashMap<Integer, String> students = new HashMap<>();

students.put(101, "Jashu");
students.put(102, "Rahul");
students.put(103, "Pavan");
```

Conceptually:

```text
101 → Jashu
102 → Rahul
103 → Pavan
```

### Common Methods

```java
put()
get()
remove()
containsKey()
containsValue()
keySet()
values()
```

---

# 🔄 Iterating Collections

## For-each Loop

```java
for(String name : names) {
    System.out.println(name);
}
```

## Iterator

```java
Iterator<String> iterator = names.iterator();

while(iterator.hasNext()) {
    System.out.println(iterator.next());
}
```

---

# 👨‍🎓 Mini Project — Student Management System

To apply the Collections Framework practically, I built a:

# 🎓 Student Management System

The application uses an:

```java
ArrayList<Student>
```

to dynamically store and manage student objects.

---

# 🏗️ Project Architecture

```text
                  STUDENT MANAGEMENT SYSTEM
                              │
                              ▼
                    ArrayList<Student>
                              │
              ┌───────────────┼───────────────┐
              │               │               │
              ▼               ▼               ▼
           CREATE           SEARCH          UPDATE
              │               │               │
              └───────────────┼───────────────┘
                              │
                              ▼
                           DELETE
                              │
                              ▼
                           DISPLAY
```

---

# 👤 Student Class

Each student contains the following information:

```java
class Student {

    private int studentId;
    private String name;
    private String course;
    private double marks;

}
```

### Student Information

| Field | Description |
|---|---|
| Student ID | Unique student identification |
| Name | Student name |
| Course | Student's course |
| Marks | Student's marks |

---

# 📋 Project Features

### ➕ Add Student

Adds a new student to the collection.

```java
students.add(student);
```

---

### 📋 Display Students

Displays all students stored in the `ArrayList`.

```java
for(Student student : students) {
    System.out.println(student);
}
```

---

### 🔍 Search Student

Searches for a student using their ID.

```java
for(Student student : students) {

    if(student.getStudentId() == id) {
        // Student found
    }
}
```

---

### ✏️ Update Student

Updates the details of an existing student.

```text
Search Student
      ↓
Student Found?
      ↓
Update Details
      ↓
Save Changes
```

---

### ❌ Delete Student

Removes a student from the collection.

```java
students.remove(student);
```

---

# 💻 Main Collection

The core of the project is:

```java
static ArrayList<Student> students = new ArrayList<>();
```

This allows the application to dynamically store any number of student objects.

---

# 🖥️ Sample Output

```text
==========================================
        STUDENT MANAGEMENT SYSTEM
==========================================

1. Add Student
2. Display Students
3. Search Student
4. Update Student
5. Delete Student
6. Exit

Enter your choice: 1

Enter Student ID: 101
Enter Name: Jashu
Enter Course: CSE
Enter Marks: 91.5

Student added successfully!


Enter your choice: 1

Enter Student ID: 102
Enter Name: Rahul
Enter Course: AI & ML
Enter Marks: 88.0

Student added successfully!


Enter your choice: 1

Enter Student ID: 103
Enter Name: Pavan
Enter Course: ECE
Enter Marks: 76.5

Student added successfully!


Enter your choice: 2


========== STUDENT LIST ==========

ID       Name        Course       Marks
------------------------------------------
101      Jashu       CSE          91.5
102      Rahul       AI & ML       88.0
103      Pavan       ECE           76.5

Total Students: 3
```

---

# 🔍 Search Example

```text
==========================================
          SEARCH STUDENT
==========================================

Enter Student ID: 101

Student Found!

Student ID : 101
Name       : Jashu
Course     : CSE
Marks      : 91.5
```

---

# ❌ Delete Example

```text
==========================================
          DELETE STUDENT
==========================================

Enter Student ID: 103

Student deleted successfully!

Remaining Students: 2
```

---

# 🧩 Collection Comparison

| Collection | Duplicates | Ordering | Main Use |
|---|---|---|---|
| ArrayList | ✅ Allowed | Insertion Order | Dynamic list |
| LinkedList | ✅ Allowed | Insertion Order | Frequent insert/delete |
| HashSet | ❌ Not Allowed | No guaranteed order | Unique data |
| TreeSet | ❌ Not Allowed | Sorted | Unique + sorted data |
| HashMap | Keys ❌ / Values ✅ | No guaranteed order | Key-value data |

---

# 🆚 Array vs ArrayList

| Array | ArrayList |
|---|---|
| Fixed size | Dynamic size |
| Can store primitives | Stores objects |
| Less flexible | More flexible |
| Limited built-in methods | Many useful methods |
| Example: `int[]` | Example: `ArrayList<Integer>` |

### Example

```java
int[] numbers = new int[5];
```

vs.

```java
ArrayList<Integer> numbers = new ArrayList<>();
```

---

# 🧠 Important Collection Methods

```text
ArrayList
│
├── add()
├── get()
├── set()
├── remove()
├── contains()
├── size()
├── clear()
└── isEmpty()


HashSet
│
├── add()
├── remove()
├── contains()
├── size()
└── clear()


HashMap
│
├── put()
├── get()
├── remove()
├── containsKey()
├── containsValue()
├── keySet()
└── values()
```

---

# 🔑 Key Takeaways

Through Day 11, I learned:

- 📚 What the Java Collections Framework is
- 📋 Difference between List, Set, Queue and Map
- 🔹 How `ArrayList` works
- 🔗 How `LinkedList` works
- 🔐 How `HashSet` handles unique elements
- 🌳 How `TreeSet` maintains sorted data
- 🗺️ How `HashMap` stores key-value pairs
- 🔄 How to iterate through collections
- 👨‍🎓 How to store custom objects inside an `ArrayList`
- 🏗️ How Collections can be used in real-world applications

---

# 🌍 Real-World Applications

Java Collections are heavily used in real-world applications.

### 👨‍🎓 Student Management

```text
ArrayList<Student>
```

### 🛒 E-Commerce

```text
List<Product>
```

### 👥 Employee Management

```text
List<Employee>
```

### 🏦 Banking

```text
Map<AccountNumber, Account>
```

### 📦 Inventory Management

```text
Map<ProductId, Product>
```

---

# 🎯 Interview Questions

### 1. What is the Java Collections Framework?

A framework that provides interfaces and classes for storing and manipulating groups of objects.

### 2. ArrayList vs LinkedList?

`ArrayList` is backed by a dynamic array, while `LinkedList` uses linked nodes.

### 3. List vs Set?

`List` allows duplicates, while `Set` does not allow duplicate elements.

### 4. HashSet vs TreeSet?

`HashSet` does not guarantee sorted order, while `TreeSet` maintains sorted order.

### 5. HashMap vs HashSet?

`HashMap` stores key-value pairs, while `HashSet` stores unique elements.

### 6. Can ArrayList contain duplicates?

Yes.

### 7. Can HashSet contain duplicates?

No.

### 8. Can HashMap have duplicate keys?

No. A key can occur only once.

### 9. What happens when the same key is inserted into HashMap?

The existing value associated with that key is replaced.

### 10. What is the difference between Collection and Collections?

`Collection` is an interface, while `Collections` is a utility class containing static methods for working with collections.

---

# 🛠️ Technologies Used

```text
☕ Java
🧠 Object-Oriented Programming
📚 Java Collections Framework
💻 Eclipse IDE
🌿 Git
🐙 GitHub
```

---

# ▶️ How to Run

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/jashwanth345/50-Days_Java-Full-Stack-Challenge.git
```

### 2️⃣ Navigate to Day 11

```bash
cd 50-Days_Java-Full-Stack-Challenge/Day-11
```

### 3️⃣ Compile

```bash
javac Main.java
```

### 4️⃣ Run

```bash
java Main
```

---

# 📈 Challenge Progress

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
```

## 🔥 11 / 50 Days Completed

```text
███████████░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░

                    22%
```

### 🎉 11 Days Down — 39 Days To Go!

---

# 🔗 GitHub Repository

🚀 **50 Days Java Full Stack Development Challenge**

https://github.com/jashwanth345/50-Days_Java-Full-Stack-Challenge

---

# 🚀 What's Next?

```text
Day 10
Encapsulation ✅
       │
       ▼
Day 11
Collections Framework ✅
       │
       ▼
Day 12
Coming Next 🚀
```

---

<div align="center">

# ☕ 50 Days Java Full Stack Development Challenge

## 📚 Day 11 — Java Collections Framework

### ✅ COMPLETED

**11 Days Down • 39 Days To Go 🔥**

### Learn → Code → Build → Share → Grow 🚀

⭐ Keep Learning • Keep Building • Keep Growing ⭐

</div>
