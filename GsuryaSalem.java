import java.util.Scanner;
class InvalidFunction extends Exception{
	public InvalidFunction(String s) {
		super(s);
	}
}
class Elevator {
	int count=1;
	void inputFunction() {
		System.out.println("(s)elect a floor,(f)ire alarm,(q)uit");
		System.out.println("Enter s, f, or q");
		Scanner obj=new Scanner(System.in);
		String input=obj.nextLine();
		selectFunction(input);
		
	}
	void inputFloar(String floars) {
		System.out.println("Enter the floar you'd like to go to");
		Scanner obj=new Scanner(System.in);
		int floar=obj.nextInt();
		try {
		if((0<floar)&&(floar<=10)){
			if(count==floar) {
				inputFunction();
			}
			else if(count<floar) {
				System.out.print("Going up");
				int i;
			for(i=count+1;i<=floar;i++) {
				System.out.print(".."+i);
			}
			count=i-1;	
			System.out.print("..Ding");
			System.out.println();
			inputFunction();
			}
			else if(count>floar) {
				System.out.print("Going down");
				int i;
			for(i=count;i>=floar;i--) {
				System.out.print(".."+i);
			}
			count=i+1;
			System.out.print("..Ding");
			System.out.println();
			inputFunction();
		}
		}
		else {
			throw new InvalidFunction("Invalid Function");
			
			
		}
		
	}
	catch(InvalidFunction ed1) {
		System.out.println("Invalid floar");
		inputFunction();
		}
	}
	
	
	
	
	
	void selectFunction(String input) {
		input=input.toLowerCase();
		try {
		if(input.equals("f")) {
			System.out.println("Danger,you must exit the building");
		}
		else if(input.equals("q")) {
			System.out.println("exit");
		}
		else if(input.equals("s")) {
			inputFloar("s");
		}
		else {
			throw new InvalidFunction("Invalid Function");  
		}}
		catch(InvalidFunction ed) {
			System.out.println("Invalid Function");
		}
	}
	
	
}



public class GsuryaSalem {

	public static void main(String[] args) {
		Elevator eobj=new Elevator();
		eobj.inputFunction();

	}

}
