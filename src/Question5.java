import java.util.Arrays;
import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two strings :");
		String s1=sc.next();
		String s2=sc.next();
		System.out.println();
		
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		boolean b=Arrays.equals(ch1, ch2);
		
		if(b)
			System.out.println("O/P : Given two strings " + s1 + " and " + s2 + " are anagrams");
		else
			System.out.println("O/P : Given two strings " + s1 + " and " + s2 + " are not anagrams");

	}

}
