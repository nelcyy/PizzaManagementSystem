/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.*;
import java.sql.*;
import java.util.*;

/**
 *
 * @author lodar
 */
public class Bill extends Database {

    @Override
    public void save() {
        String query = "insert into bill values ('" + getBid() + "', '" + 
                        getBname() + "','" + getBphone() + "','" + getBemail() + "','" + 
                        getBdate() + "','" + getBtotal() + "','" + getBcreatedBy() + "','" + 
                        getBpaymet() + "')";
        DbOperations.setDataorDelete(query, "Bill Details Added Successfully");
    }

    public static String getId() {
        int id = 1;
        try {
            ResultSet rs = DbOperations.getData("select max(id) from bill");
            if (rs.next()) {
                id = rs.getInt(1);
                id = id + 1;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return String.valueOf(id);
    }

    public static ArrayList<Database> getAllRecordsByInc(String date) {
        ArrayList<Database> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select * from bill where date like '%" + date + "%'");
            while (rs.next()) {
                Database bill = new Database();
                bill.setBid(rs.getInt("id"));
                bill.setBname(rs.getString("name"));
                bill.setBphone(rs.getString("phone"));
                bill.setBemail(rs.getString("email"));
                bill.setBdate(rs.getString("date"));
                bill.setBtotal(rs.getString("total"));
                bill.setBcreatedBy(rs.getString("createdBy"));
                bill.setBpaymet(rs.getString("PayMeth"));
                arrayList.add(bill);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static ArrayList<Database> getAllRecordsByDesc(String date) {
        ArrayList<Database> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select * from bill where date like '%" + date + "%' order By id DESC");
            while (rs.next()) {
                Database bill = new Database();
                bill.setBid(rs.getInt("id"));
                bill.setBname(rs.getString("name"));
                bill.setBphone(rs.getString("phone"));
                bill.setBemail(rs.getString("email"));
                bill.setBdate(rs.getString("date"));
                bill.setBtotal(rs.getString("total"));
                bill.setBcreatedBy(rs.getString("createdBy"));
                bill.setBpaymet(rs.getString("PayMeth"));
                arrayList.add(bill);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
}
