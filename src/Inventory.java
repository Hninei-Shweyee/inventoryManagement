

import java.util.Scanner;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InventoryManagementSystem inventorySystem = new InventoryManagementSystem();

        System.out.println("\033c");
        boolean bool1=true;
        while(bool1){
        System.out.println("Register\t:Enter 1\nLogin\t\t:Enter 2\nExit\t\t:Enter 3");
        int account=scanner.nextInt();
        System.out.println("\033c");
        
        switch (account) {
        
        case 1:{
                System.out.print("Enter user name: ");
                String userName=scanner.next();
                System.out.print("Enter email: ");
                String email=scanner.next();
                System.out.print("Enter role 'M' for Manager 'S' for Staff ");
                String role=scanner.next();
                System.out.print("Enter passward: ");
                String passward=scanner.next();

                inventorySystem.createAccount(userName, email, role, passward);
                System.out.println("\nSuccess! Your account has been created.\n");
                continue;
        }
         case 2:{System.out.print("Enter user name: ");
                String userName=scanner.next();
                System.out.print("Enter passward: ");
                String passward=scanner.next();
                System.out.print("Enter role 'M' for Manager 'S' for Staff ");
                String role=scanner.next();

                boolean user=inventorySystem.login(userName, passward,role);
                
                if(user){
                        boolean bool=true;
                        System.out.println("\nLog in Successful!");
                        while (bool) {

                                option();
                    
                                System.out.print("\nEnter your choice: ");
                                int choice = scanner.nextInt();
                                System.out.println("\033c");

                                switch (choice) {
                    
                                case 1:{
                                        System.out.print("Enter product name to add: ");
                                        String productName = scanner.next();
                                        System.out.print("Enter quantity: ");
                                        int quantity = scanner.nextInt();
                                        inventorySystem.addProduct(productName, quantity);
                                }
                                break;
                    
                                case 2: {
                                        System.out.print("Enter product name to remove: ");
                                        String removeProductName = scanner.next();
                                        inventorySystem.removeProduct(removeProductName);
                                }
                                break;
                    
                                case 3: {
                                        System.out.print("Enter product name to update quantity: ");
                                        String updateProductName = scanner.next();
                                        System.out.print("Enter new quantity: ");
                                        int newQuantity = scanner.nextInt();
                                        inventorySystem.updateQuantity(updateProductName, newQuantity);
                                }
                                break;
                    
                                case 4:inventorySystem.viewAvailableStock();
                                break;
                    
                                case 5:inventorySystem.generateReport();
                                break;
                    
                                case 6: {if(role.equalsIgnoreCase("M"))
                                        inventorySystem.printHistory();
                                
                                        else System.out.println("Staff cannot access");    
                                }
                                break;
                                        
                                case 7:{
                                        System.out.print("Enter your search :");
                                        String input=scanner.next();
                                        inventorySystem.search(input);
                                }
                                break;
                               
                                case 8: {
                                        System.out.println("\nAlready log out from user account .\n");
                                        bool=false;
                                }
                                break;

                                default :{
                                        System.out.println("\nInvalid input!. Please enter a valid input.\n");
                                        continue;
                                }
                                
                            }
                        }

                }
                
                else {
                        System.out.println("\nInvalid username, password or role! Login in again\n");
                        continue;
                }
         }
        continue;
        
        
        case 3:{System.out.println("You exit!!!!");
        bool1=false;
        } 
        break;

        default :System.out.println("Enter valid inputs ");
                continue;
        }
    }
}
        
        public static void option(){
                System.out.println("\n\n\n");
                System.out.println("\nChoose one of these Options:");
                    System.out.println("1. Add Product");
                    System.out.println("2. Remove Product");
                    System.out.println("3. Update Quantity");
                    System.out.println("4. View Available Stock");
                    System.out.println("5. Generate Report");
                    System.out.println("6. Print Transaction History");
                    System.out.println("7. Search");
                    System.out.println("8. logout");
            }
        
        
    
}
