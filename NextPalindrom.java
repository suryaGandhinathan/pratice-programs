import java.util.Scanner;

class Palindrom {
	void CheckPalindrom() {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	num=num+1;
	    int flag=1;
	    while(flag==1)
	     {
	        int rev=0;
	        int n=num;
	        while(n!=0) {
	            rev=((n%10)+rev)*10;
	            n=n/10;
	        }
	        rev=rev/10;
	        if(num==rev) {
	            
	       flag=0;
	        
	    }
	        else {
	            num++;
	            }
	        }
	    
	        System.out.println(num);
	}
	
		
		
	
	
}


public class NextPalindrom {

	public static void main(String[] args) {
		Palindrom pobj=new Palindrom();
		pobj.CheckPalindrom();

	}

}
