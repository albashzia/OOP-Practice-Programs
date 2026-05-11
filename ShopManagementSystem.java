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

    public void returnBill(){
        System.out.println("Product: "+getName()+" | "+"Price: "+getPrice());
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

    public void returnDiscountedBill(){
        super.returnBill();
        System.out.println("Discounted Bill: "+(getPrice()-getDiscount()));
    }

}
public class ShopManagementSystem {
}
