package cart;

public class book {

	private String name;
	private int price;

	book(){
		setName("");
		price=0;
	}

	book(String n,int p) {
	setName(n);
	price=p;
	}

	public int getP(){
		return price;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

		public static void main(String[] args) {
		}

	}


