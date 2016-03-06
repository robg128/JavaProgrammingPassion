package mypackage;

public class Person {
	private String name;
  private int age;

  public Person (String name, int age){
      this.setName(name);
      this.age = age;
  }

  public int getAge() {
      return age;
  }

  public void setAge(int age) {
      this.age = age;
  }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
  @Override
  public boolean equals(Object p){
  	if (name.compareTo(((Person)p).getName()) == 0){
  		return true;
  	}
  	return false;
  }

}
