import java.util.Scanner;

public class InitialWithTitle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String sen=sc.nextLine();
		String words[]=sen.split(" ");
		int len=words.length;
		for(int i=0;i<len;i++) {
			if(i==len-1) {
				System.out.print(words[i]);
			}
			else {
				String word=words[i];
				System.out.print((word.charAt(0))+".");
			}
		}

	}

}
