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
    public int totalPage;

    //the Book class has one constuctor
    public Book(String bookName, int totalPage) {
        this.bookName = bookName;
        this.totalPage = totalPage;
    }

    //the Book class has three methods
    //add new book
    public void addNewBook( String novelName, int number) {
        bookName = novelName;
        totalPage = number;
    }

    //method to delete a book
    public void deleteBook(){
        bookName = null;
        totalPage = 0;
    }

    //toString() method to print info about the book
    public String toString() {
        return (bookName + " has " + totalPage + " pages ");
    }
}

