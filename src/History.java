
import java.util.*;
public class History {
    private String productName;
    private String type;
    private int quantity;
    private Date date;

    public History(){
        productName=null;
        type=null;
        quantity=0;
        
    }
    public History(String productName, String type, int quantity){
        this.productName = productName;
        this.type=type;
        this.quantity = quantity;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return date+"\nProduct Name: "+productName+"\nTransaction Type: "+type+"\nQuantity: "+quantity+"\n";
        
    }
    
}
