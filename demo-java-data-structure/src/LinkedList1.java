public class LinkedList1 <T>{
// Java Version LinkedList (Double Linked)
// Out Version LinkedList (Single Linked)

//Java Version LinkedList (Doulbe Linked)
  
  
  // ! Our Version LinkedList (Single Linked)
  private Node<T> firstNode;

  // ! Java Version LinkedList (Double Linked)
  // private Node<T> lastNode;

  public LinkedList1() {

  }

  // remove(int index)
  // addFirst(T element)

  // ! addLast
  public void add(T element) {
    if (this.firstNode == null) {
      this.firstNode = new Node<>(element);
      return;
    }
    Node<T> temp = this.firstNode;
    while (temp.getNext() != null) {
      temp = temp.getNext();
    }
    temp.setNext(new Node<>(element));
  }

  // Object toString()
  @Override
  public String toString() {
    if (this.firstNode == null) {
      return "[]";
    }
    String s = "[";
    Node<T> head = this.firstNode;
    while (head != null) {
      s += head.getElement().toString();
      s += ",";
      head = head.getNext();
    }
    s = s.substring(0, s.length() - 1); // remove last ","
    s += "]";
    return s;
  }

  public static class Node<T> {
    private T element;
    private Node<T> next;

    public Node(T element) {
      this.element = element;
    }

    public T getElement() {
      return this.element;
    }

    public Node<T> getNext() {
      return this.next;
    }

    public void setNext(Node<T> next) {
      this.next = next;
    }
  }

  public static void main(String[] args) {
    LinkedList1<String> names = new LinkedList1<>();
    names.add("Leo");
    names.add("Sally");
    System.out.println(names); // [Leo,Sally]
  }
}