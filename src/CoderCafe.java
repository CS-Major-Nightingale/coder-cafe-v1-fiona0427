// File for your Coder Cafe code!
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CoderCafe {
    public static void main(String args[]) {

        LocalDate myDate = LocalDate.now();
        LocalTime myTime = LocalTime.now();
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("HH:mm");
        String formattedTime = myTime.format(myFormatter);


        System.out.println("-------------------------------------------------------------");
        System.out.println("|\t\t\t\tWelcome to Fiona's Coder Cafe\t\t\t\t|");
        System.out.println("|\t\t\t\t\t" + myDate + " " + formattedTime + "\t\t\t\t\t\t|");

        int icedMatchaLatteAmount = 2;
        int icedLatteAmount = 4;
        int cappuccinoAmount = 3;
        int hotChocolateAmount = 1;

        double icedMatchaLattePrice = 4.50;
        double icedLattePrice =  5.30;
        double cappuccinoPrice = 3.75;
        double hotChocolatePrice = 4.80;
        double serviceFee = 1.21;

        double icedMatchaLatteSubtotal = (icedMatchaLatteAmount * icedMatchaLattePrice);
        double icedLatteSubtotal = (icedLatteAmount * icedLattePrice);
        double cappuccinoSubtotal = (cappuccinoAmount * cappuccinoPrice);
        double hotChocolateSubtotal = (hotChocolateAmount * hotChocolatePrice);
        double subTotal = (icedMatchaLatteSubtotal+icedLatteSubtotal+cappuccinoSubtotal+hotChocolateSubtotal);
        double salesTax = (8.875/100) * subTotal;
        double roundedSalesTax = (int) (salesTax * 100) / 100.0;

        int totalItems = icedMatchaLatteAmount + icedLatteAmount + cappuccinoAmount + hotChocolateAmount;
        double coderCafeFee = subTotal % totalItems;
        coderCafeFee = (int) (coderCafeFee * 100) / 100.0;
        double total = subTotal + roundedSalesTax + serviceFee + coderCafeFee;


        System.out.println("|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.printf("|\t\t\t\t2x Iced Matcha Latte: $ %.2f \t\t\t\t|", icedMatchaLatteSubtotal);
        System.out.println();
        System.out.printf("|\t\t\t\t\t4x Iced latte: $ %.2f \t\t\t\t\t|", icedLatteSubtotal);
        System.out.println();
        System.out.printf("|\t\t\t\t\t3x Cappuccino: $ %.2f \t\t\t\t\t|", cappuccinoSubtotal);
        System.out.println();
        System.out.printf("|\t\t\t\t\t1x Hot Chocolate: $ %.2f \t\t\t\t|", hotChocolateSubtotal);
        System.out.println();
        System.out.println("|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.printf("|\t\t\t\tSubtotal: $ %.2f \t\t\t\t\t\t\t|", subTotal);
        System.out.println();
        System.out.printf("|\t\t\t\tSales Tax: $ %.2f \t\t\t\t\t\t\t|", roundedSalesTax);
        System.out.println();
        System.out.printf("|\t\t\t\tService Fee: $%.2f \t\t\t\t\t\t\t|", serviceFee);
        System.out.println();
        System.out.printf("|\t\t\t\tCoder Cafe Fee: $%.2f \t\t\t\t\t\t|", coderCafeFee);
        System.out.println();
        System.out.println("|-----------------------------------------------------------|");
        System.out.printf("|\t\t\t\t\t\tTotal: $%.2f \t\t\t\t\t\t|", total);
        System.out.println();
        System.out.println("|-----------------------------------------------------------|");
    }
}