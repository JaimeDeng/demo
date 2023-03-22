package practice;
import java.util.Scanner;

import org.springframework.util.StringUtils;
import java.sql.*;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SQL_demo {
	
	//將資料先設定好 , 以便套用
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/demo";
	
	static final String USER = "root";
	static final String PW = "0413";
	
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		try{
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL , USER , PW);
			stmt = conn.createStatement();
			String sql = "INSERT INTO widget_test " + "VALUES (4, 'susan' , '2023/3/22')";
			stmt.executeUpdate(sql);
			System.out.println("Record inserted successfully...");
		 }catch(SQLException se){
		     se.printStackTrace();
		 }catch(Exception e){
		     e.printStackTrace();
		 }finally{
		     try{
		        if(stmt!=null)
		           conn.close();
		 }catch(SQLException se){
		 }
		 try{
		    if(conn!=null)
		       conn.close();
		 }catch(SQLException se){
		    se.printStackTrace();
		}
    	}
	}
}
