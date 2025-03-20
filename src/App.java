public class App {
    public static void main(String[] args) throws Exception {
        // Widget w1 = new Widget(10, 20);
        // Widget w2 = new Widget(30, 40);

        // Widget w1 = new Widget(10, 20);
        // Widget w2 = w1;

        Widget w1 = new Widget(10, 20);
        Widget w2 = new Widget(w1);
        w2.setX(20);

        System.out.println(w1.getX() + " " + w2.getX());
    }
}
