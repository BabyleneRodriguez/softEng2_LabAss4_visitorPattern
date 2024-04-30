package softEng2_LabAss4_visitorPattern;

public class Furniture implements WeightInterface
{
    private String furniture;
    private double cost;
    private double distance;


    public Furniture(String furniture, double price, double distance)
    {
        this.furniture = furniture;
        this.cost = price;
        this.distance = distance;
    }

    public double accept(LightWeightInterface lightweightCalculator, double price)
    {
        this.cost = price;
        return lightweightCalculator.computeLightWeight(furniture, price);
    }
    
    public double accept(HeavyWeightInterface heavyweightCalculator, double price, double distance)
    {
        this.cost = price;
        return heavyweightCalculator.computeHeavyWeight(furniture, price, distance);
    }

    public double getCost()
    {
        return cost;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public String getFurniture()
    {
        return furniture;
    }

    public void setFurniture(String furniture)
    {
        this.furniture = furniture;
    }

    public double getDistance()
    {
        return distance;
    }

    public void setDistance(double distance)
    {
        this.distance = distance;
    }
}
