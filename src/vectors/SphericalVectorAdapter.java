package vectors;

public class SphericalVectorAdapter implements ICartesianVector{

    private ICartesianVector iCartesianVector;

    public SphericalVectorAdapter(ISphericalVector iSphericalVector)
    {
        double x = iSphericalVector.getR()*Math.sin(iSphericalVector.getTheta())*Math.cos(iSphericalVector.getPhi());
        double y = iSphericalVector.getR()*Math.sin(iSphericalVector.getTheta())*Math.sin(iSphericalVector.getPhi());
        double z = iSphericalVector.getR()*Math.cos(iSphericalVector.getTheta());

        iCartesianVector = new Vector3D(x,y,z);
    }

    @Override
    public double[] getComponents() {
        return iCartesianVector.getComponents();
    }

    @Override
    public double[] getAngels() {
        return iCartesianVector.getAngels();
    }

    @Override
    public double cdot(ICartesianVector vector) {
        return iCartesianVector.cdot(vector);
    }

    @Override
    public double abs() {
        return iCartesianVector.abs();
    }
}
