/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;
import javax.swing.*;
import java.io.*;

/**
 *
 * @author lodar
 */
public class OpenPdf {
    public static void openById (String id){
        try{
            if(new File("C:\\Users\\lodar\\Bills\\" + id + ".pdf").exists()){
                Process p = Runtime
                            .getRuntime()
                            .exec("rundll32 url.dll,FileProtocolHandler C:\\Users\\lodar\\Bills\\"+id+".pdf");
            } else {
                JOptionPane.showMessageDialog(null, "File is not Exists");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
