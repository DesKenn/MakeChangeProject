import java.util.Scanner;

public class CashRegister {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		// calculate the amount of change returned to a customer

		double itemPrice; // how much the item costs
		double amountPaid; // how much the customer gave the cashier

		boolean equalPayment = true;

		do {
			System.out.println("How much does the item cost: ");
			itemPrice = keyboard.nextDouble();
			System.out.println("How much did the customer pay: ");
			amountPaid = keyboard.nextDouble();

			double change = amountPaid - itemPrice; // change allotted to customer

			if (amountPaid >= itemPrice) {

				System.out.println("Your change is $" + change);

				double twenties = change / 20;
				double tens = change / 10;
				double fives = change / 5;
				double ones = change / 1;
				double quarters = change / .25;
				double dimes = change / .10;
				double nickles = change / .5;
				double pennies = change / .01;

				// notify the cashier on the type of currency needed for the change

				if (twenties >= 1) {
					change = change % 2000;
					System.out.println("Cashier: Hand the customer " + Math.floor(twenties) + " $20 Bills");
				}

				 if (tens >= 1) {
					change = change % 1000;
					System.out.println("Cashier: Hand the customer " + Math.floor(tens) + " $10 Bills");
				}

				 if (fives >= 1) {
					change = change % 500;
					System.out.println("Cashier: Hand the customer " + Math.floor(fives) + " $5 Bills");
				}

				 if (ones >= 1) {
					change = change % 100;
					System.out.println("Cashier: Hand the customer " + Math.floor(ones) + " $1 Bills");
				}

				 if (quarters >= 1) {
					change = change % 25;
					System.out.println("Cashier: Hand the customer " + Math.floor(quarters) + " Quarters");
				}

				 if (dimes >= 1) {
					change = change % 10;
					System.out.println("Cashier: Hand the customer " + Math.floor(dimes) + " Dimes");
				}

				 if (nickles >= 1) {
					change = change % 5;
					System.out.println("Cashier: Hand the customer " + Math.floor(nickles) + " Nickles");

				}

				 if (pennies >= 1) {
					change = change % 1;
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
