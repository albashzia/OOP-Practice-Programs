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

}

class PizzaOrder{

}

public class PizzaOrderApp {
}
