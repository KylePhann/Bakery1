package Bakery2;

public class Main {
    public static void main(String[] args) {

        Ingredient flour = new Ingredient("flour");
        Ingredient sugar = new Ingredient("Sugar");

        //Ingredient Choco = new Ingredient("Chocolate");

        Cake Choco = new Cake("Chocolate");
        Cake egg = new Cake("Egg");
        Cake size = new Cake("Jumbo size");



        Pastry croissant = new Pastry("Croissant");
        croissant.addIngredient(flour);
        croissant.addIngredient(sugar);

        Pastry muffin = new Pastry("Blueberry Muffin");
        muffin.addIngredient(flour);
        muffin.addIngredient(sugar);

        Cake cake = new Cake("Premium Plus Chocolate Cake");
        cake.addIngredient(sugar);
        cake.addIngredient(flour);
        cake.addGoodies(egg);
        cake.addGoodies(Choco);
        cake.addGoodies(size);


        Bakery bakery = new Bakery();
        bakery.addPastry(croissant);
        bakery.addPastry(muffin);
        bakery.addCake(cake);



        bakery.displayPastries();
        bakery.displayCakes();








    }
}