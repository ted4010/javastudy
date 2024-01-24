package _my_1_23;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class My0123 {

  public static void method1() {
    
    // 디렉터리 (폴더를 항상 만드는 기능을 함)
    File dir = new File("\\storage"); // 폴더 이름
    if(!dir.exists()) {               // dir(경로)에 디렉토리/파일 구분없이 존재하는지를 확인
      dir.mkdirs();                   // 상위 폴더가 없는 경우에도 원하는 경로에 폴더를 생성하게 됩니다. 
    }
    
    // 파일
    File file = new File(dir, "Samlp3.dat"); //생성자 dir=\\storage에 있는 Samlp3.dat
    
    // 버퍼 출력 스트림 선언
    BufferedOutputStream out = null; // 파일 쓰기 스트림(프로그램과 파일이나 콘솔사이에 있는  중간 매개자 역할)
    
    try {
      
      // 버퍼 출력 스트림 생성
      out = new BufferedOutputStream(new FileOutputStream(file));
    } catch ( e) {
      // TODO: handle exception
    }
    
  }
}
