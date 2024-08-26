/*
    Lab 20
    Jason Chen
    112515450
 */
public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;
    Stock(String symbol, String name, double previousClosingPrice){
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
    }
    public double getChangePercent(){
        return (this.currentPrice - this.previousClosingPrice) / this.previousClosingPrice * 100;
    }
    public void updateCurrentPrice(double currentPrice){
        this.currentPrice = currentPrice;
    }
    public String getSymbol(){
        return this.symbol;
    }
    public double getPreviousClosingPrice(){
        return this.previousClosingPrice;
    }
    public double getCurrentPrice(){
        return this.currentPrice;
    }
    public static void main(String[] args){
        Stock ORCL = new Stock("ORCL", "Oracle Corporation", 34.5);
        ORCL.updateCurrentPrice(34.35);
        System.out.printf("%s\nPrevious Closing Price: \t$%.2f\nCurrent Price: \t\t\t\t$%.2f\nPrice Change: " +
                        "\t\t\t\t%.2f%%", ORCL.getSymbol(), ORCL.getCurrentPrice(), ORCL.getCurrentPrice(), ORCL.getChangePercent());
    }
}
