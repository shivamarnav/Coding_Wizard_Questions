import java.util.*;
public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		long x=0,y=0,i,z;
		int c=0;
		for(i=2;i<1000000;i++)
		{
			c=1;
			z=i;
			while(z!=1)
			{
				if(z%2==0)
					z=z/2;
				else
					z=3*z+1;
				c++;
			}
			if(c>x && z==1)
			{
				x=c;
				y=i;
			}
		}
		System.out.println(y);

	}

}
