package model;
import java.util.List;

/**
 * WestminsterLibraryManager
 */
public class WestminsterLibraryManager implements LibraryManager {

    private List<Book> booksList;
    private List<Dvd> dvdsList;
    private List<LibraryReader> readersList;
    private List<Author> authorsList;
    private List<Producer> producersList;
    private List<Actor> actorsList;
    private List<BookPublisher> publishersList;

    // Constructor
    public WestminsterLibraryManager(){

    }

    public void refresh(){


    }

    public List<Integer> spaceLeft(){
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