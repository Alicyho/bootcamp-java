
public class DemoOperator {
  public static void main(String[] args) {
    // + - * /

    // % (Find Remainder)
    int remainder = 5 % 2;
    System.out.println(remainder); // 1
    System.out.println(5 % 6); // 5

    // ++ --
    // += -= *= /=
    int a = 10;
    a = a + 1; 
    a += 1;
    a++;
    ++a;
    System.out.println(a); // 14

    int b = 20;
    b = b - 1;
    b -= 1;
    b--;
    --b;
    System.out.println(16);

    // + 2
    int c = 10;
    c = c + 2;
    c += 2;

    int salary = 25000;
    salary *= 3;
    System.out.println(salary); // 75000

    // Naming Convension: Caml Case
    double hourRate = 40.5;
    int hoursPerDay = 7;
    double todaySalary = hourRate * hoursPerDay;
    System.out.println(todaySalary);

    // pre / post
    int g = 10;
    g++;
    ++g;
    
    System.out.println(g); // 12

    // post ++
    int k = g++ * 2;
    System.out.println(k); // 24 (x 2 first, then assign, then ++)
    System.out.println(g); // 13

    // pre ++
    int p = 10;
    int k2 = ++p * 2;
    System.out.println(k2); // 22
    System.out.println(p); // 11

    // Another presentation for Post++
    int h = 10;
    // int y = h++ * 2;
    int y = h * 2;
    h++;
    System.out.println(y); // 20
    System.out.println(h); // 11

    // Another presentation for pre++
    int j = 10;
    // int e = ++j * 2;
    ++j;
    int e = j * 2;
    System.out.println(e); // 22
    System.out.println(j); // 11


  }
}
