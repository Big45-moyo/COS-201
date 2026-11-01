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
└── week02/
    ├── HelloWorld.java
    ├── StudentProfile.java
    ├── PrintExample.java
    └── ErrorExample.java
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
