
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    //compare
    public boolean equals(Object otherBook) {
        // check if the same memory obj
        if (this == otherBook) {
            return true;
        }
        //if not an instance of book will be false
        if (!(otherBook instanceof Book)) {
            return false;
        }
        // convert the object to compare to a Book object to check name and publication year
        Book bookToCompare = (Book) otherBook;
        if (this.name.equals(bookToCompare.name)
                && this.publicationYear == bookToCompare.publicationYear) {
            return true;
        }
        
        return false;
    }

}
