package practice03_Employee;

import java.util.ArrayList;
import java.util.List;

public class Company {

  //field
  private String name;                //name  변수선언
  private List<Employee> employees;   //List형태로 employee 변수선언
  
  
  // constructor
  public Company(String name) {       //매개변수를 가진 생성자
    this.name = name;           
    employees = new ArrayList<Employee>();  
    
  }


  //method
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }
  
  // 고용
  public void hire(Employee employee) throws RuntimeException{  //타입 Employee 변수명 employee 
    if(employee == null) {
      throw new RuntimeException("고용될 사원 정보가 올바르지 않습니다.");  //employee가 null일떄 던진다
    }
    if(employees.contains(employee)) {              //hire에 employee가 포함있으면 던진다..
      throw new RuntimeException("이미 등록된 사원 번호입니다.");
    }
    employees.add(employee);                  //employees(배열)에 employee 추가 
  }
  
  // 해고
  public void fire(int empNo) {
    if(employees.isEmpty()) {                 
      throw new RuntimeException("헤고할 사원이 없습니다.");      //employees의 값이 없으면 던진다.
    }
    for(int i = 0, size = employees.size(); i < size; i++) {  
      if(employees.get(i).getEmpNo() == empNo) {        //employees에 있는 i값이 empNo 같아지면 i를 제거
        employees.remove(i);
        break;
      }
    }
  }
  
  // 조회
  public void search(int empNo) {
    if(employees.isEmpty()) {              //employees의 값이 없으면 던진다.
      throw new RuntimeException("조회할 사원이 없습니다.");
    }
    Employee searchEmployee = new  Employee(empNo, null);   //객체생성
    for(Employee employee : employees) {
      if(employee.equals(searchEmployee)) {           
        employee.info();                  //employees배열에 있는 값을 순서대로 employee 입력 후 employee랑 searchEmployee 같아지면 employee 출력 
      }
    }
  }
  
  // 전체 조회
  public void searchAll() throws RuntimeException {       
    if(employees.isEmpty()) {                 //employees의 값이 없으면 던진다.
      throw new RuntimeException("조회할 사원이 없습니다.");
    }
    System.out.println("전체 사원 명단");
    System.out.println("----------");
    for(Employee employee : employees) {
      employee.info();                    //employees배열에 있는 값을 순서대로 employee 입력 후 employee 전체 출력
      System.out.println("------------");
    }
  } 
}