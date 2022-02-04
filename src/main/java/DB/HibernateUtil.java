package DB;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	  private static ServiceRegistry serviceRegistry;
      private static SessionFactory sessionFactory;
      
      public static Session getSession() {
    	  Session session = null;
    	  if (sessionFactory != null) {
    	   session = sessionFactory.openSession();
    	  }
    	  return session;
    	 }

      public static SessionFactory getSessionFactory() {
          if (sessionFactory == null) {
              try {
                  Configuration configuration = new Configuration().configure("hibernate.cfg.xml");


                  // Create SessionFactory
                  sessionFactory = configuration.buildSessionFactory();


              } catch (Exception e) {
                  e.printStackTrace();
                  if (serviceRegistry != null) {
                      StandardServiceRegistryBuilder.destroy(serviceRegistry);
                  }
              }
          }
          return sessionFactory;
      }
}
