import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string :");
		String s=sc.next();
		System.out.println();
		
		s=s.toLowerCase();
		
		int[] arr=new int[26];
		
		for(int i=0;i<s.length();i++) 
			arr[s.charAt(i)-97]++;
		
		System.out.println("O/P : Duplicates characters from the given string " + s + " by ignoring case are ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>1)
				System.out.print((char)(i+97) + " ");
		}
		System.out.println();
		
	}

}
