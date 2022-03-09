import java.text.NumberFormat;

public class PizzaOrder {
    private static final int MAX_PIZZAS = 100;
    private Pizza[] pies = new Pizza[MAX_PIZZAS];
    private int numPizzas;

    public boolean addPizzaToOrder(char size, boolean pepperoni, boolean sausage, boolean mushroom, boolean vegan){
        if (numPizzas < MAX_PIZZAS) {
            pies[numPizzas++] = new Pizza(size, pepperoni, sausage, mushroom, vegan);
            return true;
        }
        return false;
    }
    public double calcCost(){
        double cost = 0.0;
        for (int i=0; i<numPizzas;i++){
            switch(pies[i].getSize()){
                case 's':
                case 'S':
                    cost += 8.0;
                    break;
                case 'm':
                case 'M':
                    cost += 10.0;
                    break;
                case 'l':
                case 'L':
                    cost += 12.0;
                    break;
            }
            cost += pies[i].getNumToppings();
        }
        return cost;
    }

    @Override
    public String toString() {

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String output = "Pizza Order: Number of Pies = " + numPizzas + "\n";
        for (int i = 0; i < numPizzas; i++)
            output += "Pie #" + (i+1) + ": " + pies[i].toString() + "\n";
        output += "Total Cost = " + currency.format(calcCost());

        return output;
    }
}
