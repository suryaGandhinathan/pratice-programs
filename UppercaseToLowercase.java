import java.util.Scanner;

public class UppercaseToLowercase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String sen=sc.nextLine();
		int len=sen.length();
		for(int i=0;i<len;i++) {
			char word=sen.charAt(i);
			if(('A'<word)&&(word<'Z')) {
				String s=String.valueOf(word); 
				System.out.print(s.toLowerCase());
			}
			else if(('a'<word)&&(word<'z')) {
				String s=String.valueOf(word); 
				System.out.print(s.toUpperCase());
			}
			else if(word==' ') {
				System.out.print(word);
			}
			
		}

	}

}
