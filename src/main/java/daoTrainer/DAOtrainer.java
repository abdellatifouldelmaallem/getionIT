package daoTrainer;

import java.util.List;

import model.Trainer;

public interface DAOtrainer {
	
	void saveTrainer(Trainer trainer);
	
	void updateTrainer(Trainer trainer);
	
	 void deleteTrainer(Long id);
	 
	 Trainer getTrainer(Long id);
	 
	 List < Trainer > getAllTrainer();

}
