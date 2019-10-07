package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {

	private final String JDBC_URL = "jdbc:mysql://localhost/docoblue?serverTimezone=JST";
	private final String DB_USER = "root";
	private final String DB_PASS = "root";

	//接続状態をcloseするための初期化
	private Connection conn = null;
	private PreparedStatement pStmt = null;
	private ResultSet rs = null;

}
