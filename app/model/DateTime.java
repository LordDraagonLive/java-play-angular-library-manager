package model;

/**
 * DateTime
 */
public class DateTime {

    private String date;
    private String time;


    public DateTime(){
        
    }
    public DateTime(String date){
        setDate(date);
    }
    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }


}