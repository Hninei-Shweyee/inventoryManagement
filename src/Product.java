

public class Product {
    private String productName;
    private int quantity;

    public Product(){
        productName=null;
        quantity=0;
    }

    public Product(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return 
                "Product Name= " + productName  +
                ", Quantity=" + quantity ;
                
    }
    
}
