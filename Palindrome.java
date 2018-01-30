import java.util.Scanner;
public class Palindrome
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		boolean pal = isPalindrome(num, reverse(num));
		if(pal == true)
		{
			System.out.println("This number is a palindrome.");
		}
		else
			System.out.println("This number is not a palindrome.");
	}

	public static int reverse(int number)
	{
		int reversed = 0;
		int lastnum;
		while(number !=0)
		{
			lastnum = number % 10;
			reversed = reversed *10 + lastnum;
			number = number/10;
			
		}
		
		return reversed;
		
	}

	public static boolean isPalindrome(int n1, int n2)
	{
		if(n1 == n2)
		{
			return true;
		}
		return false;
	}

	
}