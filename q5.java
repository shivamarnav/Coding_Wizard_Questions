import java.util.*;
public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0,y=0;
		long l1=0;
       for(int i=100;i<=999;i++)
       {
    	   for(int j=i+1;j<=999;j++)
    	   {
    		   long re=i*j;
    		   if(cpalindrome(re))
    			   if(re>l1)
    			   {
    				   l1=re;
    				   x=i;
    				   y=j;
    			   }
    			   
    			   
    	   }
    	   
    	   
       }
       System.out.println("The largest palindrome made from the product of two 3-digit numbers is "+l1+" and the numbers are "+x+" and "+y);
	}
    public static boolean cpalindrome(long re)
    {
    	String str=re+"",str2="";
    	for(int i=str.length()-1;i>=0;i--)
    		str2=str2+str.charAt(i)+"";
    
    	if(str.equals(str2))
    		return true;
    	else
    		return false;
    }

}
