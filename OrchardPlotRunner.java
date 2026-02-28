class OrchardPlot{
    private String fruitType;
    private double landAreaKanal;
    private double treeSpacingFeet;
    private int totalTrees;
    private double averageYieldPerTreeKg;
    private double marketPricePerKg;

    public OrchardPlot(String fruitType, double landAreaKanal,
                       double treeSpacingFeet, int totalTrees,
                       double averageYieldPerTreeKg, double marketPricePerKg)
    {
        this.fruitType = fruitType;
        this.landAreaKanal = landAreaKanal;
        this.treeSpacingFeet = treeSpacingFeet;
        this.totalTrees = totalTrees;
        this.averageYieldPerTreeKg = averageYieldPerTreeKg;
        this.marketPricePerKg = marketPricePerKg;
    }

    public double calculateTotalYield() {
        return totalTrees * averageYieldPerTreeKg;
    }

    public double calculateRevenue() {
        return calculateTotalYield() * marketPricePerKg;
    }

    public void checkPlantDensity() {

        double treesPerKanal = totalTrees / landAreaKanal;

        if(treesPerKanal > 100)
            System.out.println("Orchard is overcrowded.");
        else if(treesPerKanal >= 50)
            System.out.println("Plant density is optimal.");
        else
            System.out.println("Land is underutilized.");
    }

    public double dailyWaterRequirement() {
        return totalTrees * 50;
    }

    public void displayOrchard() {

        System.out.println("Fruit Type: " + fruitType);
        System.out.println("Land Area: " + landAreaKanal + " kanal");
        System.out.println("Total Trees: " + totalTrees);
        System.out.println("Spacing: " + treeSpacingFeet + " feet");
        System.out.println("Estimated Yield: " + calculateTotalYield() + " kg");
        System.out.println("Estimated Revenue: Rs " + calculateRevenue());
    }

}

public class OrchardPlotRunner {
    public static void main(String args[]){

        OrchardPlot plot1 = new OrchardPlot(
                "Mango",
                1.5,
                25,
                60,
                80,
                200
        );

        plot1.displayOrchard();
        System.out.println();

    }
}
