package abstracts;

import entities.Gamer;

public interface CustomerService {
	
	void add(Gamer gamer);
	void delete(Gamer gamer);
	void update(Gamer gamer);

}
