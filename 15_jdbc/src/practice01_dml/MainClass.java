package practice01_dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MainClass {

/*
 * TALK_T 테이블에 1행씩 삽입하시오.
 * TALK_T 구조
 *    TALK_NO NUMBER (PK)
 *    TALK_CONTENT VARCHAR2(1000 BYTE)
 *    TALK_EDITOR  VARCHAR2(1000 BYTE)
 *    WRITEN_AT    TIMESTAMP (* 현재 날짜/시간 : CURRENT_TIMESTAMP)
 * TALK_SEQ 시퀀스 존재함   
 * DB 서버 환경
 *    192.168.0.214
 *    GD/1111
 */
  
  public static void method1() {
    
    // 접속을 위해서 필요한 정보 (주소, 계정정보)
    String url = "jdbc:oracle:thin:@192.168.0.214:1521:xe";
    String user = "GD";
    String password = "1111";
    
    Connection con = null;
    
    try {
      
      // Connection 객체 생성
      con = DriverManager.getConnection(url, user, password);
      System.out.println("데이터베이스에 접속되었습니다.");
      
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        if(con != null)
          con.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
  }
  
  public static void method2() {
    String url = System.getProperty("jdbc.url");
    String user = System.getProperty("jdbc.user");
    String password = System.getProperty("jdbc.password");
    
    Connection con = null;
    
    try {
      con = DriverManager.getConnection(url, user, password);
      System.out.println("데이터베이스에 접속되었습니다.");
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if(con != null) con.close();
      } catch (Exception e2) {
        e2.printStackTrace();
      }
    }
    
  }
  
  public static void method3() {
    
    // Connection, PreparedStatement 객체 선언
    Connection con = null;
    PreparedStatement ps = null;
    
    try {
      
      String url = System.getProperty("jdbc.url");
      String user = System.getProperty("jdbc.user");
      String password = System.getProperty("jdbc.password");
      
      con = DriverManager.getConnection(url, user, password);
      
      String sql = "INSERT INTO TALK_T(TALK_NO, TALK_CONTENT, TALK_USER, WRITEN_AT) VALUES(TALK_SEQ.NEXTVAL, '안녕하세요', '신동우', CURRENT_TIMESTAMP)";
      
      ps = con.prepareStatement(sql);
      
      int result = ps.executeUpdate();
      System.out.println(result + " 행 이(가) 삽입되었습니다.");
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if(con != null) con.close();
        if(ps != null) ps.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
    
    
  }
  public static void main(String[] args) {
    method3();
  }

}
