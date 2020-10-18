package vectors;

public class PolarVectorAdapter implements ICartesianVector{

    private ICartesianVector iCartesianVector;

    public PolarVectorAdapter(IPolarVector iPolarVector)
    {
     double x = iPolarVector.getR()*Math.cos(iPolarVector.getPhi());
     double y = iPolarVector.getR()*Math.sin(iPolarVector.getPhi());

    iCartesianVector = new Vector2D(x,y);

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
