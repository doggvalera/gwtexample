package com.github.server.domain;


public class UserRepository {
    
	EntityManager em = EntityManagerFactoryClass.getEntityManager();
	
	public User loadById(int id) {
		return em.find(User.class, id);
	}
}
