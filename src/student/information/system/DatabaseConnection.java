/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.information.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Arafat Hossain Ar
 */
public class DatabaseConnection {

    Connection conn;

    public static Connection ConnectDb() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:src/database/database.db");
            return conn;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return null;
       
    }

//    public void selectAll() {
//        String sql = "SELECT name, pass FROM logininfo";
//
//        try (Connection conn = this.ConnectDb();
//                Statement stmt = conn.createStatement();
//                ResultSet rs = stmt.executeQuery(sql)) {
//
//            // loop through the result set
//            while (rs.next()) {
//                System.out.println(rs.getString("name") + "\t" + rs.getInt("pass"));
//            }
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//    }

    public static void main(String[] args) {
//       DatabaseConnection connection = new DatabaseConnection();
//       connection.selectAll(); 
    }

}
