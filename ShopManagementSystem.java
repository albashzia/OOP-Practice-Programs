/*** 2. Prepare a program for a shop to maintain the records of its sold products by using following
 concepts.
 a. Product is an encapsulated class with aƩributes product name and its price. Include
 method to return the bill of the product.
 b. DiscountedProduct is also an encapsulated class that extends Product and it has an
 aƩribute of discount. Include method to return the bill of discounted product.
 c. Define a class named CustomerCart that represents a collecƟon of mulƟple objects of type
 Product or DiscountedProduct. The class will have an instance variable whose type is
 Product[] , which will be used as a parƟally filled array. There will also be another instance
 variable of type int that keeps track of how much of this array is currently used. Include
 methods for the following:
  add a product in the cart. It can either be a product or discounted product
  display total bill
  display the number of products and discounted products in the cart individually
 ***/
class Product{
    private String name;
    private double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    public double returnPrice(){
        return price;
    }
}

class DiscountedProduct extends Product{

    double discount;

    public DiscountedProduct(String name, double price,double discount) {
        super(name, price);
        this.discount=discount;
    }

    public double getDiscount(){
        return this.discount;
    }

    @Override
    public double returnPrice(){
        return getPrice() - discount;
    }

}

class CustomerCart {

    private Product[] cart;
    private int count;

    public CustomerCart(int size) {
        cart = new Product[size];
        count = 0;
    }

    public void addProduct(Product p) {
        if (count < cart.length) {
            cart[count] = p;
            count++;
        } else {
            System.out.println("Cart is full!");
        }
    }

    public void displayTotalBill() {
        double total = 0;

        for (int i = 0; i < count; i++) {
            total += cart[i].returnPrice();
        }

        System.out.println("Total Bill: " + total);
    }

    public void displayProductCounts() {
        int normalProducts = 0;
        int discountedProducts = 0;

        for (int i = 0; i < count; i++) {

            if (cart[i] instanceof DiscountedProduct) {
                discountedProducts++;
            } else {
                normalProducts++;
            }
        }

        System.out.println("Normal Products: " + normalProducts);
        System.out.println("Discounted Products: " + discountedProducts);
    }

    public void displayCart() {

        for (int i = 0; i < count; i++) {

            System.out.println(
                    cart[i].getName() +
                            " -- Bill: " +
                            cart[i].returnPrice()
            );
        }
    }
}
public class ShopManagementSystem {
}
