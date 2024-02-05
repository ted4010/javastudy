package practice03_Employee;

import java.util.Objects;

public class Employee {

  //field
  private int empNo;    //empNo 변수선언
  private String name;  //name  변수선언

  //constructir
  public Employee() {   //기본생성자

  }

  public Employee(int empNo, String name) { //매개변수를 가진 생성자
    super();                //부모 클래스를 나타내는 것임
    this.empNo = empNo;           //empNo를 호출 
    this.name = name;
  }

  //method
  public int getEmpNo() {
    return empNo;
  }

  public void setEmpNo(int empNo) {
    this.empNo = empNo;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  public void info() {        // info()는 해석 그대로 클래스 안의 정보를 보여주는 것입니다.
    System.out.println("사원번호 : " + empNo);
    System.out.println("사원명 : " + name);
  }

  @Override              // generate hashcode() and equals() 사용
  public int hashCode() {
    return Objects.hash(empNo);    
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)        //주소가 같으므로 당연히 true
      return true;
    if (this == null)       //주소가 null이므로 당연히 false
      return false;
    Employee other = (Employee) obj;
    return empNo == other.empNo;
  }
}