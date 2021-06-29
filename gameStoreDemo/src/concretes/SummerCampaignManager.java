package concretes;

import abstracts.CampaignService;
import entities.Game;

public class SummerCampaignManager implements CampaignService {

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " adl� oyun Yaz Kampanyas�nda indirime girdi. Yeni fiyat: " + game.getnewPrice());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() + " adl� oyunun Yaz Kampanyas� bitmi�tir");
		
	}

}
