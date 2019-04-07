public class Student extends  Person {
private String[] emner;


 Student(String navn , int alder,  String[] emner) {

     super(navn, alder);
     this.emner = emner;


 }


 @Override
    public String toString() {

     return  super.navn  + "som har faget " + emner[0];
 }
}
