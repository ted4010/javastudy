package _my_1_23;

import java.net.URL;

public class My0125 {

  public static void main(String[] args) {

    StringBuilder builder = new StringBuilder();
    builder.append("http://apis.data.go.kr/B552061/AccidentDeath/getRestTrafficAccidentDeath");
    builder.append("?serviceKey=").append("rRbRiGXum8tsdqGARrqv1w6D07kmS4MkI%2FMMRSLJucAxl9VLMLgWSMTu2u6t9PaWiIThV3fmrEUycCtR9MvQqw%3D%3D");
    builder.append("&searchYear=").append(2022);
    builder.append("&siDo=").append(1100);
    builder.append("&guGun=").append(1125);
    builder.append("&type=").append("json");
    builder.append("&numOfRows=").append(10);
    builder.append("&pageNo=").append(1);
    
    String spec = builder.toString(); // String에 builder를 그대로 넣을 순 없다. toString()을 붙여야 한다
    URL url = null;
  }

}
