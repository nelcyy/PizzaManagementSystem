/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author lodar
 */
public class User extends Database {

    @Override
    public void save() {
        String query = "insert into user(name,email,phone,password,securityQuestion,answer,status) "
                        + "values('" + getUname() + "','" + getUemail() + "','" + getUphone() + "','" + getUpassword() 
                        + "','" + getUsecurityQuestion() + "','" + getUanswer() + "','false')";
        DbOperations.setDataorDelete(query, "Register Successfully! Wait for Admin Approval!");
    }

    public static Database login(String email, String password) {
        Database user = null;
        try {
            ResultSet rs = DbOperations.getData("select * from user where email='" + email + "' and password='" + password + "'");
            while (rs.next()) {
                user = new User();
                user.setUstatus(rs.getString("status"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }

    public static Database getSecurityQuestion(String email) {
        Database user = null;
        try {
            ResultSet rs = DbOperations.getData("select * from user where email='" + email + "'");
            while (rs.next()) {
                user = new User();
                user.setUsecurityQuestion(rs.getString("securityQuestion"));
                user.setUanswer(rs.getString("answer"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }

    public static void update(String email, String password) {
        String query = "update user set password = '" + password + "'where email='" + email + "'";
        DbOperations.setDataorDelete(query, "Password Changed Successfully!");
    }

    public static void update(String email, String securityQuestion, String answer) {
        String query = "update user set securityQuestion = '" + securityQuestion + "', answer='" + answer + "' where email='" + email + "'";
        DbOperations.setDataorDelete(query, "Security Question Changed Successfully!");
    }

    public static void changeStatus(String email, String status) {
        String query = "update user set status = '" + status + "'where email='" + email + "'";
        DbOperations.setDataorDelete(query, "Status Changed Successfully!");
    }

    public static ArrayList<Database> getAllRecords(String email) {
        ArrayList<Database> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select * from user where email like '%" + email + "%'");
            while (rs.next()) {
                Database user = new Database();
                user.setUid(rs.getInt("id"));
                user.setUname(rs.getString("name"));
                user.setUemail(rs.getString("email"));
                user.setUphone(rs.getString("phone"));
                user.setUsecurityQuestion(rs.getString("securityQuestion"));
                user.setUstatus(rs.getString("status"));
                arrayList.add(user);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static void changePassword(String email, String OldPass, String NewPass) {
        try {
            ResultSet rs = DbOperations.getData("select * from user where email='" + email + "' and password='" + OldPass + "'");
            if (rs.next()) {
                update(email, NewPass);
            } else {
                JOptionPane.showMessageDialog(null, "Old Password is Wrong!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void changeSQ(String email, String pass, String SQ, String ans) {
        try {
            ResultSet rs = DbOperations.getData("select * from user where email='" + email + "' and password='" + pass + "'");
            if (rs.next()) {
                update(email, SQ, ans);
            } else {
                JOptionPane.showMessageDialog(null, "Password is Wrong!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
