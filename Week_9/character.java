import java.util.*;
public class character {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string nd 2nd string");
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		str1= str1.toLowerCase();
		str2=str2.toLowerCase();
		char arr[] = new char[str1.length()];
		char[] mask = new char[256];
		for(int i=0;i<str2.length();i++)
		mask[str2.charAt(i)]++;
		for(int i=0;i<str1.length();i++)
		{

		if(mask[str1.charAt(i)]==0)
		System.out.print(str1.charAt(i));
		}
	}
}

