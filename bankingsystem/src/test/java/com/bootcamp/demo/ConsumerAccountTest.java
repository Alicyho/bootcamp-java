package com.bootcamp.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConsumerAccountTest {
  
     @Test
    void testCommercialAccount() {
        // 正確建立物件的方式
        Company company = new Company("Tech Corp");
        Long accountNumber = 88888888L;
        int pin = 8888;
        double startingDeposit = 5000.0;
        
        CommercialAccount account = new CommercialAccount(company, accountNumber, pin, startingDeposit);
        
        // 驗證
        Assertions.assertEquals(company, account.getCompany());
        Assertions.assertEquals(accountNumber, account.getAccountNumber());
        Assertions.assertEquals(pin, account.getPin());
        Assertions.assertEquals(startingDeposit, account.getBalance());
    }

       @Test
    void testAddAuthorizedUser() {
        // 準備測試資料
        Company company = new Company("ABC Corp");
        CommercialAccount account = new CommercialAccount(company, 12345678L, 1234, 1000.0);
        
        Person john = new Person("John");
        Person jane = new Person("Jane");
        
        // 執行：添加授權使用者
        account.addAuthorizedUser(john);
        account.addAuthorizedUser(jane);
        
        // 驗證
        Assertions.assertEquals(2, account.getAuthorizedUsers().size());
        Assertions.assertEquals("John", account.getAuthorizedUsers().get(0).getName());
        Assertions.assertEquals("Jane", account.getAuthorizedUsers().get(1).getName());
    }
    
    @Test
    void testAddNullAuthorizedUserThrowsException() {
        Company company = new Company("ABC Corp");
        CommercialAccount account = new CommercialAccount(company, 12345678L, 1234, 1000.0);
        
        // 驗證：添加 null 應該拋出異常
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            account.addAuthorizedUser(null);
        });
    }
    
    @Test
    void testAddDuplicateAuthorizedUser() {
        Company company = new Company("ABC Corp");
        CommercialAccount account = new CommercialAccount(company, 12345678L, 1234, 1000.0);
        
        Person john = new Person("John");
        
        account.addAuthorizedUser(john);
        account.addAuthorizedUser(john);  // 再次添加同一個人
        
        // 根據實作決定期望結果
        // 如果希望不添加重複，應該還是 1 個
        // 如果允許重複，會是 2 個
        Assertions.assertEquals(1, account.getAuthorizedUsers().size());
    }
}
}
