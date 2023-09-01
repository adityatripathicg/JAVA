public class bitwiseoperators{
    public static void main(String args[]){

        //Binary AND
        System.out.println(5&6);
        //BInary OR 
        System.out.println(5|6);
        //XOR Operators
        System.out.println(5^6);
        //One's Complement
        System.out.println(~5);
        int mask = 0x000F;
        int value = 0x2222;
        System.out.println(value & mask);
        try{
            Float f1 = new Float ("3.0");
            int x = f1.intValue();
            byte b = f1.byteValue();
            double d = f1.doubleValue();
            System.out.println(x+b+d);
        }
        catch (NumberFormatException e)
        {
            System.out.println("bad number");
        }
        
    }

}