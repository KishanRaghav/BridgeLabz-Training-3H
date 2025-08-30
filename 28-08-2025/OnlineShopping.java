import java.util.*;
public class OnlineShopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Online shopping ");
        System.out.println("Entet the number of customers");
        int  customer =sc.nextInt();;
        while (customer !=0 ) {
            
            int items;
        do {
                System.out.print("Enter number of items you want to buy (at least 1) : ");
                System.out.println("Please select the products : ");
                items = sc.nextInt();
            } while (items < 1);
            
         int total_amount=0;


            for(int i = 1; i <= items; i++){
                System.out.println("Product Menu :");
         System.out.println("1 for Mobile  Rs 15000");
         System.out.println("2 for books Rs 200");
         System.out.println("3 for headphones Rs 1100");
         System.out.println("4 for tshirt Rs 999");
         System.out.println("5 for shoes Rs 2000");
         System.out.println("enter number to choose items :");
         int n=sc.nextInt();


         switch (n) {
            case 1: total_amount+=15000;
                
                break;
         
            case 2: 
                total_amount+=200;
                
                break;
         
            case 3: total_amount+=1100;
                
                break;
         
            case 4: total_amount+=999;
                
                break;
         
         
            case 5: total_amount+=2000;
                
                break;
         
            default: System.out.println("Invalid choice");
            i--;
                break;
         }

         
            
         }

         if (total_amount > 5000) {
            System.out.println("Congratulations! You got 20% discount.");
                total_amount = total_amount - (total_amount * 20 / 100);

            }

            
         System.out.println("total amount is  Rs "+ total_amount);
        

        
        customer--;
        }
        
    }
}
