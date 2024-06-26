package com.example.webapp.dao;

import com.example.webapp.database.ConnectDB;
import com.example.webapp.models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO {
    public static void save(User user) throws SQLException, ClassNotFoundException {
        Connection con=ConnectDB.connect();
        String sql="INSERT INTO users (username,password) VALUES(?,?)";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,user.getUsername());
        ps.setString(2,user.getPassword());
        int status=ps.executeUpdate();
        System.out.println(status);
    }
}
