package cash;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import Card.ServicePublish;

public class CashActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;
	
	
	public void start(BundleContext context) throws Exception {
		
		System.out.println("Card Service Provider has Started!!!");
		ServicePublish publisherService = new CashPublishImpl();
		
		publishServiceRegistration = context.registerService(ServicePublish.class.getName(), publisherService, null); 
	
	}

	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Card Service Provider has Stopped!!!");
		publishServiceRegistration.unregister();
	
	}

}
