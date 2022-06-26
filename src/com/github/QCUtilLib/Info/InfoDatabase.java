package com.github.QCUtilLib.Info;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InfoDatabase {

	public static void addUserInfo(String name, String uuid)
	{

		try {
			
			Connection con = DB_Connection.getConnection();
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate("use userinfo");
			
			String insertSQL = "INSERT INTO info VALUES ('" + uuid + "', '" + name + "')";
			stmt.executeUpdate(insertSQL);

			
			con.close();
			stmt.close();

			
		} catch (SQLException e) {
			
		}
	}
	
	
	public static String getUserInfo(String type, String condition)
	{
		
		String result = null;
		
		try {
			
			Connection con = DB_Connection.getConnection();
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate("use userinfo");
			
			String selectSQL = "SELECT uuid, name FROM info WHERE " + condition;
			ResultSet rs = stmt.executeQuery(selectSQL);
			
			String uuid = null;
			String name = null;
			
			while (rs.next()) {
				uuid = rs.getString("uuid");
				name = rs.getString("name");
				
				break;
			}
			
			
			if (type.equals("uuid"))
			{
				result = uuid;
			} else {
				result = name;
			}
			
			con.close();
			stmt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	
	public static Boolean isUser(String type, String value)
	{
		return (!(getUserInfo(type, type + " = '" + value + "'").isEmpty()));
	}
}
