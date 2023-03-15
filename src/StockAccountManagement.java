import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 class Stock{  // simple code using private variables getter and setter to access stock variables
    private String name;
    private int numShares;
    private double sharePrice;

    public Stock(String name, int numShares, double sharePrice) {
        this.name = name;
        this.numShares = numShares;
        this.sharePrice = sharePrice;
    }

    public String getName() {
        return name;
    }

    public int getNumShares() {
        return numShares;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public double getValue() {
        return numShares * sharePrice;
    }
}

 class StockPortfolio { // storing values of user entered value in stock
     private List<Stock> stocks;

     public StockPortfolio() {
         stocks = new ArrayList<>();
     }

     public void addStock(Stock stock) {
         stocks.add(stock);
     }

     public double getTotalValue() {
         double totalValue = 0;
         for (Stock stock : stocks) {
             totalValue += stock.getValue();
         }
         return totalValue;
     }

     public void printStockReport() {   // using class1's data here
         System.out.println("Stock Report:");
         for (Stock stock : stocks) {
             System.out.println(stock.getName() + " - " + stock.getNumShares() + " shares - " + stock.getSharePrice() + " per share - Value: " + stock.getValue());
         }
         System.out.println("Total Stock Value: $" + getTotalValue());
     }
 }
public class StockAccountManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of stocks: ");
        int numStocks = scanner.nextInt();

        StockPortfolio portfolio = new StockPortfolio(); // accessing seacond class to add stock to list

        for (int i = 1; i <= numStocks; i++) {
            System.out.println("Enter details of stock #" + i + ":");
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Number of shares: ");
            int numShares = scanner.nextInt();
            System.out.print("Share price: ");
            double sharePrice = scanner.nextDouble();

            Stock stock = new Stock(name, numShares, sharePrice); // creating stock
            portfolio.addStock(stock); // passing stock to list
        }

        portfolio.printStockReport(); //printing stock accessing seacond class variable
    }
}
