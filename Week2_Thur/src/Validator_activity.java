

import java.util.Scanner;  
public class Validator_activity {     
	public static String getString(Scanner sc, String prompt) {
		System.out.print(prompt);         
		String s = "";  
		boolean isValid = false;
		// read the user entry         
		
		while( isValid == false){
			
			s = sc.nextLine();
			if(s.length() > 20){
				System.out.println("The item code should have at most 20 characters, Try again.");
				
				}
			
			else { isValid = true;}     
			     
			}
		return s;
	}
	
	public static int getInt(Scanner sc, String prompt, int min, int max){         
		int i = 0;         
		boolean isValid = false;         
		while (isValid == false){             
			System.out.print(prompt);
			if(sc.hasNextInt()){
				i = sc.nextInt();
				
				if(i >= min && i <= max ) {isValid = true;}
				else {System.out.println("The entered number should be between " + min + " and  " + max);}
					

			}
			else{System.out.println("Error! Invalid integer value. Try again.");}    
			
			sc.nextLine();  // discard any other   
		}

		return i; 

	}
	
	
	public static double getDouble(Scanner sc, String prompt, double min, double max){         
		double i = 0;         
		boolean isValid = false;         
		while (isValid == false){             
			System.out.print(prompt);
			if(sc.hasNextDouble()){
				i = sc.nextInt();
				
				if(i >= min && i <= max ) {isValid = true;}
				else {System.out.println("The entered number should be between " + min + " and  " + max);}
					

			}
			else{System.out.println("Error! Invalid integer value. Try again.");}    
			
			sc.nextLine();  // discard any other   
		}

		return i; 

	}
	
	public static void main (String [] args){
		
		Scanner key = new Scanner (System.in);
		Validator_activity val = new Validator_activity();
		
		val.getString(key,"Please enter your name: ");
		val.getInt(key, "Please enter your age ", 0, 100);
		val.getInt(key, "Please enter your height: ", 36, 92);
		val.getInt(key, "Please enter your weight: ", 80, 400);
		val.getDouble(key, "Please enter your favorit decimal: ", 36, 92);
		
		System.out.println();
		
	}

}
