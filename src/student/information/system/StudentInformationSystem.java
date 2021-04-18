/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.information.system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Arafat Hossain Ar
 */
public class StudentInformationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        String n = "4/13/21";
//        String replace = n.replace("/", "");
//        int nu = Integer.parseInt(replace);
//        System.out.println(nu);
//
//        Date date = new Date();
//        SimpleDateFormat formatter = new SimpleDateFormat("M/dd/yy");
//        String strDate = formatter.format(date);
//
//        String replaceto = strDate.replace("/", "");
//        int num = Integer.parseInt(replaceto);
//        System.out.println(num);
//        if (num <= nu) {
//            System.out.println("Active");
//        } else if (num > nu) {
//            System.out.println("Close");
//        }
        //////////////////////////////////////////
        Connection conn = DatabaseConnection.ConnectDb();
        String url = "Select phone, endd from studentsdata";

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("M/dd/yy");
        String strDate = formatter.format(date);

        String replaceto = strDate.replace("/", "");
        int num = Integer.parseInt(replaceto);
//        System.out.println(num);
        try {
            PreparedStatement pstm = conn.prepareStatement(url);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                String ii = rs.getString("endd");
                String p = rs.getString("phone");
                String iii = ii.replace("/", "");
                int iiii = Integer.parseInt(iii);
//                System.out.println(iiii);

                if (num <= iiii) {
                    update(p, "Active");
                } else if (num > iiii) {
                    update(p, "Close");
                }
            }
            conn.close();
            pstm.close();
            rs.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

    public static void update(String phone, String status) {
        String sql = "UPDATE studentsdata SET  status = ?   WHERE  phone = ?";

        try (Connection conn = DatabaseConnection.ConnectDb();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, status);
            pstmt.setString(2, phone);

            // update 
            pstmt.executeUpdate();
            conn.close();
            pstmt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
