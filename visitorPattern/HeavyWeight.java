package softEng2_LabAss4_visitorPattern;
import java.util.HashMap;
import java.util.Map;

public class HeavyWeight implements HeavyWeightInterface
{
    private static Map<String, Double> heavyweightMap = new HashMap<>();

    static
    {
        heavyweightMap.put("Sofa", 1000.0);
        heavyweightMap.put("Cabinet", 1000.0);
        heavyweightMap.put("Bed", 1000.0);
        heavyweightMap.put("Mattress", 1000.0);
        heavyweightMap.put("Dining Table", 1000.0);
    }

    @Override
    public double computeHeavyWeight(String furniture, double price, double distance)
    {
        double heavyWeightFee = distance * 1000.0;
        return heavyWeightFee + price;
    }
}
