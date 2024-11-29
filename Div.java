import java.util.Scanner;

public class Main
{
    	public static int Div(int a , int b)
    	{
		Scanner scanner = new Scanner(System.in) ;
		while(b == 0)
		{
			System.out.println("Cannot divide by 0!");		
			b = scanner.nextInt();
		}
        	return a / b ;
    	}
	public static void main(String args[])
	{
		System.out.println(Div(10,2));	
	}
};
