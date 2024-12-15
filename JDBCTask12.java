package jat_task_12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCTask12 {

    
	
	public static void main(String[] args) {
    	Connection  connection = null;
    	try {
    		String dbURL = "jdbc:sqlite:C:\\Users\\Anbarasan_SAM\\OneDrive\\Documents\\mySQL\\JAT TASK 12.db";
    		connection = DriverManager.getConnection(dbURL);
    		System.out.println(":: The connection to the SQLite is established ::");
    		Statement statement = connection.createStatement();
    		String myQuery = "CREATE TABLE Employee (\r\n"
    				+" empcode INTEGER PRIMARY KEY,\r\n"
    				+" empname TEXT NOT NULL,\r\n"
    				+" empage INTEGER NOT NULL,\r\n"
    				+" empslary INTEGER NOT NULL\r\n"
    		+");";
    		statement.execute(myQuery);
    		myQuery = "INSERT INTO Employee VALUES (101,'Jenny',25,10000)";
    		statement.executeUpdate(myQuery);

    		myQuery = "INSERT INTO Employee VALUES (102,'Jacky',30,20000)";
    		statement.executeUpdate(myQuery);

    		myQuery = "INSERT INTO Employee VALUES (103,'Joe',20,40000)";
    		statement.executeUpdate(myQuery);

    		myQuery = "INSERT INTO Employee VALUES (104,'John',40,80000)";
    		statement.executeUpdate(myQuery);

    		myQuery = "INSERT INTO Employee VALUES (105,'Shameer',25,90000)";
    		statement.executeUpdate(myQuery);
    		System.out.println(":: All 5 Rows are INSERTED ::");
    		
    		statement.close();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}finally {
    		System.out.println("============================================================================================================");
    	}

    
    }
    
}