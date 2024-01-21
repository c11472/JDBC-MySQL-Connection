import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertRows {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// JDBC connection parameters
		String url = "jdbc:mysql://localhost:3306/dbs1";
		String username = "root";
		String password = "P2ssw0rd@123";

		// JDBC objects
		Connection connection = null;
		PreparedStatement pst = null;

		// try {
		// Load the JDBC driver
		Class.forName("com.mysql.jdbc.Driver");

		// Establish the connection
		connection = DriverManager.getConnection(url, username, password);

		// SQL query to insert data into the table
		String sql = "insert into course(courseid, coursename, fees) VALUES (?, ?, ?)";

		// Create a prepared statement
		pst = connection.prepareStatement(sql);

		// Set values for the parameters
		pst.setInt(1, 567891);
		pst.setString(2, "test09818");
		pst.setInt(3, 67514);

		// Execute the query
		int rowsAffected = pst.executeUpdate();

		System.out.println(rowsAffected); // 1

		// Check if the insertion was successful

		if (rowsAffected > 0) {
			System.out.println("Data inserted successfully!");
		} else {
			System.out.println("Failed to insert data.");
		}

		// }
		/*
		 * catch (Exception e) { e.printStackTrace(); } finally { // Close JDBC objects
		 * in the reverse order of their creation try { if (preparedStatement != null) {
		 * preparedStatement.close(); } if (connection != null) { connection.close(); }
		 * } catch (Exception e) { e.printStackTrace(); }
		 */
	}

}
