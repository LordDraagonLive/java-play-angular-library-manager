package model;
import java.util.Date;

/**
 * Dvd
 */
public class Dvd extends LibraryItem{

    private int producerID;
    private int actorID;
    private String langAvailable;
    private String subsAvailable;

    /**
     * 
     * @param isbn
     * @param title
     * @param sector
     * @param borrowedDate
     * @param publishedDate
     * @param currentReaderId
     * @param producerID
     * @param actorID
     * @param langAvailable
     * @param subsAvailable
     */
    public Dvd(String isbn, String title, String sector, DateTime borrowedDate, Date publishedDate, int currentReaderId, int producerID, int actorID, String langAvailable, String subsAvailable, boolean isBorrowed){
        super(isbn,title,sector,borrowedDate,publishedDate,currentReaderId,isBorrowed);
        setActorID(actorID);
        setProducerID(producerID);
        setLangAvailable(langAvailable);
        setSubsAvailable(subsAvailable);
        
    }

    /**
     * @return the subsAvailable
     */
    public String getSubsAvailable() {
        return subsAvailable;
    }

    /**
     * @param subsAvailable the subsAvailable to set
     */
    public void setSubsAvailable(String subsAvailable) {
        this.subsAvailable = subsAvailable;
    }

    /**
     * @return the langAvailable
     */
    public String getLangAvailable() {
        return langAvailable;
    }

    /**
     * @param langAvailable the langAvailable to set
     */
    public void setLangAvailable(String langAvailable) {
        this.langAvailable = langAvailable;
    }

    /**
     * @return the actorID
     */
    public int getActorID() {
        return actorID;
    }

    /**
     * @param actorID the actorID to set
     */
    public void setActorID(int actorID) {
        this.actorID = actorID;
    }

    /**
     * @return the producerID
     */
    public int getProducerID() {
        return producerID;
    }

    /**
     * @param producerID the producerID to set
     */
    public void setProducerID(int producerID) {
        this.producerID = producerID;
    }


    
}