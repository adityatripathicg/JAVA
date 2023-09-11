public class inheritance {
    public static void main(String args[]){
        Fish tuna = new Fish();
        tuna.eat();
        tuna.breathe();
    }
}
//Base Class
class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}

//Derived Class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims in water");
    }
}
