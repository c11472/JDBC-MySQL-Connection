import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CreateTableQuery {
	// Global members
	String jdbcUrl = "jdbc:mysql://localhost:3306/dbs1";
	String username = "root";
	String password = "P2ssw0rd@123";

	public static void main(String args[]) throws SQLException, ClassNotFoundException {
		CreateTableQuery obj = new CreateTableQuery();

		int caseindex;
		Scanner c = new Scanner(System.in);
		caseindex = c.nextInt(); // 1

		switch (caseindex) {
		case 1:
			obj.CreateTableTest();
			break;
		case 2:
			// call insert
			break;
		case 3:
			// call update
			break;
		case 4:
			// call delete
			break;
		default:
			System.out.println("case is invalid !");

		}
	} // main method end

	// method definition
	public void CreateTableTest() throws ClassNotFoundException, SQLException {

		// JDBC objects
		Connection connection = null;
		Statement statement = null;

		// Establish the connection
		connection = DriverManager.getConnection(jdbcUrl, username, password);

		// Create a Statement object
		statement = connection.createStatement();

		// Define the SQL statement to create a table
		String createTableSQL = "create table testtab2(empid int(4))";

		// Execute the SQL statement
		statement.executeUpdate(createTableSQL);

		System.out.println("Table created successfully!");

	}
}
