package pkg02_interfave;

/*
 * 인터페이스
 * 1. public final(상수임) static 상수만 선언할 수 있다.
 *    - > public final static 은 생략 할 수 있다.
 * 2. public abstract 추상 메소드만 선언 할 수 있다.
 *    - > public abstract 는 생략 할 수 있다.
 * 3. jdk 1.8 이후로 추가된 메소드
 *    1) 디폴트 메소드
 *      public default 반환타입 메소드명(매개변수) {
 *      
 *      }
 *    2) 클래스 메소드
 *      public static 반환타입 메소드명(매개변수) {
 *      
 *      }
 *      
 */
public interface Shape {
  
  // 상수
  /* public final static 생략가능 */ double PI = 3.141592;
  
  // 추상 메소드
  /* public final static 생략가능 */ double getArea();
  /* public final static 생략가능 */ double getCircum();
  
  // 디폴트 메소드
  public default void whoami(String name) {
    System.out.println(name);
  }
  
  // 클래스 메소드
  public static void whoami2(String name) {
    System.out.println(name);
  }
}
