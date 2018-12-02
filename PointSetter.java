import java.awt.*;

public class PointSetter {
    public static void main(String[] args) {

        Point location = new Point(4, 13);    // alt enter dodaje import dla Point

        System.out.println("Polozenie poczatkowe: ");
        show(location);
        changePoint(location, 7, 6 , "przejscie do (7,6");
       // System.out.println("Przejscie do {7,6}");
       // location.x = 7;
       // location.y = 6;

        System.out.println("Polozenie koncowe: ");
        show(location, "Polozenie koncowe");

    }

    static void show(Point point) {
        System.out.println("X rowne " + point.x);
        System.out.println("Y rowne " + point.y);
        }

    static void show(Point point, String desc){
        System.out.println("X rowne " + point.x);
        System.out.println("Y rowne " + point.y);
        }

    static void changePoint(Point point, int x, int y, String desc){
        System.out.println(desc);
        point.x = x;
        point.y = y;
        }
}
