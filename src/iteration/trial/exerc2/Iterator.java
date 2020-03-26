package iteration.trial.exerc2;

public class Iterator {

	public String flowChart(int A, int max) {

		while (A <= max) {

			if (A % 2 == 0) {
				System.out.println("-" + A);
			}
			if (A % 2 != 1) {
				System.out.println("*" + A);
			}

			A++;

		}

		return ("END");

	}

}