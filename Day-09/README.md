🚀 Day 09 of my 50 Days Java Full Stack Challenge

🏦 Mini Project: Banking System using Abstraction

Today, I built a simple Banking System in Java to practically understand and implement **Abstraction, Abstract Classes, Abstract Methods, Inheritance, Method Overriding, and Runtime Polymorphism**.

🔹 Project Structure:

BankAccount (Abstract Class)
│
├── SavingsAccount
│
└── CurrentAccount

🔹 1. Abstract Class — BankAccount

I created an abstract `BankAccount` class containing common properties:

• Account Number
• Account Holder
• Balance

It also contains common methods such as:

• deposit()
• withdraw()
• displayBalance()
• displayDetails()

The class also defines an abstract method:

`calculateInterest()`

This method does not contain an implementation because different types of bank accounts can calculate interest differently.

🔹 2. SavingsAccount

`SavingsAccount` extends `BankAccount` and provides its own implementation of `calculateInterest()`.

The interest is calculated using:

Interest = Balance × Interest Rate / 100

It also maintains a specific interest rate and displays savings account details.

🔹 3. CurrentAccount

`CurrentAccount` also extends `BankAccount`.

Unlike a savings account, a current account supports an **overdraft limit**.

I also overridden the `withdraw()` method to allow withdrawals using the available overdraft limit.

The `calculateInterest()` method is overridden because the current account in this project does not earn interest.

🔹 4. Runtime Polymorphism

One of the important concepts I implemented was:

`BankAccount savings = new SavingsAccount(...);`

`BankAccount current = new CurrentAccount(...);`

Although the reference type is `BankAccount`, Java executes the overridden method based on the actual object at runtime.

For example:

`savings.calculateInterest();`

calls the `SavingsAccount` implementation.

While:

`current.calculateInterest();`

calls the `CurrentAccount` implementation.

This helped me understand **runtime polymorphism in a practical way**.

🔹 Concepts Used:

✅ Abstraction
✅ Abstract Class
✅ Abstract Methods
✅ Inheritance
✅ Method Overriding
✅ Runtime Polymorphism
✅ Constructors
✅ Encapsulation using protected/private members

💡 Key Learning:

Abstraction allows us to define common functionality at the parent level while allowing child classes to provide their own specific implementations.

This project helped me understand how these OOP concepts can work together in a real-world scenario rather than learning them only theoretically.

🚀 Next Step:

Continuing my journey through the 50 Days Java Full Stack Challenge and strengthening my Java OOP fundamentals by building more practical mini projects.

#Day09 #50DaysJavaFullStackChallenge #Java #JavaProgramming #OOP #Abstraction #AbstractClass #Inheritance #Polymorphism #MethodOverriding #CodingJourney #LearningJava #FullStackDevelopment #Programming

