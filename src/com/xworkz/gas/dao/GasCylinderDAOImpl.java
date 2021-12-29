package com.xworkz.gas.dao;

import javax.transaction.Transaction;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.List;
import org.hibernate.query.Query;

import com.xworkz.gas.entity.GasCylinderEntity;

public class GasCylinderDAOImpl implements GasCylinderDAO {

	@Override
	public void saveGasCylinderEntity() {
		System.out.println("Invoked GasCylinderEntity");
		org.hibernate.Transaction transaction = null;
		Session session = null;
		SessionFactory sessionFactory = null;
		try {

			Configuration configuration = new Configuration();

			configuration.configure("hibernate.cfg.xml");

			configuration.addAnnotatedClass(GasCylinderEntity.class);

			sessionFactory = configuration.buildSessionFactory();

			session = sessionFactory.openSession();

			GasCylinderEntity gasCylinderEntity = new GasCylinderEntity("HP", "Blue", 940.0, "lpg");

			transaction = session.beginTransaction();

			session.save(gasCylinderEntity);

			transaction.commit();

			System.out.println("Done");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("transaction roll back");

		} finally {
			if (session != null) {
				session.close();
				System.out.println("session is close");
			} else {
				System.out.println("session is not close");
			}
			if (sessionFactory != null) {
				sessionFactory.close();
				System.out.println("sessionFactory is close");
			} else {
				System.out.println("sessionFactory is not close");
			}
		}
	}

	@Override
	public void getGasCylinderEntity() {
		System.out.println("invoked getGasCylinderEntity");
		Session session = null;
		SessionFactory sessionFactory = null;
		try {
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			configuration.addAnnotatedClass(GasCylinderEntity.class);
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();

			GasCylinderEntity gasCylinderEntity = session.get(GasCylinderEntity.class, 1);
			System.out.println("Read is Done" + gasCylinderEntity);

		} catch (HibernateException e) {
			System.out.println("inside catch block");
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session is close");
			} else {
				System.out.println("session is not close");
			}
			if (sessionFactory != null) {
				sessionFactory.close();
				System.out.println("sessionFactory is close");
			} else {
				System.out.println("sessionFactory is not close");
			}
		}
	}

	@Override
	public void updateGasCylinderEntity() {
		System.out.println("invoked updateGasCylinderEntity");
		org.hibernate.Transaction transaction = null;
		Session session = null;
		SessionFactory sessionFactory = null;
		try {
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			configuration.addAnnotatedClass(GasCylinderEntity.class);
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();

			GasCylinderEntity gasCylinderEntity = session.get(GasCylinderEntity.class, 2);
			System.out.println("gasCylinderEntity" + gasCylinderEntity);

			gasCylinderEntity.setBRAND("Indane");
			gasCylinderEntity.setCOLOR("Red");

			session.update(gasCylinderEntity);

			transaction = session.beginTransaction();
			transaction.commit();

		} catch (HibernateException e) {
			System.out.println("inside catch block");

		} finally {
			if (session != null) {
				session.close();
				System.out.println("session is close");
			} else {
				System.out.println("session is not close");
			}
			if (sessionFactory != null) {
				sessionFactory.close();
				System.out.println("sessionFactory is close");
			} else {
				System.out.println("sessionFactory is not close");
			}
		}
	}

	@Override
	public void deleteGasCylinderEntity() {
		System.out.println("invoked deleteGasCylinderEntity");
		org.hibernate.Transaction transaction = null;
		Session session = null;
		SessionFactory sessionFactory = null;
		try {
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			configuration.addAnnotatedClass(GasCylinderEntity.class);
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();

			GasCylinderEntity gasCylinderEntity = session.get(GasCylinderEntity.class, 3);
			System.out.println("gasCylinderEntity" + gasCylinderEntity);

			session.delete(gasCylinderEntity);

			transaction = session.beginTransaction();
			transaction.commit();
			System.out.println("Delete one row");
		} catch (HibernateException e) {
			System.out.println("inside catch block");
			transaction.rollback();
			System.out.println("transaction roll back");
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session is close");
			} else {
				System.out.println("session is not close");
			}
			if (sessionFactory != null) {
				sessionFactory.close();
				System.out.println("sessionFactory is close");
			} else {
				System.out.println("sessionFactory is not close");
			}
		}

	}

	public void getAllGasCylinderEntites() {
		System.out.println("invoked getGasCylinderEntites");
		Session session = null;
		SessionFactory sessionFactory = null;
		try {
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			configuration.addAnnotatedClass(GasCylinderDAO.class);
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();

			String hqlQuery = "from com.xworkz.gas.entity.GasCylinderEntity";
			Query query = session.createQuery(hqlQuery);
			java.util.List listOfGasCylinderEntity = query.list();
			System.out.println("listOfGasCylinderEntity");

		} catch (HibernateException e) {
			System.out.println("inside catch block");
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session is close");
			} else {
				System.out.println("session is not close");
			}
			if (sessionFactory != null) {
				sessionFactory.close();
				System.out.println("sessionFactory is close");
			} else {
				System.out.println("sessionFactory is not close");
			}
		}

	}
}
