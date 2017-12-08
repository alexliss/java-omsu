package september.pointsAndVectors;

public class Vector3DProcessor {

    public static Vector3D sum(Vector3D v1, Vector3D v2) {
        return new Vector3D(v1.getX() + v2.getX(), v1.getY() + v2.getY(), v1.getZ() + v2.getZ());
    }

    public static Vector3D residual(Vector3D v1, Vector3D v2) {
        return new Vector3D(v1.getX() - v2.getX(), v1.getY() - v2.getY(), v1.getZ() - v2.getZ());
    }

    public static Vector3D vectorMultiply(Vector3D v1, Vector3D v2) {
        return new Vector3D( v1.getY()*v2.getZ() - v1.getZ()*v2.getY(),
                v1.getX()*v2.getZ() - v1.getZ()*v2.getX(),
                v1.getX()*v2.getY() - v1.getY()*v2.getX());
    }

    public static double scalarMultiply(Vector3D v1, Vector3D v2) {
        return v1.getX()*v2.getX() + v1.getY()*v2.getY() + v1.getZ()*v2.getZ();
    }

    public static Vector3D multiply(Vector3D v, double n) {
        return new Vector3D(v.getX()*n, v.getY()*n, v.getZ()*n);
    }

}
