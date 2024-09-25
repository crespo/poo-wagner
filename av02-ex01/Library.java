import models.Book;
import services.BookManager;
import util.Status;

import java.util.ArrayList;
import java.util.List;

public class Library {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        System.out.println(BookManager.addBook(books, "Game of Thrones"));

        System.out.println(BookManager.rentBook(books.get(0)));
        System.out.println(BookManager.rentBook(books.get(0)));
        System.out.println(BookManager.returnBook(books.get(0)));
        System.out.println(BookManager.returnBook(books.get(0)));

        System.out.println(books.get(0));

    }
}