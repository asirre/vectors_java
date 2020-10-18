package vectors;

public class SphericalVector implements ISphericalVector{

    private double r;
    private double phi;
    private double theta;


    public SphericalVector(double r, double phi, double theta)
    {
        this.r = r;
        this.phi = phi;
        this.theta = theta;
    }

    public double getR() {
        return r;
    }

    public double getPhi() {
        return phi;
    }

    public double getTheta() {
        return theta;
    }

    @Override
    public double abs() {
        return 0;
    }
}
