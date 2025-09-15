import java.util.Scanner;

class Codechef {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner input = new Scanner(System.in);
		int daysLeft = 15 - Integer.parseInt(input.nextLine());
		if (daysLeft >= 0) {
			System.out.println(daysLeft);

		} else {
			System.out.println(-1);

		}

	}
}
