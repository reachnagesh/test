import java.sql.*;

public class PostgresJdbcTest {

	public static void main(String[] args) throws Exception {
		Class.forName("org.postgresql.Driver");
		String url = "jdbc:postgresql://localhost:5432/pmp";
		String username = "pmp";
		String password = "pmp1";
		
		Connection conn = DriverManager.getConnection(url, username, password);
		System.out.println("Connected to the DB successfull!");
		PreparedStatement pstmt = conn.prepareStatement("SELECT 1 \"Column1\" ");
		System.out.println("Prepared the sql!");
		ResultSet rs = pstmt.executeQuery();
		System.out.println("Executed the sql!");
		while (rs.next()) {
			System.out.println("Value : ");
			System.out.println(rs.getString("Column1"));		
		}	
	}
}