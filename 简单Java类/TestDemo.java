public class TestDemo{
	public static void main(String args[]){
		Book a = new Book("Java",78.9);
		Book b = new Book("Java",78.9);
		if(a.getTitle().equals(b.getTitle()) && a.getPrice() == b.getPrice())
			System.out.println("同一本书");
		else
			System.out.println("不是同一本书");
	}
}
