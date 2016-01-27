package controllers;

import play.*;
import play.mvc.*;

import java.util.*;
import models.*;

/**
 * Created by user on 26.01.2016.
 */
public class BookController extends Controller {

    static List<Book> getBooks() {
        List<Book> books = new ArrayList<Book>();

        Book one = new Book();
        one.title = "Book1";
        one.author = "Author1";
        one.id = 1l;
        one.pagecount = 123;

        Book two = new Book();
        two.title = "Book2";
        two.author = "Author2";
        two.id = 23l;
        two.pagecount = 112323;

        books.add(one);
        books.add(two);

        return books;
    }

    static Book findBookById(Long id) {
        List<Book> books = getBooks();
        for (Book book : books) {
            if (book.id == id) return book;
        }
        return null;
    }

    public static void first() {
        List<Book> books = getBooks();
        render(books);
    }

    public static void second(Book book) {
        System.out.println(book.title+ book.author + book.publishedYear +book.isbn + book.pagecount);
        render(book);
    }


}

