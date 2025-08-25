package info.etotyoma.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

//    Написать программу аналог библиотеки, которая должна уметь делать
//    — добавить книгу
//    — получить список всех книг
//    — получить информацию о книге по id
//    — удалить книгу

    private static List<Book> books = new ArrayList<>();
    private static final Scanner SCANNER = new Scanner(System.in);

    // run to use library
    public static void main(String[] args) {
        System.out.println("Book Library\n");

        while (true) {
            System.out.println("""
                1. add book
                2. get all books
                3. get book by id
                4. remove book
                5. quit
                """);

            System.out.print("> ");
            int userChoice = SCANNER.nextInt();

            switch (userChoice) {
                case 1 -> addBook();
                case 2 -> getAllBooks();
                case 3 -> getBookById();
                case 4 -> removeBook();
                case 5 -> {
                    return;
                }
                default -> System.out.println("enter valid value");
            }
        }
    }

    private static void addBook() {
        System.out.print("Enter book title: ");
        String title = SCANNER.next();
        System.out.print("Enter book author: ");
        String author = SCANNER.next();

        Book book = new Book(title, author);
        books.add(book);
        System.out.printf("Book %s added\n\n", title);
    }

    private static void getAllBooks() {
        books.stream()
                .map(book -> String.format("%d. %s by %s",
                        books.indexOf(book) + 1, book.getTitle(), book.getAuthor()))
                .forEach(System.out::println);
        System.out.println("");
    }

    private static void getBookById() {
        System.out.print("Enter book id: ");
        int id = SCANNER.nextInt();
        Book book = books.get(id - 1);
        System.out.printf("%s by %s\n\n", book.getTitle(), book.getAuthor());
    }

    private static void removeBook() {
        System.out.print("Enter book id: ");
        int id = SCANNER.nextInt();
        Book book = books.get(id - 1);
        books.remove(book);
        System.out.printf("Book %s deleted\n\n", book.getTitle());
    }
}
