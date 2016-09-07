import java.util.Scanner;


public class gcRoomSizes {

	public static void main(String[] args) {
		
	    //Welcome Messgae
		System.out.println("Welcome to Grand Circus's Room Detail Generator!");

		//Space
		System.out.println();
		
		//Set choice 
		String choice = "Y";
		
		//Set while loop
		while (choice.equalsIgnoreCase("y")) {
		 
	
			
		 //Create scanner
		Scanner s = new Scanner (System.in);
		
		//First prompt for user
		System.out.print("Enter Length:");
		
		//Assign length
		double length = s.nextDouble();
		
		//Second prompt for user
		System.out.print("Enter Width:");

		//Assign width
		double width = s.nextDouble();
	
		
		//Assign Area
		double Area = length * width;
		
		//Assign Perimeter
		double Perimeter = 2 * length + width;
	
		//Assign Volume
		double Volume = length * width * length;
		
		//Print out Area result
		System.out.println("Area: " + Area);
		
		//Print out Perimeter result
		System.out.println("Perimeter " + Perimeter);
		
		//Print out Volume result
		System.out.println("Volume" + Volume);
		
		
        //Prompt user to continue
		 System.out.print("Continue? (y/n): ");
		
		 //Scan for Y
		 s.nextLine();
		 choice = s.nextLine();
		 
		 
       
       System.out.println();
       
		
		}
		
		
		

	}

}

