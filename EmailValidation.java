import java.util.Scanner;

public class EmailValidation {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an E-mail : ");
		String a=sc.next();
		
		String[] arr=a.split("@");
		if(arr.length==2)
		{
			//System.out.println("Accepted");
			String[] b=arr[1].split("\\.");
			if(b.length==2)
			{
				if(arr[0].length()<=10 && b[0].length()<=5 && b[1].length()<=3)
				{
					System.out.println("Accepted");
				}
				else
				{
					System.out.println("Not Accepted");
				}
			}
			else
			{
				System.out.println("Not Accepted");
			}
		}
		else
		{
			System.out.println("Not Accepted");
		}

	}

}
