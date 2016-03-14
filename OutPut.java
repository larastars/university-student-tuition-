
public class OutPut {
public static void printStringLeft(int size, String formatted)
	
	{
		int length = formatted.length();
		System.out.println(formatted);
		while (size > length)
		{
			System.out.println(" ");
			size --;
		}
	}
	
	public static void printStringRight (int size, String formatted)
	
	{
		int length = formatted.length();
		System.out.println(formatted);
		while (size > length)
		{
			System.out.println(" ");
			size--;
		}
		System.out.print(formatted);
	}

}
