// Garden Shop System
// Created by : Christiane A. Bacani
import java.util.Scanner;
public class Mavenproject18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String plants[] = {"Orchid","Gumamela","Sunflower"};
        int price[] = {50,70,90};
        boolean orderAgain = true;
        
        System.out.print("Welcome to our Garden Shop!\n");
        
        System.out.print("Enter your name : ");
        String username = input.nextLine();
        
        System.out.print("Hello " + username + " Welcome to Our Garden Shop!\n");
        
        int nums = 1;
        int totalDue = 0;
               
        while (orderAgain){
        for(int i = 0; i < plants.length ; i++){
            System.out.print(nums + ") " + plants[i] + " / P " + price[i] + "\n");
            nums++;
            
        }
        System.out.print("Enter your choice here : ");
        int userChoice = input.nextInt();
        
        System.out.print("Enter the quantity here : ");
        int quantity = input.nextInt();
        
        totalDue += price[userChoice - 1] * quantity;
        System.out.print("Do you want to buy more ? (y/n): ");
        input.nextLine();
        String userOrderAgain = input.nextLine();
        
        if (userOrderAgain.equals("n")){
            orderAgain = false;
            System.out.print("The total price is : P " + totalDue + "\n");
            
            System.out.print("Enter your payment here : P ");
            int payment = input.nextInt();
            
            int change = payment - totalDue;
            System.out.print("Change : P " + change + "\n");
            
            System.out.print("Press enter to exit shop : ");
            input.nextLine();
            String pressEnter = input.nextLine();
            System.out.print("\n");
            
            
            System.out.print("Thank you for visiting the shop!, Please come again1");
                    
        }
        }
                
    }
}
