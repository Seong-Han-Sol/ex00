package org.zerock.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WedConfig extends 
	AbstractAnnotationConfigDispatcherServletInitializer {
	
	@Override
	protected Class<?>[] getRootConfigClasses(){
		//root-context.xml을 대신하는 클래스를 지정함 - RootConfig
		return new Class[] {RootConfig.class};
	}
	
	@Override
	protected Class<?>[] getServletConfigClasses(){
		//
		return null;
	}
	
	@Override
	protected String[] getServletMappings(){
		//
		return null;
	}
}
