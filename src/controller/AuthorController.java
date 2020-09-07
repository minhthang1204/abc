/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.DAO.AuthorDAO;
import Model.DTO.Author;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class AuthorController {

    AuthorDAO dao;

    public AuthorController() {
        dao = new AuthorDAO();
    }

    public ArrayList<Author> getAllAuthor() {
        return dao.getAllAuthor();
    }

    public boolean addAuthor(Author author) {
        return dao.addAuthor(author);
    }
    public boolean deleteAuthorBySTT(int STT ){
        return false;
    
    }
}
