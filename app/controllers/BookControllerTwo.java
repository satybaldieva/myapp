package controllers;

import models.Book;
import play.mvc.Controller;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 27.01.2016.
 */
public class BookControllerTwo extends Controller{
    static List<Book> getBooks() {
        List<Book> books = new ArrayList<Book>();

        Book one = new Book();
        one.title = "Harry_Potter";
        one.author = "J.Rowling";
        one.id = 1l;
        one.pagecount = 123;

        Book two = new Book();
        two.title = "Rich dad and poor dad";
        two.author = "R.Kiyosaki";
        two.id = 23l;
        two.pagecount = 112323;

        books.add(one);
        books.add(two);

        return books;
    }

    public static void one() {
        List<Book> listOfMyBooks = getBooks();

        render(listOfMyBooks);
    }

    public static void two(Book book) {
        System.out.println(book.title+ book.author + book.publishedYear +book.isbn + book.pagecount);
        render(book);
    }
}
