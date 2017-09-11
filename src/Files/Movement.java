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

				if (Var.ingame == true) {

					if (Var.x >= 1000 && Var.moveright == true) {
						if (Var.Level1 == true && Var.backx >= -2550) {
							if (Var.sprint == true) {
								Var.enemylv1x -= 6;
								Var.lv1rchdx -= 6;
								Var.backx -= 6;
							} else {
								Var.backx -= 3;
								Var.enemylv1x -= 3;
								Var.lv1rchdx -= 3;
							}
						}

						if (Var.Level2 == true && Var.backx >= -6400) {
							if (Var.sprint == true) {
								Var.backx -= 6;
							} else {
								Var.backx -= 3;
							}
						}

					}

					if (Var.x <= 30 && Var.moveleft == true) {
						if (Var.Level1 == true && Var.backx <= -10) {
							if (Var.sprint == true) {
								Var.backx += 6;
								Var.enemylv1x += 6;
								Var.lv1rchdx += 6;
							} else {
								Var.backx += 3;
								Var.enemylv1x += 3;
								Var.lv1rchdx += 3;
							}
						} else if (Var.Level2 == true && Var.backx <= -10) {
							if (Var.sprint == true) {
								Var.backx += 6;
							} else {
								Var.backx += 3;
							}
						}

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
