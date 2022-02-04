package baseService;

import daoAdmin.iDaoAdmin;
import daoAdmin.implDaoAdmin;

public class BaseServiceImpl implements BaseService {

	private iDaoAdmin loginDao = new implDaoAdmin();
	
	@Override
	public boolean login(String email, String password) {
		
		return loginDao.validate(email, password);
	}

}
