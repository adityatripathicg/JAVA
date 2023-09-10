public class copyconstructor {
    public static void main(String args[]) {
        student s1 = new student();
        s1.username = "cg";
        s1.pass = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        student s2 = new student(s1);

        for (int i = 0; i < s2.marks.length; i++) {
            System.out.print(s2.marks[i] + " ");
        }
    }
}

class student {
    String username;
    int marks[];
    String pass;
    int a;

    student() {
        System.out.println("Constructor is called...");
        //blank
    }

    student(student s1) {
        this.username = s1.username;
        this.pass = s1.pass;
        this.marks = new int[s1.marks.length]; // Create a new array
        System.arraycopy(s1.marks, 0, this.marks, 0, s1.marks.length); // Copy the values
    }
}
