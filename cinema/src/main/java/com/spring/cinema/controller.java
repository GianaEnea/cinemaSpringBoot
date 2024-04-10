package com.spring.cinema;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class controller{

    /*@GetMapping("/index.html")
    @ResponseBody
    public String hello(@RequestParam(value="nome") String nome){
        return "<b>CIAO"+nome+"</b>";
    }*/
    private dbController controller;
    @GetMapping("/index.html")
    public String hellov2(){

        return"index";  //ritorna il contenuto del file nominato uguale nei template    
    }

    @GetMapping("/login")
    public boolean login(@RequestBody String user, String password) {
        try {
        return controller.perpStatementLogin(user, password);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    @GetMapping("/home")
    public ArrayList<film> home() {
        try {
        return controller.statementGetFilm();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping("/vista")
    public ArrayList<film> vista(String id) {
        try {
        return controller.prepstatementgetfilmSingolo(id);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }



}
