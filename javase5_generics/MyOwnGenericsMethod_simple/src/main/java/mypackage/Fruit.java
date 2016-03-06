package mypackage;

public class Fruit {
	private String name;
  private int quantity;

  public Fruit (String name, int quantity){
      this.setName(name);
      this.quantity = quantity;
  }

  public int getQuantity() {
      return quantity;
  }

  public void setQuantity(int quantity) {
      this.quantity = quantity;
  }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
  @Override
  public boolean equals(Object p){
  	if (name.compareTo(((Fruit)p).getName()) == 0){
  		return true;
  	}
  	return false;
  }

}
