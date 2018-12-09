package model;
import java.util.Date;

/**
 * Book
 */
public class Book  extends LibraryItem{

    private int authorID;
    private int publisherID;
    private int numOfPages;

    public Book(String isbn, String title, String sector, DateTime borrowedDate, Date publishedDate, int currentReaderId, int authorID, int publisherID, int numOfPages ){
        super(isbn,title,sector,borrowedDate,publishedDate,currentReaderId);
        setAuthorID(authorID);
        setPublisherID(publisherID);
        setNumOfPages(numOfPages);


    }

    /**
     * @return the authorID
     */
    public int getAuthorID() {
        return authorID;
    }

    /**
     * @return the numOfPages
     */
    public int getNumOfPages() {
        return numOfPages;
    }

    /**
     * @param numOfPages the numOfPages to set
     */
    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    /**
     * @return the publisherID
     */
    public int getPublisherID() {
        return publisherID;
    }

    /**
     * @param publisherID the publisherID to set
     */
    public void setPublisherID(int publisherID) {
        this.publisherID = publisherID;
    }

    /**
     * @param authorID the authorID to set
     */
    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }


}