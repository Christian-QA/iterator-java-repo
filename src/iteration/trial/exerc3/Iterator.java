package iteration.trial.exerc3;

public class Iterator {

	public void loopInLoop(int min, int max) {

		int min2 = min;

		for (min = 0; min <= max; min++) {

			System.out.println(min);

			for (min2 = 0; min2 <= max; min2++) {

				System.out.println(min2);

			}

		}

	}

}