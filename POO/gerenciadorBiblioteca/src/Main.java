
public class Main {

    public static void main(String[] args) {
        Author author = new Author();
        Book book = new Book(
            "Viagem ao centro da terra",
            "123Code",
            3,
            author
        );
        System.out.printf("Hello and welcome!");
    }
}