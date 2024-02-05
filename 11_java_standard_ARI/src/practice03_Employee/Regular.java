package practice03_Employee;

public class Regular extends Employee {
  
  //field
  private int salary;

  //constructor
  public Regular(int empNo, String name) {
    super(empNo, name);                   //부모 클래스에 있는 empNo, name 들고 옴
  }

  public Regular(int empNo, String name, int salary) {
    super(empNo, name);
    this.salary = salary;   
  }

  //method
  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }
  @Override
  public void info() {
    super.info();
    System.out.println("연봉 : " + salary); // 연봉 출력
  }
  
  
  
  
  
  

}