package mypackage;

public class Person extends Thing {
  private int age;

  public Person (String name, int age){
      super(name);
      this.age = age;
  }

  public int getAge() {
      return age;
  }

  public void setAge(int age) {
      this.age = age;
  }

}
