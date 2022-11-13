import java.util.Scanner;

public class Question6 {

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
			String is=item.toLowerCase();
			
			for(int i=0;i<is.length();i++)
				arr[is.charAt(i)-97]++;
		}
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0)
				count++;
		}
		
		if(count==26)
			System.out.println("O/P : Given string is pangram");
		else
			System.out.println("O/P : Given string is not pangram");
		
	}

}
