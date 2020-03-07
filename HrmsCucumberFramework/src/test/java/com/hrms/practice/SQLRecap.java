package com.hrms.practice;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class SQLRecap {
	
	String dbURL="jdbc:mysql://54.167.125.15:3306/syntaxhrm_mysql";
	String dbUsername = "syntax_hrm";
	String password = "syntaxhrm123";
	
	@Test
	public void getConnected() throws SQLException {
		
		Connection c=DriverManager.getConnection(dbURL, dbUsername, password);
		
		DatabaseMetaData dbMetaData = c.getMetaData();
		String dbName=dbMetaData.getDatabaseProductName();
		String dbVersion=dbMetaData.getDatabaseProductVersion();
		System.out.println(dbName);
		System.out.println(dbVersion);
		
		
		Statement st=c.createStatement();
		ResultSet rset=st.executeQuery("select * from ohrm_skill");
		
		ResultSetMetaData rsetMetaData = rset.getMetaData();
		int cols = rsetMetaData.getColumnCount();
		System.out.println(cols);
//		System.out.println(rsetMetaData);
		
		String columnName;
		
		for(int i =1; i<=cols; i++) {
			columnName= rsetMetaData.getColumnName(i);
			System.out.println("Column name ="+columnName);
		}
		
		
		String id;
		String skill;
		while(rset.next()) {
			id=rset.getObject("id").toString();
			skill=rset.getObject("name").toString();
			System.out.println(id+" = "+skill);
		}
		
		rset.close();
		st.close();
		c.close();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
