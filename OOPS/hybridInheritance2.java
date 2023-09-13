    class Animal{
        String name;
        void eat(){
            System.out.println("eats");
        }
         void breathe(){
            System.out.println("breathe");
         }
    }
     class Fish extends Animal{
        void swims(){
            System.out.println("swims");
        }
     }
     class Shark extends Fish{
        void fins(){
            System.out.println("fins");
        }
     }
     class Bird extends Animal{
        void fly(){
            System.out.println("fly");
        }
     }
     class Parrort extends Bird{
        void talks(){
            System.out.println("talks");
        }
     }
     class Mammals extends Animal{
        void walk(){
            System.out.println("walks");
        }
     }
     class human extends Mammals{
        void brain(){
            System.out.println("brain");
        }
     }
    
     public class hybridInheritance2 {
        public static void main (String args[]){
            human h1= new human();
            h1.eat();
    
            Bird b1= new Bird();
            b1.breathe();
    
        }
        
    }

