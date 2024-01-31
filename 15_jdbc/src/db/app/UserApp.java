package db.app;

import java.util.List;

import javax.swing.JOptionPane;

import db.ctrl.UserController;
import db.dao.UserDao;
import db.dto.UserDto;
import db.service.UserService;
import db.service.UserServiceImpl;
import db.view.DeleteView;
import db.view.DetailView;
import db.view.EditView;
import db.view.ListView;
import db.view.RegisterView;
import db.view.View;

//UserApp 동작 흐름
/*
* UserApp              UserController                                       UserService                                  UserDao
*   작업 선택       ->
*   View 실행 결과  -> 
*                      String requestHandle(작업 선택, View 실행 결과) {
*                        작업에 따른 서비스 호출(View 실행 결과 전달)    -> 
*   작업결과메시지  <-   작업결과메시지 반환
*   확인               }
*                                                                            반환타입 선택된메소드(View 실행 결과) {
*                                                                              DAO 메소드 호출(View 실행 결과)         ->
*                                                                        <-    반환값 반환         
*                                                                            }
*                                                                                                                         반환타입 선택된메소드(View 실행 결과) {
*                                                                                                                           DB 처리
*                                                                                                                      <-   반환값 반환
*/

public class UserApp {

  public static void main(String[] args) {
    
    UserController userController = new UserController();

    while(true) {
      String choice = JOptionPane.showInputDialog("1.전체명단\n2.상세조회\n3.등록\n4.편집\n5.삭제\n0.종료\n원하는 작업 번호를 입력하세요.");
      View view = null;
      switch(choice) {
      case "1": view = new ListView(); break;
      case "2": view = new DetailView(); break;
      case "3": view = new RegisterView(); break;
      case "4": view = new EditView(); break;
      case "5": view = new DeleteView(); break;
      case "0": JOptionPane.showMessageDialog(null, "사용자 앱을 종료합니다."); return;
      default: JOptionPane.showMessageDialog(null, "잘못된 입력입니다. 다시 선택하세요.");
      }
      if(view != null) {
        String message = userController.requestHandle(choice, view.display());
        JOptionPane.showMessageDialog(null, message);
      }
    }
    
//    System.out.println(userController.requestHandle("3", new UserDto(0, "테스트이름", "테스트연락처", null)));
//    System.out.println(userController.requestHandle("1", null));
    
    
//    UserDto userDto = new UserDto(0, "테스트이름", "테스트연락처", null);
//    UserDao userDao = UserDao.getInstance();
//    int result = userDao.saveUser(userDto);
//    System.out.println(result + "행이 삽입되었습니다.");
//    
 
    
//    UserService userService = new UserServiceImpl();
//    
//    List<UserDto> users = userDao.getUsers();
//    for(UserDto user : users) {
//      System.out.println(user);
//    }
//    
//    UserDto userDto = userDao.getUser(10);
//    System.out.println(userDto);
    
    
    
//   UserDto userDto = new UserDto(1, "수정이름", "수정연락처", null);
//   int result = userDao.modifyUser(userDto);
//   System.out.println(result + "행이 수정되었습니다.");
//   
//   int result = userDao.removeUser(1);
//   System.out.println(result + "행이 삭제되었습니다.");
  }

}
