package Files;

import java.util.Timer;
import java.util.TimerTask;

public class Movement {
	Timer Run;

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
		
		System.out.println("System: Movement Loaded successfully!");
	}

}
