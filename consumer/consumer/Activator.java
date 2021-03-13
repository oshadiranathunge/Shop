package consumer;

import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceEvent;
import org.osgi.framework.ServiceListener;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTracker;

public class Activator implements BundleActivator, ServiceListener {
	
	private BundleContext fContext;

	@Override
	public void start(BundleContext context) throws Exception {
		fContext = context;
		

		Hashtable<String, ?> props = new Hashtable<>();
		// register the service
		

		// create a tracker and track the service
		

		// have a service listener to implement the whiteboard pattern
		
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// close the service tracker
		
		fContext = null;
	}

	public void serviceChanged(ServiceEvent ev) {
		ServiceReference<?> sr = ev.getServiceReference();
		switch(ev.getType()) {
			case ServiceEvent.REGISTERED:
			{
				
			}
			break;
			case ServiceEvent.UNREGISTERING:
			{
				
			}
			break;
		}
	}


}
