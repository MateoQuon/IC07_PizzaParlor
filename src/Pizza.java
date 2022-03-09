public class Pizza {
    private char size;
    private boolean pepperoni;
    private boolean sausage;
    private boolean mushrooms;
    private boolean vegan;


    public Pizza(char size, boolean pepperoni, boolean sausage, boolean mushrooms, boolean vegan) {
        this.pepperoni = pepperoni;
        this.sausage = sausage;
        this.mushrooms = mushrooms;
        this.size = size;
        this.vegan = vegan;
    }
    public char getSize(){
        return size;
    }
    public int getNumToppings(){
        int numToppings = 0;
        if (pepperoni)
            numToppings++;
        if (sausage)
            numToppings++;
        if (mushrooms)
            numToppings++;
        if (vegan)
            numToppings++;
        return numToppings;
    }

    @Override
    public String toString() {
        String pizza = "Pizza [Size=" + size;
        if (pepperoni)
            pizza += ", Pepperoni";
        if (sausage)
            pizza += ", Sausage";
        if (mushrooms)
            pizza += ", Mushrooms";
        if (vegan)
            pizza += ", Vegan";

        return pizza + "]";
    }
}
