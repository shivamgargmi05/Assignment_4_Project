import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string :");
		String s=sc.nextLine();
		System.out.println();
		
		System.out.println("Given String : " + s);
		System.out.println();
		
		String r="";
		for(int i=0;i<s.length();i++) {
			boolean flag=false;
			
			for(int j=0;j<s.length();j++) {
				if(i!=j && s.charAt(i)==s.charAt(j)) {
					flag=true;
					break;
				}
			}
			
			if(flag==false)
				r=r+s.charAt(i);
		}
		
		System.out.println("O/P : String after removing duplicates " + r);
		
	}

}
