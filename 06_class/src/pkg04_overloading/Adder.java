package pkg04_overloading;

public class Adder {

  int add(int[] arr) {
    int total = 0;
    for(int n : arr) { // 배열을 순서대로 순회할 때
      total += n;
    }
    return total;
  }
  
  double add(double[] arr) {
    double total = 0;
    for(double n : arr) {
      total += n;
    }
    return total;
  }
  
}
