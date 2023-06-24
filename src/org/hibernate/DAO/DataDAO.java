package org.hibernate.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Entity.Data;
import org.hibernate.cfg.Configuration;

public class DataDAO {
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Data.class)
			.buildSessionFactory();
	Session session = factory.getCurrentSession();

	public void addData(Data data) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.save(data);
		session.getTransaction().commit();

	}

	public boolean validate(String username, String password) {
		Transaction transaction = null;
		Data data = null;
		
			Session session = factory.getCurrentSession();
			transaction = session.beginTransaction();
			data = (Data) session.get(Data.class, password);
			if (data != null && data.getUsername().equals(username)) {
				return true;
			}
			transaction.commit();
			
		    return false;	
	}
}
    

