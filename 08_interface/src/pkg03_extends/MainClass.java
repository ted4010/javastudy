package pkg03_extends;

public class MainClass {

  public static void main(String[] args) {

    Elec elec = new SmartPhone();
    elec.powerOn();
    ((SmartPhone) elec).game();
    ((SmartPhone) elec).call();
    
    System.out.println();
    
    Computer computer = new SmartPhone();
    computer.powerOn();
    computer.game();
    ((SmartPhone) computer).call();
    
    System.out.println();
    
    Phone phone = new SmartPhone();
    phone.call();
    ((SmartPhone) phone).game();
    ((SmartPhone) phone).powerOn();
    
    System.out.println();
    
    SmartPhone smartphone = new SmartPhone();
    smartphone.powerOn();
    smartphone.game();
    smartphone.call();
  }

}
