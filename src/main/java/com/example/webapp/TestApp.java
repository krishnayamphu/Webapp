package com.example.webapp;

import com.example.webapp.javamail.JavaMailAPI;
import com.example.webapp.models.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class TestApp {
    public static String test() {
        return "Testing something";
    }

    public static void main(String[] args) {
        JavaMailAPI.send();
    }
}
