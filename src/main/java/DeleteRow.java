
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteRow {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		// JDBC connection parameters
		String url = "jdbc:mysql://localhost:3306/dbs1";
		String username = "root";
		String password = "P2ssw0rd@123";

		// SQL query to delete a row
		String deleteQuery = "DELETE FROM course WHERE courseid = ?";

		// ID of the row you want to delete
		// int rowIdToDelete = 6; // Replace with the actual ID you want to delete

		// Establishing the database connection
		Connection connection = DriverManager.getConnection(url, username, password);

		// Creating a prepared statement with the delete query
		PreparedStatement ps1 = connection.prepareStatement(deleteQuery);

		// Setting the parameter for the WHERE clause
		ps1.setInt(1, 11111);

		// Executing the delete query
		int rowsAffected = ps1.executeUpdate();

		System.out.println(rowsAffected);
	}

}
