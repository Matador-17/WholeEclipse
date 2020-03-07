package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class StoringDataFromDB {
	String dbURL = "jdbc:mysql://54.167.125.15:3306/syntaxhrm_mysql";
	String dbUsername = "syntax_hrm";
	String password = "syntaxhrm123";

//	@Test
//	public void getAndStoreData() throws SQLException {
//		Connection c=DriverManager.getConnection(dbURL, dbUsername, password);
//		Statement st=c.createStatement();
//		ResultSet rset=st.executeQuery("select * from ohrm_location");
//		
//		List<Map<String, String>> listData= new ArrayList<>();
//		while(rset.next()) {
//			Map<String, String> map=new LinkedHashMap<>();
//			
//				map.put(key, value)
//			
//			
//			
//		}
//		
//		
//		
//		
//	}

	@Test
	public void getAndStoreDataEnhanced() throws SQLException {
		Connection c = DriverManager.getConnection(dbURL, dbUsername, password);
		Statement st = c.createStatement();
		ResultSet rset = st.executeQuery("select * from ohrm_location");

		ResultSetMetaData rsetMetaData = rset.getMetaData();

		List<Map<String, String>> listData = new ArrayList<>();
		Map<String, String> rowMap;
		while (rset.next()) {
			rowMap = new LinkedHashMap<>();

			for (int i = 1; i <= rsetMetaData.getColumnCount(); i++) {

				rowMap.put(rsetMetaData.getColumnName(i), rset.getObject(i).toString());

				listData.add(rowMap);

			}
		}
		System.out.println(listData);
		
		rset.close();
		st.close();
		c.close();

	}
	//find employee first name
	
	
	
}
