package practice03_Bus;

public class Bus extends Person{
  
  private Seat[] seats;
  private int idx;
  
  public Bus(int seatCount) {
    seats = new Seat[seatCount];
  }
  
  public void addseat(Seat seat) {
    if(idx > seats.length) {
      System.out.println("자리가 없습니다.");
      return;
    } else {
      for (int i = 0; i <= seats.length; i++) {
        if( == Man() ) {
          
        }
      }
    }
  }
}
