package 조건문;

import java.util.Scanner;

public class P2884 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int hour = in.nextInt();
		int minute = in.nextInt();

		in.close();

		if (minute < 45) {
			hour--; 
			minute = 60 - (45 - minute); 
			if (hour < 0) {
				hour = 23;
			}
			System.out.println(hour + " " + minute);
		} else {
			System.out.println(hour + " " + (minute - 45));
		}

	}
}
