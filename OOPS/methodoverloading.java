public class methodoverloading {
    public static void main(String args[]){
        calculator calc = new calculator();
        System.out.println(calc.sum((float)1.2,(float) 2.4,(float)3.4));
        System.out.println(calc.sum(1, 2, 3));
        System.out.println(calc.sum(5,2));
    }
}
class calculator{
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a, int b,int c){
        return a+b;
    }
    float sum(float a, float b,float c){
        return a+b+c;
    }
}
