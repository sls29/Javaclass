/**
 * Novel class definition
 *
 * @author Yours trully
 * @version 1.0
 */
package main.java.februarie.Homework2;

//class Library
public class Library {

    public static void main(String[] args) {

    System.out.println(""); //rand liber

    // define and list new objects
    Album book1 = new Album("First Album", 223, "best");
    System.out.println(book1.toString());

    Novel book2 = new Novel("First Novel", 334, "Science Fiction", 16);
    System.out.println(book2.toString());

    Novel book3 = new Novel("Second Novel", 556, "Romance", 18);
    System.out.println(book3.toString());

    System.out.println(" "); //rand liber

    // call deleteAlbum() and deleteNovel(). Both methods clears objects attributes (null and zero)
    book1.deleteAlbum();
    book2.deleteNovel();
    book3.deleteNovel();

    System.out.println(book1.toString());
    System.out.println(book2.toString());
    System.out.println(book3.toString());

    System.out.println("");
    System.out.println(" Eh, ...merge?");
    }
}
