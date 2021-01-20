package org.PlanCanadaTestAutomation.utilities;

import java.sql.Connection; //make sure it is THIS library to be imported for Connection class
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.PlanCanadaTestAutomation.baseClass.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SQL_Connection extends TestBase  {

	public static void main(String host, String port, String dbName, String dbUserName, String dbPass, String query) throws SQLException 
	{
	
	//define parameters for connection
	//String host = "localhost";
	//String port = "3306";
	//String dbName = "/AntTestDB";
		
		
	
	//below class is standard with JDK. and URL format is the same. 
	Connection sqlConnection = DriverManager.getConnection("jdbc:mysql://"+ host + ":" + port + dbName, dbUserName, dbPass);
	
	//statement for queries to travel
	Statement sqlStatement = sqlConnection.createStatement();
	
	//send queries
	ResultSet sqlRS = sqlStatement.executeQuery(query);
	

	//keep displaying results from querty long as next record is found in above ResultSet
	/*
	while(sqlRS.next())
	{
		String field[1] = sqlRS.getString("field1");
		String field[2]= sqlRS.getString("field2");
		
		return field;
	}
	*/


	}
}
