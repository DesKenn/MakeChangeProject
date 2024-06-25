import java.util.Scanner;

public class CashRegister {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		// calculate the amount of change returned to a customer

		double itemPrice; // how much the item costs
		double amountPaid; // how much the customer gave the cashier

		boolean equalPayment = true;

		do {
			System.out.println("How much does the item cost: "); // 25
			itemPrice = keyboard.nextDouble();
			System.out.println("How much did the customer pay: ");// 50
			amountPaid = keyboard.nextDouble();

			double change = amountPaid - itemPrice; // change allotted to customer //25

			if (amountPaid >= itemPrice) {

				System.out.printf("Your change is $" + "%.2f", change);
				System.out.println();

				// 1.25

				// notify the cashier on the type of currency needed for the change
				double twenties = change / 20;
				if (twenties >= 1) {
					change = change % 20;
					System.out.println("Cashier: Hand the customer " + Math.round(twenties) + " $20 Bills");
				}
				double tens = change / 10;
				if (tens >= 1) {
					change = change % 10;
					System.out.println("Cashier: Hand the customer " + Math.round(tens) + " $10 Bills");
				}
				double fives = change / 5;
				if (fives >= 1) {
					change = change % 5;
					System.out.println("Cashier: Hand the customer " + Math.round(fives) + " $5 Bills");
				}
				double ones = change / 1;
				if (ones >= 1) {
					change = change % 1;
					System.out.println("Cashier: Hand the customer " + Math.round(ones) + " $1 Bills");
				}
				double quarters = change / .25;
				if (quarters >= 1) {
					change = change % .25;
					System.out.println("Cashier: Hand the customer " + Math.round(quarters) + " Quarters");
				}
				double dimes = change / .10;

				if (dimes >= 1) {
					change = change % .10;
					System.out.println("Cashier: Hand the customer " + Math.round(dimes) + " Dimes");
				}

				double nickles = change / .5;
				if (nickles >= 1) {
					change = change % .05;
					System.out.println("Cashier: Hand the customer " + Math.round(nickles) + " Nickles");

				}
				double pennies = change / .01;

				if (pennies >= 1) {
					change = change % .01;
					System.out.println("Cashier: Hand the customer " + Math.round(pennies) + " Pennies");

					break;
				}

				if (amountPaid < itemPrice) {
					System.err.println("There was not enough money to pay for this item.");
					continue;
				}
			}

		} while (equalPayment);

		keyboard.close();

	}
}
