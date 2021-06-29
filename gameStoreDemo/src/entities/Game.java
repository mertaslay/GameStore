package entities;

public class Game {
	
	private int id;
	private String name;
	private double price; //double int da olabilir
	private int stock;
	private int discount;
	private int newPrice;
	

	public Game() {
	
	}
	
	public Game(int id, String name, double price, int stock, int discount,int newPrice) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.discount = discount;
		this.newPrice = newPrice;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	public int getnewPrice() {
		return newPrice;
	}
	public void setnewPrice(int newPrice) {
		this.newPrice = newPrice;
	}
	

}
