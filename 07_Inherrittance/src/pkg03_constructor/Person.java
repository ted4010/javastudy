package pkg03_constructor;

public class Person {
  
  //field
  private String name;
  
  //constructor
  public Person() { //디폴트 형식의 생성자
  
  }
  

  public Person(String name) {
    super();
    this.name = name;
  }

  //method
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  
  
}
