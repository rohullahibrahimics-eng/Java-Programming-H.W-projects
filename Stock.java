package chapter9;
public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    
    public Stock(String symbol, String name){
        this.symbol=symbol;
        this.name=name;
    }
    
    public double  getChangePercent() {
        return (previousClosingPrice-currentPrice);
    }
    
    public void set_previousClosingPrice(double previousClosingPrice){
        this.previousClosingPrice=previousClosingPrice;
    }
    
    public void set_currentPrice(double currentPrice){
        this.currentPrice=currentPrice;
    }
}
