public class Book {
    private String title;
    private double price;
    public Book(String title, double price){
        this.title = title;
        this.price = price;
    }
    public boolean compare(Book book){
        if(book == null){
            return false;
        }
        if(this == book){
            return true;
        }
        if(this.price == book.price && this.title.equals(book.title)){
            return true;
        } else {
            return false;
        }
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

    public String getInfo(){
        return "图书名称" + this.title + "，图书价格" + this.price;
    }
}
