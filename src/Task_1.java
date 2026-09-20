public class Task_1 {
    public static void main(String[] args) {
    double purchasePrice = 50.00;
    double taxRate = .05;
    double salesTax = purchasePrice * taxRate;
    double totalCost = purchasePrice + salesTax;
    System.out.println("The total cost of the items is " + "the purchase price before tax, which is " + purchasePrice + " plus the sales tax, which is " + salesTax + " making the total cost " + totalCost);



    }
}
