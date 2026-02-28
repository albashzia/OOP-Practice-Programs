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

}

public class OrchardPlotRunner {
    public static void main(String args[]){

    }
}
