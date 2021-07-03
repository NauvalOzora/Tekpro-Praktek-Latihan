package Case3;

//****************************************************************
//Factorials.java
//Reads integers from the user and prints the factorial of each.
//
//****************************************************************
import java.util.Scanner;

public class Factorials{
	public static void main(String[] args){
		String KeepGoing = "y";
		Scanner scan = new Scanner(System.in);
		while (KeepGoing.equals("y") || KeepGoing.equals("Y")){
			System.out.print("Enter an integer: ");
			int val = scan.nextInt();
			
			try {
				System.out.println("Factorial(" + val + ") = "+ MathUtils.factorial(val));
			}catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
			System.out.print("Another factorial? (y/n) ");
			KeepGoing = scan.next();
		}
	}
}
