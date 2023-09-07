public class GettersAndSetters {
    public static void main(String args[]) {
        pen p1 = new pen();
        p1.setColour("blue");
        p1.setTip(5);
        System.out.println(p1.getColour());
        System.out.println(p1.getTip());
    }
}

class pen {
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
