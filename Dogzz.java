public class Dogzz {
    private String name;
    private String breed;


    public Dogzz(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


    public void print() {
        System.out.println("Name: " + name + ", Breed: " + breed);
    }

    public static void main(String[] args) {

        Dogzz dog1 = new Dogzz("Charli", "Bulldog");
        Dogzz dog2 = new Dogzz("Tommy", "German Shepherd");


        System.out.println("Initial values:");
        dog1.print();
        dog2.print();


        dog1.setName("Lucky");
        dog1.setBreed("Labrador");

        dog2.setName("Max");
        dog2.setBreed("Husky");

        System.out.println("\nUpdated values:");
        dog1.print();
        dog2.print();
    }
}
