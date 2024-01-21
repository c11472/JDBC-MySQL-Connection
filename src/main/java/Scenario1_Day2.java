import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Scenario1_Day2 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.jdbc.Driver");
		Scenario1_Day2 obj = new Scenario1_Day2();
		obj.SortData();
		System.out.println("*****************************");
		int p = obj.AvailableProducts();
		System.out.println("List of available products are 2" + p);

	}

	public void SortData() throws SQLException {
		ArrayList al = new ArrayList();
		try {
			Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbs1", "root", "P2ssw0rd@123");

			Statement stmt1 = con1.createStatement();

			ResultSet rs1 = stmt1.executeQuery("select * from ShoppingList order by Price desc");
			while (rs1.next()) {
				System.out.println(
						rs1.getString(1) + " " + rs1.getInt(2) + " " + rs1.getDouble(3) + " " + rs1.getString(4));

			}
		} catch (Exception e) {
			System.out.println("Database connection failure");
		}
	}

	public int AvailableProducts() throws SQLException {

		Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbs1", "root", "P2ssw0rd@123");

		Statement stmt2 = con2.createStatement();

		ResultSet rs2 = stmt2.executeQuery("select * from ShoppingList where Status='Available'");
		while (rs2.next()) {
			System.out
					.println(rs2.getString(1) + " " + rs2.getInt(2) + " " + rs2.getDouble(3) + " " + rs2.getString(4));

		}

		return 1;
	}

}