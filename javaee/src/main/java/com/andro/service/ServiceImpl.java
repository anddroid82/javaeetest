package com.andro.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.andro.entity.Employee;

@Stateless
public class ServiceImpl implements Service {
	
	//private EntityManagerFactory entityManagerFactory;
	@PersistenceContext(unitName = "persistence")
	EntityManager entityManager;
	
	/*@PostConstruct
	public void postConstruct() {
		this.entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
		this.entityManager = entityManagerFactory.createEntityManager();
	}*/
	
	//@Transactional
	public String getService() {
		
		//EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
		//EntityManager entityManager = entityManagerFactory.createEntityManager();
		//entityManager.getTransaction().begin();
		
		Employee employee = new Employee();
		employee.setName("Pankaj");
		
		entityManager.persist(employee);
		
		//entityManager.getTransaction().commit();
		
		return "Hello Andro!";
	}
	
	/*@PreDestroy
	public void preDestroy() {
		entityManager.close();
		this.entityManagerFactory.close();
	}*/
	
}
