import java.sql.*;

public class JdbcTest {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "pmp";
		String password = "pmp1";
		
		Connection conn = DriverManager.getConnection(url, username, password);
		System.out.println("Connected to the DB successfull!");
		PreparedStatement pstmt = conn.prepareStatement("SELECT table_name FROM user_tables");
		System.out.println("Prepared the sql!");
		ResultSet rs = pstmt.executeQuery();
		System.out.println("Executed the sql!");
		while (rs.next()) {
			System.out.println("Tablename : ");
			System.out.println(rs.getString("table_name"));		
		}	
	}
}