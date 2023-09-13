public class multipleinheritance {//example of multiple inheritance using interface
    public static void main(String args[]){
        bear b = new bear();
        b.eatflesh();
        b.eatplants();
    }
}
interface herbivores{
    void eatplants();
}
interface carnivore{
    void eatflesh();
}
class bear implements herbivores,carnivore{
    public void eatflesh(){
        System.out.println("eat flesh of other animals");
    }
    public void eatplants(){
        System.out.println("eat plants");
    }
}
