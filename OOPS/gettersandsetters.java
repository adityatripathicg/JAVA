public class gettersandsetters{
    public static void main(String args[]) {
    pen p1 = new pen();
    p1.setcolour("blue");
    p1.settip(5);
    System.out.println(p1.getcolour());
    System.out.println(p1.gettip());
    }
}
class pen{

    String colour;//I   // these roman numerals were used for personal reference;
    int tip; // II
    void settip(int tip){
        this.tip=tip;//here this tip refers to the II tip;
    }
    void setcolour(String colour){
        this.colour=colour;//here this colour refers to the I colour;
    }
    String getcolour(){
        return this.colour;
    }
    int gettip(){
        return this.tip;
    }
    
}
