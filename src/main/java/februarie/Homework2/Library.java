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
        Books.add(book2);
        Books.add(book3);

        for (Book book : Books) {
            System.out.println(book);
        }

        Books.remove(book1);
        Books.remove(book2);
        Books.remove(book3);

        System.out.println(Books);
    }
}