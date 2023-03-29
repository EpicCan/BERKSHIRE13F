package com.inesa.demo.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;

@RestController
public class LoginController {

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        // Set up database connection
//        String url = "jdbc:mysql://localhost:3306/mydb";
//        String user = "root";
//        String dbPassword = "password";
//        Connection connection;
//        try {
//            connection = DriverManager.getConnection(url, user, dbPassword);
//        } catch (SQLException e) {
//            return "Error connecting to database";
//        }

        // Validate user
        try {
//            String query = "SELECT * FROM users WHERE username = ? AND password = ?";
//            PreparedStatement statement = connection.prepareStatement(query);
//            statement.setString(1, username);
//            statement.setString(2, password);
//            ResultSet result = statement.executeQuery();


            if ("admin".equals(username)&&"123456".equals(password)) {
                return "Login successful";
            } else {
                return "Invalid username or password";
            }


        } catch (Exception e) {
           return "Error validating user";
//        } finally {
//            try {
//                connection.close();
//            } catch (SQLException e) {
//                // Ignore
//            }
      }
    }
}

