package ConditionalStmts;

import java.util.Scanner;

//Relational Operators:    <,>,<=,>=,==<!==
//Logical Operators:      &&, ||, ! 
public class OperatorsDemo {
	
	public static void main(String args[])
	{
		System.out.println("Enter a number to check if it is even or odd:");
           Scanner scan = new Scanner(System.in);
           String n = scan.nextLine();
           
             if(n.matches("[01]+"))
             {
            	 System.out.println("Number is Binary so radix is 2");
             }
             else if(n.matches("[0-7]+"))
             {
            	 System.out.println("Number is octal so radix is 8");
             }
             else if(n.matches("[0-9]+"))
             {
            	 System.out.println("Number is Decimal so radix is 10");
             }
             else if(n.matches("[0-9A-f]+"))
             {
            	 System.out.println("Number is Hexadecimal so radix is 16");
             }
             
		
	}
}
