public class lab03
{

	static String concatName(String firstName, String lastName)
	{
		return firstName + " " + lastName;
	}

	static int checkAge(int check)
	{

		if(check >= 18)
		{
			System.out.println("You are " + check + "years old.");

			System.out.println("You can vote");
		}
		else
		{
			System.out.println("You are " + check + "years old.");

			System.out.println("You can't vote");
		}
	}

	public static void main(String args[])
	{
		System.out.println("Student Name: Lab03");
	
		concatName();

		checkAge()Integer.parseInt(args[2]);
	}
}
