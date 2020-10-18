package vectors;

public interface ICartesianVector extends IVector {

    public double[] getComponents();
    public double[] getAngels();
    public double cdot(ICartesianVector vector);

}
