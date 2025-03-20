public class Widget {

    private int x;
    private int y;

    public Widget(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Widget(Widget w) {
        this.x = w.x;
        this.y = w.y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

}
