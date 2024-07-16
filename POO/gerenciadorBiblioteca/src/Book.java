public class Book {
    /**     ATRIBUTS
     *    - `title` (String)
     *    - `author` (Author)
     *    - `isbn` (String)
     *    - `availableCopies` (int)
     */
    private String title, isbn;
    private int avaibleCopies;
    Author author;

    public Book(String title, String isbn, int avaibleCopies, Author author) {
        this.title = title;
        this.isbn = isbn;
        this.avaibleCopies = avaibleCopies;
        this.author = author;
    }

    /**
     *    METHODS
     *    - `getTitle()`, `getAuthor()`, `getIsbn()`, `getAvailableCopies()`
     *    - `setTitle(String title)`, `setAuthor(Author author)`, `setIsbn(String isbn)`, `setAvailableCopies(int copies)`
     *    - `borrowBook()`: diminui o número de cópias disponíveis em 1.
     *    - `returnBook()`: aumenta o número de cópias disponíveis em 1.
     */

    public void borrowBook() {
        int borrowAvaibleCopies = getAvaibleCopies() - 1;
        setAvaibleCopies(borrowAvaibleCopies);
    }

    public void returnBook() {
        int borrowAvaibleCopies = getAvaibleCopies() + 1;
        setAvaibleCopies(borrowAvaibleCopies);
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAvaibleCopies() {
        return this.avaibleCopies;
    }

    public void setAvaibleCopies(int avaibleCopies) {
        this.avaibleCopies = avaibleCopies;
    }


}
