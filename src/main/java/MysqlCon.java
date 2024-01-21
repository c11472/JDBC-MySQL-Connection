import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class MysqlCon {

	public static void main(String[] args) {
		ArrayList<Object> al1 = new ArrayList<Object>();

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbs1", "root", "P2ssw0rd@123");

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from course");

			while (rs.next()) {
				// System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
				// con.close();
				al1.add(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));

				if (al1.contains("PowerPoint")) {
					System.out.println("PowerPoint is a valid subject");
					break;
				} else {
					System.out.println("PowerPoint is a valid subject");

					break;

				}

			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
