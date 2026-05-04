import java.math.BigDecimal;

public class Order {
  // id
  private String address;
  private Item[] items;

  public Order() {
    this.items = new Item[0];
  }

  public Order(Item[] items) {
    this.items = items;
  }

  public Item[] getItems() {
    return this.items;
  }
  
  // ! Nice to have
  public void addItem(Item newItem) {
    Item[] newItems = new Item[this.items.length + 1];
    for (int i = 0; i < this.items.length; i++) {
      newItems[i] = this.items[i];
    }
    newItems[newItems.length - 1] = newItem;
    this.items = newItems;
  }

  // return type always keep primitive (Best Practice)
  public double totalAmount() { // APIE: Encapsulation
    // sum
    BigDecimal sum = BigDecimal.ZERO;
    for (int i = 0; i < this.items.length; i++) {
      Item item = this.items[i];
      double subTotal = item.subTotal();
      sum = sum.add(BigDecimal.valueOf(subTotal));
    }
    return sum.doubleValue();
  }

  // ! One-to-Many -> Array -> Encapsulation ()
  public static void main(String[] args) {
    Item rice = new Item("rice", 2.99, 3);
    Item water = new Item("water", 5, 10);
    
    Order order1 = new Order();
    order1.addItem(rice);
    order1.addItem(water);

    Customer c1 = new Customer();
    c1.addOrder(order1);

    Item fish = new Item("fish", 10, 3);

    Order order2 = new Order();
    order2.addItem(fish);
    c1.addOrder(order2);

    System.out.println(c1.totalOrderAmount()); // 88.97
    System.out.println(c1.isVip());
  }
}