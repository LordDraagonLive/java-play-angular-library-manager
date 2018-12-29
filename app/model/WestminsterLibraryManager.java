package model;
import java.util.List;

/**
 * WestminsterLibraryManager
 */
public class WestminsterLibraryManager implements LibraryManager {

    private List<Book> booksList = new List<Book>(100);
    private List<Dvd> dvdsList = new List<Dvd>(50);
    private List<LibraryReader> readersList = new List<>();
    private List<Author> authorsList = new List<>();
    private List<Producer> producersList = new List<>();
    private List<Actor> actorsList = new List<>();
    private List<BookPublisher> publishersList = new List<>();

    // Constructor
    public WestminsterLibraryManager(){
        
    }

    /**
     * @return the booksList
     */
    public List<Book> getBooksList() {
        return booksList;
    }

    /**
     * @param booksList the booksList to set
     */
    public void setBooksList(List<Book> booksList) {
        this.booksList = booksList;
    }

    /**
     * @return the dvdsList
     */
    public List<Dvd> getDvdsList() {
        return dvdsList;
    }

    /**
     * @param dvdsList the dvdsList to set
     */
    public void setDvdsList(List<Dvd> dvdsList) {
        this.dvdsList = dvdsList;
    }




    public void liveData(){


    }

    public List<Integer> libraryCapLeft(){
        return null;
    }

    @Override
    public void addLibraryItem(LibraryItem item) {
        
    }
    @Override
    public void addActor(Actor actor) {
        
    }

    @Override
    public void addAuthor(Author author) {
        

    }

    @Override
    public void addProducer(Producer producer) {
        
    }

    @Override
    public void addReader(LibraryReader reader) {
        
    }

    @Override
    public void addPublisher(BookPublisher publisher) {
        
    }

    @Override
    public void removeActor(int id) {
        
    }

    @Override
    public void removeAuthor(int id) {
        
    }

    @Override
    public String removeLibraryItem(String item) {
        return null;
    }

    @Override
    public void removeProducer(int id) {
        
    }
    @Override
    public void removePublisher(int id) {
        
    }
    @Override
    public void removeReader(int id) {
        
    }
    @Override
    public List<LibraryItem> displayLibraryItems(LibraryItem item) {
        return null;
    }

    @Override
    public boolean borrowItem(String item, int id, DateTime dateTime) {
        return false;
    }

    @Override
    public boolean returnItem(String item, int id, DateTime dateTime) {
        return false;
    }

    @Override
    public String generateReport() {
        return null;
    }
    


}