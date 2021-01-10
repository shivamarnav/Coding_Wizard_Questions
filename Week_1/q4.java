import java.util.*;
public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Date as 09 th January 2019");
		String st=in.nextLine();
		int d=Integer.parseInt(st.substring(0,2));
	        String m= st.substring(6,9);
	        m=m.toUpperCase();
	        int feb,days=d, b;
	        b=Integer.parseInt(st.substring(st.length()-4));
	      
	        if ((b% 4 == 0 && b % 100 != 0 ) || (b % 400 == 0)){
	            feb=29;
	        }
	        else{
	            feb=28;
	        }
	        switch(m){
	        case "JAN":
	        	days=days;
	        	break;
	        case "FEB":
	        	days =days+ 31;
	            break;
	        case "MAR":
	        	days =days+ 31+feb;
	            break;
	        case "APR":
	        	days =days+ 31+feb+31;
	            break;
	        case "MAY":
	        	days =days+ 31+feb+31+30;
	            break;
	        case "JUN":
	        	days =days+ 31+feb+31+30+31;
	            break;
	        case "JUL":
	        	days =days+ 31+feb+31+30+31+30;
	            break;            
	        case "AUG":
	        	days =days+ 31+feb+31+30+31+30+31;
	            break;
	        case "SEP":
	        	days =days+ 31+feb+31+30+31+30+31+31;
	            break;
	        case "OCT":
	        	days =days+ 31+feb+31+30+31+30+31+31+30;            
	            break;            
	        case "NOV":
	        	days =days+ 31+feb+31+30+31+30+31+31+30+31;            
	            break;                        
	        case "DEC":
	        	days =days+ 31+feb+31+30+31+30+31+31+30+31+30;            
	            break; 
	        default:System.out.println("Enter a Valid Date");
	        }
	        System.out.println("No Of Days: "+days);
	    }
	

	}


