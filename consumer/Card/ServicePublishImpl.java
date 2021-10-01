package Card;

import java.util.Scanner;

public class ServicePublishImpl implements ServicePublish{

	@Override
	public int cashMenu(){
		
		System.out.println("Please Select Your Card Type");
		System.out.println("1. Visa card");
		System.out.println("2. Master card");
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your card type: ");
        int number = input.nextInt();
        System.out.println("You entered " + number);

		if(number == 1) {
			
			System.out.println("Visa Card has been selected");
		}
		
		if(number == 2) {
			
			System.out.println("Master card has been selected");
		}
		
		if(number>2) {
			
			System.out.println("Invalid Input! Please try again!");
		}
		
		return 0;
		
	}
	
}

