import java.util.ArrayList;
import java.util.LinkedList;

public class DemoLinkedList {
  public static void main(String[] args) {

      //A連B ，B連C，
  //一層層 入去搵
  //SEARCHING 速度慢

    LinkedList<String> strings = new LinkedList<>();
    strings.add("leo");
    strings.add("steven");
    strings.add("vincent");
    
    System.out.println(strings.size()); // 3
    System.out.println(strings.contains("steven")); // true
    
    strings.remove(strings.size()/2); //! loop
    strings.add("Sally"); // add the tail (no loop)
  
    LinkedList<String> strings2 = new LinkedList<>();
    strings.add("leo");
    strings.add("steven");
    strings.add("vincent");
    System.out.println(strings2.size()); //3
     System.out.println(strings2.contains("steven"));
    
    strings2.remove(strings.size()/2); //! clear element, (may) resize the array (loop)
    strings2.add("Sally");//((may) revise array, add element)

    // create delete update search (4 actions)

    // CRUD -> create read update delete (database)

  
  }
}




