public class accessmodifiers {

   
    }
    

class bankacc{
    public String username;
    private String pass;
    void setpw(String pw){
        pass=pw;
    }
     public static void main(String[] args) {
        bankacc myacc = new bankacc();
        myacc.username = "abcd";
        //myacc.pass = "1234"; this won't work due to access specifier private
        myacc.setpw("hello");
     }
}
