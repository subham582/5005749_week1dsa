package Week1Task;

public class exercise6a {
	//Implement Linear Search and Binary Search:
	//Linear Search to Find Books by Title:
	
	    private exercise6[] books;
	    private int size;
	    public exercise6a(int capacity) {
	        books = new exercise6[capacity];
	        size = 0;
	    }
	    public void addBook(exercise6 book) {
	        if (size < books.length) {
	            books[size] = book;
	            size++;
	        } else {
	            System.out.println("Library is full. Cannot add more books.");
	        }
	    }
	    public exercise6 linearSearchByTitle(String title) {
	        for (int i = 0; i < size; i++) {
	            if (books[i].getTitle().equalsIgnoreCase(title)) {
	                return books[i];
	            }
	        }
	        return null;
	    }
	
public static void main(String[] args) {
	exercise6a library = new exercise6a(5);

    // Add some books to the library
    library.addBook(new exercise6("1", "The Great Gatsby", "F. Scott Fitzgerald"));
    library.addBook(new exercise6("2", "1984", "George Orwell"));
    library.addBook(new exercise6("3", "To Kill a Mockingbird", "Harper Lee"));
    library.addBook(new exercise6("4", "The Catcher in the Rye", "J.D. Salinger"));
    library.addBook(new exercise6("5", "Moby-Dick", "Herman Melville"));

    // Search for a book by title
    String searchTitle = "1984";
    exercise6 foundBook = library.linearSearchByTitle(searchTitle);

    // Display the search result
    if (foundBook != null) {
        System.out.println("Book found: " + foundBook);
    } else {
        System.out.println("Book not found: " + searchTitle);
    }
}
}
