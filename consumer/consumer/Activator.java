package consumer;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceEvent;
import org.osgi.framework.ServiceListener;
import org.osgi.framework.ServiceReference;

import Card.ServicePublish;
import cash.CashPublish;
import cash.CashPublishImpl;
import consumer.ConMethod;
import discount.DiscountInterface;


public class Activator implements BundleActivator, ServiceListener {
	ServiceReference serviceReferance;
	
	private static BundleContext context;
	
	static BundleContext getContext() {
		return context;
	}

	@Override
	public void start(BundleContext context) throws Exception {
		Activator.context = context;
		System.out.println("Consumer bundule has started.");
		this.ConMethod();
		System.out.println("Consumer service has started.");
		
	}

	private void ConMethod() {
		Scanner sc=new Scanner(System.in);
		String user_option="no";
		
		do {
			int serviceType = ConMethod.find();
			
			if(serviceType == 1) {
				
				ServiceReference service_1 = context.getServiceReference(ServicePublish.class.getName());
				ServicePublish card_Int =(ServicePublish)context.getService(service_1);
				ConMethod.Card(card_Int);  
				context.ungetService(service_1);
			}
			else if(serviceType == 2) {
				
				ServiceReference service_2 = context.getServiceReference(DiscountInterface.class.getName());
				DiscountInterface Reload_Int =(DiscountInterface)context.getService(service_2);
				ConMethod.discount(Reload_Int);
				context.ungetService(service_2);
			}
			else if(serviceType == 3) {
				
				ServiceReference<?> service_3 = context.getServiceReference(CashPublish.class.getName());
				CashPublishImpl cash_Int =(CashPublishImpl)context.getService(service_3);
				ConMethod.CashPublish(cash_Int);
				context.ungetService(service_3);
			}
			else {
				System.out.println("");
			}
			System.out.println("Do you want to exit? \n 'yes' for YES \n 'no' for NO");
			user_option = sc.next();
			
		}while(user_option.equals("no"));	
		ConMethod.PrintBill();
	}
		
	

	@Override
	public void stop(BundleContext context) throws Exception {
		Activator.context = null;
		System.out.println("Consumer service stopped.");
	}

	@Override
	public void serviceChanged(ServiceEvent arg0) {
		
		
	}

	

	
		

}
