package pkg3_branch_practice;

public class MainClass {

  public static void method1() {
    // 월에 따른 계절 출력하기
    int month = 7;
    String season;
    
    if( month >= 3 && month <= 5 ) {
      season = "봄";
    } else if( month >= 6 && month <= 8 ) {
      season = "여름";
    } else if( month >= 9 && month <= 11 ) {
      season = "가을";
    } else  {
      season = "겨울";
    }
   
    System.out.println(season);   
  }
  
  public static void method1_1() {
    int month = 7;
    String season;
   
    int mod = month % 12;
    
    if(mod <= 2) {
      season = "겨울";
    } 
  }
  
  public static void method2() {
    
    // 점수와 학년에 따른 합격 여부
    // 1~3학년 : 60점 이상이면 합격, 아니면 불합격
    // 4~6학년 : 70점 이상이면 합격, 아니면 불합격
    
    int score = 60;  // 점수
    int grade = 4;   // 학년
    
    if (score >= 60) { // 60점이상 합격
      if (grade != 4) { // 1,2,3 학년 / 4학년
          System.out.println("합격!"); // 4학년 아니면 합격 (1,2,3학년 해당)
      } else if (score >= 70) {
          System.out.println("합격!");// 4학년이 70점일떄 합격
      } else {
          System.out.println("불합격"); // 4학년이 70점 미만이면 불합격
      }
   }else 
      System.out.println("불합격");
    
    
  }

  public static void method2_1() {
    

    // 점수와 학년에 따른 합격 여부
    // 1~3학년 : 60점 이상이면 합격, 아니면 불합격
    // 4~6학년 : 70점 이상이면 합격, 아니면 불합격
    
    int score = 60; //점수
    int grade = 1;  //학년
    
    // 합격 점수
    int pass = 0;
    if (grade >= 1 && grade <= 3) {
      pass = 60;
    } else if(grade >= 4 && grade <= 6) {
      pass = 70;
    }
    
    // 합격/불합격
    String result = null;
    if(score >= pass) {
      result = "합격";
    } else {
      result = "불합격";
    }
    System.out.println(result);
  }
  
  public static void method3() {
    
    // 4일은 목요일, n일 후는 무슨 요일?
    
    int day = 4;      // 4일은 목요일
    int n = 1;    // nDay일 후
    String weekName;  // 요일 (월~일)
    
    
    if((day + n)%5 == 0){                 //1일 후 금
      System.out.println("금요일");
    } else if((day + n)%5 == 1){          //1일 후 토
      System.out.println("토요일");
    } else if((day + n)%5 == 2){          //1일 후 월
      System.out.println("일요일");
    } else if((day + n)%5 == 3){          //1일 후 화
      System.out.println("화요일");
    } else if((day + n)%5 == 4){          //1일 후 수
      System.out.println("수요일");
    } else if((day + n)%5 == 5){          //1일 후 목
      System.out.println("목요일");
    } 
    
    
    
  }
  
  public static void method3_1() {
  // 4일은 목요일, n일 후는 무슨 요일?
  
  int day = 4;      // 4일은 목요일
  int n = 1;    // nDay일 후
  String weekName;  // 요일 (월~일)
  
  // day의 n일 후
  day += n;
  
  // day를 7로 나눈 나머지
  int mod = day % 7;
  if(mod == 0) {
    weekName = "일";
  } else if(mod == 1) {
    weekName = "월";
  } else if(mod == 2) {
    weekName = "화";
  } else if(mod == 3) {
    weekName = "수";
  } else if(mod == 4) {
    weekName = "목";
  } else if(mod == 5) {
    weekName = "금";
  } else {
    weekName = "토";
  } 
  
  System.out.println(weekName);
  
  
  }
  
  public static void method4() {
    
    // 메뉴에 따른 가겻
    // 아메리카노 : 1000
    // 카페라테   : 2000
    // 밀크티     : 3000
    // 기타       : 5000
    
    String order = "아메리카노";
    int price = 0;
    
    switch (order) {
    case "아메리카노":
      price = 1000;
      break;
    case "카페라테":
      price = 2000;
      break;
    case "밀크티":
      price = 3000;
      break;
    case "기타":
      price = 5000;
      break;
    default:
    }
    
    System.out.println(price);
  }
  
  public static void main(String[] args) {
    method4();
  }

}


