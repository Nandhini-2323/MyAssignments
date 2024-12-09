package week2assign1;
import java.util.Scanner;

public class CheckNumberIsPositive {
	void number(int a) {
		if (a>=0) {
		    System.out.println("The given number " +a+ " is POSITIVE");
		} else {
		    System.out.println("The given number " +a+ " is NEGATIVE");
		}
		
	
	}


public static void main(String args[]) {
	CheckNumberIsPositive check = new CheckNumberIsPositive();
	check.number(8);
	check.number(-4);
	check.number(87);
	check.number(-44);
	
	Scanner scanner = new Scanner(System.in);
	int number = scanner.nextInt();
	check.number(number);
}}
