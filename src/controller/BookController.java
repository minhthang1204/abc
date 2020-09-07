/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import model.DAO.BookDAO;
import model.DTO.Book;
import java.util.UUID;

import java.util.ArrayList;
import java.util.Scanner;

public class BookController {

    BookDAO bookDAO = new BookDAO();
    Scanner sc = new Scanner(System.in);
    ArrayList<Book> library = new ArrayList<>();

    private static BookController instance;

    public static BookController getIntance() {
        if (instance == null) {
            instance = new BookController();
        }
        return instance;
    }

    private BookController() {
    }

    public ArrayList<Book> getAllBooks() {
        try {
            library = bookDAO.getAllBooks();
        } catch (SQLException e) {
            System.out.println("ko xem đc!");
        } finally {
            return library;
        }
    }

    public boolean addBook(Book b) throws SQLException {
        try {
            return bookDAO.addBook(b);
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
}

public void deleteBook(String id) {
        bookDAO.delete(id );
    }

    public boolean updateBook(String nameOldBook, Book newBook) {
        return bookDAO.update(nameOldBook, newBook);
    }

}
