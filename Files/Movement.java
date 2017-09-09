package Files;

import java.util.Timer;
import java.util.TimerTask;

public class Movement {
	Timer Run;
	Timer Background;
	Timer enemy;

	public Movement() {
		Run = new Timer();
		Run.schedule(new TimerTask() {

			@Override
			public void run() {

				if (Var.moveright == true) {
					if (Var.x <= 1000) {
						if (Var.sprint == true) {
							Var.x += 11;
						} else {
							Var.x += 6;
						}
					}
				} else if (Var.moveleft == true) {
					if (Var.x >= 20) {
						if (Var.sprint == true) {
							Var.x -= 11;
						} else {
							Var.x -= 6;
						}
					}
				}

			}

		}, 0, 6);

		Background = new Timer();
		Background.schedule(new TimerTask() {

			@Override
			public void run() {

				if (Var.x >= 1000 && Var.moveright == true && Var.backx != -2550) {
					if (Var.sprint == true) {
						Var.backx -= 6;
						Var.enemyx -= 6;
					} else {
						Var.backx -= 3;
						Var.enemyx -= 3;
					}

				}

				if (Var.x <= 30 && Var.moveleft == true && Var.backx != 0) {
					if (Var.sprint == true) {
						Var.backx += 6;
						Var.enemyx += 6;
					} else {
						Var.backx += 3;
						Var.enemyx += 3;
					}

				}

			}
		}, 0, 6);

		enemy = new Timer();
		enemy.schedule(new TimerTask() {

			@Override
			public void run() {
				
				

			}
		}, 0, 40);
	

		System.out.println("System: Movement Loaded successfully!");
	}

}
