public class gs {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.setColour("blue");
        p1.setTip(5);
        System.out.println(p1.getColour());
        System.out.println(p1.getTip());
    }
}

class Pen {
    private String colour;
    private int tip;

    public void setTip(int tip) {
        this.tip = tip;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return this.colour;
    }

    public int getTip() {
        return this.tip;
    }
}
