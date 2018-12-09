package model;
import java.util.Date;
/**
 * LibraryItem
 */
public abstract class LibraryItem {

    private String isbn;
    private String title;
    private String sector;
    private DateTime borrowedDate;
    private Date publishedDate;
    private int currentReaderId;

    /***
     * 
     * @param isbn
     * @param title
     * @param sector
     * @param borrowedDate
     * @param publishedDate
     * @param currentReaderId
     */
    public LibraryItem(String isbn, String title, String sector, DateTime borrowedDate, Date publishedDate, int currentReaderId ){

        setIsbn(isbn);
        setTitle(title);
        setSector(sector);
        setBorrowedDate(borrowedDate);
        setPublishedDate(publishedDate);
        setCurrentReaderId(currentReaderId);

    }

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }
    /**
     * @return the sector
     */
    public String getSector() {
        return sector;
    }
    /**
     * @return the publishedDate
     */
    public Date getPublishedDate() {
        return publishedDate;
    }
    /**
     * @return the borrowedDate
     */
    public DateTime getBorrowedDate() {
        return borrowedDate;
    }
    /**
     * @return the currentReaderId
     */
    public int getCurrentReaderId() {
        return currentReaderId;
    }
    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * @param sector the sector to set
     */
    public void setSector(String sector) {
        this.sector = sector;
    }
    /**
     * @param publishedDate the publishedDate to set
     */
    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }
    /**
     * @param currentReaderId the currentReaderId to set
     */
    public void setCurrentReaderId(int currentReaderId) {
        this.currentReaderId = currentReaderId;
    }
    /**
     * @param borrowedDate the borrowedDate to set
     */
    public void setBorrowedDate(DateTime borrowedDate) {
        this.borrowedDate = borrowedDate;
    }
}