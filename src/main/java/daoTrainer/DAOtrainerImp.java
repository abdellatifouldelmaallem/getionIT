package daoTrainer;



import java.util.List;


import org.hibernate.Session;


import org.hibernate.Transaction;

import DB.HibernateUtil;
import model.Trainer;

public class DAOtrainerImp implements DAOtrainer {

	@Override
	public void saveTrainer(Trainer trainer) {
		 Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // save the Trainer object
	            session.save(trainer);
	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
		
	}

	@Override
	public void updateTrainer(Trainer trainer) {
		  Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // save the Trainer object
	            session.update(trainer);
	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
				System.out.println("Exception occurred on update : "+e.getMessage());
			}
		
	}

	@Override
	public void deleteTrainer(Long id) {
		Transaction transaction = null;
        Trainer trainer = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            // start the transaction
            transaction = session.beginTransaction();
            trainer = session.get(Trainer.class, id);
            session.delete(trainer);

            // commit the transaction
            transaction.commit();
        } catch(Exception e) {
            if(transaction != null) {
                e.printStackTrace();
                transaction.rollback();
                System.out.println("not worked");
            }

        }
		
	}

	@Override
	public Trainer getTrainer(Long id) {
		  Transaction transaction = null;
		  Trainer trainer = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // get an Trainer object
	            trainer = session.get(Trainer.class, id);
	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	        return trainer;
	}

	@Override
	public List<Trainer> getAllTrainer() {
		 Transaction transaction = null;
	        List < Trainer > listOfUser = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // get an Trainer object

	            listOfUser = session.createQuery("from Trainer").getResultList();

	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	        return listOfUser;
	}

	
}
