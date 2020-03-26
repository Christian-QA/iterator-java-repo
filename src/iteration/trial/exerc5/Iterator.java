package iteration.trial.exerc5;

public class Iterator {

	public void loopInLoop(int min, int max) {

		while (min < max) {

			for (int i = 0; i < min; i++) {

				System.out.println(min);

			}

			min++;

		}

	}

}