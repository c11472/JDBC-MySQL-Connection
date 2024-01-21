import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class MySqlCon2 {

	public static void main(String[] args) {
		ArrayList<Object> al1 = new ArrayList<Object>(); // To validate the table data

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbs1", "root", "P2ssw0rd@123");

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from ShopingList");

			while (rs.next()) {
				// System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
				// con.close();
				al1.add(rs.getString(1) + " " + rs.getInt(2) + " " + rs.getDouble(3));

				System.out.println(al1);
			}
		} catch (Exception e) {
			System.out.println("hello");
		}
	}
}
