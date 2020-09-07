/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Model.DTO.Author;
import controller.AuthorController;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class AuthorView {

    AuthorController authorController = new AuthorController();
    Scanner sc = new Scanner(System.in);

    public void execute() {
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
                    ArrayList<Author> allAuthor = authorController.getAllAuthor();
                    for (int i = 0; i < allAuthor.size(); i++) {
                        System.out.println(allAuthor.get(i).toString());
                    }
                    break;
                case 2:
                    System.out.println("Nhập tên: ");
                    String name = sc.nextLine();
                    System.out.println("Nhập tuổi: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhập ngày sinh");
                    int day = sc.nextInt();
                    System.out.println("Nhập tháng sinh:");
                    int month = sc.nextInt();
                    System.out.println("Nhập năm sinh: ");
                    int year = sc.nextInt();
                    sc.nextLine();
                    Date birthday = new Date(year, month, day);
                    Author author = new Author(name, age, birthday);
                    boolean response = authorController.addAuthor(author);
                    if (response) {
                        System.out.println("success");
                    } else {
                        System.out.println("fail");
                    }
                    break;
                case 3:
                    System.out.println("Nhập Tên Cũ: ");
                    String nae = sc.nextLine();
                    System.out.println("Nhập Tên Mới: ");
                    String newName = sc.nextLine();
                    System.out.println("Nhập giá mới: ");
                    int newPrice = sc.nextInt();

                    break;
                case 4:
                    System.out.println("Nhập tên: ");
                    String na = sc.nextLine();

                    break;
                default:
                    return;
            }
        }

    }
}
