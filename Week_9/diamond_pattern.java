import java.util.*;

public class diamond_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = ob.nextInt();
		int a[][] = new int[n][n];
		int pos = 1, cnt = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < pos; j++) {
				a[i][n / 2 - j] = cnt;
				a[i][n / 2 + j] = cnt;

				cnt++;
			}

			if (pos == (n / 2) + 1)
				break;

			pos++;
			cnt = 1;
		}
		pos = 1;
		cnt = 1;
		for (int i = n - 1; i >= n / 2; i--) {
			for (int j = 0; j < pos; j++) {
				a[i][n / 2 - j] = cnt;
				a[i][n / 2 + j] = cnt;
				cnt++;
			}

			if (pos == (n / 2) + 1)
				break;

			pos++;
			cnt = 1;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] == 0)
					System.out.print(" ");
				else
					System.out.print(a[i][j]);
			}
			System.out.println();
		}

	}

}