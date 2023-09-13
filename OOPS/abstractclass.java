public class abstractclass {
    public static void main(String args[]){
    horse h1 = new horse();
    h1.eat();
    h1.walk();
    System.out.println(h1.Color);
    h1.changeColor();
    System.out.println(h1.Color);
    }
    //Animal a = new Animal();{//object of abstract class can't be created 
}

abstract class Animal{//object of abstract class can't be created 
    void eat(){
        System.out.println("Animal eats");
    }
    String Color;
    Animal(){//constructor
        //Color = "brown";
        System.out.println("Animal constructor called");
    }
    abstract void walk();//abstract function can only be declared
}
class horse extends Animal{
    horse(){
        System.out.println("horse constructor called");
    }
    void changeColor(){
        Color = "dark brown";
    }
    void walk(){//it is mandatory to define abstract function in every derived class.
        System.out.println("walks on 4 legs");//
    }
}
