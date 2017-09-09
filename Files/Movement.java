package Files;

import java.util.Timer;
import java.util.TimerTask;

public class Movement {
	Timer Run;
	Timer Background;

	public Movement() {
		Run = new Timer();
		Run.schedule(new TimerTask() {

			@Override
			public void run() {

				if (Var.moveright == true) {
					if (Var.x <= 1000) {

						Var.x += 6;
					}
				} else if (Var.moveleft == true) {
					if (Var.x >= 20) {
						Var.x -= 6;
					}
				}

			}

		}, 0, 6);

		Background = new Timer();
		Background.schedule(new TimerTask() {

			@Override
			public void run() {

				if (Var.x >= 1000 && Var.moveright == true) {

					Var.backx -= 3;

				}

				if (Var.x <= 30 && Var.moveleft == true) {

					Var.backx += 3;
				}

			}
		}, 0, 6);

		System.out.println("System: Movement Loaded successfully!");
	}

}
