class Pizza{

    private String size;
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;

    public Pizza(String size, int cheeseToppings, int pepperoniToppings, int hamToppings) {
        this.size = size.toLowerCase();
        this.cheeseToppings = cheeseToppings;
        this.pepperoniToppings = pepperoniToppings;
        this.hamToppings = hamToppings;
    }

    public String getSize() {
        return size;
    }

    public int getCheeseToppings() {
        return cheeseToppings;
    }

    public int getPepperoniToppings() {
        return pepperoniToppings;
    }

    public int getHamToppings() {
        return hamToppings;
    }

    public void setSize(String size) {
        this.size = size.toLowerCase();
    }

    public void setCheeseToppings(int cheeseToppings) {
        this.cheeseToppings = cheeseToppings;
    }

    public void setPepperoniToppings(int pepperoniToppings) {
        this.pepperoniToppings = pepperoniToppings;
    }

    public void setHamToppings(int hamToppings) {
        this.hamToppings = hamToppings;
    }

    public double calcCost() {
        int baseCost = 0;
        switch(size) {
            case "small":
                baseCost = 10;
                break;
            case "medium":
                baseCost = 12;
                break;
            case "large":
                baseCost = 14;
                break;
            default:
                baseCost = 10;
        }

        int totalToppings = cheeseToppings + pepperoniToppings + hamToppings;
        return baseCost + 2 * totalToppings;
    }

    public String getDescription() {
        return "Size: " + size +
                ", Cheese: " + cheeseToppings +
                ", Pepperoni: " + pepperoniToppings +
                ", Ham: " + hamToppings +
                ", Cost: $" + calcCost();
    }
}

class PizzaOrder{

    private Pizza[] pizzas;
    private int pizzaCount;

    public PizzaOrder() {
        pizzas = new Pizza[3];
        pizzaCount = 0;
    }

    public void addPizza(Pizza p) {
        if (pizzaCount < 3)
        {
            pizzas[pizzaCount] = p;
            pizzaCount++;
        }
        else
        {
            System.out.println("Order full! Cannot add more pizzas.");
        }
    }

    public double calcTotal()
    {
        double total = 0;
        for (int i = 0; i < pizzaCount; i++)
        {
            total = total + pizzas[i].calcCost();
        }
        return total;
    }

    public void displayOrder() {
        for (int i = 0; i < pizzaCount; i++)
        {
            System.out.println("Pizza " + (i+1) + ": " + pizzas[i].getDescription());
        }
        System.out.println("Total Order Cost: $" + calcTotal());
    }
}

public class PizzaOrderApp {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("large", 1, 1, 2);
        Pizza pizza2 = new Pizza("medium", 2, 0, 1);

        PizzaOrder order = new PizzaOrder();
        order.addPizza(pizza1);
        order.addPizza(pizza2);

        order.displayOrder();
    }
}
