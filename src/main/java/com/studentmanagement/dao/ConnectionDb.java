package com.studentmanagement.dao;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionDb {
	PropertiesDb propertiesDb = new PropertiesDb();
	Connection connection;
	
	public Connection getConnection()
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(propertiesDb.getUrlString(),propertiesDb.getUsernameString(),propertiesDb.getPasswordString());
		} 
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		return connection;
		
	}
}
