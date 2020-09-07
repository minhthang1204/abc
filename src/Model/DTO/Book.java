/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DTO;

import java.util.UUID;

public class Book {

    String id;
    String name;
    int price;

    public Book() {
        this.id = UUID.randomUUID().toString();
    }

    public Book(String id, String name, int price) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

   

    @Override
    public String toString() {
        return "Book{"
                + "name='" + name + '\''
                + ", price=" + price
                + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
