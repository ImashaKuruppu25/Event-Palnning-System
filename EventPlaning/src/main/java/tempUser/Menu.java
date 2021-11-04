package tempUser;

public class Menu {
	String ID;
	String name;
	String descr;
	int price;
	
	public Menu(String iD, String name, String descr, int price) {
		super();
		ID = iD;
		this.name = name;
		this.descr = descr;
		this.price = price;
	}
	
	public Menu() {}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
