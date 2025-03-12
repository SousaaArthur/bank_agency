package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class User {
    String fullName;
    String cpf;
    String phone;
    String login;
    String password;

    public User(String fullName, String cpf, String phone){
        this.fullName = fullName;
        this.cpf = cpf;
        this.phone = phone;
        this.login = getLogin(); // Gera o login
        this.password = getPassword(); // Gera a senha
    }

    public String getLogin(){
        String name = fullName.trim();
        String[] parties = name.split("\\s+");

        if(parties.length < 2){
            login = fullName.toLowerCase();
            return login;
        } else{
            String firstName = parties[0].toLowerCase();
            String lastName = parties[parties.length - 1].toLowerCase();
            login = firstName + "." + lastName;
            return login;
        }
    }

    public String getPassword(){
        password = String.valueOf((int) (Math.random() * 9000) + 1000); // Senha de 4 dígitos
        return password;
    }

    public void saveUser(){
        String url = "jdbc:sqlite:data/usuarios.db";
        String sql = "INSERT INTO users (userID, name, cpf, phone, login, password, balance) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try(Connection conn = DriverManager.getConnection(url);
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, null); // Adicione esta linha para definir o valor do userID como null
            conn = DriverManager.getConnection(url);
            conn.createStatement().execute("PRAGMA busy_timeout = 5000"); // Ajuste o timeout
            pstmt = conn.prepareStatement(sql);

            pstmt.setString(2, fullName);
            pstmt.setString(3, cpf);
            pstmt.setString(4, phone);
            pstmt.setString(5, login);
            pstmt.setString(6, password);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
