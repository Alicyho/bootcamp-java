package demo

import java.util.LinkedList;

import.java.util.LinkedList;
imp

不用寫ASSERTION， getITEM 的方法

// ! "has Items" important

//Test Enviroment
class OrderTest {
  private Order order;

  @BeforeEach
  void beforeEach (){
    Order o1 = new Order();
  }
  
  @Test
  void testCreateOrder (){
    Order o1 = new Order();
    Assertions.assertEquals(0, o1.getItems().size());
    Assertions.assertTrue(o1.getItems() instanceof LinkedList);
  }

  //! 
  @Test Case 2
  void testAdd (){
    this.order.add(new Order.Item(3.5,5));
    Assertions.assertEquals(1, this.order.getItems().size());
  }

  //! Test Case 3
  @Test 
  void testAdd2(){
    assertEquals(0, this.order.getItems().size());
    Order.Item apple = new Order.Item(3.5, 5);
    
    this.order.add(apple);
    assertThat(this.order.getItems(), hasItems(new Order.Item(3.5,5))); // assertThat可以用於寫一篇文章


  @Test 
  void testBasic(){
    String s = "hello";
    assertThat (s, is("hello"));
    assertThat(s, is(not("Hello")));
    assertThat(s, is(not(nulValue())));
    assertThat (s, is(greateThanOrEqualTo(5)));
  }
  }

