import java.math.BigDecimal;

public class Square extends Shape {
  private double length;



  public Square (double length, Color color){
    super (color);
    this.length = length;
  }

  public double getlength (){
    return this.length;
  }

  @Override 
  public double area (){
    return BigDecimal.valueOf(this.length)//
    .multiply(BigDecimal.valueOf(this.length))//
    .doubleValue();
  }


}
