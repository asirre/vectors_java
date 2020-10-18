package vectors;


public class Vector3D extends Vector2D {

    private double z;

    public Vector3D(double x, double y, double z)
    {
        super(x,y);
        this.z=z;
    }
    @Override
    public double abs() {

        double x = getX();
        double y = getY();
        return Math.sqrt(x*x+y*y+z*z);

    }
    @Override
    public double[] getComponents() {
        double[] components = new double[3];
        components[0]=getX();
        components[1]=getY();
        components[2]=z;
        return components;
    }

    @Override
    public double[] getAngels() {
        double[] angels = new double[2];
        angels[0]=Math.atan(getY()/getX());
        angels[1]=Math.acos(z/abs());
        return angels;
    }

    @Override
    public double cdot(ICartesianVector vector) {

        double[] comp = vector.getComponents();
        return getX()*comp[0]+getY()*comp[1]+z*comp[2];
    }

    public Vector3D vectorProduct(ICartesianVector vector)
    {
        double[] a = getComponents();

        double[] b = vector.getComponents();

        Vector3D vector3D = new Vector3D(0,0,0);

        if(vector instanceof Vector2D)
        {
            vector3D = new Vector3D(a[1]*0-a[2]*b[1],a[2]*b[0]-a[0]*0,a[0]*b[1]-a[1]*b[0]);
        }
        else
            {
            vector3D = new Vector3D(a[1] * b[2] - a[2] * b[1], a[2] * b[0] - a[0] * b[2], a[0] * b[1] - a[1] * b[0]);
        }

        return vector3D;
    }


}
