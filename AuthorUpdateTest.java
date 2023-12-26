package com.salesforce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbcEx.AuthorVo;

public class AuthorUpdateTest {

	public static void main(String[] args) {
		// 0. import java.sql.*;
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			// 1. JDBC 드라이버 (Oracle) 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. Connection 얻어오기
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "webdb", "webdb");

			// 3. SQL문 준비 / 바인딩 / 실행
			// sql 문
			String sql = " UPDATE AUTHOR a       \n" + 
									 " SET a.AUTHOR_DESC = ? \n" + 
									 " WHERE a.AUTHOR_ID = ?   ";
			// 바인딩
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "기안동");
			pstmt.setInt(2, 4);
			
			// 실행
			int count = pstmt.executeUpdate();

			// 4.결과처리
			System.out.print(count + "건이 반영 완료 되었습니다.");

		} catch (ClassNotFoundException e) {
			System.out.println("error: 드라이버 로딩 실패 - " + e);
		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {

			// 5. 자원정리
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.out.println("error:" + e);
			}

		}

	}

}
