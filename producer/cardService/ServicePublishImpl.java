package com.mtit.service;

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
			
			System.out.println("You have selected Visa Card");
		}
		
		if(number == 2) {
			
			System.out.println("You have selected Master card");
		}
		
		if(number>2) {
			
			System.out.println("Invalid Input!!!!!");
		}
		
		return 0;
		
	}
	
}

