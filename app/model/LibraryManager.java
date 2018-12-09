package model;
import java.util.Date;
import java.util.List;

public interface LibraryManager {

    void addLibraryItem(LibraryItem item); // from libraryitem class
    String removeLibraryItem(String item);
    void addAuthor(Author author); //from author class
    void removeAuthor(int id);
    void addReader(LibraryReader reader); // from LibraryReader class
    void removeReader(int id);
    void addProducer(Producer producer); // from creator class
    void removeProducer(int id);
    void addPublisher(BookPublisher publisher); // from publisher class
    void removePublisher(int id);
    void addActor(Actor actor); // form actor class
    void removeActor(int id);
    List<LibraryItem> displayLibraryItems(LibraryItem item); // display library list items
    boolean borrowItem(String item, int id, DateTime dateTime);
    boolean returnItem(String item, int id, DateTime dateTime);
    String generateReport();
}