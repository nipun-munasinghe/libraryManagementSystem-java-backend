import java.util.ArrayList;

public class LibraryManager {

    private ArrayList<Book> books = new ArrayList<>();

    //method to add a book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book successfully added!\n");
    }

    //method to view books
    public void viewBooks() {
        if(books.isEmpty()) {
            System.out.println("No books available right now.\n");
        }
        else {
            System.out.println("\nBooks in Library:");
            for (int i=0; i<books.size(); i++) {
                System.out.println((i+1) + ". "+ books.get(i));
            }
        }
    }

    //method to borrow books
    public void borrowBook(int index) {
        if(index < 0 || index >= books.size()) {
            System.out.print("Invalid book number:(\n");
        }
        else if (!books.get(index).isAvailable()) {
            System.out.print("Sorry, the book is already borrowed:(\n");
        }
        else {
            books.get(index).setAvailable(false);
            System.out.print("You have successfully borrowed the "+books.get(index).getTitle()+" book :)\n");
        }
    }

    //method to return book
    public void returnBook(int index) {
        if(index < 0 || index >= books.size()) {
            System.out.println("Invalid book number:(");
        }
        else if (books.get(index).isAvailable()) {
            System.out.println("The book is already in the library!");
        }
        else {
            books.get(index).setAvailable(true);
            System.out.println("you have successfully returned the "+books.get(index).getTitle()+" book:)");
        }
    }
}
