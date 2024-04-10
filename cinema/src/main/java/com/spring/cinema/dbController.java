package com.spring.cinema;

import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class dbController {

    Connection conn;
    

    public dbController() throws SQLException { //dbname                                psw
        this.conn = DriverManager.getConnection("'jdbc:mysql://localhost/film', 'root', ''");
    }

    /*public void statement() throws SQLException{
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery("Select * From utenti");
        while(rs.next()){
            int id= rs.getInt(0);
            String user = rs.getString("userName");
        }
    }*/
    
    public boolean perpStatementLogin(String user, String pass) throws SQLException{
       PreparedStatement prepStat = conn.prepareStatement("select * from user where username=? and psw=ms5(?)");
        prepStat.setString(1, user);
        prepStat.setString(2, pass);
        ResultSet rs = prepStat.executeQuery(); 
        if (rs.getRow()>0){
            return true;
        }
        return false;
    }
    

    public ArrayList<film> statementGetFilm() throws SQLException{
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery("Select id, titolo, durata, locandina From film");
        ArrayList<film> listafilm = new ArrayList<film>();
        while (rs.next()) {
            film f = new film();
            f.id=rs.getInt("id");
            f.titolo=rs.getString("titolo");
            f.locandina=rs.getString("locandina");
            f.durata=rs.getString("durata");
            listafilm.add(f);
        }
        return listafilm;
    } 

    public ArrayList<film> prepstatementgetfilmSingolo(String id) throws SQLException{
        PreparedStatement prepStat = conn.prepareStatement("Select id, titolo, durata, locandina From film Where id=?");
        prepStat.setString(1, id);
        ResultSet rs = prepStat.executeQuery();
        ArrayList<film> listafilm = new ArrayList<film>();
        while (rs.next()) {
            film f = new film();
            f.id=rs.getInt("id");
            f.titolo=rs.getString("titolo");
            f.locandina=rs.getString("locandina");
            f.durata=rs.getString("durata");
            listafilm.add(f);
        }
        return listafilm;
    }

}