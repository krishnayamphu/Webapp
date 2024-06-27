package com.example.webapp.dao;

import com.example.webapp.database.ConnectDB;
import com.example.webapp.models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    public static User getUser(int id) throws SQLException, ClassNotFoundException {
        User user=null;
        Connection con=ConnectDB.connect();
        String sql="SELECT * FROM users WHERE id=?";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1,id);
        ResultSet rs=ps.executeQuery();
        while
        (rs.next()){
            user=new User(rs.getInt("id"),rs.getString("username"),rs.getString("password"),rs.getString("created_at"));
        }
       return user;
    }
    public static void save(User user) throws SQLException, ClassNotFoundException {
        Connection con=ConnectDB.connect();
        String sql="INSERT INTO users (username,password) VALUES(?,?)";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,user.getUsername());
        ps.setString(2,user.getPassword());
        int status=ps.executeUpdate();
        System.out.println(status);
    }
    public static void update(User user) throws SQLException, ClassNotFoundException {
        Connection con=ConnectDB.connect();
        String sql="UPDATE users set username=?, password=? WHERE id=?";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,user.getUsername());
        ps.setString(2,user.getPassword());
        ps.setInt(3,user.getId());
        int status=ps.executeUpdate();
        System.out.println(status);
    }

    public static void delete(int id) throws SQLException, ClassNotFoundException {
        Connection con=ConnectDB.connect();
        String sql="DELETE FROM users WHERE id=?";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1,id);
        int status=ps.executeUpdate();
        System.out.println(status);
    }
}
