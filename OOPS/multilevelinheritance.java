public class multilevelinheritance {
    public static void main(String args[]){
    Dog d1Dog = new Dog();
    d1Dog.eat();
    d1Dog.Breed = "Desi";
    System.out.println(d1Dog.Breed);
    d1Dog.breathe();
    d1Dog.legs = 4;
    System.out.println(d1Dog.legs);
    }
    

}
class Animal{
    String color;
    void eat() {
        System.out.println("Eats");
    }
    void breathe() {
        System.out.println("Breathes");
    }
}
class Mammal extends Animal{
    int legs;
}
class Dog extends Mammal{
    String Breed;
}
