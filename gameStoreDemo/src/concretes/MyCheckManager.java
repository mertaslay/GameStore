package concretes;

import abstracts.CustomerCheckService;
import entities.Gamer;

public class MyCheckManager implements CustomerCheckService{

	
	@Override
	public boolean verificationWithEdevlet(Gamer gamer) {
		if(gamer.getNationalityId().length() == 11) {
			return true;
		}
		return false;
	}

}
