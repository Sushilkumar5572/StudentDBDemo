package com.wipro.dao;

import java.sql.*;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import com.wipro.bean.StudentBean;
import com.wipro.util.DBConnection;

public class StudentDAO {
        public static String createStudent(StudentBean bean) {
                int cnt = 0;
                try {
                        Connection con = DBConnection.getDBConnection();
                        String query = "insert into student values(?,?,?,?)";
                        PreparedStatement pstmt = con.prepareStatement(query);
                        pstmt.setInt(1, bean.getRoll_no());
                        pstmt.setString(2, bean.getName());
                        pstmt.setString(3, bean.getEmail());
                        pstmt.setString(4, bean.getAddress());
                        cnt = pstmt.executeUpdate();
                } 
                catch(MySQLIntegrityConstraintViolationException e){
                        System.out.println("\nStudent with this Roll no is already exist cannot insert record :(\n");
                }catch (Exception e) {
                        e.printStackTrace();
                }
                if (cnt > 1) {
                        return "Successfull Operation";
                } else {
                        return "Error!!!";
                }

        }

        public static void displayStudent() {
                try {
                        Connection con = DBConnection.getDBConnection();
                        String query = "select * from student";
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery(query);

                        System.out.println("Roll no\t\tName\t\tEmail\t\t\tAddress");

                        while (rs.next()) {
                                int rn = rs.getInt(1);
                                String name = rs.getString(2);
                                String email = rs.getString(3);
                                String addr = rs.getString(4);
                                System.out.println(rn + "\t\t" + name + "\t\t" + email + "\t\t" + addr);
                        }
                } catch (Exception e) {
                        e.printStackTrace();
                }
        }

}
