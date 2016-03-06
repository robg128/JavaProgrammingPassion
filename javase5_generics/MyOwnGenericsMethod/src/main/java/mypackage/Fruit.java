package mypackage;

public class Fruit extends Thing{
  private int quantity;

  public Fruit (String name, int quantity){
      super(name);
      this.quantity = quantity;
  }

  public int getQuantity() {
      return quantity;
  }

  public void setQuantity(int quantity) {
      this.quantity = quantity;
  }

}
