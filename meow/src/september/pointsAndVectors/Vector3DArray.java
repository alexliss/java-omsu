package september.pointsAndVectors;

import exceptions.WrongValueException;

public class Vector3DArray {

    private Vector3D[] array;

    private int length = 0;

    public Vector3DArray(int length) throws WrongValueException {
        if (length <= 0) {
            throw new WrongValueException("Length of Vector3DArray cannot be less than 1. Object will not be created.");
        }
        this.length = length;
        array = new Vector3D[this.length];
    }

    public Vector3DArray(Vector3D oldArray[]) throws WrongValueException {
        this.length = oldArray.length;
        array = new Vector3D[this.length];
        for (int i = 0; i < this.length; i++) {
            array[i] = oldArray[i];
        }
    }

    public int getLength() {
        return length;
    }

    public void set(int i, Vector3D v) throws WrongValueException{
        if ( (i >= length) || (i < 0) ) {
            throw new WrongValueException("Requested item doesn't exist.");
        }
        array[i] = new Vector3D(v.getX(), v.getY(), v.getZ());
    }

    public double maxVectorLength() {
        double max = array[0].length();
        for (int i = 1; i < length; i++) {
            if (max < array[i].length()) max = array[i].length();
        }
        return max;
    }

    public int search(Vector3D v) {
        for (int i = 0; i < length; i++) {
            if (array[i].equals(v)) return i;
        }
        return -1;
    }

    public Vector3D sum() {
        Vector3D sum = array[0];
        for (int i = 1; i < length; i++) {
            sum = Vector3DProcessor.sum(sum, array[i]);
        }
        return sum;
    }

    public Vector3D linearCombination(double scalars[]) throws WrongValueException{
        if (scalars.length != length) {
            throw new WrongValueException("The length of the array of scalars is not equal to the length of the array of vectors.");
        }
        Vector3D comb = Vector3DProcessor.multiply(array[0], scalars[0]);
        for (int i = 0; i < length; i++) {
            comb = Vector3DProcessor.sum(comb, Vector3DProcessor.multiply(array[i], scalars[i]));
        }
        return comb;
    }

    public Point3D[] pointMoving(Point3D p) {
        Point3D[] pointArray = new Point3D[length];
        for (int i = 0; i < length; i++) {
            pointArray[i] = new Point3D(p.getX()+array[i].getX(), p.getY()+array[i].getY(), p.getZ()+array[i].getZ());
        }
        return pointArray;
    }
}
