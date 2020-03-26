package iteration.trial.exerc2;

public class Iterator {

	public String flowChart(int A, int max) {

		int min = A;
		while (min <= max) {

			int B = min - 1;
			if (min % 2 != 1) {
				if (B > A) {
					System.out.println("*" + B);
				}
			}
			if (min % 2 == 0) {
				System.out.println("-" + min);
			}

			min++;

		}

		return ("END");

	}

}