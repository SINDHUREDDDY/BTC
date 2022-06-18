import java.util.Scanner;
public class Aquarium {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter pH value of the aquarium water ");
		int ph=s.nextInt();
		if(ph<0)
		{
			System.out.println("invalid number");
		}
		else
		{
			if(ph<7)
			{
				System.out.println("pH value is low, partial water change required");
			}
			else if(ph==7 || ph==8)
			{
				System.out.println("pH value is fine");
			}
			else
			{
				System.out.println("pH value is high, partial water change required");
			}
		}
	}

}
