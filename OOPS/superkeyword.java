public class superkeyword {
    public static void main(String args[]){
        horse h = new horse();
        System.out.println(h.color);
    }
}
class Animals{
    String color;
    Animals(){
        System.out.println("Animal constructor is called");
    }
}
class horse extends Animals{
    horse(){
        //super();
        super.color = "Brown";
        System.out.println("horse constructor is called");
    }
}
