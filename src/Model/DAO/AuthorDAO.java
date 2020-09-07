/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.DTO.Author;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class AuthorDAO {

    ArrayList<Author> listAuthor = new ArrayList<>();

    public AuthorDAO() {

    }

    public ArrayList<Author> getAllAuthor() {
        return listAuthor;

    }

    public boolean addAuthor(Author author) {
        return listAuthor.add(author);
    }

    public boolean deleteAuthorBySTT(int stt) {
        try {
            listAuthor.remove(stt);
            return true;
        } catch(Exception e)  {
            System.out.println(e);
            return false;
        }
    }
}
