// Changed to libraryReader to avoid confusion with Reader Java class
package model;

/**
 * LibraryReader
 */
public class LibraryReader {

    private int readerId;
    private String name;
    private int mobileNum;
    private String email;

    public LibraryReader() {

    }

    /**
     * @param readerId the readerId to set
     */
    public void setReaderId(int readerId) {
        this.readerId = readerId;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @param mobileNum the mobileNum to set
     */
    public void setMobileNum(int mobileNum) {
        this.mobileNum = mobileNum;
    }
    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * @return the readerId
     */
    public int getReaderId() {
        return readerId;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @return the mobileNum
     */
    public int getMobileNum() {
        return mobileNum;
    }
    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }
}