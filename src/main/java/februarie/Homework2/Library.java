/**
 * Novel class definition
 *
 * @author Yours trully
 * @version 1.0
 */
package februarie.Homework2;

import java.util.*;

//class Library
public class Library {

    public static void main(String[] args) {

        System.out.println(" "); //empty row

        // define new books
        Album book1 = new Album("First Album", 223, "best");
        Novel book2 = new Novel("First Novel", 334, "Science Fiction", 16);
        Novel book3 = new Novel("Second Novel", 556, "Romance", 18);

        List<Book> Books = new LinkedList<>();

        Books.add(book1);
        System.out.println("First book added");
        Books.add(book2);
        System.out.println("Second book added");
        Books.add(book3);
        System.out.println("Third book added");
        System.out.println("--------------------------------");

        System.out.println("The following books are in the Library");

        for (Book book : Books) {
            System.out.println(" - " + book + ".");
        }

        Books.remove(book1);
        System.out.println("--------------------------------");
        System.out.println("First book removed");
        Books.remove(book2);
        System.out.println("Second book removed");

        System.out.println("--------------------------------");
        System.out.println("The following books are in the Library");
        System.out.println(Books);

        Books.remove(book3);

        System.out.println("--------------------------------");
        System.out.println("The following books are in the Library");
        System.out.println(Books);
        System.out.println("Library is empty");
    }
}