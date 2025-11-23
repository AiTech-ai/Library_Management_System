# Library_Management_System

Name: Sumit Kumar Sah

Course: Programming in Java

# Project Overview

The Library Management system is a software application developed to simplify and automate the daily operations of a library. So, you can take the example like managing books manually often leads to errors, confusion, and delays in tracking issued or returned books. This system provides organized and reliable way to handle library resources efficiently.While developing the project I focused on making it simple and practical for library use. It helps to save time, also ensures the proper record management and also improves the overall functioning of the library. This system is suitable for small to medium-sized in schools and colleges where the maintaining structured book data is very important.

# Key Features Of Library Management System
## 1. Book Management

  * Add new books with details (Title, Author, ID, Quantity)
  * Update existing book information
  * Delete books from the system
  * Search books by name or ID
  * Display all books with availability status

## 2. Member Management 

  * Add new library members
  * View and Update member details
  * Assign unique member ID
  * Maintain member borrowing records

## 3. Issue and Return 
  * Issue book to registered members
  * Automatically Update the book quantity
  * Return books and availability
  * Block Issuing if Book is out of Stock

## 4. Report and Record Module
  * Show list of issued books
  * Show list of available books
  * Display member wise borrowing history
  * Generate Summary of library activity

# Technologies/Tools Used
* Java(JDK or Above)- Core Programming Language.
* Object Oriented Programming(OOP)- for modular design
* Java Collections Framework – Array List for data storage
* Scanner Class – For user input handling
* Local Date API – For managing issue and return dates
* VirtualStudio(VS Code)- Code Editor
* Git & GitHub – Version control and project hosting

# Steps to Install & Run the Project
## 1. Prerequisites
Ensure the following are installed:
* Java JDK 8 or higher
* Any Java IDE or Command Prompt / Terminal

## 2. Clone the Repository
Use the following command to clone the project from GitHub:

git clone https://github.com/AiTech-ai/Library_Management_System

## 3. Navigate to Project Folder

cd LibraryManagementSystem

## 4. Compile All Java Files
javac *.java

## 5. Run the Application
java LibraryApp

The Console based menu will appear, allowing you to interact with the system.

# Instructions for Testing
## 1. Launch the Application
* Run the program using:
  * javac *.java
  
  * java LibraryApp

Confirm that the main menu is displayed without errors.

## 2. Test – Add Books
* From the menu, choose option 1 (Add Book).
* Enter valid details (title, author, copies).
* Repeat for 2–3 different books.
* Then choose option 2 (View All Books) and verify that:
  * All added books appear
  * Each book has a unique Book ID.
  * Available copies match the entered quantity.

## 3. Test – Add Members
* Choose option 4 (Add Member).
* Enter valid name and email.
* Add 2–3 members.
* Use option 5 (View All Members) and verify that:
    * Members are listed with unique Member IDs.
    * Names and emails are correctly displayed.
  
## 4. Test – Issue Book
* Note a valid Book ID and Member ID from previous steps.
* Choose option 6 (Issue Book).
* Enter the Book ID and Member ID.
* Check that:
    * A transaction is created with a Transaction ID.
    * The record appears under option 8 (View Currently Issued Books).

## 5. Test – Return Book
* From the issued books list (option 8), note a Transaction ID.
* Choose option 7 (Return Book).
* Enter that Transaction ID.
* Verify that:
    * The record now shows a return date.
    * The same transaction cannot be returned again.

## 6. Test – Search Book by Title
* Choose option 3 (Search Book by Title).
* Enter a keyword from an existing book title.
* Confirm that:
  * Matching books are displayed.
  * Searching with a random keyword shows “No matching books found.”

## 7. Test – Exit
* Choose option 0.
* Confirm that the application exits gracefully with a goodbye message.

# Functional Modules 
## 1. Book Management Module
This module handles all operations related to library books.

* Add new books to the system
* Update book details (title, author, quantity)
* Delete book records
* Search books by title or ID
* View list of all books with availability status

## 2. Member Management Module
This module manages student or user information.

* Register new members
* View member details
* Maintain unique member ID
* Update member records if required

## 3. Issue Book Module
This module controls the process of issuing books to members.

* Issue books to registered members
* Verify book availability
* Record issue date and due date
* Reduce available book quantity
* Generate transaction ID

## 4. Return Book Module
This module manages the returning process.

* Accept returned books
* Update return date
* Increase available book quantity
* Prevent duplicate return of same book
* Display confirmation message






