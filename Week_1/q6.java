public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0,x=0,i;
        for(i=2;;i++)
        {
        	if(cprime(i))
        	c++;
        	if(c==10001)
        	{
        		x=i;
        		break;
        	}
        }
       System.out.println("The 10001st prime number is "+x);
	}
	public static boolean cprime(int y)
	{
		for(int i=2;i<y;i++)
		{
			if(y%i==0)
			  return false;
		}
		return true;
	}

}