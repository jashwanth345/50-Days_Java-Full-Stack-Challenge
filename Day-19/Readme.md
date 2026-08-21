# 🚀 Day 19/50 — JDBC-1

## 📚 Topic: Java Database Connectivity (JDBC)

Today I learned the fundamentals of **JDBC (Java Database Connectivity)** and how Java applications communicate with relational databases such as MySQL.

---

## 🎯 Learning Objectives

By the end of Day 19, I learned:

- What is JDBC?
- Why JDBC is required
- JDBC Architecture
- JDBC API and Driver
- JDBC Components
- Connecting Java with MySQL
- Database and table setup
- CRUD Operations
- Using `PreparedStatement`
- Using `ResultSet`
- Handling `SQLException`

---

# 1️⃣ What is JDBC?

**JDBC (Java Database Connectivity)** is a Java API used to connect Java applications with databases.

It allows Java applications to:

- Connect to a database
- Insert data
- Retrieve data
- Update data
- Delete data

### Basic Flow

```text
Java Application
       ↓
    JDBC API
       ↓
  JDBC Driver
       ↓
    MySQL
