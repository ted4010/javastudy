package practice03_Bus;

public class Seat extends Person{

  // field
  private Person person;
  
  // constructor
  public Seat() {
  
  }

  // method
  public Person getPerson() {
    return person;
  }
  public void setPerson(Person person) {
    this.person = person;
  }
}
