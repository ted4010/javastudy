package practice04_Car;

public class MainClass {

  public static void main(String[] args) {
    
    Driver driver = new Driver("elsa", 5);
    System.out.println(driver.isBestDriver());
    
    Driver driver2 = new Driver();
    driver2.setName("else");
    driver2.setCareer(20);
    System.out.println(driver2.isBestDriver());
    
    Car car = new Car(driver2, 0, 100);
    car.enginStart();
    car.accelerator(5);
    car.brake(5);
  }
}
