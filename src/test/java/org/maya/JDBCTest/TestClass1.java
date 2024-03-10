package org.maya.JDBCTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestClass1 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String host = "localhost";
		String port = "3306";
		String db = "/MayaDB";
		String query = "select * from mayadb.EmployeeInfo where name='Ram'";
		String usrname = "root";
		String password = "Mysql@08";
		Connection con =  DriverManager.getConnection("jdbc:mysql://"+host+":"+port+db, usrname, password);
		Statement s = con.createStatement();
		ResultSet rs =  s.executeQuery(query);
		while(rs.next()) {
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("id"));
		}
		
	}

}
