package discount;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import javax.naming.Context;

public class DiscountActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;
	
	private static BundleContext context;



	public void start(BundleContext context) throws Exception {

		System.out.println("Publisher Start");
		DiscountInterface discount = new DiscountImplement();
	
		publishServiceRegistration = context.registerService(DiscountInterface.class.getName(),discount,null);
	}


	public void stop(BundleContext context) throws Exception {

		System.out.println("Publisher Stop");
		
		publishServiceRegistration.unregister();
	}

}
