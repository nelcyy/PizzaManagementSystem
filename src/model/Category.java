/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.*;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author lodar
 */
public class Category extends Database {

    @Override
    public void save() {
        String query = "insert into category (name) values ('" + getCname() + "')";
        DbOperations.setDataorDelete(query, "Category Added Successfully");
    }
    
    public static ArrayList<Database> getAllRecords(){
        ArrayList<Database> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOperations.getData("select * from category");
            while(rs.next()){
                Database category = new Database();
                category.setCid(rs.getInt("id"));
                category.setCname(rs.getString("name"));
                arrayList.add(category); 
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    public static void delete(String id){
        String query = "delete from category where id='"+id+"'";
        DbOperations.setDataorDelete(query, "Category Deleted Successfully");
    }
}
