//package javaTesting;
//
//import static org.junit.Assert.*;
//
//import org.junit.Test;
//import org.junit.jupiter.api.Assertions;
//
//import daoTrainer.DAOtrainer;
//import daoTrainer.DAOtrainerImp;
//import junit.framework.Assert;
//import model.Trainer;
//
//public class DAOtrainerImpTest {
//
//	@Test
//	public void testSaveTrainer() {
//		DAOtrainer trainerDAO = new DAOtrainerImp();
//		Trainer oneTrainer = new Trainer("mohamed","baqal","mohamed@gmail.com",111333);
//		trainerDAO.saveTrainer(oneTrainer);
//		
//		assertEquals("mohamed",oneTrainer.getFname());
//	}
//
//	@Test
//	public void testUpdateTrainer() {
//		DAOtrainer trainerDAO = new DAOtrainerImp();
//   
//    Trainer user = new Trainer( 10, "kolo", "rachid", "rachid@gmail.com", 1234);
//    
//    trainerDAO.updateTrainer(user);    
//    assertEquals("kolo", user.getFname());
//	}
//
//	@Test
//	public void testDeleteTrainer() {
//		DAOtrainer trainerDAO = new DAOtrainerImp();
//		trainerDAO.deleteTrainer((long) 7);
//	        Assert.assertNull(trainerDAO.getTrainer((long) 7));
//	}
//
//	@Test
//	public void testGetTrainer() {
//		DAOtrainer trainerDAO = new DAOtrainerImp();
//	        Trainer trainer = new Trainer();
//	        trainer = trainerDAO.getTrainer((long) 1);
//	        Assertions.assertEquals("youssef", trainer.getFname());
//	}
//
//	/*@Test
//	public void testGetAllTrainer() {
//		DAOtrainer trainerDAO = new DAOtrainerImp();
//        Assertions.assertEquals(9,trainerDAO.getAllTrainer().size());
//	}
//	*/
//
//}
