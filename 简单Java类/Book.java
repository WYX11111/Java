public class Book{
	private String title;
	private double price;

	public Book(){
		System.out.println("无参构造");	
	}

	public Book(String t){
		title = t;
		System.out.println("有参构造");
	}

	public Book(String t, double p){
		title = t;
		price = p;
		System.out.println("有参构造");
	}

	public void setTitle(String t){
		title = t;
	}

	public void setPrice(double p){
		price = p;
	}

	public String getTitle(){
		return title;
	}

	public double getPrice(){
		return price;
	}

	public void getInfo(){
		System.out.println("图书名称："+title+",价格"+price);
	}
}
