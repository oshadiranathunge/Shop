package cash;

import java.util.Scanner;

import Card.ServicePublish;

public class CashPublishImpl implements ServicePublish{
		
		Scanner scn = new Scanner(System.in);
		String pp2 = "y";

		public void cashEntry() {
			while (pp2 == "y") {

				System.out.println("Please enter below details:\n");
				System.out.println("No of Rs1000 notes:");
				int Count1 = scn.nextInt();

				System.out.println("No of Rs500 notes:");
				int Count2 = scn.nextInt();

				System.out.println("No of Rs100 notes:");
				int Count3 = scn.nextInt();

				System.out.println("No of Rs50 notes:");
				int Count4 = scn.nextInt();

				System.out.println("No of Rs20 notes:");
				int Count5 = scn.nextInt();

				double total = (Count1 * 1000) + (Count2 * 500) + (Count3 * 100) + (Count4 * 50) + (Count5 * 20);

				System.out.println("\nTotal: " + total);
				System.out.println("\nProceed payment (y/n):");
				String pp1 = scn.nextLine();

				if (pp1 == "y") {
					System.out.println("\nThank you for shopping with us");
				}

				else {
					System.out.println("\nRe enter payment details (y/n): ");
					pp2 = scn.nextLine();

					if (pp2 == "n") {
						System.out.println("Thank you for visiting us! Come again!");

					}

				}

			}

		}

		@Override
		public int cashMenu() {
			return 0;
		}

		public int Payment(String user_option) {
			return 0;
		}

		
}

