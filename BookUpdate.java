package jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookUpdate {

    public static void main(String[] args) {
        // 0. import java.sql.*;
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // 1. JDBC 드라이버 (Oracle) 로딩
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // 2. Connection 얻어오기
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            conn = DriverManager.getConnection(url, "webdb", "webdb");
            System.out.println("접속성공");

            // 3. SQL문 준비 / 바인딩 / 실행
            String query = " UPDATE BOOK \r\n" + 
                           " SET    TITLE = ?,\r\n" + 
                           "        PUBS  = ?,\r\n" + 
                           "     PUB_DATE = TO_DATE(?, 'YYYYMMDD'),\r\n" + 
                           "    AUTHOR_ID = ? \r\n" + 
                           " WHERE BOOK_ID = ?";
            pstmt = conn.prepareStatement(query);

            pstmt.setString(1, "토지");
            pstmt.setString(2, "마로니에북스");
            pstmt.setString(3, "20120815");
            pstmt.setInt(4, 1);
            pstmt.setInt(5, 2);

            int count = pstmt.executeUpdate();

            // 4.결과처리
            System.out.println(count + "건 처리");

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
