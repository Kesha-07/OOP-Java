
class BillGenerator {

    int generateBill(int itemTotal) {
        return itemTotal;
    }

    int generateBill(int itemTotal, int discount) {
        return itemTotal - discount;
    }

    double generateBill(int itemTotal, double discountPercent) {
        double discountAmount = itemTotal * discountPercent / 100;
        return itemTotal - discountAmount;
    }
}


public class Practical15 {
    public static void main(String[] args) {

        BillGenerator bill = new BillGenerator();

        int regularBill = bill.generateBill(2000);
        System.out.println("Final Bill (Regular Customer): Rs. " + regularBill);

        int privilegedBill = bill.generateBill(2000, 300);
        System.out.println("Final Bill (Privileged Customer): Rs. " + privilegedBill);

        double festiveBill = bill.generateBill(2000, 10.0);
        System.out.println("Final Bill (Festive Offer): Rs. " + festiveBill);
    }
}
