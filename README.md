
# Library Management System 📖

A simple console-based Library Management System built using Java. This project allows users to manage a collection of books by adding, viewing, borrowing, and returning books.


## Features

1. Add a Book
- Users can add new books to the library by providing a title and an author.

2. View Books
- Displays all books in the library, along with their availability status.

3. Borrow a Book
- Users can borrow a book by selecting its number, which marks it as unavailable.

4. Return a Book
- Allows users to return a borrowed book, making it available again.

5. Exit
- Exits the application.


## Technologies Used

- **Java:** The project is implemented in Java using classes and objects.
- **ArrayList:** To dynamically manage the collection of books.
- **Scanner:** For user inputs.


## How to Run

1. Clone the repository to your local machine:
```bash
git clone https://github.com/nipun-munasinghe/libraryManagementSystem-java-backend.git
```
2. Navigate to the project directory:
```bash
cd libraryManagementSystem-java-backend
```
3. Compile and run files
## Code Structure

- **Main.java:** Handles the menu-driven user interface and interaction with the library system.

- **Book.java:** Represents a book with attributes like title, author, and availability.

- **LibraryManager.java:** Manages the library's collection of books and provides methods to add, view, borrow, and return books.
## Usage

1. Start the program, and you will be greeted with a menu.
2. Select an option:
- **Add a Book:** Enter the book's title and author.
- **View Books:** See the list of all books with their availability status.
- **Borrow a Book:** Choose a book to borrow using its number.
- **Return a Book:** Choose a book to return using its number.
- **Exit:** Quit the application.


## Sample Output
```bash
Welcome to the Library Management System!

Menu:
1. Add a book
2. View books
3. Borrow a book
4. Return a book
5. Exit

Please enter your choice: 1

Enter the title of the book: Head First Java
Enter the author of the book: Joshua Bloch
Book successfully added!

Menu:
1. Add a book
2. View books
3. Borrow a book
4. Return a book
5. Exit

Please enter your choice: 2

Books in Library:
1. Title: Head First Java, Author: Joshua Bloch, Available: true
```
## Future Improvements

- Implement a database to persist book data.
- Add a graphical user interface (GUI).
- Introduce user authentication for admin and library members.

## Acknowledgements

- Java Documentation: [https://docs.oracle.com/javase/](https://docs.oracle.com/javase/)


## Contributing

Contributions are welcome! If you want to improve the library management system, feel free to fork the repository and submit a pull request.


## Contact

- Developer: Nipun Munasinghe
- LinkedIn: [Nipun Lakmal](https://www.linkedin.com/in/nipun-lakmal-b5b3652bb?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=ios_app)
- Email: nipunlakmal884@gmail.com
- GitHub: [nipun-munasinghe](https://github.com/nipun-munasinghe)
