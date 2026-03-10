import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        while (n < 1 || n > 10) {
            System.out.print("value invalid, please enter a correct value");
            n = sc.nextInt();
            sc.nextLine();
        }

        String[] productNames = new String[n];
        String[] unitPrice = new String[n];
        String[] quantity = new String[n];

        double[] prices = new double[n];
        int[] qtys = new int[n];
        double subtotal = 0;

        for (int i = 0; i < productNames.length; i++) {
            System.out.println("Enter the name of the product: ");
            productNames[i] = sc.nextLine();

            System.out.println("Enter the price per unit: ");
            unitPrice[i] = sc.nextLine();

            System.out.println("Enter the quantity of the product: ");
            quantity[i] = sc.nextLine();

            prices[i] = parsePrice(unitPrice[i], sc);
            qtys[i] = parseQuantity(quantity[i], sc);

            subtotal = subtotal + computeLineTotal(prices[i], qtys[i]);
        }

        printReceipt(subtotal, computeDiscount(subtotal), productNames, qtys, prices);
    }

    public static double parsePrice(String text, Scanner sc) {
        double price = Double.parseDouble(text);

        while (price <= 0) {
            System.out.print("value invalid, please enter a correct value");
            price = sc.nextDouble();
        }
        return price;
    }

    public static int parseQuantity(String text, Scanner sc) {
        int qty = Integer.parseInt(text);

        while (qty < 1 || qty > 100) {
            System.out.print("value invalid please enter a correct value");
            qty = sc.nextInt();
        }
        return qty;
    }

    public static double computeLineTotal(double price, int qty) {
        double lineTotal = price * qty;
        return lineTotal;
    }

    public static double computeDiscount(double subtotal) {
        double discount = 0;

        if (subtotal >= 200) {
            discount = subtotal / 100 * 5;
        }
        return discount;
    }

    public static void printReceipt(double subtotal, double discount, String[] productNames, int[] quantity, double[] prices) {

        for (int i = 0; i < productNames.length; i++) {
            System.out.println(productNames[i] + " " + quantity[i] + " " + computeLineTotal(prices[i], quantity[i]) + "zl");
        }
        double vat = (subtotal - discount) * 23/100;
        double finalTotal = subtotal - discount + vat;
        int roundedInt = (int) finalTotal;

        String roundedTotal = String.format("%.2f", finalTotal);
        System.out.println("subtotal: " + subtotal);
        System.out.println("discount: " + discount);
        System.out.println("vat: " + vat);
        System.out.println("Your total is (rounded): " + roundedInt + "zl");
        System.out.println("Your total is: " + finalTotal + "zl");

    }
}
