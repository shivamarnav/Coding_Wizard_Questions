import java.util.regex.*;
 public class RESimple
 {
	 public static void main(String[] argv)
	 {
		 String pattern = " pxy";
		 String input =" pqr abd pxy";
		 Pattern p = Pattern.compile(pattern);
		 Matcher m= p.matcher(input);
		 if(m.find())
			 System.out.println("Pattern" + pattern + "found in string" + input);
		 else
		 System.out.println("Pattern "+ pattern+" not found in string" + input);
	 }
 }