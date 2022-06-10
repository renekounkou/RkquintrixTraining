package garage.com;

import static org.testng.Assert.assertEquals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class JavaSqlStatements {
	
  @Test
  public void getCitiesInDescendingAlphabeticalOrder() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "Password");
		Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery("select city from city\r\n"
				+ "ORDER BY city DESC LIMIT 10;");
		while(resultset.next()) {
			System.out.println(resultset.getString("city"));
		}
  	}
  @Test
  public void useaViewtogettheFilmInfo() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "Password");
		Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery("select film_info from actor_info\n"
				+ "where actor_id = 19;");
		while(resultset.next()) {
			System.out.println(resultset.getString("film_info"));
		}
	}
  @Test
  public void UseaStoredProceduretoGetThe4inventory() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "Password");
		Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery("call inventstore2;");
		while(resultset.next()) {
			System.out.print(resultset.getString("inventory_id")+  " ");
			System.out.print(resultset.getString("film_id")+  " ");
			System.out.print(resultset.getString("store_id")+  " ");
			System.out.println(resultset.getString("last_update"));
		}
	}
  @Test
  public void updatetheTimestampForstore2() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "Password");
		Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery("select * from store where store_id = 2;");
		while(resultset.next()) {
			System.out.print(resultset.getString("last_update"));
			String expectedResult = "2022-05-30 03:00:00";
			assertEquals(resultset.getString("last_update"), expectedResult);
		}
	}
}
