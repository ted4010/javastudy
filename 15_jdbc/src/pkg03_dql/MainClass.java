package pkg03_dql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
  
  /*
   * java.sql.ResultSet
   * 1. SELECT 문의 실행 결과를 처리하는 인터페이스이다.
   * 2. SELECT 문의 결과 행(Row)을 하나씩 조회하는 포이너 역할을 수행한다.
   * 3. 주요 메소드
   *    1) boolean next() : 결과 행(Row)이 있으면 해당 행(Row)을 선택하고 true 를 반환한다.
   *    2) int getInt(String columnLabel) : ResulSet 포인터가 선택한 결과 행(Row)의 칼럼 중 이름이 columnLabel 이고 타입이 int 인 값을 반환한다.
   *       int getInt(int columnIndex)    : ResulSet 포인터가 선택한 결과 행(Row)의 칼럼 중 순번이 columnIndex 이고 타입이 int 인 값을 반환한다.
   */

  public static void method1() {
    
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    try {
      
      Class.forName("oracle.jdbc.OracleDriver");
      
      String url = System.getProperty("jdbc.url");
      String user = System.getProperty("jdbc.user");
      String password = System.getProperty("jdbc.password");
      con = DriverManager.getConnection(url, user, password);
      
      String sql = "SELECT SAMPLE_NO, SAMPLE_CONTENT, SAMPLE_EDITOR, SAMPLE_DT FROM SAMPLE_T ORDER BY SAMPLE_NO DESC";
      
      ps = con.prepareStatement(sql);
      
      // SELECT문 실행 결과는 ResultSet이 처리한다.
      rs = ps.executeQuery();
      
      // 결과를 저장할 List<SampleDto> 를 생성한다.
      List<SampleDto> samples = new ArrayList<SampleDto>();
      
      // SELECT문 실행 결과를 행 단위로 조회한다.
      while(rs.next()) {
        
        // rs 포인터가 조회한 행을 SampleDto 객체로 만든다.
        SampleDto sampleDto = new SampleDto();
        sampleDto.setSample_no(rs.getInt("SAMPLE_NO"));
        sampleDto.setSample_content(rs.getString("SAMPLE_CONTENT"));
        sampleDto.setSample_editor(rs.getString("SAMPLE_EDITOR"));
        sampleDto.setSample_dt(rs.getDate("SAMPLE_DT"));
        
        // 결과 확인
        // System.out.println(sampleDto.getSample_no() + "," + sampleDto.getSample_content() + "," + sampleDto.getSample_editor() + "," + sampleDto.getSample_dt());
      
        // samples 리스트에 sampleDto 객체를 저장한다.
        samples.add(sampleDto);
      }
      
      // 결과 확인
      for(int i = 0, size = samples.size(); i < size; i++) {
        System.out.println(samples.get(i));
      }
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if(rs != null) rs.close();
        if(ps != null) ps.close();
        if(con != null) con.close();
      }catch (Exception e2) {
        e2.printStackTrace();
      }
    }
  } 
 
  public static void method2() {
    
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    try {
      
      Class.forName("oracle.jdbc.OracleDriver");
      
      String url = System.getProperty("jdbc.url");
      String user = System.getProperty("jdbc.user");
      String password = System.getProperty("jdbc.password");
      con = DriverManager.getConnection(url, user, password); 
      
      String sql = "SELECT SAMPLE_NO, SAMPLE_CONTENT, SAMPLE_EDITOR, SAMPLE_DT FROM SAMPLE_T WHERE SAMPLE_NO = ?";
      
      ps = con.prepareStatement(sql);
      
      // 변수 처리
      Scanner sc = new Scanner(System.in);
      System.out.println("조회할 SAMPLE_NO 입력하세요 >>> ");
      int sampleNo = sc.nextInt();
      sc.close();
      
      ps.setInt(1, sampleNo);  // 쿼리문의 1번쨰 물음표에 sampleNo를 전달한다.
      
      // 쿼리문 실행
      rs = ps.executeQuery();
      
      // 결과를 저장할 SampleDto 객체 선언
      SampleDto sampleDto = null;
      
      // 결과 조회
      if(rs.next()) {
        
        // 결과 행을 SampleDto 객체로 만든다.
        sampleDto = new SampleDto();
        sampleDto.setSample_no(rs.getInt(1));
        sampleDto.setSample_content(rs.getString(2));
        sampleDto.setSample_editor(rs.getString(3));
        sampleDto.setSample_dt(rs.getDate(4));
        
        // 결과 확인
        System.out.println(sampleDto);
        
      } 
        
       
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  public static void method3() {
    
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    try {
      
      Class.forName("oracle.jdbc.OracleDriver");
      
      String url = System.getProperty("jdbc.url");
      String user = System.getProperty("jdbc.user");
      String password = System.getProperty("jdbc.password");
      con = DriverManager.getConnection(url, user, password);
      
      String sql = "SELECT COUNT(*) AS CNT FROM SAMPLE_T";
      
      ps = con.prepareStatement(sql);
      
      rs = ps.executeQuery();
      
      // 결과를 저장할 변수
      
      int cnt = 0;
      
      // 결과 조회
      if(rs.next()) {
        
        cnt = rs.getInt("CNT");
        
      }
      
      // 결과 확인

      System.out.println(cnt);
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    
    
  }
  public static void main(String[] args) {
     method3();
  }

}
