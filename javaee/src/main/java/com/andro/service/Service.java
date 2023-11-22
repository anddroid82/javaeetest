package com.andro.service;

import javax.ejb.Stateless;

@Stateless
public class Service {

	public String getService() {
		return "Hello Andro";
	}
	
}
