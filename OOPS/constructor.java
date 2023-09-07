public class constructor {
    public static void main(String[] args) {
        student s1 = new student("CG");
        System.out.println(s1.name);
        student s2 = new student();
    }
    
}
class student{
    String name;
    int rollno;

    student(String name){//parameterized constructor;
        this.name=name;
    }
    student(){  //non-parameterized constructor;
        System.out.println("Constructer is called...");
    }

}
