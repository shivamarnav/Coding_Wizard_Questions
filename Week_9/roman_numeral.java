import java.util.*;

public class roman_numeral {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no. between 1 to 1000");
		int number = in.nextInt();
		number = Math.min(1000, Math.max(1, number));
		String asRomanNumerals = "";
		String[] RN = { "I", "V", "X", "L", "C", "D", "M" };
		int i = 0;
		while (number > 0) {
			switch (number % 10) {
			case 1:
				asRomanNumerals = RN[i] + asRomanNumerals;
				break;
			case 2:
				asRomanNumerals = RN[i] + RN[i] + asRomanNumerals;
				break;
			case 3:
				asRomanNumerals = RN[i] + RN[i] + RN[i] + asRomanNumerals;
				break;
			case 4:
				asRomanNumerals = RN[i] + RN[i + 1] + asRomanNumerals;
				break;
			case 5:
				asRomanNumerals = RN[i + 1] + asRomanNumerals;
				break;
			case 6:
				asRomanNumerals = RN[i + 1] + RN[i] + asRomanNumerals;
				break;
			case 7:
				asRomanNumerals = RN[i + 1] + RN[i] + RN[i] + asRomanNumerals;
				break;
			case 8:
				asRomanNumerals = RN[i + 1] + RN[i] + RN[i] + RN[i] + asRomanNumerals;
				break;
			case 9:
				asRomanNumerals = RN[i] + RN[i + 2] + asRomanNumerals;
				break;
			}
			number = (int) number / 10;
			i += 2;
		}
		System.out.println(asRomanNumerals);
	}
}
