package javaChallenge;

public class Challenge1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//defining the string
		String str1 = "Hello World";//storing the sentence as string
		String split1[] = str1.split(" ");//spliting the words using white spaces
		String res1 = split1[1];//storing the last word
		int length1 = res1.length();//finding the length of last word
		System.out.println("The last word is "+res1 + " with length "+length1);
		System.out.println("<<<------------->>>");
		
		//defining the second sentance
		String str2 = "   fly me   to   the moon";
		String split2[] = str2.split("e ");
		String res2 = split2[2];
		int length2 = res2.length();
		System.out.println("The last word is "+res2 + " with length "+length2);
		System.out.println("<<<------------->>>");
		
		//defining the third sentense
		String str3 = "luffy is still joyboy";
		String split3[] = str3.split(" ");
		String res3= split3[3];
		int length3 = res3.length();
		System.out.println("The last word is "+res3+ " with length "+length3);
	}

}
