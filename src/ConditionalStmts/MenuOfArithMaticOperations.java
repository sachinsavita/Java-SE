package ConditionalStmts;

import java.util.Scanner;

public class MenuOfArithMaticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println("Enter the operation you want to perform: ");
		String operator = scan.next();
		
		switch (operator) {
		case "+" : System.out.println(a+b);
		break;
		case "-" : System.out.println(a-b);
        break;
		case "*" : System.out.println(a*b);
        break;
		case "/" : System.out.println(a/b);
        break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + operator);
		}

	}

}
