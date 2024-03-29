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
  public void addCar() throws RuntimeException {
    /* 구현부 */
    int size = cars.size();
    System.out.println("현재 등록된 차량 : " + size + "대");
    if(size == LIMIT) {
      throw new RuntimeException("만차입니다. 더 이상 차량 등록이 불가능합니다.");  
    }
    System.out.println("차량번호 입력 >>> ");
    String carNo = sc.next();
    System.out.println("모델 입력 >>> ");
    String model = sc.next();
    cars.add(new Car(carNo, model));
    System.out.println("차량번호 " + carNo + " 차량이 등록되었습니다.");
  }
  
  //삭제
  public void deleteCar() throws RuntimeException {
    /* 구현부 */
    if(cars.isEmpty()) {
      throw new RuntimeException("현재 주차장에 등록된 차량이 없습니다.");
    }
    System.out.println("삭제할 차량번호 입력 >>> ");
    String carNo = sc.next();
    for(int i = 0, size = cars.size(); i < size; i++) {
      if(cars.get(i).getCarNo() == carNo) {
        cars.remove(i);
        return;
      }
    }
    throw new RuntimeException("차량번호 " + carNo + " 차량이 존재하지 않습니다.");
   }
  
  
  // 조회
  public void searchCar() throws RuntimeException {
    /* 구현부 */
    if(cars.isEmpty()) {
      throw new RuntimeException("현재 주차장에 등록된 차량이 없습니다.");
    }
    System.out.println("조회할 차량번호 입력 >>> ");
    String carNO = sc.next();
    for(int i = 0, size = cars.size(); i < size; i++) {
      if(cars.get(i).getCarNo().equals(carNO)) {
        System.out.println("조회 결과 : " + cars.get(i));
        return;
      }
    }
    throw new RuntimeException("차량번호 " + carNO + " 차량이 존재하지 않습니다.");
  }
  
  public void printAllCars() throws RuntimeException {
    /* 구현부 */
    if(cars.isEmpty()) {
      throw new RuntimeException("현재 주차장에 등록된 차량이 없습니다.");
    }
    System.out.println(name + " 차량 목록");
    for(int i = 0; i < LIMIT; i++) {
      if(i < cars.size()) {
        System.out.println((i+1) + "번째 차량: " + cars.get(i));
      } else {
        System.out.println((i+1) + "번째 차량: 없음");
      }
    }
  }
  
  public void manage() {
    /* 구현부 */
   
    System.out.println("##### 주차관리 프로그램 시작 #####");
    
    while(true) {
      
      try {
        
        System.out.println("1.추가 2.삭제 3.조회 4.전체조회 0.종료 >>> ");
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
          return;
        default:
          throw new RuntimeException("잘못된 입력입니다.");
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
      
    }
   
         

  }
}
  