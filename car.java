package session_2lab;
import java.util.Scanner;
public class car {
	
	String make;
	String model;
	short year;
	int price;
	
	public car(String make ,String model,short year,int price) {
		this.make=make;
		this.model=model;
		this.year=year;
		this.price=price;
	}
	
	public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make  : " + make);
        System.out.println("Model : " + model);
        System.out.println("Year  : " + year);
        System.out.println("Price : ₹" + price);
        System.out.println("----------------------");
    }
       public static void main (String [] args) {
    	   Scanner scanner = new Scanner(System.in);
    	   
    	   System.out.println("how many cars would you like to create");
    	   
    	   int n= scanner.nextInt();
    	   scanner.nextLine();
    	   
    	   car[] cars =new car[n];
    	   
    	   for (int i=0;i<n;i++) {
    		   System.out.println("Enter details for Car #" + (i + 1));

               System.out.print("Make: ");
               String make = scanner.nextLine();

               System.out.print("Model: ");
               String model = scanner.nextLine();

               System.out.print("Year: ");
               short year = scanner.nextShort();

               System.out.print("Price: ");
               int price = scanner.nextInt();
               scanner.nextLine(); 
               cars[i] = new car(make, model, year, price);
               
               System.out.println("\n--- Car Inventory ---");
               for (car car : cars) {
                   car.displayDetails();
           
    		   
    	   }
               scanner.close();
       }
       }
}
       
