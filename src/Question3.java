import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string :");
		String s=sc.nextLine();
		System.out.println();
		
		int n=s.length()/2;
		int l=s.length()-1;
		boolean flag=false;
		for(int i=0;i<=n;i++) {
			if(s.charAt(i)!=s.charAt(l-i)) {
				flag=true;
				break;
			}
		}
		
		if(flag==false)
			System.out.println("O/P : Given string " + s + " is palindrome");
		else
			System.out.println("O/P : Given string " + s + " is not palindrome");

	}

}
