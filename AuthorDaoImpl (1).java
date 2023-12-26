package com.salesforce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AuthorDaoImpl implements AuthorDao {

	@Override
	public int insert(AuthorVO vo) {
		
		System.out.println("AuthorDaoImpl.insert(vo) --> " + vo);
		
		// 0. import java.sql.*;
		Connection conn = null;
		PreparedStatement pstmt = null;
		int count = 0;
		
		try {
			// 1. JDBC 드라이버 (Oracle) 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. Connection 얻어오기
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "webdb", "webdb");

			// 3. SQL문 준비 / 바인딩 / 실행
			// sql 문
			String sql = " INSERT INTO author(author_id, author_name, author_desc) \n" + 
					         " values(seq_author_id.nextval, ?, ?) ";
			// 바인딩
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getAuthor_name() );
			pstmt.setString(2, vo.getAuthor_desc() );
			
			// 실행
			count = pstmt.executeUpdate();

			// 4.결과처리
			System.out.println(count + " 건이 저장 되었습니다.");

		} catch (ClassNotFoundException e) {
			System.out.println("error: 드라이버 로딩 실패 - " + e);
		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {
			// 5. 자원정리
			try {
				if (pstmt != null) {	pstmt.close(); }
				if (conn != null) { conn.close(); }
			} catch (SQLException e) {
				System.out.println("error:" + e);
			}
		}

		return count;
	}

	@Override
	public void getList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int delete(Long authorId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(AuthorVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
