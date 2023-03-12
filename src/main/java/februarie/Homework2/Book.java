/**
 * Book class definition
 *
 * @author Yours trully
 * @version 1.0
 */

package februarie.Homework2;

/**
 @param: bookName, totalPage;
 @return: Book Objects
 **/
public class Book {
    // the Book class has two fields
    public String bookName;
    public int totalPages;

    //the Book class has one constuctor
    public Book(String bookName, int totalPages) {
        this.bookName = bookName;
        this.totalPages = totalPages;
    }

    //the Book class has three methods
    //add new book
    public void addNewBook( String novelName, int number) {
        bookName = novelName;
        totalPages = number;
    }

    //method to delete a book
    public void deleteBook(){
        bookName = null;
        totalPages = 0;
    }

    //toString() method to print info about the book
    public String toString() {
        return (bookName + " has " + totalPages + " pages ");
    }
}

