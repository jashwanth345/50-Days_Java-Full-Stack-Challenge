# 🚀 Day 15 – Java File Handling

Welcome to **Day 15** of my **50 Days Java Full Stack Challenge**! 🎯

Today I learned how to work with files in Java — creating files, writing data, reading data, buffering data, handling byte streams, and managing file-related exceptions.

As a mini project, I extended the previous banking system and created a **Bank Transaction File Management System** that stores transaction history in a file.

---

## 📚 Topics Covered

### 📁 1. File Handling Introduction

File handling allows Java programs to:

* Create files
* Write data
* Read data
* Store information permanently
* Manage files and directories

---

### 📄 2. File Class

The `File` class is used to represent files and directories.

```java
File file = new File("student.txt");

if (file.createNewFile()) {
    System.out.println("File created successfully!");
}
```

Important methods:

* `createNewFile()`
* `exists()`
* `getName()`
* `getPath()`
* `length()`
* `delete()`

---

### ✍️ 3. FileWriter

`FileWriter` is used to write character/text data into a file.

```java
FileWriter writer = new FileWriter("student.txt");

writer.write("Welcome to Day 15!");

writer.close();
```

For appending data without deleting existing content:

```java
FileWriter writer = new FileWriter("transaction.txt", true);
```

Here, `true` enables **append mode**.

---

### 📖 4. FileReader

`FileReader` is used to read character data from a text file.

```java
FileReader reader = new FileReader("student.txt");

int data;

while ((data = reader.read()) != -1) {
    System.out.print((char) data);
}

reader.close();
```

`read()` returns `-1` when the end of the file is reached.

---

### ⚡ 5. BufferedWriter

`BufferedWriter` is used to efficiently write text data.

```java
BufferedWriter writer =
    new BufferedWriter(new FileWriter("student.txt"));

writer.write("Hello Java");
writer.newLine();
writer.write("File Handling");

writer.close();
```

Useful methods:

* `write()`
* `newLine()`
* `close()`

---

### 📖 6. BufferedReader

`BufferedReader` is used to efficiently read text, especially line by line.

```java
BufferedReader reader =
    new BufferedReader(new FileReader("student.txt"));

String line;

while ((line = reader.readLine()) != null) {
    System.out.println(line);
}

reader.close();
```

`readLine()` returns `null` when there are no more lines.

---

### 💾 7. FileInputStream

`FileInputStream` is used to read **byte data**.

It is commonly useful for:

* Images
* Videos
* Audio
* PDFs
* Binary files

```java
FileInputStream input =
    new FileInputStream("student.txt");

int data;

while ((data = input.read()) != -1) {
    System.out.print((char) data);
}

input.close();
```

---

### 💾 8. FileOutputStream

`FileOutputStream` is used to write **byte data**.

```java
FileOutputStream output =
    new FileOutputStream("student.txt");

String text = "Hello Java";

output.write(text.getBytes());

output.close();
```

---

### ⚠️ 9. IOException

File operations can fail because of problems such as:

* File not found
* Invalid file path
* Permission issues
* File access problems

Java provides `IOException` to handle these errors.

```java
try {
    FileReader reader = new FileReader("student.txt");
} catch (IOException e) {
    System.out.println("File error occurred!");
}
```

---

# 🏦 Day 15 Mini Project

## Bank Transaction File Management System

The mini project extends the previous **Bank Account Management System** by adding file storage for transaction history.

### 🔄 Project Flow

```text
             BANK ACCOUNT
                  │
                  ▼
          Perform Transaction
                  │
          ┌───────┴───────┐
          ▼               ▼
       Deposit         Withdraw
          │               │
          └───────┬───────┘
                  ▼
          Transaction Data
                  │
                  ▼
             Write to File
                  │
                  ▼
          transaction.txt
                  │
                  ▼
          Read Transaction
             History
```

---

## 💡 Mini Project Features

* Create a bank account
* Deposit money
* Withdraw money
* Check account balance
* Store transactions in `transaction.txt`
* Read transaction history
* Handle invalid transactions
* Handle file-related exceptions
* Maintain previous transactions using append mode

---

## 📝 Example Transaction File

After performing transactions, `transaction.txt` contains:

```text
Deposited: ₹5000.0 | Balance: ₹15000.0
Withdrawn: ₹2000.0 | Balance: ₹13000.0
Deposited: ₹3000.0 | Balance: ₹16000.0
Withdrawn: ₹1000.0 | Balance: ₹15000.0
```

---

## 🧠 Key Concepts Learned

| Concept            | Purpose                        |
| ------------------ | ------------------------------ |
| `File`             | File and directory management  |
| `FileWriter`       | Write character data           |
| `FileReader`       | Read character data            |
| `BufferedWriter`   | Efficient text writing         |
| `BufferedReader`   | Efficient text reading         |
| `FileInputStream`  | Read byte data                 |
| `FileOutputStream` | Write byte data                |
| `IOException`      | Handle file-related errors     |
| `try-catch`        | Exception handling             |
| Append Mode        | Preserve existing file content |

---

## 🔑 Important Difference

```text
Reader / Writer
       ↓
Character-based
       ↓
Text Files


InputStream / OutputStream
       ↓
Byte-based
       ↓
Binary Files
```

### Easy way to remember:

**Reader → Read Characters**

**Writer → Write Characters**

**InputStream → Read Bytes**

**OutputStream → Write Bytes**

---

## 📂 Project Output

The program automatically creates:

```text
transaction.txt
```

and stores the complete transaction history.

This demonstrates how Java applications can use **file persistence** to store information even after the program terminates.

---

## 🎯 Day 15 Outcome

By the end of Day 15, I learned how to:

* Work with files in Java
* Create and manage files
* Write and read text files
* Use buffered streams
* Work with byte streams
* Handle `IOException`
* Use `try-catch` with file operations
* Implement file persistence in a real-world banking application

---

## 📈 50 Days Java Full Stack Challenge

**Day 15 / 50 ✅**

> Learning Java one day at a time, building projects along the way, and moving one step closer to becoming a Full Stack Developer. 🚀

### 🔥 Progress

```text
Day 01 → Java Basics
Day 02 → Control Flow
Day 03 → Arrays
Day 04 → Methods
Day 05 → Java Concepts
Day 06 → Java Practice
Day 07 → Employee Management System
Day 08 → Polymorphism & Payment Processing
Day 09 → Banking System
Day 10 → Encapsulation & Bank Account Management
Day 11 → Collections
Day 12 → Generics & Comparator
Day 13 → Exception Handling
Day 14 → Multithreading
Day 15 → File Handling ✅
```

---

## 🚀 What's Next?

Continuing the **50 Days Java Full Stack Challenge** with the next Java concept and another hands-on project.

**Day 15 Completed! ✅**

#Java #JavaProgramming #FileHandling #FileIO #JavaDeveloper #FullStackDevelopment #CodingChallenge #50DaysChallenge #LearningJava #Programming #DeveloperJourney

