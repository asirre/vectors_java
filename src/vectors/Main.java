package vectors;

public class Main {
    public static void main(String[] arg) {
        Vector2D vector2D = new Vector2D(2,3);
        Vector3D vector3D = new Vector3D(1,2,3);
        PolarVector polarVector = new PolarVector(3,40);
        SphericalVector sphericalVector = new SphericalVector(5,6,60);

        Vector3D vectorproduct = vector3D.vectorProduct(vector2D);
        var val = vector2D.cdot(new PolarVectorAdapter(polarVector));
        var val2 = vector3D.cdot(new SphericalVectorAdapter(sphericalVector));
        System.out.println("Hello");

    }

}
