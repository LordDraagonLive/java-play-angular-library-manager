package model;

/**
 * Actor
 */
public class Actor {

    private int numOfMoviesActed;
    private String name;


    public Actor(){
        
    }

    /**
     * @return the numOfMoviesActed
     */
    public int getNumOfMoviesActed() {
        return numOfMoviesActed;
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
     * @param numOfMoviesActed the numOfMoviesActed to set
     */
    public void setNumOfMoviesActed(int numOfMoviesActed) {
        this.numOfMoviesActed = numOfMoviesActed;
    }




}