package com.wipro.service;

import java.util.Scanner;

import com.wipro.bean.StudentBean;
import com.wipro.dao.StudentDAO;

public class StudentMain {
        
        public static void main(String[] args) {
                // Statement stmt;
                // ResultSet rs;
                // Connection con;
                // try {
                //         con = DBConnection.getDBConnection();
                //         stmt = con.createStatement();
                //         rs = stmt.executeQuery("select * from student");
                //         while (rs.next()) {
                //                 System.out.println("\n\n"+rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
                //         }
                // } catch (Exception e) {
                //         e.printStackTrace();
                // }
                Scanner sc1 = new Scanner(System.in);
                Scanner sc2 = new Scanner(System.in);
                System.out.print("Enter roll no:");
                int roll_no = sc1.nextInt();
                
                System.out.print("\nEnter your name:");
                String name = sc2.nextLine();
                System.out.print("\nEnter your email:");
                String email = sc2.nextLine();
                System.out.print("\nEnter your Address:");
                String addr = sc2.nextLine();
                sc1.close();
                sc2.close();

                StudentBean sb = new StudentBean(roll_no,name,email,addr);

                StudentDAO.createStudent(sb);

                StudentDAO.displayStudent();
        }
}
