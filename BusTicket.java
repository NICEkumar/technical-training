import java.util.Scanner;
class BusTicket {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter from stage number: ");
        int fromStage = in.nextInt();
        System.out.print("Enter to stage number: ");
        int toStage = in.nextInt();
        System.out.print("Enter number of adult passengers: ");
        int adults = in.nextInt();
        System.out.print("Enter number of children passengers: ");
        int children = in.nextInt();
        int numStages = Math.abs(toStage - fromStage);
        int adultCost = adults * 10 * numStages;
        int childCost = children * 5 * numStages;
        int totalCost = adultCost + childCost;
        double discount;
        if (adults >= 5) {
            discount = 0.20;
        } else if (adults == 4) {
            discount = 0.15;
        } else if (adults == 3) {
            discount = 0.10;
        } else if (adults == 2) {
            discount = 0.05;
        } else {
            discount = 0.0;
        }
        double discountedCost = totalCost - (totalCost * discount);
        double serviceCharge = discountedCost * 0.05;
        double totalTicketCost = discountedCost + serviceCharge;
        System.out.println("Total ticket cost: Rs." + totalTicketCost);
    }
}
