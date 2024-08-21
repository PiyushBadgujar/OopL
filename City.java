import java.util.Scanner;

public class City {

    private String name;
    private int population;


    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }


    public void displayDetails() {
        System.out.println("City Name: " + name);
        System.out.println("Population: " + population);
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        City[] cities = new City[5];
        for (int i = 0; i < cities.length; i++) {
            System.out.println("ENTER THE NAME OF CITY "+(i+1)+" AND POPULATION ");
            cities[i].name= scn.nextLine();
            cities[i].population= scn.nextInt();
        }


        cities[0] = new City("Mumbai", 8419000);
        cities[1] = new City("Delhi", 3980000);
        cities[2] = new City("Karad", 2716000);
        cities[3] = new City("Jalgaon", 2328000);
        cities[4] = new City("Dhule", 1690000);

        for (int i = 0; i < cities.length; i++) {
            cities[i].displayDetails();
            System.out.println();
        }
    }
}

