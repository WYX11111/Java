public class TestDemo {
    public static void main(String args[]){
        PetShop shop = new PetShop();
        shop.add(new Cat("猫0" ,0));
        shop.add(new Cat("猫1" ,1));
        shop.add(new Cat("猫2" ,2));
        shop.add(new Cat("猫3" ,3));
        shop.add(new Cat("猫4" ,4));
        shop.add(new Cat("猫5" ,5));
        shop.add(new Dog("狗0" ,0));
        shop.add(new Dog("狗" ,1));
        shop.add(new Dog("狗" ,2));
        shop.add(new Dog("狗" ,3));
        shop.delete(new Cat("猫1", 1));

        Link all = shop.search("猫");
        Object obj[] = all.toArray();

        for(int x = 0; x < obj.length; x++){
            System.out.println(obj[x]);
        }
    }
}
