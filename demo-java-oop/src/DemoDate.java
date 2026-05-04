import java.time.LocalDate;
import java.time.Month;

public class DemoDate {
  public static void main(String[] args) {
    // Java 8+ -> LocalDate
    // LocalDate -> Cannot be "new"
    LocalDate ld1 = LocalDate.of(2024, 12, 31); // (YYYY/MM/DD)
    // sysout -> ld1.toString()
    System.out.println(ld1); // "2024-12-31"

    System.out.println(ld1.getMonthValue()); // 12
    System.out.println(ld1.getYear()); // 2024
    System.out.println(ld1.getDayOfWeek()); // TUESDAY

    LocalDate today = LocalDate.now(); //generate system date ( system Today )
    System.out.println(today.getDayOfWeek()); // THURSDAY

    // + / -
    LocalDate joinDate = LocalDate.now(); // 2026-04-09
    LocalDate probationEndDate = joinDate.plusMonths(3L);//計算試用期END係幾時
    System.out.println(probationEndDate); // 2026-07-09

    LocalDate firstDayOfYear = LocalDate.of(2026, 1, 1);
    LocalDate yearEnd = firstDayOfYear.minusDays(1L); 
    System.out.println(yearEnd);

    Month month = joinDate.getMonth();
    System.out.println(month); // APRIL
    
    // comparsion
    if (probationEndDate.isBefore(LocalDate.of(2026, 7, 10))) {
      System.out.println("Yes. before 2026-07-10.");
    }
    // isAfter
    if (probationEndDate.isAfter(LocalDate.of(2026, 7, 1))) {
      System.out.println("Yes. after 2026-07-01.");
    }
    // equals
    if (probationEndDate.equals(LocalDate.of(2026, 7, 9))) {
      System.out.println("Yes. after 2026-07-09.");
    }

    System.out.println(LocalDate.of(2100, 1, 1).isLeapYear()); // false
    System.out.println(LocalDate.of(2004, 1, 1).isLeapYear()); // true

    System.out.println(joinDate.isLeapYear()); // false (2026)
  }
}