



package practice03_Employee;

import java.util.Objects;

public class PartTime extends Employee {
  
  //field
  private int hourPay;

  //construtor
  public PartTime(int empNo, String name) {
    super(empNo, name);         //부모 클래스에 있는 empNo, name 들고 옴
    
  }

  public PartTime(int empNo, String name, int hourPay) {
    super(empNo, name);
    this.hourPay = hourPay;
    
  }
  
  //method
  public int getHourPay() {
    return hourPay;
  }
  public void setHourPay(int hourPay) {
    this.hourPay = hourPay;
  }
  @Override
  public void info() {
    super.info();
    System.out.println("시급 : " + hourPay); // 시급 출력 
  }
}
  
  
  
  
  


