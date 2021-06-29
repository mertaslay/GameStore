package concretes;

import abstracts.CampaignService;
import entities.Game;

public class ChristmasCampaignManager implements CampaignService {

	@Override
	public void add(Game game) {
		
		System.out.println(game.getName() + " adlý oyun Yýlbaþý Kampanyasýnda indirime girdi. Yeni fiyat: " + game.getnewPrice());
	}

	@Override
	public void delete(Game game) {
		
		System.out.println(game.getName() + " adlý oyunun Yýlbaþý Kampanyasý bitmiþtir");
	}

}
