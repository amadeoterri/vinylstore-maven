package com.amadeo.vinylstore.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FrontController extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {

		return new Class[] { SpringWebMVCConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		return new Class[] {};

	}

	@Override
	protected String[] getServletMappings() {

		return new String[] { "/" };

	}

}
