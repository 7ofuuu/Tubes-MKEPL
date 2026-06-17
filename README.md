# Library Management System 📚

A simple Library Management System developed in Java, allowing users to borrow and return books with ease. The system enables users to interact with a collection of books and view available books, borrow books, and return them. 📖

## Features ✨

- **Add Books** ➕: Add books to the library collection.
- **Display Available Books** 👀: View a list of books that are available to borrow.
- **Borrow Books** 🎧: Borrow a book if it's available.
- **Return Books** 🔙: Return a book to the library.
- **Exit Option** 🚪: Exit the system after completing operations.

## Technologies Used 🛠️

- Java ☕
- Object-Oriented Programming (OOP) 🔄
- Data Structures: ArrayList 📊

## How to Use 🚀

1. **Clone the Repository**:
   To use the Library Management System, clone the repository to your local machine:
   ```bash
   git clone <repo-url>
   ```

2. **Run the Program**:
   Open the project in your favorite IDE (like IntelliJ IDEA or Eclipse) or run it from the terminal:
   ```bash
   java LibraryManagementSystem
   ```

3. **Interact with the System**:
   - You will be prompted with a list of available books in the library.
   - You will have the option to either **borrow** or **return** a book.
   - Type `exit` to quit the program. 👋

## Example Workflow 🔄

- The user can first see the list of available books.
- The user will then be prompted to either borrow or return a book.
- If the user chooses to borrow a book, they will enter the book's title and author, and the book will be marked as borrowed. 📚
- Similarly, if the user chooses to return a book, they will enter the title and author, and the book will be marked as returned. 🔄

## Code Structure 🏗️

- **Library.java** 📦: Contains the logic for adding books, displaying available books, borrowing, and returning books.
- **Book.java** 📖: Represents individual books with properties such as title, author, and availability status.
- **LibraryManagementSystem.java** 🎮: Contains the main program logic, where the user interacts with the system via the console.

## Example:

```
Available Books:
Verity by Colleen Hoover
The Secret by Rhonda Byrne
Grit by Angela Duckworth

Do you want to borrow or return a book?
Type 'borrow' to borrow a book, 'return' to return a book, or 'exit' to quit.
borrow

Enter the title of the book you want to borrow: The Secret
Enter the author of the book you want to borrow: Rhonda Byrne
You have successfully borrowed 'The Secret' by Rhonda Byrne. ✅

Available Books:
Verity by Colleen Hoover
Grit by Angela Duckworth
```

## Future Enhancements 🔮

- Implement search functionality to search for books by title or author 🔍.
- Add a due date feature for borrowed books 📅.
- Implement user authentication to maintain a history of borrowed books for each user 🧑‍💻.

testing workflow 3