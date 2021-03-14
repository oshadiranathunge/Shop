package discount;

public class DiscountImplement implements DiscountInterface {
	
public double getDiscountAmount(int amount , int d) {
		
		double  total = 0;
		
		if(d == 1) {
		total = amount + (amount*0.15);
		}
		
		if(d == 2) {
			total = amount + (amount*0.25);
		
	}

		return total;
}


	public void Discounts() {
		
		System.out.println("You have selected payment method\n");
		System.out.println("Two types of payment methodes");
		System.out.println("1. Cash");
		System.out.println("2. Card");		
	}


	@Override
	public void PrintNumber(int number) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public float PrintAmountAndSuccessMsg1(int amount) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public float PrintAmountAndSuccessMsg(int amount) {
		// TODO Auto-generated method stub
		return 0;
	}
	


}

