package softEng2_LabAss4_visitorPattern;

import java.util.HashMap;
import java.util.Map;

public class LightWeight implements LightWeightInterface
{
    private static Map<String, Double> lightweightMap = new HashMap<>();

    static{
        lightweightMap.put("Table", 500.0);
        lightweightMap.put("Chair", 500.0);
        lightweightMap.put("Small Book Case", 500.0);
        lightweightMap.put("Foldable Desk", 500.0);
        lightweightMap.put("Mini Couch", 500.0);
    }
    @Override
    public double computeLightWeight(String furniture, double price)
    {
        double lightWeightFee = lightweightMap.getOrDefault(furniture, 0.0);
        return lightWeightFee + price;
    }
}
