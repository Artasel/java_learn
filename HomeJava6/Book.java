package HomeJava6;

import java.util.HashMap;
import java.util.Map;

public class Book {
    private String nameBook;
    private String nameAuthorBook;

    Book(String nameBook, String nameAuthorBook) {
        this.nameBook = nameBook;
        this.nameAuthorBook = nameAuthorBook;
        library(nameBook, nameAuthorBook);
    }

    public void getNameBook() {
        toString(); 
    }

    public void getNameAuthorBook() {
        toString(); 
    }

    static Map<String, String> list = new HashMap<>();

    public void library(String nameBook, String nameAuthorBook) {
        if (!list.containsKey(nameAuthorBook)) {
            list.put(nameAuthorBook, nameBook);
        } else {
            list.put(nameAuthorBook, list.get(nameAuthorBook) + ", " + nameBook);
        }
    }

    @Override
    public String toString() {
        return nameBook;  // "Автор = " + nameAuthorBook + ", " + "Название книги: " + 
    }

    
}
