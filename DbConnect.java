package db;
import java.sql.*;
import javax.swing.JOptionPane;
public class DbConnect {
    //2 variables forming
    public static Connection c;
    public static Statement st;
    //static block will be formed (first execution)
    static{
        try{ // inside c variable
             c =DriverManager.getConnection
        ("jdbc:mysql://localhost:3306/spendingdb"+"?useSSL=false", "root", "Agnihotri03@"); // Connection established
          // inside st variable
          st = c.createStatement();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);        
    }
        
   }
    public static void main(String[] args){
        
    }
    
}
    
    

