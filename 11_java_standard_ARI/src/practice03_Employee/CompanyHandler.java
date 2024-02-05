package practice03_Employee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CompanyHandler {
  
  //field
  private Scanner sc;     //클래스Scanner 객체sc선언
  private Company company;  //클래스Company 객체company선언
  
  
  //constructor
  public CompanyHandler(Company company) {
    sc = new Scanner(System.in);    //객체 = new 클래스이름 자바 콘솔 창 내에서 값을 입력받겠다
    this.company = company;       //privare에 숨어있는 company 사용하기 워해
  }
  
  //method
  
  // 사원 정보 입력
  private Employee getEmployee() throws InputMismatchException, RuntimeException {
    
    System.out.println("사원타입(1.정규 2.파트) 입력 >>>");
    String type = sc.next();            //문자열로 입력받는다
    
    System.out.println("사원번호 입력 >>>");
    int empNo = sc.nextInt();           //숫자로 입력받는다
    System.out.println("사원명 입력 >>>");
    String name = sc.next();            //문자열로 입력받는다
    
    switch(type) {
    case "1":
      System.out.println("연봉 입력 >>>");
      return new Regular(empNo, name, sc.nextInt());   //정규에 번호, 이름, 입렧값 저장
    case "2":
      System.out.println("시급 입력 >>>");
      return new PartTime(empNo, name, sc.nextInt());  //파트에 번호, 이름, 입렧값 저장
    default:
      throw new RuntimeException("잘못된 사원타입입니다.");     //1,2아닌 다른 숫자를 입력하면 던진다.
    }
  }
  
  // 사원 번호 입력
  private int getEmpNo() throws InputMismatchException {
    
    System.out.println("사원번호 입력 >>>");            //사원번호를 입력
    return sc.nextInt();
    
  }
  
  // 회사 관리
  public void manage() {
    
    System.out.println("===== 사원관리 프로그램 시작 =====");
    
    while(true) {
      
      try {
        
        System.out.println("\n1.고용 2.해고 3.조회 4.전체조회 0.프로그램종료 >>>");
        String choice = sc.next();
        switch(choice) {
        case "1":
          company.hire(getEmployee());  //1을 입력하면 hire(getEmployee())출력 고용
          break;
        case "2":
          company.fire(getEmpNo());     //2을 입력하면 fire(getEmpNo())출력 해고
          break;
        case "3":
          company.search(getEmpNo());     //3을 입력하면 search(getEmpNo())출력 조회
          break;
        case "4":
          company.searchAll();        //4을 입력하면 searchAll()출력  전체 조회
          break;
        case "0":
          System.out.println("===== 사원관리 프로그램 종료 ====="); // 0을 입력하면 종료
          return;
        default:
          throw new RuntimeException("잘못된 입력입니다."); 
        }
        
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
  }
  
  
  
  

}

