/**
 * Novel class definition
 *
 * @author Yours trully
 * @version 1.0
 */

package februarie.Homework2;

/**
 @param: bookName, totalPage, bookType, ageRating.
 @return: Novel Objects
 **/

    // Novel class
public class Novel extends Book {
    String bookType;
    int ageRating;
    //the Novel class has one constructor
     public Novel(String bookName, int totalPages, String bookType, int ageRating) {
         super(bookName, totalPages);

         this.bookType = bookType;
         this.ageRating = ageRating;
    }

    // the Novel class has three methods
    //add novel
    public void addNewNovel(String novelName, int number, String type, int age) {
         super.addNewBook(novelName, number);
        bookType = type;
        ageRating = age;
    }

    //delete novel
    public void deleteNovel(){
         super.deleteBook();
         bookType = null;
         ageRating = 0;
    }

    //toString() method to print info about the novel
    @Override
    public String toString(){
         return(super.toString() + " and it is a " + bookType + " novel recommended for people older then " + ageRating);
    }
}
