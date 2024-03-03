

import java.util.ArrayList;


public class InventoryManagementSystem {
    private ArrayList<Product> inventory=new ArrayList<>();
    private ArrayList<History> history=new ArrayList<>();
    private ArrayList<Person> register=new ArrayList<>();

    public void createAccount(String userName,String email,String role,String password){
        Person person=new Person(userName,email,role,password);
        
        register.add(person);
        
    }
    public boolean login(String userName,String password,String role){
        
        for(Person person:register){
           
            if(person.getUserName().equalsIgnoreCase(userName)&&person.getPassword().equals(password)
            &&person.getRole().equalsIgnoreCase(role)){
                return true;
            }
            
        }
        return false;
    }


    

    public void addProduct(String productName, int quantity) {
        Product newProduct = new Product(productName, quantity);
        inventory.add(newProduct);
        history.add(new History(productName, "Add", quantity));
        System.out.println("\nProduct added: \n" + newProduct);
    }

    public void removeProduct(String productName) {
        for (Product product : inventory) {
            if (product.getProductName().equals(productName)) {
                history.add(new History(productName, "Remove", product.getQuantity()));
                inventory.remove(product);
                System.out.println("\nProduct removed: \n" + product);
               return;
            }
        }
        System.out.println("Product with name " + productName + " not found in the inventory.");
    }

    public void updateQuantity(String productName, int newQuantity) {
        for (Product product : inventory) {
            if (product.getProductName().equals(productName)) {
                
                int total=product.getQuantity()+newQuantity;
                product.setQuantity(total);
                history.add(new History(productName, "Update", total));
                System.out.print("\nQuantity updated: \n" + total);
                return;
            }
        }
        System.out.println("Product with name " + productName + " not found in the inventory.");
    }

    public void viewAvailableStock() {
        System.out.println("\nCurrent Inventory:");
        System.out.printf("%15s%15s\n","Product","Quantity");
        for (Product product : inventory) {
            System.out.printf("%15s%15d",product.getProductName(),product.getQuantity());
            System.out.println();
        }
    }

    public void generateReport() {
        System.out.println("\nGenerate Overstock Report " );
        for (Product product : inventory) {
            if (product.getQuantity() > 10) {
                System.out.printf("%15s%s%15d%15s\n",product.getProductName(),":",product.getQuantity(),"Overstock");
            }
            else if (product.getQuantity() < 5) {
                System.out.printf("%15s%s%15d%15s\n",product.getProductName(),":",product.getQuantity(),"Understock");
            }
            else {
                System.out.printf("%15s%s%15d%15s\n",product.getProductName(),":",product.getQuantity(),"Mediumstock");
            }
        }
    }

    
    public void printHistory() {
        System.out.println("\nProduct History:\n");
        for(int i=0;i<history.size();i++)
        System.out.println(history.get(i));
        
        
    }


   // @SuppressWarnings("unused")
    public void search(String input){
        String str="";
        for(Product product:inventory){
            String productName=product.getProductName();
            if(productName.contains(input)){
                str+=productName+"\n";
            }

            }
            if(str!=" ")
                System.out.println("\nRelated Search\n"+str);
            else
            System.out.println("\nProduct with name " + input + " not found in the inventory.");
            
        }
        
    }
    

