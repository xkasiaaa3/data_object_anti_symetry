# Data/Object Anti-Symmetry

This repository is exercise on comparing procedural code with OOP version. It's made as part of Java course.

This example is taken from the Data/Object Anti-Symmetry chapter of the Clean Code book by Robert C. Martin. 

> These two examples show the difference between objects and data structures. Objects hide their data behind abstractions and expose functions that operate on that data. Data structure expose their data and have no meaningful functions

Excerpt From
Clean Code: A Handbook of Agile Software Craftsmanship
Martin, Robert C.

Make a fork of this repository and clone it to your machine.

## 1. Create OOP version of the program

Implement OOP version of the procedural code that can be found in `org.geometry.procedural` package.
There is already a [`Geometry` class](./src/main/java/org/geomerty/oop/Geometry.java) for OOP code. It is also an entry point for the program.
Implement `Point`, `Point`, `Square` and `Rectangle` classes in best practices of OOP employing encapsulation, polymorphism and inheritance (if needed).
Make a commit to the git repository.

Describe how application has changed?

## 2. Add a new operation

Add *perimeter* calculation to both procedural and oop code. Observe how many changes you need to make in each of given cases.
Make a commit to the git repository.
You might want to use `git show` of `git diff` (if you haven't committed changes yet) to compare the changes to both versions.

## 3. Add a new type

Add *triangle* shape to both procedural and oop code. Observe how many changes you need to make in each of given cases.
Make a commit to the git repository.
You might want to use `git show` of `git diff` (if you haven't committed changes yet) to compare the changes to both versions.

## 4. Make conclusions

Given you observations what conclusions you can make about procedural vs OOP way of writing code.
Create a `my-coclusions.md` file and write there your conclusions.

When you are ready check Robert C. Martin's conclusion in [conclusions.md](./conclusions.md) file.

## 5. Push you code for reviewal

Push the code to the remote repository for reviewal. Create a PR to the upstream repository.
To make it easier for your peer to find you PR, write your github username as the PR title.

## 6. Give feedback to your peer of the day

Find the PR of your peer of the day. Review the code, read their conclusion.
Give them feedback. Feedback could include strong points, questions or friendly suggestions about improvements.