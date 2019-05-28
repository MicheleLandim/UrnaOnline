package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	public static SessionFactory sessionFactory;

	public HibernateUtil() {
	}

	public static SessionFactory getSessionFactory() {

		if (sessionFactory == null) {

			try {
				Configuration annotation = new Configuration();

				sessionFactory = annotation.configure().buildSessionFactory();

			} catch (Throwable ex) {
				System.out.println("Erro ao inicar o Hibernte" + ex);
				throw new ExceptionInInitializerError(ex);
			}

			return sessionFactory;

		} else {
			return sessionFactory;
		}
	}

	public static Session getSession() {
		return null;
	}
}
