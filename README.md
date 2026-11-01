# COS 201 — Computer Programming I

This repository contains my weekly Java practicals for COS 201. Each week's work is in its own folder, and this README explains what each program does and how to compile and run it.

## Student Details

| Field | Details |
|---|---|
| **Name** | Ige Enoch Moyosooreoluwa |
| **Matriculation Number** | 25/16540 |
| **Programme** | Cyber Security |
| **Course** | COS 201 — Computer Programming I |

## Repository Structure

```
cos-201/
├── README.md
├── .gitignore
├── week01/
│   └── FirstProgram.java
├── week02/
│   ├── HelloWorld.java
│   ├── StudentProfile.java
│   ├── PrintExample.java
│   └── ErrorExample.java
└── week03/
    ├── SimpleCalculator.java
    ├── AverageCalculator.java
    └── ItemCost.java
```

## Requirements

You need the Java Development Kit (JDK) to compile and run these programs. To check that it is installed, type these two commands in a terminal. Each one should print a version number.

```bash
java -version
javac -version
```

---

## Week 1: Introduction to Programming and Problem-Solving

### Practical Exercise

For Week 1 I wrote, compiled and ran my first Java program. It begins with the three welcome messages from the practical steps. Then it shows my course and programme, three reasons why programming is important in Computer Science (in my own words), and my learning goal for COS 201.

Activities A, B and C (input–process–output, algorithms, pseudocode and flowcharts) were handwritten on paper as instructed, so they are not in this repository.

### File

- `week01/FirstProgram.java`

### How to Run

```bash
cd week01
javac FirstProgram.java
java FirstProgram
```

### Output

```
Welcome to COS 201!
I am learning computer programming.
Programming begins with problem-solving.

Course: COS 201 - Computer Programming I
Programme: Cyber Security
Reason 1: Every computer, phone and network device only does what its code tells it to do.
Reason 2: A program can repeat a boring task, like checking thousands of records, quickly and without mistakes.
Reason 3: Many security problems begin as small coding errors, so careful programmers help keep systems safe.
My goal: To write Java programs that check their input and never crash on bad data.

My programme is running successfully.
I will practise programming every week.
```

### Skills Practised

- Creating a Java class with a `main` method
- Printing text with `System.out.println()`
- Printing an empty line to separate parts of the output
- Compiling with `javac` and running with `java`
- Uploading my work to GitHub

---

## Week 2: Development Environment and First Java Program

### Objective

To install and use a Java development environment, then write, compile and run simple Java programs and upload the source code to GitHub.

### Tools Used

- Java Development Kit (JDK)
- Visual Studio Code
- Git
- GitHub Desktop
- GitHub

### Files

| File | Description |
|---|---|
| `week02/HelloWorld.java` | Main practical. Prints a greeting and two lines about the course. |
| `week02/StudentProfile.java` | Personalised program. Prints my student profile: name, matric number, programme and course details. |
| `week02/PrintExample.java` | Practice on `print()` versus `println()`. My prediction of the output is in the comment at the top of the file. |
| `week02/ErrorExample.java` | "Find and fix the error" exercise. The original line had no semicolon, so the compiler reported `';' expected`. This file is the fixed version. |

### How to Run

1. Go into the Week 2 folder: `cd week02`
2. Compile the program: `javac HelloWorld.java`
3. Run it: `java HelloWorld`

The other three programs are compiled and run the same way, for example `javac StudentProfile.java` then `java StudentProfile`.

### Output

`HelloWorld`

```
Hello, World!
Welcome to COS 201.
I am learning Java programming.
```

`StudentProfile`

```
==================================
          STUDENT PROFILE
==================================
NAME: Ige Enoch Moyosooreoluwa
MATRIC NO: 25/16540
PROGRAMME: Cyber Security
COURSE: COS 201
COURSE TITLE: Computer Programming I
WEEK: 2
TOPIC: Development Environment and Java
GOAL: To build a strong Java foundation for secure software.
==================================
```

`PrintExample` (this matched my prediction)

```
COS 201
Java
```

`ErrorExample` (after adding the missing semicolon)

```
Learning Java
```

### Learning Outcome

I can now set up a Java project in Visual Studio Code, compile and run it from the terminal, and push it to GitHub. I learned that `print()` leaves the cursor on the same line while `println()` ends the line, and that reading the compiler's error message (such as `';' expected`) shows me which line to fix.

---

## Week 3: Variables, Data Types, Expressions and Input/Output

### Objectives

- Declare and initialise variables.
- Choose suitable data types (`int`, `double` and `String`).
- Write arithmetic expressions.
- Read keyboard input with `Scanner`.
- Display formatted output with `printf()`.
- Compile, test and submit Java programs on GitHub.

### Programs

1. **`week03/SimpleCalculator.java`**
   - Asks for two numbers, then shows their sum, difference, product and quotient to two decimal places.
   - Only divides when the second number is not zero. Otherwise it prints `Quotient: cannot divide by zero.`
2. **`week03/AverageCalculator.java`**
   - Asks for a student's name and three course scores, then shows the total and the average.
   - Extension exercise: each score must be from 0 to 100. If any score is outside that range, the program prints an error and does not calculate a result.
3. **`week03/ItemCost.java`**
   - Asks for an item name, the quantity and the unit price, then prints a purchase summary with the total cost (quantity × unit price).
   - Prints an error instead of a total if the quantity is less than 1 or the unit price is negative.

### How to Run

Go into the Week 3 folder first:

```bash
cd week03
```

Simple calculator:

```bash
javac SimpleCalculator.java
java SimpleCalculator
```

Average calculator:

```bash
javac AverageCalculator.java
java AverageCalculator
```

Item cost:

```bash
javac ItemCost.java
java ItemCost
```

Each program asks for its values one at a time. Type a value and press **Enter**.

### Sample Runs

`SimpleCalculator`

```
Enter the first number: 45
Enter the second number: 12
Sum: 57.00
Difference: 33.00
Product: 540.00
Quotient: 3.75
```

`AverageCalculator`

```
Enter student name: Ige Enoch Moyosooreoluwa
Enter score for Course 1: 67
Enter score for Course 2: 72
Enter score for Course 3: 88

--- STUDENT RESULT ---
Student: Ige Enoch Moyosooreoluwa
Total: 227.00
Average: 75.67
```

`ItemCost`

```
Enter item name: Flash Drive
Enter quantity: 3
Enter unit price: 4500

--- PURCHASE SUMMARY ---
Item: Flash Drive
Quantity: 3
Unit price: 4500.00
Total cost: 13500.00
```

### Testing

I ran each program with normal values, boundary values and invalid values, and checked every answer against my own calculation.

| Program | Test | Input | Expected result | Pass |
|---|---|---|---|---|
| SimpleCalculator | Normal | 45 and 12 | Sum 57.00, Difference 33.00, Product 540.00, Quotient 3.75 | ✔ |
| SimpleCalculator | Negative and decimal | -9 and 2.5 | Sum -6.50, Difference -11.50, Product -22.50, Quotient -3.60 | ✔ |
| SimpleCalculator | Zero first number | 0 and 4 | Sum 4.00, Difference -4.00, Product 0.00, Quotient 0.00 | ✔ |
| SimpleCalculator | Zero divisor | 17 and 0 | Sum, difference and product shown; `Quotient: cannot divide by zero.` | ✔ |
| AverageCalculator | Normal | 67, 72, 88 | Total 227.00, Average 75.67 | ✔ |
| AverageCalculator | Boundary scores | 0, 100, 100 | Total 200.00, Average 66.67 | ✔ |
| AverageCalculator | Decimal scores | 55.5, 60, 64.5 | Total 180.00, Average 60.00 | ✔ |
| AverageCalculator | Score above 100 | 105, 60, 70 | Error message; no result | ✔ |
| AverageCalculator | Score below 0 | 80, -3, 70 | Error message; no result | ✔ |
| ItemCost | Normal | Flash Drive, 3 × 4500 | Total cost 13500.00 | ✔ |
| ItemCost | Decimal price | Exercise Book, 20 × 150.75 | Total cost 3015.00 | ✔ |
| ItemCost | Boundary (1 item, price 0) | Free Brochure, 1 × 0 | Total cost 0.00 | ✔ |
| ItemCost | Quantity 0 | Pen, 0 × 100 | Error message; no total | ✔ |
| ItemCost | Negative price | Pen, 5 × -50 | Error message; no total | ✔ |

### Things to Note

- Type only digits (and a decimal point) when a program asks for a number. Letters or symbols such as `₦` or `,` make Java stop with an `InputMismatchException`.
- In `ItemCost`, the quantity is stored as an `int`, so it must be a whole number like `3`, not `3.5`.

### Learning Outcome

This week I learned to pick the right data type for each value (`String` for names, `int` for counts and `double` for scores and prices), read input from the keyboard with `Scanner`, and calculate results with arithmetic expressions. I also learned to show numbers to two decimal places with `printf("%.2f")` and to use an `if` statement to check input before calculating, so an impossible value such as a score of 105 or a quantity of 0 cannot produce a wrong answer.
