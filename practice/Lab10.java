import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

enum colors
{
	CYAN,
	MAGENTO,
	YELLOW,
	BLACK
}

interface Major
{
	public String getMajor();
	public void setMajor(String major);
}

interface Deposit
{
	public int getDeposit();
	public void setDeposit(int deposit);
}

class Student implements Major, Deposit
{
	private String major;
	private int deposit;

	public void setMajor(String name)
	{
		this.major = name;
	}

	public String getMajor()
	{
		return major;
	}

	public void setDeposit(int money)
	{
		this.deposit = money;
	}

	public Student(String name, int money)
	{
		major = name;
		deposit = money;
	}

	public void display()
	{
		System.out.println("Student " + " major: " + major);
		System.out.println("Student " + " deposit: " + deposit);
	}
}

public class Lab10
{
	public static void main(String[] args)
	{
		System.out.println("Matthew Garcia: Lab10 \n");
		Scanner nmbrs = new Scanner(System.in);
		Scanner strings = new Scanner(System.in);

		Student info[] = { new Student(), new Student() };
		info[0].setStudent(Music, 25);
		info[1].setStudent(Math, 50);

		for(int zoomer = 0; zoomer < info.length; zoomer++)
		{
			info[zoomer].display();
		}

		ArrayList<String> schools = new ArrayList<String>();
		HashMap<String, String> department = new HashMap<String, String>();

		System.out.println("Toner:");

		for(colors n : colors.values() )
		{
			System.out.println(n);
		}

		System.out.println("\nArrayList:");
		System.out.println("How many schools do you want to enter?");
		int school_amount = nmbrs.nextInt();

		for(int i = 0; i < school_amount; i++)
		{
			System.out.println("Enter a college name:");

			String school_name = strings.nextLine();

			schools.add(school_name);
		}

		System.out.println("\nHere are your colleges");

		for(int j = 0; j < schools.size(); j++)
		{
			System.out.println(schools.get(j) );
		}

		System.out.println("\nHashMap: \nHow many departments do you want to enter?");
		int departments_amount = nmbrs.nextInt();

		for(int d = 0; d < departments_amount; d++)
		{
			System.out.println("Enter the department name:");

			String dep_name = strings.nextLine();

			System.out.println("Enter the name of the department chair");

			String dep_chair = strings.nextLine();

			department.put(dep_name + " chair is ", dep_chair);
		}

		System.out.println("\nHere are your department chars");

		Map<String, String> sorted = new TreeMap<String,String>(department);

		for(String m : sorted.keySet() )
		{
			System.out.println(m + sorted.get(m) );
		}
	}
}
