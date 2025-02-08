package CURD.CURDopr;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Entity.DetailsEntity;

public class App {
	public static void main(String[] args) {
//		DetailsEntity d = new DetailsEntity();
//		d.setId(2);
//		d.setName("Amit");
//		d.setEmail("Amit@gmail.com");
//		d.setPassord("Amit@1234");
//		d.setCity("Noida");

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

//		try {
//			session.save(d);
//			transaction.commit();
//		} catch (Exception e) {
//			transaction.rollback();
//			e.printStackTrace();
//		}

		// --------------Get-Details----------------------

//		try {
//			DetailsEntity d2 = session.get(DetailsEntity.class, 1);
//			System.out.println(d2.getId());
//			System.out.println(d2.getName());
//			System.out.println(d2.getEmail());
//			System.out.println(d2.getPassord());
//			System.out.println(d2.getCity());
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		//-----------------Update---------------------
		
//		DetailsEntity d = session.get(DetailsEntity.class, 2);
//		d.setName("Amit");
//		d.setEmail("Amit@gmail.com");
//		d.setPassord("Amit@1234");
//		d.setCity("Noida");
//		try {
//			d.setName("Diksha Behen");
//			transaction.commit();
//		} catch (Exception e) {
//			transaction.rollback();
//			e.printStackTrace();
//		}
		
		//-----------------Delete-------------------------------
		
		DetailsEntity d = new  DetailsEntity();
		try {
			d.setId(2);
			session.delete(d);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}


	}
}