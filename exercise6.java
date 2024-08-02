package Week1Task;

public class exercise6 {

	    private String bookId;
	    private String title;
	    private String author;
	    public exercise6(String bookId, String title, String author) {
	        this.bookId = bookId;
	        this.title = title;
	        this.author = author;
	    }
	    public String getBookId() {
	        return bookId;
	    }
	    public void setBookId(String bookId) {
	        this.bookId = bookId;
	    }

	    public String getTitle() {
	        return title;
	    }
	    public void setTitle(String title) {
	        this.title = title;
	    }
	    public String getAuthor() {
	        return author;
	    }

	   public void setAuthor(String author) {
	        this.author = author;
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
           System.out.println("Book found: " + foundBook.getTitle() + " by " + foundBook.getAuthor());
       } else {
           System.out.println("Book not found: " + searchTitle);
       }
	}
}
	