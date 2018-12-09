package model;

/**
 * Producer
 */
public class Producer {

    private int numOfMoviesMade;
    private String name;
    private int id;

    public Producer(){

    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the numOfMoviesMade
     */
    public int getNumOfMoviesMade() {
        return numOfMoviesMade;
    }

    /**
     * @param numOfMoviesMade the numOfMoviesMade to set
     */
    public void setNumOfMoviesMade(int numOfMoviesMade) {
        this.numOfMoviesMade = numOfMoviesMade;
    }

}