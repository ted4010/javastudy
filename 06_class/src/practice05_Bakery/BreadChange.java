package practice05_Bakery;

public class BreadChange {
  
  //field
  private int bread;  // 빵
  private int change; // 돈
  
  public BreadChange() {
    // TODO Auto-generated constructor stub
  }

  //coustructor
  public BreadChange(int bread, int change) {
    super();
    this.bread = bread;
    this.change = change;
  }
  
  //method
  public int getBread() {
    return bread;
  }

  public void setBread(int bread) {
    this.bread = bread;
  }

  public int getChange() {
    return change;
  }

  public void setChange(int change) {
    this.change = change;
  }
  
  
}
