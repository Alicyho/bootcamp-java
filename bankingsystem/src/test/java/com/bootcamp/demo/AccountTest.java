package com.bootcamp.demo;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class AccountTest {
  

  @Test
    void testAccountHolder() {
        AccountHolder a1 = new AccountHolder();
        a1.setAccountNumber("12345678");
        a1.setPin("8888");
        a1.setStartingDeposit(5000.0);
        
        Assertions.assertEquals("12345678", a1.getAccountNumber());
        Assertions.assertEquals("8888", a1.getPin());
        Assertions.assertEquals(5000.0, a1.getStartingDeposit());
    }



    @Test 
    
    void testAccountNotNull() {
        Account a1 = new Account();
        Assertions.assertFalse(a1 == null);
        // 或更簡單：Assertions.assertNotNull(a1);
    }


    @Test
    void testValidatePin() {
        Account a1 = new Account();
        a1.setPin("1234");
        
        Assertions.assertTrue(a1.validatePin("1234"));   // 正確的 PIN
        Assertions.assertFalse(a1.validatePin("9999"));  // 錯誤的 PIN
        Assertions.assertNotNull(a1);
    }

  
	  public double getBalance() {
		// complete the function
		return -1.0;
	}

    @Test
    

    void testBalance(){
    Account a1 = new Account();
    Assertions.assertTrue((), a1.getBalance());

    Account a2 = new Account(-0.1);
    Assertions.assertFalse(a1.getBalance() <= -0.1);
  

    @Test 

    void testCreditAccount(){
      Account a1 = new Account ();
      Assertion.doubleAmount();
    }

    @Test
    void testDebitAccount(){
      Account a1 = new Account ();
      Assertion.doubleAmount();
     Assertions.assertFalse(a1.getAccount() <= -0.1);
  
}

}
