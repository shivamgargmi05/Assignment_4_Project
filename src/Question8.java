import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string :");
		String s=sc.nextLine();
		System.out.println();
		
		System.out.println("Given string : " + s);
		System.out.println();
		
		String[] ss=s.split(" ");
		
		int[] arr=new int[26];
		
		for(String item: ss) {
			String is=item.toUpperCase();
			
			for(int i=0;i<is.length();i++)
				arr[is.charAt(i)-65]++;
		}
		
		int count=1;
		char ch=' ';
		for(int i=0;i<arr.length;i++) {
			if(count<arr[i]) {
				count=arr[i];
				ch=(char)(i+65);
			}
		}
		
		System.out.println("O/P : Maximum occuring character is " + ch);
		
	}

}
