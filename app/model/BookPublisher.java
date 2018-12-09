package model;

/**
 * BookPublisher
 */
public class BookPublisher {

    private int numOfBooksPublished;
    private String name;

    public BookPublisher(){

    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the numOfBooksPublished
     */
    public int getNumOfBooksPublished() {
        return numOfBooksPublished;
    }

    /**
     * @param numOfBooksPublished the numOfBooksPublished to set
     */
    public void setNumOfBooksPublished(int numOfBooksPublished) {
        this.numOfBooksPublished = numOfBooksPublished;
    }


}