import java.util.Scanner;

public class Question7 {

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
		
		int no=0;
		for(String item: ss) {
			String is=item.toUpperCase();
			
			no=no+is.length();
			
			for(int i=0;i<is.length();i++)
				arr[is.charAt(i)-65]++;
		}
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1)
				count++;
		}
		
		if(count==no)
			System.out.println("O/P : Given string contains all unique characters");
		else
			System.out.println("O/P : Given string doesn't contain all unique characters");
		
	}

}
