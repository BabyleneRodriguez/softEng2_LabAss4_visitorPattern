package softEng2_LabAss4_visitorPattern;
public interface WeightInterface
{
    public double accept(LightWeightInterface lightweight, double weight);
    public double accept(HeavyWeightInterface heavyweight, double weight, double distance);
}
