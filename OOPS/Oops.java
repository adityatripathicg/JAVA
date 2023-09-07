class pen{
    String colour;
    int Tip;

    public void SetTip(int NTip){
        Tip = NTip;
    }
    public void Setcolor(String Ncolor){
        colour = Ncolor;
    }
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.SetTip(5);
        p1.Setcolor("blue");
        System.out.println(p1.Tip+  " "+ p1.colour);   
}
}
