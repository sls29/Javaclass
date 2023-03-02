/**
 * Album class definition
 *
 * @author Yours trully
 * @version 1.0
 */

package februarie.Homework2;

/**
 @param: bookName, totalPage; pictureQuality
 @return: Album Objects
 **/

    // Album class


class Album extends Book {
    public String pictureQuality;

    //the Book class has one constuctor
    public Album(String bookName, int totalPage, String pictureQuality){
        super(bookName, totalPage);

        this.pictureQuality = pictureQuality;
    }


    //the Album class has two methods
    //add new album
    public void addNewAlbum(String novelName,int number, String quality) {
        super.addNewBook(novelName, number);
        pictureQuality = quality;
    }

    //delete album
    public void deleteAlbum(){
        super.deleteBook();
        pictureQuality = null;
    }

    @Override
    //toString() method to print info about the album
     public String toString() {
        return(super.toString() + " and the quality of the photos is " + pictureQuality);
    }
}
