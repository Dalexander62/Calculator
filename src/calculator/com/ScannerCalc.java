package calculator.com;

import java.util.Scanner;

public class ScannerCalc {

	Scanner input = new Scanner(System.in);
	

		public static double result;
		
		public static double add(double numeroUno, double numeroDos) {
		 result = numeroUno + numeroDos;
			return result;
		 
		}

		public static double sub(double numeroUno, double numeroDos) {
			
			 result = numeroUno - numeroDos;
			return result;
			
		}

		public static double div(double numeroUno, double numeroDos) {
			
			result = numeroUno/numeroDos;
			return result;
		}

		public static double mul(double numeroUno, double numeroDos) {
			
			 result = numeroUno * numeroDos;
			return result;
		}

		
	}



