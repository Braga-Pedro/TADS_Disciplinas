import java.util.List;

public class Author {
    /**     ATRIBUTS
     *    - `name` (String)
     *    - `email` (String)
     *    - `books` (List<Book>)
     */
    private String nome;
    private String email;
    private List<String> books;

    public Author(String nome, String email, List<String> books) {
        this.nome = nome;
        this.email = email;
        this.books = books;
    }
    /**     METHODS
     *    E os seguintes métodos:
     *    - `getName()`, `getEmail()`, `getBooks()`
     *    - `setName(String name)`, `setEmail(String email)`
     *    - `addBook(Book book)`: adiciona um livro à lista de livros do autor.
     * */
}
