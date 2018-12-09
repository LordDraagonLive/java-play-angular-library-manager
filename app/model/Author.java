package model;

/**
 * Author
 */
public class Author {
    private int numOfBooks;
    private String name;

    public Author(){

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
     * @return the numOfBooks
     */
    public int getNumOfBooks() {
        return numOfBooks;
    }

    /**
     * @param numOfBooks the numOfBooks to set
     */
    public void setNumOfBooks(int numOfBooks) {
        this.numOfBooks = numOfBooks;
    }
}