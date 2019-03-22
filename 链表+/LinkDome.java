public class LinkDome {
    public static void main(String args[]){
        Link all = new Link();
        all.add(new Book("Java", 79.8));
        all.add(new Book("Android", 89.9));
        all.add(new Book("Python", 69.8));
        all.add(new Book("Oracle", 99.8));

        System.out.println("num:" + all.size());
        System.out.println(all.contains(new Book("Java", 79.8)));
        all.remove(new Book("Android", 89.9));
        System.out.println("num:" + all.size());
        Book[] books = all.toArray();

        for(int x = 0; x < books.length; x++){
            System.out.println(books[x].getInfo());
        }
    }
}
