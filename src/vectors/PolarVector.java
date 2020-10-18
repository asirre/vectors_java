package vectors;

public class PolarVector implements IPolarVector {
    double r;
    double phi;

    public PolarVector(double r, double phi)
    {
        this.r = r;
        this.phi = phi;
    }

    public double getPhi() {
        return phi;
    }

    public double getR() {
        return r;
    }

    @Override
    public double abs() {
        return 0;
    }
}
