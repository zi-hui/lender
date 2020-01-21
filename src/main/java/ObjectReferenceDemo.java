import java.awt.Point;

public class ObjectReferenceDemo {
    static void foo(Point p, int d) {
        p.x = p.x + d;
        p.y = p.y + d;
        p = new Point(1, 1);
        d = 7;
    }

    public static void main(String[] args) {
        Point original = new Point(0, 0);
        int distance = 5;
        foo(original, distance);
        System.out.println(original);
    }
}
