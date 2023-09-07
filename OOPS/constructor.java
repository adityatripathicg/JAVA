public class constructor {
    public static void main(String[] args) {
        student s1 = new student("CG");
        System.out.println(s1.name);
    }
    
}
class student{
    String name;
    int rollno;

    student(String name){
        System.out.println("Constructer is called...");
        this.name=name;
    }

}
