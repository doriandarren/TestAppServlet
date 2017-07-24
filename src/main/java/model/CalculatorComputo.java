package model;

public class CalculatorComputo {

	
	public static double add(double a, double b) {
		return a + b;
	}
	
	public static double rem(double a, double b) {
		return a - b;
	}
	
	
	public static double mul(double a, double b) {
		return a * b;
	}
	
	public static double div(double a, double b) {
		return a / b;
	}
	
	
	
	/**
	 * Devuelve array de entero con fibonacci
	 * @param n
	 * @return
	 */
	public static int[] fibonacci(int n){
		int fibo1 = 1;
		int fibo2 = 1;
		int[] array=new int[n];		
		int counter=0;		
		
		for(int i=2; i<=n; i++){
			array[counter]=fibo2;
			counter++;			
			fibo2 = fibo1 + fibo2;
			fibo1 = fibo2 - fibo1;
		}
		return array;
	}
	
}
