import java.util.jar.Manifest;

public class Student extends Person{
  private String studentId; 

  public Student (){
    super();
  }
  public void setStudentId(String studentId){
    this.studentId = studentId;
  }

  public String getStudentId(){
    return studentId;
  }

  @Override
  public void performDuty(){
    System.out.println("I am studying");
  }


  public static void main(String[] args) {
    student s1 = new student ("234");
  
    s1.performDuty();

    System.out.println(s1.performDuty());
    System.out.println(s1.studentId());
  }
}




