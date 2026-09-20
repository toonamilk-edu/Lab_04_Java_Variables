public class Task_3 {
    public static void main(String[] args) {
        int creditBalance = 5000;
        double interestRate = 0.17;
        double interestDueMonth1 = creditBalance * interestRate;
        double interestDueMonth2 = (creditBalance + interestDueMonth1) * interestRate;
        System.out.println("The interest due for month 1 is " + interestDueMonth1);
        System.out.println("The interest due for month 2 is " + interestDueMonth2);


    }
}
