import java.util.Scanner;
public class StratingLetterCapital {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String sen=sc.nextLine();
	System.out.print(sen.charAt(0));
	for(int i=0;i<sen.length();i++) {
		String word="";
		word=word+sen.charAt(i);
		if(word.equals(" ")) {
			System.out.print("."+sen.charAt(i+1));
		}
	}
	System.out.print(".");

	}

}
