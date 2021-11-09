package calculator.com;

import java.util.Scanner;

public class Menu {

	
	Scanner input = new Scanner(System.in);
	

		public void menu() {
			
			boolean menuBool = true;
			String menuOppy = "";
		    int nummy1;
			int nummy2;
			
	       
			
			System.out.println("Welcome to the only Calc app out there...");

			while (menuBool) {
			
				System.out.println("Please select which operator to call, +, -, *, or /");
	
				System.out.println("\tA). Add me");
				System.out.println("\tB). Sub me");
				System.out.println("\tC). Multiply me");
				System.out.println("\tD). Divide me");
				System.out.println("\tE). Call me");
				

				menuOppy = this.input.nextLine();
				
				switch (menuOppy) {
				
				
					case "1":
						System.out.println("Please enter numero uno");
						nummy1 = input.nextInt();
						System.out.println("Please enter numero dos");
						nummy2 = input.nextInt();
						input.nextLine();
						System.out.println("The outcome is ");
						System.out.println(ScannerCalc.add(nummy1, nummy2));
						break;
		
						
					case "2":
						System.out.println("Please enter numero uno");
						nummy1 = input.nextInt();
						System.out.println("Please enter numero dos");
						nummy2 = input.nextInt();
						input.nextLine();
						System.out.println("The outcome is ");
						System.out.println(ScannerCalc.sub(nummy1, nummy2));
						break;
		
						
					case "3":
						System.out.println("Please enter numero uno");
						nummy1 = input.nextInt();
						System.out.println("Please enter numero dos");
						nummy2 = input.nextInt();
						input.nextLine();
						System.out.println("The outcome is ");
						System.out.println(ScannerCalc.div(nummy1, nummy2));
						break;
		
						
					case "4":
						System.out.println("Please enter your numero uno");
						nummy1 = input.nextInt();
						System.out.println("Please enter your numero dos");
						nummy2 = input.nextInt();
						input.nextLine();
						System.out.println("The outcome is ");
						System.out.println(ScannerCalc.mul(nummy1, nummy2));
						break;	
}

				
			
			
		}
		
}
		
}


