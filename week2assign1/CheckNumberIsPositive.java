package week2assign1;

public class CheckNumberIsPositive {
	int number(int a) {
		if (a>=0) {
		    System.out.println("The given number " +a+ " is POSITIVE");
		} else {
		    System.out.println("The given number " +a+ " is NEGATIVE");
		}
		return a;
	
	}


public static void main(String args[]) {
	CheckNumberIsPositive check = new CheckNumberIsPositive();
	System.out.println(check.number(8));
	System.out.println(check.number(-4));
	System.out.println(check.number(87));
	System.out.println(check.number(-44));
}}
