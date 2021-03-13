package com.mtit.service;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class ServiceActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;
	
	
	public void start(BundleContext context) throws Exception {
		
		System.out.println("Card Service Provider has Started!!!");
		ServicePublish publisherService = new ServicePublishImpl();
		
		publishServiceRegistration = context.registerService(ServicePublish.class.getName(), publisherService, null); 
	
	}

	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Card Service Provider has Stopped!!!");
		publishServiceRegistration.unregister();
	
	}

}
