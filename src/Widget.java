public class Widget {

    private int x;
    private int y;
    private static int count = 0;

    public Widget(int x, int y) {
        this.x = x;
        this.y = y;
        count++;
        System.out.println("Widget " + count + " created.");
    }

    public int getX() {
        return x;
    }

    public static int getCount() {
        return count;
    }
}
