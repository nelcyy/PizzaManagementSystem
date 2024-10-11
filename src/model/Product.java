/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author lodar
 */
public class Product extends Database {

    @Override
    public void save() {
        String query = "insert into product(name,category,price) "
                + "values('" + getPname() + "','" + getPcategory() 
                + "','" + getPprice() + "')";
        DbOperations.setDataorDelete(query, "Product Added Successfully");
    }

    @Override
    public void update() {
        String query = "update product set name = '" + getPname() + "', "
                + "category = '" + getPcategory() + "',price = '" + getPprice() 
                + "' where id ='" + getPid() + "'";
        DbOperations.setDataorDelete(query, "Product Updated Successfull!");
    }

    public static ArrayList<Database> getAllRecords() {
        ArrayList<Database> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select * from product");
            while (rs.next()) {
                Database product = new Database();
                product.setPid(rs.getInt("id"));
                product.setPname(rs.getString("name"));
                product.setPcategory(rs.getString("category"));
                product.setPprice(rs.getString("price"));
                arrayList.add(product);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static void delete(String id) {
        String query = "delete from product where id='" + id + "'";
        DbOperations.setDataorDelete(query, "Product Deleted Successfully");
    }

    public static ArrayList<Database> getAllRecordsByCategory(String category) {
        ArrayList<Database> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select * from product where category = '" + category + "'");
            while (rs.next()) {
                Database product = new Database();
                product.setPname(rs.getString("name"));
                arrayList.add(product);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static ArrayList<Database> filterProductByname(String name, String category) {
        ArrayList<Database> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select * from product where name like '%" + name + "%' and category = '" + category + "'");
            while (rs.next()) {
                Database product = new Database();
                product.setPname(rs.getString("name"));
                arrayList.add(product);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static Database getProductByname(String name) {
        Database product = new Database();
        try {
            ResultSet rs = DbOperations.getData("select * from product where name = '" + name + "'");
            while (rs.next()) {
                product.setPname(rs.getString(2));
                product.setPcategory(rs.getString(3));
                product.setPprice(rs.getString(4));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return product;
    }
}
