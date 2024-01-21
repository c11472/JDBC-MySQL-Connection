import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateTable {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

		// JDBC connection parameters
		String url = "jdbc:mysql://localhost:3306/dbs1";
		String username = "root";
		String password = "P2ssw0rd@123";

		// JDBC objects
		Connection connection = null;
		PreparedStatement ps = null;

		// try {
		// Load the JDBC driver
		Class.forName("com.mysql.jdbc.Driver");

		// Establish the connection
		connection = DriverManager.getConnection(url, username, password);

		// SQL query to update data in the table
		String sql = " update course set courseid = ? where courseid=?";

		// Create a prepared statement
		ps = connection.prepareStatement(sql);

		// Set new values for the columns
		ps.setInt(1, 11111);
		ps.setInt(2, 895);

		// Execute the query
		int rowsAffected = ps.executeUpdate();
		System.out.println(rowsAffected); // 1

		// Check if the update was successful
		/*
		 * if (rowsAffected > 0) { System.out.println("Data updated successfully!"); }
		 * else { System.out.println("Failed to update data. Row not found."); }
		 */

		// }
		/*
		 * catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
		 * finally { // Close JDBC objects in the reverse order of their creation try {
		 * if (preparedStatement != null) { preparedStatement.close(); } if (connection
		 * != null) { connection.close(); } } catch (SQLException e) {
		 * e.printStackTrace(); }
		 */
	}

}
