package consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import consumer.Activator;
import discount.DiscountInterface;
import Card.ServicePublish;
import cash.CashPublishImpl;

public class ConMethod {
	public static  List<Object> stringlist=new ArrayList<Object>();
	public static  List<Object> TotalInvoicelist=new ArrayList<Object>();
	public static float TotalPrice=0;
	
	//method to select service
		public static int find() {
			Scanner sc = new Scanner(System.in);
			String user_option = "yes";
			
			System.out.println("Select the type of service\n1. Card Service\n2. Cash Service\n3. Discount Service"); 
			System.out.printf("Enter the number :");
			int details = sc.nextInt();
			   
			   if(details == 1) {
				  return 1;
			   }
			   else if(details == 2) {
				   return 2;
			   }
			   else if(details == 3) {
				   return 3;
			   }
			   else
			   return 0;
		}

		//method to access gas service
		public static void Card(ServicePublish card) {
			Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Select the type of card\n1. Visa\n2. Master");
		    System.out.printf("Enter the number : ");
		    String cardType = myObj.nextLine();  
		    
		    System.out.println("\nThe payment method");
		    
			//enter the size of the gas
			Scanner scan=new Scanner(System.in);
			consumer u1 = new consumer();
			card.cashMenu();
			
			String user_option="yes";
			int total=0;
			
			do {

				System.out.println("Select the card type;\n1. Visa\n2. Master");
				System.out.printf("Enter the number : ");
				int size=scan.nextInt();
				
				if(size == 1) {
					System.out.println("Your selection for Visa card is successful ");		
					System.out.println("Current Bill: "+card.cashMenu());
					total+=card.cashMenu();
					
					u1.setPayment(card.cashMenu());
					
					
				}
				else if(size == 2) {
					System.out.println("Your selection for Master is successful ");							
					System.out.println("Current Bill: "+card.cashMenu());
					
					total+=card.cashMenu();
					
					
				}			
				
				else 
					System.out.println("Unexpected error! Please try again");
				   
							
				
					total=0;
					System.out.println("Do you want to continue? 'yes' for YES \n 'no' for NO");
					user_option=scan.next();		
				}
			while(user_option.equals("yes")); 
			
			//printing the bill for card payment
			System.out.println("*******************************************************");
			System.out.println("                 			 BILL                      ");
			System.out.println("*******************************************************");
			

			System.out.println("-------------------------------------------------------");   
			System.out.println("   	Total bill: " +TotalPrice);
			System.out.println("*******************************************************");
			System.out.println("        Thank you..!     				               ");
			
			stringlist.clear();
			
			TotalPrice=0;
		}

	
		
		//method to access discount service
		public static void discount(DiscountInterface discount) {
			{
		
			Scanner scan=new Scanner(System.in);
			consumer u2 = new consumer();

			String user_option="yes";
			int total=0;
			do {
				discount.getDiscountAmount(total, total);
				//discount.DisplayBrand();
				System.out.printf("Enter your connection brand");
				String answer=scan.nextLine();
				
				if(answer != null ) {
					Scanner scan2 = new Scanner(System.in);		
					System.out.println("Enter your number");
					int number = scan2.nextInt();
					discount.PrintNumber(number);
					
					Scanner scan3 = new Scanner(System.in);	
					System.out.println(discount);
					int amount = scan3.nextInt();				
					
					total += amount;
					TotalPrice += discount.PrintAmountAndSuccessMsg(amount);

				}			
				else 
					System.out.println("Unexpected error! Please try again");
				
					u2.setPayment(total);
					 stringlist.add(u2.getPayment());			
					
					total=0;	
					
					System.out.println("Do you want to continue? 'yes' for YES \n 'no' for NO and you can find another services");
					user_option=scan.next();			
				
				}
				while(user_option.equals("yes")); 
				
				System.out.println("*******************************************************");
				System.out.println("                 DISCOUNT                           ");
				System.out.println("*******************************************************");
		
				System.out.println("-------------------------------------------------------");   
				System.out.println("   	Total bill: " +TotalPrice);
				System.out.println("*******************************************************");
				System.out.println("        Thank you & See you again..!                   ");
				
				stringlist.clear();
			     
				u2.setPayment(TotalPrice);

				TotalInvoicelist.add(u2.getPayment());
				TotalPrice=0;
			}
			
		}	
		
		//method to access cash service
			public static void CashPublish(CashPublishImpl cash) {

			Scanner scan=new Scanner(System.in);
			consumer u3 = new consumer();
			
			System.out.println("select the type of vehicle");
			Scanner s1 = new Scanner(System.in);  // Create a Scanner object
			cash.cashEntry();
		    System.out.printf("Enter the count : ");
		    
			
			String user_option="yes";
			
			int total=0;
			
			do {
				Scanner s3=new Scanner(System.in);
				System.out.printf("Enter the cash: ");
				//no of cash
				int y=s3.nextInt();
				
				if(y == 1) {
					total=cash.Payment(user_option)*y;
					TotalPrice=total;
				}
				else if(y == 1000) {
					total=cash.Payment(user_option)*y;
					TotalPrice=total;
				}
				else if(y == 500) {
					total=cash.Payment(user_option)*y;
					TotalPrice=total;
					
				}else if(y == 100) {
					total=cash.Payment(user_option)*y;
					TotalPrice=total;
					
				}else if(y == 50) {
					total=cash.Payment(user_option)*y;
					TotalPrice=total;
				}
				else 
					System.out.println("Unexpected error! Please try again");
				
					u3.setPayment(total);
					 stringlist.add(u3.getPayment());			
					
					total=0;	
					
					System.out.println("Do you want to continue? 'yes' for YES \n 'no' for NO and you can find another services");
					user_option=scan.next();			
				
				
				
			}while(user_option.equals("yes")); 
			
			//printing the bill for cash service
			System.out.println("*******************************************************");
			System.out.println("                 Cash BILL                        ");
			System.out.println("*******************************************************");
			
			System.out.println("-------------------------------------------------------");   
			System.out.println("   	Total bill: " +TotalPrice);
			System.out.println("*******************************************************");
			System.out.println("        Thank you & Have nice day..!                   ");
			
			stringlist.clear();
			
			u3.setPayment(TotalPrice);

			TotalInvoicelist.add(u3.getPayment());
			TotalPrice=0;
		}
		
		//method to access print bill
		public static void PrintBill() {{
			
			System.out.println("*******************************************************");
			System.out.println("                 TOTAL INVOICE                         ");
			System.out.println("*******************************************************");
			System.out.println("	 			 Items 	Price                          ");
			
			for(Object obj:TotalInvoicelist) {
				if(obj.getClass()==Integer.class) {
					 System.out.print(" "+obj+" \t");
				}
				if(obj.getClass()==String.class) {

					 System.out.print(" "+obj+" \t ");

				}
				if(obj.getClass()==Float.class) {

					 System.out.print(" "+obj+"\n ");
					 TotalPrice+=(Float)obj;
				}
				
		      }
			
			//printing the bill for total cost
			System.out.println("-------------------------------------------------------");   
			System.out.println("   	Total bill: " +TotalPrice);
			System.out.println("*******************************************************");
			System.out.println("        Thank you & See you again..!                   ");
			TotalInvoicelist.clear();
			TotalPrice=0;
		}
		}


}
