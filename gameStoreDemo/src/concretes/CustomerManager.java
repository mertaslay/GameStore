package concretes;

import abstracts.CustomerCheckService;
import abstracts.CustomerService;
import entities.Gamer;

public class CustomerManager implements CustomerService {

	private CustomerCheckService customerCheckService;
	
	public CustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
		
	}

	@Override
	public void add(Gamer gamer) {
		if(this.customerCheckService.verificationWithEdevlet(gamer)) {
		System.out.println(gamer.getUserName() + " adlý kullanýcý sisteme üye oldu");
	}else {
		System.out.println("Not a valid person");
	}
}

	@Override
	public void delete(Gamer gamer) {
		if(this.customerCheckService.verificationWithEdevlet(gamer)) {
			System.out.println(gamer.getUserName() + " adlý kullanýcýnýn sistemden üyleiði iptal edildi");
		}else {
			System.out.println("Not a valid person");
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		if(this.customerCheckService.verificationWithEdevlet(gamer)) {
			System.out.println(gamer.getUserName() + " adlý kullanýcýnýn kullanýcý adý deðiþtirildi");
		}else {
			System.out.println("Not a valid person");
		}
		
	}

}
