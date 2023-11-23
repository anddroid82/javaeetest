package com.andro.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateful;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transactional;

import com.andro.entity.Employee;

@Stateful
@ApplicationScoped
public class ServiceImpl implements Service {
	
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	
	@PostConstruct
	public void postConstruct() {
		this.entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
		this.entityManager = entityManagerFactory.createEntityManager();
	}
	
	@Transactional
	public String getService() {
		
		//EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
		//EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		Employee employee = new Employee();
		employee.setName("Pankaj");
		
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
		
		
		return "Hello Andro!";
	}
	
	@PreDestroy
	public void preDestroy() {
		entityManager.close();
		this.entityManagerFactory.close();
	}
	
}
