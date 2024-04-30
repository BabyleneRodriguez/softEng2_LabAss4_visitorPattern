package softEng2_LabAss4_visitorPattern;


public class FurnitureShop
{
    public static void main (String [] args)
    {

        /* LIGHT WEIGHT FURNITURE */
        Furniture Table = new Furniture("Table", 950.00, 2);
        Furniture Chair = new Furniture("Chair", 800.00, 3);
        Furniture SmallBookCase = new Furniture("SmallBookCase", 750.0, 1);
        Furniture FoldableDesk = new Furniture("Foldable Desk", 500.0, 2);
        Furniture MiniCouch = new Furniture("Mini Couch", 1000.0, 1);


        LightWeightInterface lightWeightInterface = new LightWeight();


        System.out.println(">>>>> LIGHT WEIGHT FURNITURE <<<<<\n");
        System.out.println("Light Weight Furniture Shipping Rate: ₱500.00\n");

        System.out.println("Furniture Type: " + Table.getFurniture() +
                           "\nFurniture Item Price: " + Table.getCost() +
                           "\nShipping Fee: ₱500.00" +
                           "\nTOTAL COST: ₱" + Table.accept(lightWeightInterface, Table.getCost()));

        System.out.println("\nFurniture Type: " + Chair.getFurniture() +
                           "\nFurniture Item Price: " + Chair.getCost() +
                           "\nShipping Fee: ₱500.00" +
                           "\nTOTAL COST: ₱" + Chair.accept(lightWeightInterface, Chair.getCost()));

        System.out.println("\nFurniture Type: " + SmallBookCase.getFurniture() +
                           "\nFurniture Item Price: " + SmallBookCase.getCost() +
                           "\nShipping Fee: ₱500.00" +
                           "\nTOTAL COST: ₱" + SmallBookCase.accept(lightWeightInterface, SmallBookCase.getCost()));

        System.out.println("\nFurniture Type: " + FoldableDesk.getFurniture() +
                           "\nFurniture Item Price: " + FoldableDesk.getCost() +
                           "\nShipping Fee: ₱500.00" +
                           "\nTOTAL COST: ₱" + FoldableDesk.accept(lightWeightInterface, FoldableDesk.getCost()));

        System.out.println("\nFurniture Type: " + MiniCouch.getFurniture() +
                           "\nFurniture Item Price: " + MiniCouch.getCost() +
                           "\nShipping Fee: ₱500.00" +
                           "\nTOTAL COST: ₱" + MiniCouch.accept(lightWeightInterface, MiniCouch.getCost()));




        /* HEAVY WEIGHT FURNITURE */
        Furniture Sofa = new Furniture("Sofa", 35000, 20);
        Furniture KitchenCabinet = new Furniture("Kitchen Cabinet", 15000.0, 10);
        Furniture Bed = new Furniture("Bed", 40000, 30);
        Furniture Mattress = new Furniture("Mattress", 25000, 15);
        Furniture DiningTable = new Furniture("Dining Table", 15000, 35);

        HeavyWeightInterface heavyWeightInterface = new HeavyWeight();


        System.out.println("\n\n>>>>> HEAVY WEIGHT FURNITURE <<<<<\n");
        System.out.println("Heavy Weight Furniture Shipping Rate: ₱1000.00 per Kilometer\n");

        System.out.println("Furniture Type: " + Sofa.getFurniture() +
                           "\nFurniture Item Price: " + Sofa.getCost() +
                           "\nDelivery Distance: " + Sofa.getDistance() + "km" +
                           "\nShipping Fee: ₱1000.00" +
                           "\nTotal Cost: ₱" + Sofa.accept(heavyWeightInterface, Sofa.getCost(), Sofa.getDistance()));

        System.out.println("\nFurniture Type: " + KitchenCabinet.getFurniture() +
                           "\nFurniture Item Price: " + KitchenCabinet.getCost() +
                           "\nDelivery Distance: " + KitchenCabinet.getDistance() + "km" +
                           "\nShipping Fee: ₱1000.00" +
                           "\nTotal Cost: ₱" + KitchenCabinet.accept(heavyWeightInterface, KitchenCabinet.getCost(), KitchenCabinet.getDistance()));

        System.out.println("\nFurniture Type: " + Bed.getFurniture() +
                           "\nFurniture Item Price: " + Bed.getCost() +
                           "\nDelivery Distance: " + Bed.getDistance() + "km" +
                           "\nShipping Fee: ₱1000.00" +
                           "\nTotal Cost: ₱" + Bed.accept(heavyWeightInterface, Bed.getCost(), Bed.getDistance()));

        System.out.println("\nFurniture Type: " + Mattress.getFurniture() +
                           "\nFurniture Item Price: " + Mattress.getCost() +
                           "\nDelivery Distance: " + Mattress.getDistance() + "km" +
                           "\nShipping Fee: ₱1000.00" +
                           "\nTotal Cost: ₱" + Mattress.accept(heavyWeightInterface, Mattress.getCost(), Mattress.getDistance()));

        System.out.println("\nFurniture Type: " + DiningTable.getFurniture() +
                           "\nFurniture Item Price: " + DiningTable.getCost() +
                           "\nDelivery Distance: " + DiningTable.getDistance() + "km" +
                           "\nShipping Fee: ₱1000.00" +
                           "\nTotal Cost: ₱" + DiningTable.accept(heavyWeightInterface, DiningTable.getCost(), DiningTable.getDistance()));

    }
}
