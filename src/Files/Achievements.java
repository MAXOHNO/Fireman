package Files;

import java.util.Timer;
import java.util.TimerTask;

public class Achievements {
Timer Ach;
	static boolean FirstBlood = false;
	static boolean CompleteLvl1 = false;
	static boolean CompleteLvl2 = false;
	static boolean CompleteLvl3 = false;
	static boolean CompleteLvl4 = false;
	static boolean CompleteLvl5 = false;

	public Achievements() {
		
		Timer ach = new Timer();
		ach.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				
				if(Var.Killcount == 1 && Achievements.FirstBlood == false) {
					Achievements.FirstBlood = true;
				}
				if(Var.Level1 == false && Achievements.CompleteLvl1 == false) {
					Achievements.CompleteLvl1 = true;
				}
				if(Var.Level2 == false && Achievements.CompleteLvl2 == false) {
					Achievements.CompleteLvl2 = true;
				}
				if(Var.Level3 == false && Achievements.CompleteLvl3 == false) {
					Achievements.CompleteLvl3 = true;
				}
				
			}
		}, 0, 20);

	}

}
