package services;

import models.Book;
import util.Status;
import java.util.List;

public class BookManager {

    public static String addBook(List<Book> books, String title) {
        books.add(new Book(title, Status.AVAILABLE));

        return "Book added successfully.";
    }

    public static String rentBook(Book book) {
        if (book.getStatus() == Status.LENT) {
            return "Can't rent.";
        } else if (book.getStatus() == Status.LOST) {
            return "Book is lost.";
        }

        book.setStatus(Status.LENT);
        return "Book was rented successfully.";
    }

    public static String returnBook(Book book) {
        if (book.getStatus() == Status.AVAILABLE) {
            return "Book isn't rented.";
        } else if (book.getStatus() == Status.LOST) {
            return "Book is lost.";
        }

        book.setStatus(Status.AVAILABLE);
        return "Book was returned successfully.";
    }
}
