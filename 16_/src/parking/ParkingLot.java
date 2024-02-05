package parking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParkingLot {

  /* field 영역 수정 금지 */
  private String name;
  private List<Car> cars;
  private Scanner sc;
  public final static int LIMIT = 5;
  
  
  public ParkingLot(String name) { 
    this.name = name;
    cars = new ArrayList<Car>(); 
    sc = new Scanner(System.in);
  }

  //추가
  public void addCar(Car car) throws RuntimeException {
    /* 구현부 */
    if(cars.size() >= LIMIT) {
      throw new RuntimeException("만차입니다. 더 이상 차량 등록이 불가능합니다.");
    }
    if(cars.contains(car)) {
      throw new RuntimeException("이미 등록된 차량입니다.");
    }
    cars.add(car);
  }
  
  //삭제
  public void deleteCar(String carNo) throws RuntimeException {
    /* 구현부 */
    if(cars.isEmpty()) {
      throw new RuntimeException("현재 주차장에 등록된 차량이 없습니다.");
    }
    if(cars.equals(carNo)) {
      throw new RuntimeException("차량번호 " + carNo + "차량이 존재하지 않습니다.");
    }
    for(int i = 0, size = LIMIT; i < size; i++) {
      if(cars.get(i).getCarNo() == carNo) {
        cars.remove(i);
        break;
      }
    }
  }
  
  // 조회
  public void searchCar(String carNo) throws RuntimeException {
    /* 구현부 */
    if(cars.isEmpty()) {
      throw new RuntimeException("조회할 사이 없습니다.");
    }
    if(cars.equals(carNo)) {
      throw new RuntimeException("차량번호 " + carNo + "차량이 존재하지 않습니다.");
    }
    Car searchCar = new Car(carNo, null);
    for(Car car : cars) {
      if(car.equals(car)) {
        car.toString();
      }
    }
      
  }
  
  public void printAllCars() throws RuntimeException {
    /* 구현부 */
    if(cars.isEmpty()) {
      throw new RuntimeException("현재 주차장에 등록된 차량이 없습니다.");
    }
    System.out.println("대박주차장 차량 목록");
    for(Car car : cars) {
      car.toString();
    }
  }
  
  public void manage() {
    /* 구현부 */
    System.out.println("##### 주차관리 프로그램 시작 #####");
    
    while(true) {
      
      try {
        
        System.out.println("1.추가 2.삭제 3.조회 4.전체조회 0.종료 >>>");
        String choice = sc.next();
        switch(choice) {
        case "1":
          addCar();
          break;
        case "2":
          deleteCar();
          break;
        case "3":
          searchCar();
          break;
        case "4":
          printAllCars();
          break;
        case "0":
          System.out.println("##### 주차관리 프로그램 종료 #####");
          break;
        default:
          throw new RuntimeException("잘못된 입력입니다.");
        }
        
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
  }

  
}