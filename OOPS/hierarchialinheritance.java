public class hierarchialinheritance {
    public static void main(String args[]){
        Mammal cg = new Mammal();
        cg.breathe();
        cg.eat();
        cg.walk();
        Fish tuna = new Fish();
        tuna.breathe();
        tuna.eat();
        tuna.swim();
        Bird pipi = new Bird();
        pipi.breathe();
        pipi.eat();
        pipi.fly();
    }
}
class Animal{
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}
class Mammal extends Animal{
    void walk(){
        System.out.println("Walks");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("Swims");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("Flies");
    }
}