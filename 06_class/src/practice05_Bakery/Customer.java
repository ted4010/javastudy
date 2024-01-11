package practice05_Bakery;

public class Customer {
  
  //field
  private int money;
  private int count;
  
  
  //coustructor
  public Customer() {
    // TODO Auto-generated constructor stub
  }

  public Customer(int money, int count) {
    super();
    this.money = money;
    this.count = count;
  }

  //method
  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }
  
  // 구매
  // 인자 : 구매할 가게, 구매할 빵 개수, 구매할 때 낼 곤
  // 반환 : 없음
  
  public void buy(Bakery bakery, int count, int money) {
    
    // 가진 돈이 부족핟.
    if(this.money < money) {
      System.out.println("가진 돈이 부족합니다.");
      return;
    }
    
    // 구매 (곧 Bakery의 판매를 의미한다.)
    BreadChange breadChange = null;
    if(bakery != null) {
      bakery.sell(money, count);
    }
    
    // 구매 결과 처리
    if(breadChange != null) {
    count += breadChange.getBread();
    money += breadChange.getChange();
    this.money -= money;
   }
    
  }
  
  
  
  
  
  
  
  
  
  
}
