package com.demo;

import javax.ws.rs.core.Application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("rest")
public class Miapppe extends Application {
	
	@Override
	public Set<Class<?>> getClasses(){
		Set<Class<?>> classes=new HashSet<>();
		classes.add(RestfullService.class);
		
		return classes;
	}
	
	
}
