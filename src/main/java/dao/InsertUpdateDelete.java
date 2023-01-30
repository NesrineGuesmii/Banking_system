/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author GuesmiN
 */
public class InsertUpdateDelete {
    public static void setData (String Query, String msg) {
        Connection con = null;
        Statement st = null;
        
        try {
            con= ConnectionProvider.getCon();
            st = con.createStatement();
            
            st.executeUpdate(Query);
            
            if(!msg.equals("")) {
                JOptionPane.showMessageDialog(null, msg);
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null , e);
        }
        
        finally {
            try {
                con.close();
                st.close();
        }
            catch (Exception e) {
            
        }
        }
        
    }
    
}