import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.*;

/**
 * @author Joseph Turner
 */
public class javaconnect {
    
    Connection conn = null;
    public static Connection ConnecrDb(){
        
        try
        {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\User\\Documents\\NetBeansProjects\\Project1\\ProjectDatabase.sqlite");
            JOptionPane.showMessageDialog(null, "Connection Established");
            return conn;
        }
        catch (Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);
                    return null;
                }
    }   
}
