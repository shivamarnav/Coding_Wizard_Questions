import java.util.*;
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String st, st1="";
		char ch;
		int i, l=0;
		System.out.println("Give Input");
		st=in.nextLine();
		l=st.length();
		for(i=0;i<l;i++)
		{
			ch=st.charAt(i);
			if((ch!='G')&& (ch!='C')&& (ch!='T')&& (ch!='A'))
			{
				st1="Invalid Input";
				break;
			}
			else
			{
				if(ch=='G')
				{
					st1=st1+'C';
				}
				if(ch=='C')
				{
					st1=st1+'G';
				}
				if(ch=='T')
				{
					st1=st1+'A';
				}
				if(ch=='A')
				{
					st1=st1+'U';
				}
			}
		}
		System.out.println(st1);
	}
}

	