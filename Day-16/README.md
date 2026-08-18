# 🚀 Day 16/50 — Lambda Expressions, Functional Interfaces & Method References

![Java](https://img.shields.io/badge/Java-22-orange?style=for-the-badge&logo=openjdk)
![Lambda](https://img.shields.io/badge/Lambda%20Expressions-blue?style=for-the-badge)
![Functional%20Interface](https://img.shields.io/badge/Functional%20Interfaces-purple?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)

---

# ☕ 50 Days Java Full Stack Development Challenge

## 📅 Day 16 — Lambda Expressions, Functional Interfaces & Method References

**Day 16 completed! 🎉**

Today I learned how **Lambda Expressions, Functional Interfaces, Built-in Functional Interfaces, and Method References** can make Java code shorter, cleaner, and easier to understand.

---

## 📚 Topics Covered

- ✅ Lambda Expressions
- ✅ Functional Interfaces
- ✅ `@FunctionalInterface`
- ✅ Built-in Functional Interfaces
- ✅ `Predicate<T>`
- ✅ `Consumer<T>`
- ✅ `Function<T, R>`
- ✅ `Supplier<T>`
- ✅ Method References
- ✅ Practical implementation using a mini project

---

# 1️⃣ Lambda Expressions

A **Lambda Expression** is a concise way to provide an implementation for a functional interface.

### Syntax

```java
(parameters) -> expression
```

or:

```java
(parameters) -> {
    // statements
}
```

### Example

```java
@FunctionalInterface
interface Greeting {
    void sayHello();
}

public class Main {

    public static void main(String[] args) {

        Greeting greeting = () ->
            System.out.println("Hello Java!");

        greeting.sayHello();
    }
}
```

### Output

```text
Hello Java!
```

---

# 2️⃣ Functional Interface

A **Functional Interface** is an interface that contains exactly **one abstract method**.

Example:

```java
@FunctionalInterface
interface Calculator {

    int calculate(int a, int b);
}
```

The `@FunctionalInterface` annotation tells the compiler that the interface is intended to contain one abstract method.

A functional interface can also contain:

- `default` methods
- `static` methods

---

# 3️⃣ Built-in Functional Interfaces

Java provides several built-in functional interfaces inside:

```java
java.util.function
```

The four important interfaces covered today are:

| Interface | Input | Output | Main Method |
|---|---|---|---|
| `Predicate<T>` | Yes | `boolean` | `test()` |
| `Consumer<T>` | Yes | Nothing | `accept()` |
| `Function<T,R>` | Yes | Yes | `apply()` |
| `Supplier<T>` | No | Yes | `get()` |

### Easy Way to Remember

```text
Predicate → Test
Consumer  → Accept
Function  → Apply
Supplier  → Get
```

---

# 🔍 Predicate<T>

`Predicate<T>` accepts an input and returns a `boolean`.

### Method

```java
test()
```

### Example

```java
Predicate<Integer> isEven =
        number -> number % 2 == 0;

System.out.println(isEven.test(10));
```

### Output

```text
true
```

### Concept

```text
Input → Predicate → boolean
```

---

# 🖨️ Consumer<T>

`Consumer<T>` accepts an input but does not return a value.

### Method

```java
accept()
```

### Example

```java
Consumer<String> printer =
        name -> System.out.println(name);

printer.accept("Jashu");
```

### Output

```text
Jashu
```

### Concept

```text
Input → Consumer → No Return Value
```

---

# ⚙️ Function<T, R>

`Function<T, R>` accepts one input and returns one output.

### Method

```java
apply()
```

### Example

```java
Function<Integer, Integer> square =
        number -> number * number;

System.out.println(square.apply(5));
```

### Output

```text
25
```

### Concept

```text
Input → Function → Output
```

---

# 📦 Supplier<T>

`Supplier<T>` takes no input but returns a value.

### Method

```java
get()
```

### Example

```java
Supplier<String> message =
        () -> "Welcome to Day 16!";

System.out.println(message.get());
```

### Output

```text
Welcome to Day 16!
```

### Concept

```text
No Input → Supplier → Output
```

---

# 4️⃣ Method References

A **Method Reference** is a shorthand way to refer to an existing method.

The syntax is:

```java
::
```

### Lambda Expression

```java
name -> System.out.println(name)
```

### Method Reference

```java
System.out::println
```

Both can perform the same operation when their method signatures match.

---

# 🔹 Types of Method References

## 1. Static Method Reference

Syntax:

```java
ClassName::staticMethod
```

Example:

```java
class Calculator {

    static int square(int number) {
        return number * number;
    }
}
```

Using the method reference:

```java
Function<Integer, Integer> result =
        Calculator::square;

System.out.println(
    result.apply(5)
);
```

### Output

```text
25
```

---

## 2. Instance Method of a Particular Object

Syntax:

```java
object::instanceMethod
```

Example:

```java
Calculator calculator = new Calculator();

Function<Integer, Integer> result =
        calculator::square;
```

---

## 3. Instance Method of an Arbitrary Object

Syntax:

```java
ClassName::instanceMethod
```

Example:

```java
Function<String, String> upperCase =
        String::toUpperCase;

System.out.println(
    upperCase.apply("java")
);
```

### Output

```text
JAVA
```

---

## 4. Constructor Reference

Syntax:

```java
ClassName::new
```

Example:

```java
Supplier<ArrayList<String>> listCreator =
        ArrayList::new;

ArrayList<String> list =
        listCreator.get();
```

---

# 🎓 Day 16 Mini Project

# Student Result Processing System

Today's concepts were combined into a practical **Student Result Processing System**.

The project demonstrates how **Predicate, Function, Consumer, Lambda Expressions, and Method References** can be used together to process student information.

---

## 🏗️ Project Flow

```text
             STUDENT RESULT SYSTEM
                       │
                       ▼
                  Student List
                       │
          ┌────────────┼────────────┐
          ▼            ▼            ▼
       Predicate     Function     Consumer
          │            │            │
          ▼            ▼            ▼
       Filter       Calculate      Display
       Students       Result       Results
                       │
                       ▼
                Method Reference
```

---

# ✨ Project Features

- ➕ Add Students
- 📋 Display Students
- 🔍 Filter Passed Students
- 📊 Calculate Results
- 🖨️ Display Student Information
- 🔗 Use Method References

---

# 💻 Example

Filtering passed students:

```java
students.stream()
        .filter(student ->
            student.getMarks() >= 40
        )
        .forEach(System.out::println);
```

This example demonstrates:

```text
filter()
   ↓
Predicate
   ↓
Lambda Expression

forEach()
   ↓
Consumer
   ↓
Method Reference
```

---

# 🧠 Key Learnings

Through Day 16, I learned:

- 🔹 How Lambda Expressions work
- 🔹 How Functional Interfaces work
- 🔹 How `@FunctionalInterface` is used
- 🔹 How `Predicate` works
- 🔹 How `Consumer` works
- 🔹 How `Function` works
- 🔹 How `Supplier` works
- 🔹 How Method References work
- 🔹 Different types of Method References
- 🔹 How functional programming concepts can simplify Java code

---

# 🌍 Real-World Applications

These concepts can be useful in:

### 🎓 Student Management

```text
Filter Students
Calculate Grades
Display Results
```

### 🛒 E-Commerce

```text
Filter Products
Calculate Prices
Process Orders
```

### 👨‍💼 Employee Management

```text
Filter Employees
Calculate Salaries
Display Employee Details
```

### 📊 Data Processing

```text
Filter Data
Transform Data
Process Collections
```

---

# 🛠️ Technologies Used

```text
☕ Java
🧩 Functional Interfaces
λ Lambda Expressions
🔗 Method References
📚 Java Collections
💻 Eclipse IDE
🌿 Git
🐙 GitHub
```

---

# 📂 Project Structure

```text
Day-16/
│
├── Main.java
├── Student.java
└── README.md
```

---

# ▶️ How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/jashwanth345/50-Days_Java-Full-Stack-Challenge.git
```

### 2. Navigate to Day 16

```bash
cd 50-Days_Java-Full-Stack-Challenge/Day-16
```

### 3. Compile

```bash
javac *.java
```

### 4. Run

```bash
java Main
```

---

# 🎯 Interview Questions

### 1. What is a Lambda Expression?

A Lambda Expression is a concise way of implementing a functional interface.

### 2. What is a Functional Interface?

A Functional Interface is an interface containing exactly one abstract method.

### 3. What is `@FunctionalInterface`?

It is an annotation used to indicate that an interface is intended to be a functional interface.

### 4. What is Predicate?

`Predicate<T>` accepts an input and returns a boolean using the `test()` method.

### 5. What is Consumer?

`Consumer<T>` accepts an input and returns no result using the `accept()` method.

### 6. What is Function?

`Function<T,R>` accepts an input and returns a result using the `apply()` method.

### 7. What is Supplier?

`Supplier<T>` takes no input and returns a value using the `get()` method.

### 8. What is a Method Reference?

A Method Reference is a shorthand notation for referring to an existing method using `::`.

### 9. What are the types of Method References?

The main types are:

1. Static method reference
2. Instance method of a particular object
3. Instance method of an arbitrary object
4. Constructor reference

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
Day 12  ✅
Day 13  ✅
Day 14  ✅
Day 15  ✅
Day 16  ✅
```

## 🔥 16 / 50 Days Completed

```text
████████████████░░░░░░░░░░░░░░░░░░░░░░░░

                    32%
```

### 🚀 16 Days Down • 34 Days To Go!

---

# 🔗 GitHub Repository

[50 Days Java Full Stack Development Challenge](https://github.com/jashwanth345/50-Days_Java-Full-Stack-Challenge?utm_source=chatgpt.com)

---

<div align="center">

# ☕ Day 16 — Lambda Expressions & Functional Interfaces

## 🎓 Student Result Processing System

### ✅ COMPLETED

**Learn → Practice → Build → Share → Grow 🚀**

### 🔥 16 / 50 Days Completed

### 📊 32% of the Challenge Completed

</div>
