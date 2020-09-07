/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.BookController;
import java.sql.SQLException;
import model.DTO.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookView {

    BookController bookController = BookController.getIntance();
    Scanner sc = new Scanner(System.in);

    public void execute() throws SQLException {
        while (true) {
            System.out.println("1.Show");
            System.out.println("2.Add");
            System.out.println("3.Update");
            System.out.println("4.Delete");
            System.out.println("0.Exit");
            int inputUser = sc.nextInt();
            sc.nextLine();
            switch (inputUser) {
                case 1:
                    ArrayList<Book> allBooks = bookController.getAllBooks();
                    for (int i = 0; i < allBooks.size(); i++) {
                        System.out.println(allBooks.get(i).toString());
                    }
                    break;
                case 2:
                    System.out.println("Nhập tên: ");
                    String name = sc.nextLine();
                    System.out.println("Nhập giá: ");
                    int price = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhập id: ");
                    String id = sc.nextLine();
                    Book book = new Book(id, name, price);
                    boolean response = bookController.addBook(book);
                    if (response) {
                        System.out.println("success");
                    } else {
                        System.out.println("fail");
                    }
                    break;
                /*  case 3:
                    System.out.println("Nhập Tên Cũ: ");
                    String nae = sc.nextLine();
                    System.out.println("Nhập Tên Mới: ");
                    String newName = sc.nextLine();
                    System.out.println("Nhập giá mới: ");
                    int newPrice = sc.nextInt();

                    bookController.updateBook(nae, newName);
                    break;
                case 4:
                    System.out.println("Nhập tên: ");
                    String na = sc.nextLine();
                    bookController.deleteBook(na);
                    break;
                 */
                default:
                    return;
            }
        }

    }

}
