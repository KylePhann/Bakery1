package Bakery2;


import java.util.ArrayList;

public class Cake extends Pastry {
private ArrayList<Cake> Goodies;

private String name;

   public void addGoodies(Cake cake) {
        Goodies.add(cake);
    }



     public void whatIncluded() {
            System.out.println("What's included on the " + name + ":");
            for (Cake cake : Goodies) {
                System.out.println(cake.getName());
            }
        }

public Cake(String name) {
            super(name);
            this.name = name;
    Goodies = new ArrayList<>();

    }
    }



