public class PetShop {
    private Link pets = new Link();

    public void add(Pet pet){
        this.pets.add(pet);
    }

    public void delete(Pet pet) {
        this.pets.remove(pet);
    }

}
