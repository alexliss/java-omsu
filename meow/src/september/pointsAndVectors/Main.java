package september.pointsAndVectors;
import java.util.Scanner;

public class Main {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble(),
                y = in.nextDouble(),
                z = in.nextDouble();
        Point3D point1 = new Point3D(x, y, z);
        x = in.nextDouble();
        y = in.nextDouble();
        z = in.nextDouble();
        Point3D point2 = new Point3D();
        point2.setX(x);
        point2.setY(y);
        point2.setZ(z);
        System.out.println(point1.toString());
        System.out.println(point2.toString());
        if (point1.equals(point2)) { System.out.println("equals"); }
        else { System.out.println("doesn't equal"); }
        Vector3D vector1 = new Vector3D(point1, point2);
        Vector3D vector2 = new Vector3D(in.nextDouble(), in.nextDouble(), in.nextDouble());
    }
}
