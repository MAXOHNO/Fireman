package Files;

import java.util.Timer;
import java.util.TimerTask;

public class Counter {
Timer sek;
	public Counter() {
		sek = new Timer();
		sek.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				
				Var.Timer1++;
				Var.Score++;
				Var.Credits += 2;
				
			}
		}, 0, 1000);
	}

}
