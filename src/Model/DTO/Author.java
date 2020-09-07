/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DTO;

import java.util.Date;
import java.util.UUID;

/**
 *
 * @author Admin
 */
public class Author {

    String id;
    String name;
    int age;
    Date birthday;

    public String getId() {
        return id;
    }

    public Author() {
        this.id = UUID.randomUUID().toString();
    }

    public Author(String name, int age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.id = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

}
