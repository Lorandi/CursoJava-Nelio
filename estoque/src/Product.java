public class Product {


    private String name;
    private double price;
    private int quantity;

    public double totalValueInStock(){
        return this.getQuantity() * this.getPrice();
    }

    public void addProducts(int qt){
        this.setQuantity(this.quantity + qt);
        System.out.println("Add " + qt + " produtos ao estoque");
    }

    public void removeProducts(int qt){
        this.setQuantity(this.quantity - qt);
        System.out.println("Remove " + qt + " produtos ao estoque");
    }


    public void status() {
        System.out.printf("Product{" +
                "name ='" + this.name + '\'' +
                ", price = " + this.price +
                ", quantity = " + this.quantity
                + " -- Total valor no estoque %.2f } %n" , this.totalValueInStock());
        System.out.println(" ");
    }

    public String toString(){
        return this.getName()
                + " $ "
                + String.format("%.2f", this.getPrice())
                + ", "
                + this.getQuantity()
                + " units, Total: $ "
                + String.format("%.2f", this.totalValueInStock());
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
