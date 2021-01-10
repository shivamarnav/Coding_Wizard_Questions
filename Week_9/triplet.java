import java.util.*;

public class triplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n, i, sum;
		System.out.println("Enter the size of array & sum");
		n = in.nextInt();
		sum = in.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the array");
		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		for (i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (a[i] + a[j] + a[k] == sum) {
						System.out.println(a[i] + " " + a[j] + " " + a[k]);
					}
				}
			}
		}

	}

}
