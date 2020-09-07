/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.SQLException;
import view.AuthorView;
import view.BookView;

/**
 *
 * @author Admin
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        BookView bV = new BookView();
        bV.execute();
//        AuthorView AV = new AuthorView();
//        AV.execute();

    }

}
