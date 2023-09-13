public class methodoveriding {
    public static void main(String[] args) {
        deer d = new deer();
        d.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("eats Anything");
    }
}
class deer extends Animal{
    void eat(){
        System.out.println("Eats Grass");
    }
}
