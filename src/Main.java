// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double cardBalance = 5000;
        double interestRate = 0.17;
        double monthOneInterest = (cardBalance * interestRate) + cardBalance;
        double monthTwoInterest = ((cardBalance * interestRate) + cardBalance) * interestRate + cardBalance;
        System.out.println("The interest due after one month is " + monthOneInterest + " and the interest due after two months is " + monthTwoInterest + ".");
    }
}