import java.awt.Point;

public class PointDemo {
    public static void main(String[] args) {
        Point spot = new Point(3, 4);
        System.out.println(spot.x);
        spot.translate(2,3);
        System.out.println(spot);
        spot.move(3,3);
    }
}
