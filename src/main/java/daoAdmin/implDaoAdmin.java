package daoAdmin;

import org.hibernate.Session;
import org.hibernate.Transaction;
import DB.HibernateUtil;
import model.Admin;

public class implDaoAdmin implements iDaoAdmin {

	
	@Override
	public boolean validate(String email, String passWord) {
		
		Transaction transaction = null;
        Admin admin = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            admin = (Admin) session.createQuery("FROM Admin U WHERE U.email = :email").setParameter("email", email)
                .uniqueResult();

            if (admin != null && admin.getPassWord().equals(passWord)) {
                return true;
            }
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        
		return false;
		 
	}

	

	

}
