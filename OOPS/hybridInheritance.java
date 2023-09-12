public class hybridInheritance {
    
}
class Animal{
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
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
class Mammal extends Animal{
    void birth(){
        System.out.println("Give Birth");
    }
}
class tuna extends Fish{
    void plants(){
        System.out.println("Eats plants inside ocean");
    }
}
class shark extends Fish{
    void carnivore(){
        System.out.println("Eats Small Fishes");
    }
}
class peacock extends Bird{
    void dance(){
        System.out.println("Dances");
    }
}
class Dog extends Mammal{
    void bark(){
    System.out.println("Barks");
    }
}
class Cat extends Mammal{
    void meow(){
    System.out.println("meows");
    }
}
class human extends Mammal{
    void play(){
    System.out.println("plays");
    }
}
