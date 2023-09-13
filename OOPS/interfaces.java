public class interfaces {
    public static void main(String args[]) {
        queen q = new queen();
        q.moves();
        rook r = new rook();
        r.moves();
        king k = new king();
        k.moves();
    }
}
interface chessplayer{
    void moves();
}
class king implements chessplayer{
    public void moves(){
        System.out.println("left,right,up,down - only 1 step");
    }
}
class rook implements chessplayer{
    public void moves(){
        System.out.println("left,right,up,down");
    }
}
class queen implements chessplayer{
    public void moves(){
        System.out.println("left,right,up,down,diagonal");
    }
}
