package Bakery2;

import java.util.ArrayList;

public class Bakery {
    private ArrayList<Pastry> pastries;
    private ArrayList<Cake> cakes;


    public Bakery() {pastries = new ArrayList<>();}
    {cakes = new ArrayList<>();}

public void addPastry(Pastry pastry) {
        pastries.add(pastry);
}
public void addCake(Cake cake) {
        cakes.add(cake);
}

public void displayPastries() {
    System.out.println("Pastries in the bakery:");
    for (Pastry pastry : pastries) {
        System.out.println("Pastry: " + pastry.getName());
        pastry.displayIngredients();
        System.out.println();
    }
}
public void displayCakes() {
        System.out.println("Introducing our new cake:");
        for (Cake cake : cakes) {
            System.out.println("Cake: " + cake.getName());
            cake.displayIngredients();
            cake.whatIncluded();
                    System.out.println();

        }

}
}

