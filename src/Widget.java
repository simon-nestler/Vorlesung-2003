public class Widget {

    private int x;
    private int y;

    public Widget(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Widget created at (" + x + ", " + y + ")");
    }

    public int getX() {
        return x;
    }
}
