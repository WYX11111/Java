public class PetShop {
    private Link pets = new Link();

    public void add(Pet pet){
        this.pets.add(pet);
    }

    public void delete(Pet pet) {
        this.pets.remove(pet);
    }

    public Link search(String keyWork){
        Link result = new Link();
        Object obj[] = this.pets.toArray();
        for(int x = 0; x < obj.length; x++){
            Pet p = (Pet) obj[x];
            if(p.getName().contains(keyWork)){
                result.add(p);
            }
        }
        return result;
    }
}
