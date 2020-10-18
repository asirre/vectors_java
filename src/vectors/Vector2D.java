package vectors;

import vectors.IVector;

public class Vector2D implements ICartesianVector {

    private double x;
    private double y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public double abs() {
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public double[] getComponents() {
        double[] components = new double[2];
        components[0] = x;
        components[1] = y;
        return components;
    }

    @Override
    public double[] getAngels() {

        double[] angels = new double[1];
        angels[0] = Math.atan(y / x);
        return angels;
    }

    @Override
    public double cdot(ICartesianVector vector) {
        return x * vector.getComponents()[0] + y * vector.getComponents()[1];
    }
}


