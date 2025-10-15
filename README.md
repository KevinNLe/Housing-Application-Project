# Housing-Application-Project

🏠 Project Name: Housing Application

This project represents a simple Java program that could be used as part of a system where users apply for housing. The main goal of the project is to collect and manage information about a housing applicant in an organized and secure way.

💡 Overview

The project defines one main class, Application, which stores a person’s basic information such as their name, password, birthday, and ZIP code. It uses object-oriented programming (OOP) principles — specifically encapsulation — to protect the data and ensure it’s used correctly.

🧩 Class: Application

This class contains five private instance variables:

private String firstName;
private String lastName;
private String password;
private String birthday;
private int zipcode;


These represent the applicant’s details. The use of private means that other parts of the program can’t directly access or modify these variables. Instead, the program uses getters and setters to safely control access.

🧱 Constructor
public Application(String firstName, String lastName, String password, String birthday, int zipcode)


The constructor initializes a new Application object with the user’s details. When you create a new applicant, you pass all this information into the constructor, and it stores the data in the corresponding fields.

Example:

Application app = new Application("John", "Doe", "PassWord123", "01/01/1990", 28223);

⚙️ Getters and Setters

The class provides setter and getter methods for each variable:

Getters (like getFirstName()) return the stored value.

Setters (like setFirstName(String firstName)) update the value — but only after checking that the input is valid.

🛡️ Input Validation

One of the most important features is input validation, which ensures that data entered is correct and safe:

First and Last Name

if (firstName.isEmpty()) {
    throw new IllegalArgumentException("First name cannot be empty");
}


This prevents empty names from being set.

Password

if (password.length() <= 6 || password.length() >= 15 ||
    !password.matches(".*[A-Z].*") || !password.matches(".*[a-z].*")) {
    throw new IllegalArgumentException("Password must be between 6 and 15 characters long and contain both uppercase and lowercase letters");
}


The password must:

Be between 6 and 15 characters long.

Contain at least one uppercase and one lowercase letter.

If not, the program throws an error message explaining the issue.

Zipcode
The ZIP code is stored as an integer, which could later be used for filtering or location-based housing searches.
