package com.andro.service;

import javax.ejb.Stateless;

@Stateless
public class ServiceImpl implements Service {

	public String getService() {
		return "Hello Andro";
	}
	
}
