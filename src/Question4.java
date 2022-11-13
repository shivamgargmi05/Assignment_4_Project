import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string :");
		String s=sc.nextLine();
		System.out.println();
		
		int c=0, v=0, sp=0, n=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			
			if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i'
					|| ch=='o' || ch=='u' )
				v++;
			else if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') )
				c++;
			else if(ch>=48 && ch<=57)
				n++;
			else
				sp++;
		}
		
		System.out.println("O/P : No. of consonants, vowels, special characters in the given string " + s + 
				" are " + c + " " + v + " " + sp );
		
	}

}
