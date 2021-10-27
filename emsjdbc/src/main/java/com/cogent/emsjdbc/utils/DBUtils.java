package com.cogent.emsjdbc.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.sql.DriverManager;
import java.sql.SQLException;

@Component
@Lazy(value=true)
public class DBUtils {
	
	@Autowired
	DataSource dataSource;
	
	public DBUtils() {
		
	}
	
	
	
	
	
	public Connection getConnection() {
				
		Connection con = null;
		try {
			con = dataSource.getConnection();
			return con;
		} catch(SQLException e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public void closeConnection(Connection c)
	{
		try {
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
