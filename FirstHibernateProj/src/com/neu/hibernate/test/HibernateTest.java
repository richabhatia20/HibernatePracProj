/**
 * 
 */
package com.neu.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.neu.hibernate.dto.UserDetails;

/**
 * @author richa
 *
 */
public class HibernateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserDetails user = new UserDetails();
		
		user.setUserId(1);
		user.setUserName("Richa");
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		try{
			System.out.println("printing session: "+ session.toString());
			
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception occurred" + e.getMessage());
			session.getTransaction().rollback();
		}
		
		
		
	}

}
