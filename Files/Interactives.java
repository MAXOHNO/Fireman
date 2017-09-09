package Files;

import java.util.Timer;
import java.util.TimerTask;

public class Interactives {

	Timer hit;

	public Interactives() {

		hit = new Timer();
		hit.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {

				if (Var.enemyExists == true) {
					if (Var.inAttack == true) {
						if (Var.enemyx - Var.x <= 300) {
							Var.enemyExists = false;
							Var.enemyIsDying = true;
							try {
								Thread.sleep(1600);
							} catch (InterruptedException e) {

								e.printStackTrace();
							}
							Var.enemyIsDying = false;
						}

					}
				}

			}
		}, 0, 10);

	}

}
