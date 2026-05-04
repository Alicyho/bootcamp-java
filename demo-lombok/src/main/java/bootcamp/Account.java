package bootcamp;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


// constructor, get, set

//! Annotation

// ! Annotation
@AllArgsConstructor
// @NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Account {

    private double balance;

   // 手寫無參數建構子，設定預設值為 1000
     // I want to override the original empty constructor
    public Account() {
  
    this.balance = 1000;
  }

    // 修正 addBalance 方法：要更新 this.balance
  public void addBalance(double amount) {
    this.balance = BigDecimal.valueOf(this.balance) //
        .add(BigDecimal.valueOf(amount)) //
        .doubleValue();
  }


    public static void main(String[] args) {
        Account a1 = new Account();           // 使用無參數建構子，balance = 1000
        Account a2 = new Account(100.9);      // 使用全參數建構子，balance = 100.9


        System.out.println(a2.getBalance());  // System 的 S 要大寫
        a2.setBalance(9999.9999);
        System.out.println(a2.getBalance());
        System.out.println(a2);        // 自動呼叫 toString()

        // equals 測試
        Account a3 = new Account(100.9);
        System.out.println(a2.equals(a3)); // true



  }
}