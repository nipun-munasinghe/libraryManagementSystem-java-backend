import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LibraryManager libraryManager = new LibraryManager();
        Scanner scanner = new Scanner(System.in);

        boolean run = true;

        System.out.println("Welcome to the Library Management System!\n");

        while(run == true) {
            System.out.print("Menu:\n" +
                    "1. Add a book\n" +
                    "2. View books\n" +
                    "3. Borrow a book\n" +
                    "4. Return a book\n" +
                    "5. Exit\n\n" +
                    "Please enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 1:
                    System.out.print("Enter the title of the book: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter the author of the book: ");
                    String author = scanner.nextLine();
                    libraryManager.addBook(new Book(title,author));
                    break;
                case 2:
                    libraryManager.viewBooks();
                    break;
                case 3:
                    System.out.print("Enter the number of the book you want to borrow: ");
                    int borrowIndex = scanner.nextInt()-1;
                    libraryManager.borrowBook(borrowIndex);
                    break;
                case 4:
                    System.out.print("Enter  the book number do you want to return: ");
                    int returnIndex = scanner.nextInt()-1;
                    libraryManager.returnBook(returnIndex);
                    break;
                case 5:
                    run = false;
                    System.out.println("You have successfully exited! " +
                            "Thank you for using the Library Management System.");
                    break;
                default:
                    System.out.println("Please enter a valid number!");
                    break;
            }
        }
        scanner.close();
    }
}
