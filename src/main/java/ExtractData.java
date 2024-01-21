import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExtractData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// ArrayList<Object> al1 = new ArrayList<Object>();

		// try {
		// To specify the driver for mysql
		Class.forName("com.mysql.jdbc.Driver");

		// To establish the connection <--- inteface
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbs1", "root", "P2ssw0rd@123");

		// Prepared statement instance for query <--- Interface

		// change the query as per your table
		PreparedStatement stmt = con.prepareStatement("select * from course order by courseid;");

		// Resultset will hold the result <---- Interface
		ResultSet rs = stmt.executeQuery();

		// Traverse the ResultSet rs to display the output of the query in console
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
		}

		/*
		 * } catch (Exception e) { System.out.println(e); }
		 */

	}

}
