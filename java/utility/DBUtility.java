package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;

public class DBUtility {
    private static Connection getConnection(){
        Connection conn = null;
        try{
            String url = "jdbc:mysql://localhost3306/portfolio";
            String username = "root1";
            String password = "Password!";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
        }catch(Exception e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        return conn;
    }
}