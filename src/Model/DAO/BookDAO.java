/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import helper.DatabaseUtil;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.DTO.Book;

import java.util.ArrayList;

public class BookDAO {

    DatabaseUtil dbUtil = new DatabaseUtil();
    ArrayList<Book> library = new ArrayList<>();

    public BookDAO() {
        Book defaultBook = new Book();
        library.add(defaultBook);
    }

    public ArrayList<Book> getAllBooks() throws SQLException {
        String sql = "Select * from Book";
        ResultSet rs = dbUtil.executeQuery(sql);
        while (rs.next()) {
            Book temp = new Book();
            temp.setId(rs.getString("id"));
            temp.setName(rs.getString("name"));
            temp.setPrice(rs.getInt("price"));
            library.add(temp);
        }
        return library;
    }

    public boolean addBook(Book b) {
        String sql = "Insert into Book values('\" + b.getName() + \"','\" + b.getPrice() + \"')";
        try {
            dbUtil.updateQuery(sql);
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public void delete(String Name) {
        Book book = null;

        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).getName().equals(Name)) {
                book = library.get(i);
                break;
            }
        }
        if (book != null) {

            library.remove(book);

        } else {
            System.out.printf("id = %d not existed.\n", Name);
        }
    }

    public boolean update(String nameOldBook, Book newBook) {
        int indexOfBook = -1;
        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).getName().equals(nameOldBook)) {
                indexOfBook = i;

            }
        }
        if (indexOfBook == -1) {
            return false;
        } else {
            library.set(indexOfBook, newBook);
            return true;
        }

    }

}
