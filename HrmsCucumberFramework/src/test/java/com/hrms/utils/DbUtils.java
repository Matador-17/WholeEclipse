package com.hrms.utils;

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

public class DbUtils {

	private static Connection con;
	private static Statement st;
	private static ResultSet rset;
	private static List<Map<String, String>> listData;

	/**
	 * Method will create a connection to DB
	 */
	public static void createConnection() {

		try {
			con = DriverManager.getConnection(ConfigsReader.getProperty("dbURL"),
					ConfigsReader.getProperty("dbUsername"), ConfigsReader.getProperty("dbPassword"));
		} catch (SQLException e) {

		}
	}

	/**
	 * Retrieves data and stores inside List<Map>
	 * 
	 * @return List<Map<String, String>>
	 */

	public static List<Map<String, String>> storeDataFromDB(String sqlQuery) {

		try {
			st = con.createStatement();
			rset = st.executeQuery(sqlQuery);

			ResultSetMetaData rsetMetaData = rset.getMetaData();

			listData = new ArrayList<>();
			while (rset.next()) {

				Map<String, String> rowMap = new LinkedHashMap<>();
				for (int i = 1; i <= rsetMetaData.getColumnCount(); i++) {
					rowMap.put(rsetMetaData.getColumnName(i), rset.getObject(i).toString());

				}
				listData.add(rowMap);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return listData;

	}

	public static void closeResources() {

		try {
			if (rset != null) {
				rset.close();
			}
			if (st != null) {
				st.close();
			}
			if (con != null) {
				con.close();
			}
		}

		catch (Exception e) {
			e.printStackTrace();

		}

	}

}
