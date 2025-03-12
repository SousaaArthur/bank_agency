package org.example;

import java.sql.*;

public class DatabaseManager {
    static void initialize(){
        String url = "jdbc:sqlite:data/usuarios.db";
        String sql = "CREATE TABLE IF NOT EXISTS users (" +
                "userID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "name TEXT NOT NULL, " +
                "cpf TEXT NOT NULL, " +
                "phone TEXT NOT NULL, " +
                "login TEXT NOT NULL, " +
                "password TEXT NOT NULL, " +
                "balance REAL DEFAULT 0);";

        try (Connection conn = DriverManager.getConnection(url);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static boolean userExists(String fullName, String cpf, String phone){
        String url = "jdbc:sqlite:data/usuarios.db";
        String sql = "SELECT COUNT(*) FROM users WHERE name = ? AND cpf = ? AND phone = ?";

        try (Connection conn = DriverManager.getConnection(url);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, fullName);
            pstmt.setString(2, cpf);
            pstmt.setString(3, phone);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
