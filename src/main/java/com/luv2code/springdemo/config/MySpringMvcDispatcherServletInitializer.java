package com.luv2code.springdemo.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/***
 * 
 * @author RD89134
 * AbstractAnnotationConfigDispatcherServletInitializer class which is a base class for the WebApplicationInitializer, 
 * this will configure the servlet context programatically. We need to tell it where the location of our Spring MVC Java Configuration file is located. 
 * We do this by registering the class – of our java configuration – in the getServletConfigClasses method.
 */
public class MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] { DemoAppConfig.class };
	}

	@Override
	protected String[] getServletMappings() { //como el web.xml 
		// TODO Auto-generated method stub
		//return null; no jala ningun controller
		return new String[] { "/" };
	}

}
