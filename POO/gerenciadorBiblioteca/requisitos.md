Prática de Orientação a Objetos
Introdução

Neste tutorial, você aprenderá a criar classes em Java com foco na modelagem de objetos e na atribuição de responsabilidades apropriadas a cada classe. Os exercícios seguirão uma abordagem prática, orientada a problemas reais, que permitirá a você aplicar os conceitos teóricos de Programação Orientada a Objetos (POO).
Objetivos:
1. Compreender a importância da divisão de responsabilidades entre classes.
2. Praticar a criação de classes e a definição de atributos e métodos.
3. Implementar a interação entre objetos de diferentes classes.

Exemplo
Sistema de Gerenciamento de Clube de Leitura
Descrição:
Você foi encarregado de criar um sistema simples para gerenciar um clube de leitura. O sistema deve permitir o registro de membros e livros, além de possibilitar que os membros marquem livros como lidos.
Objetivos:
1. Modelar um sistema que reflita as interações básicas entre membros de um clube de leitura e os livros.
2. Atribuir responsabilidades claras a cada classe para garantir uma separação de preocupações adequada.
   Classes:
1. Classe `Member`
    - Atributos:
        - `name` (String): o nome do membro.
        - `age` (int): a idade do membro.
        - `readBooks` (List<Book>): uma lista de livros lidos pelo membro.

    - Métodos:
        - `getName()`: retorna o nome do membro.
        - `getAge()`: retorna a idade do membro.
        - `getReadBooks()`: retorna a lista de livros lidos pelo membro.
        - `setName(String name)`: define o nome do membro.
        - `setAge(int age)`: define a idade do membro.
        - `addReadBook(Book book)`: adiciona um livro à lista de livros lidos pelo membro.

2. Classe `Book`
    - Atributos:
        - `title` (String): o título do livro.
        - `author` (String): o autor do livro.
        - `genre` (String): o gênero do livro.

    - Métodos:
        - `getTitle()`: retorna o título do livro.
        - `getAuthor()`: retorna o autor do livro.
        - `getGenre()`: retorna o gênero do livro.
        - `setTitle(String title)`: define o título do livro.
        - `setAuthor(String author)`: define o autor do livro.
        - `setGenre(String genre)`: define o gênero do livro.

Exemplo de Implementação:

import java.util.ArrayList;
import java.util.List;

// Classe Book
class Book {
private String title;
private String author;
private String genre;

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}





// Classe Member
class Member {
private String name;
private int age;
private List<Book> readBooks;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
        this.readBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Book> getReadBooks() {
        return readBooks;
    }

    public void addReadBook(Book book) {
        this.readBooks.add(book);
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", readBooks=" + readBooks +
                '}';
    }
}



// Classe Principal para Testar
public class BookClubManagement {
public static void main(String[] args) {
// Criando alguns livros
Book book1 = new Book("1984", "George Orwell", "Dystopian");
Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "Fiction");

        // Criando um membro
        Member member1 = new Member("Alice", 17);

        // Adicionando livros lidos pelo membro
        member1.addReadBook(book1);
        member1.addReadBook(book2);

        // Exibindo informações do membro e seus livros lidos
        System.out.println(member1);
    }
}


Explicação:
- A classe `Book` é responsável por representar um livro com atributos como título, autor e gênero.
- A classe `Member` é responsável por representar um membro do clube de leitura, incluindo seu nome, idade e a lista de livros que ele já leu.
- A classe `BookClubManagement` contém o método `main` para testar a funcionalidade do sistema.

Este exemplo pode ser expandido conforme necessário, adicionando mais funcionalidades, como remoção de livros, busca por membros ou livros, etc.

Exercícios
Exercício 1: Modelagem de uma Biblioteca
Descrição:
Você foi contratado para criar um sistema de gerenciamento de uma biblioteca. A biblioteca precisa gerenciar livros, autores e usuários. Cada classe deve ser responsável por uma parte específica do sistema.
Tarefas:
1. Crie a classe `Book` com os seguintes atributos:
    - `title` (String)
    - `author` (Author)
    - `isbn` (String)
    - `availableCopies` (int)

   E os seguintes métodos:
    - `getTitle()`, `getAuthor()`, `getIsbn()`, `getAvailableCopies()`
    - `setTitle(String title)`, `setAuthor(Author author)`, `setIsbn(String isbn)`, `setAvailableCopies(int copies)`
    - `borrowBook()`: diminui o número de cópias disponíveis em 1.
    - `returnBook()`: aumenta o número de cópias disponíveis em 1.

2. Crie a classe `Author` com os seguintes atributos:
    - `name` (String)
    - `email` (String)
    - `books` (List<Book>)

   E os seguintes métodos:
    - `getName()`, `getEmail()`, `getBooks()`
    - `setName(String name)`, `setEmail(String email)`
    - `addBook(Book book)`: adiciona um livro à lista de livros do autor.

3. Crie a classe `User` com os seguintes atributos:
    - `name` (String)
    - `userId` (String)
    - `borrowedBooks` (List<Book>)

   E os seguintes métodos:
    - `getName()`, `getUserId()`, `getBorrowedBooks()`
    - `setName(String name)`, `setUserId(String userId)`
    - `borrowBook(Book book)`: adiciona um livro à lista de livros emprestados do usuário.
    - `returnBook(Book book)`: remove um livro da lista de livros emprestados do usuário.
      Exercício 2: Sistema de Gerenciamento de Tarefas
      Descrição:
      Crie um sistema simples de gerenciamento de tarefas onde os usuários podem criar tarefas, atribuir responsabilidades e marcar tarefas como concluídas.
      Tarefas:
1. Crie a classe `Task` com os seguintes atributos:
    - `title` (String)
    - `description` (String)
    - `assignedTo` (User)
    - `completed` (boolean)

   E os seguintes métodos:
    - `getTitle()`, `getDescription()`, `getAssignedTo()`, `isCompleted()`
    - `setTitle(String title)`, `setDescription(String description)`, `setAssignedTo(User user)`, `setCompleted(boolean completed)`
    - `markAsCompleted()`: marca a tarefa como concluída.

2. Crie a classe `Project` com os seguintes atributos:
    - `name` (String)
    - `tasks` (List<Task>)

   E os seguintes métodos:
    - `getName()`, `getTasks()`
    - `setName(String name)`
    - `addTask(Task task)`: adiciona uma tarefa ao projeto.
    - `removeTask(Task task)`: remove uma tarefa do projeto.

3. Crie a classe `User` com os seguintes atributos (reutilize a classe do exercício anterior):
    - `name` (String)
    - `userId` (String)
    - `assignedTasks` (List<Task>)

   E os seguintes métodos:
    - `getName()`, `getUserId()`, `getAssignedTasks()`
    - `setName(String name)`, `

