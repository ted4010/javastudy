package practice03_Employee;

public class MainClass {

  public static void main(String[] args) {

    Company company = new Company("Samsung");
    
    new CompanyHandler(company).manage(); //CompanyHandler에 있는 company 그리고 메세지 출력
  }

}