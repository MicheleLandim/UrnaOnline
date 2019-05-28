package connectors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class CriarConexao {

	protected Statement stmt = null;
	protected ResultSet rs = null;
	protected Connection connection = null;
	private String base = "projeto?useSSL=false";
	private String host = "//localhost:3306";
	private String driver = "com.mysql.jdbc.Driver";
	private String user = "root";
	private String senha = "123123";

	public Connection getConnection() {
		try {
			if (connection == null) {
				createConnection();
			} else if (connection.isClosed()) {
				createConnection();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	private void createConnection() {
		try {
			Class.forName(driver).newInstance();
			connection = DriverManager.getConnection("jdbc:mysql:" + host + "/" + base, user, senha);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void closeConection() {
		try {
			if (this.rs != null) {
				this.rs.close();
			}
			if (this.stmt != null) {
				this.stmt.close();
			}
			if (this.connection != null) {
				this.closeConection();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
