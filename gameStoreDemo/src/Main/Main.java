package Main;

import java.time.LocalDate;

import concretes.ChristmasCampaignManager;
import concretes.CustomerManager;
import concretes.EpicSaleManager;
import concretes.MyCheckManager;
import concretes.SteamSaleManager;
import concretes.SummerCampaignManager;
import entities.Game;
import entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer1 = new Gamer ("PrensChars24",1,"Mert","Aslay",LocalDate.of(2000,01,05),"40599295532");
		Game game1 = new Game (1,"CSGo",100,25,30,70);
		Game game2 = new Game (1,"GTA5",150,45,50,75);
		
		CustomerManager customerManager = new CustomerManager(new MyCheckManager());
		customerManager.add(gamer1);
		
		SteamSaleManager steamSaleManager = new SteamSaleManager();
		steamSaleManager.sale(game1, gamer1);
		
		EpicSaleManager epicSaleManager = new EpicSaleManager();
		epicSaleManager.sale(game2, gamer1);
		
		ChristmasCampaignManager christmasCampaignManager = new ChristmasCampaignManager();
		christmasCampaignManager.add(game1);
		christmasCampaignManager.delete(game1);
		
		SummerCampaignManager summerCampaignManager = new SummerCampaignManager();
		summerCampaignManager.add(game2);
		summerCampaignManager.delete(game2);
		
	}
	
}
