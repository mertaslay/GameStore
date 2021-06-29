package adaptors;

import java.rmi.RemoteException;

//new Locale için
import java.util.Locale;

import abstracts.CustomerCheckService;
//import entities.Customer;
import entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
//import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean verificationWithEdevlet(Gamer gamer) {
		
	KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		
		try {
		//new Local sistem I'yý farklý algýlamasýn die yazýlýr 
			
		return kpsPublicSoapProxy.TCKimlikNoDogrula(Long.valueOf(gamer.getNationalityId()),gamer.getFirstName().toUpperCase(new Locale("tr")), 
				gamer.getLastName().toUpperCase(new Locale("tr")),gamer.getDateOfBirth().getYear());
		}catch(RemoteException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	

}
