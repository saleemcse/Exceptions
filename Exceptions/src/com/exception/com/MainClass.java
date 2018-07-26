package com.exception.com;

public class MainClass {
	public static void main(String[] args) {
		
		try{
		System.out.println(Integer.parseInt(args[0])/Integer.parseInt(args[1]));
	}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("provide 2 numbres");
		}
		catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("invalid numbers");
		}
			catch (ArithmeticException e2) {
				// TODO: handle exception
				System.out.println("Divide by zero exception");
			}
		
		System.out.println("end");
	}
	

}
