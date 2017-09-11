package Files;

import java.util.Timer;
import java.util.TimerTask;

public class Interactives {

	Timer hit;
	Timer lvlrchd;
	Timer HP;

	public Interactives() {

		hit = new Timer();
		hit.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {

				// Char attacks Enemy
				if (Var.Level2 == true) {
					if (Var.enemyExists == true && Var.Level1 == true && Var.ingame == true) {
						if (Var.inAttack == true) {
							if (Var.enemylv1x - Var.x <= 350) {
								Var.enemyExists = false;
								Var.enemyIsDying = true;
								int rndm = (int) (Math.random() * 100);
								Var.Credits += rndm;
								System.out.println("Credits: " + Var.Credits);
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

				// Enemy attacks Char
				if (Var.Level1 == true) {
					if (Var.enemyExists == true && Var.CharDead == false && Var.Level1 == true && Var.ingame == true) {
						if (Var.enemylv1x - Var.x <= 150 && Var.enemylv1x - Var.x >= 100) {
							Var.HP--;
							Var.enemyAttacks = true;
							try {
								Thread.sleep(500);
							} catch (InterruptedException e) {

								e.printStackTrace();
							}
							Var.enemyAttacks = false;
						}
					}
				}

			}
		}, 0, 10);

		lvlrchd = new Timer();
		lvlrchd.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {

				// Level 1 to Level 2
				if (Var.Level1 == true && Var.ingame == true) {
					if (Var.x >= 920 && Var.x <= 1006 && Var.backx == -2556) {
						Var.Level1 = false;
						Var.Level2 = true;
						Var.HP = 3;
						System.out.println("Level 1 Completed!");
					}
				}
			}

		}, 0, 6);

		HP = new Timer();
		HP.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {

				if (Var.ingame == true) {
					if (Var.HP == 0) {
						Var.CharDead = true;
						Var.Level1 = true;
						Var.standstill = false;
						Var.moveleft = false;
						Var.moveright = false;
						Var.attack = false;
						Var.Level2 = false;
						if (Var.Credits >= 10) {
							Var.Credits--;
							Var.Credits--;
							Var.Credits--;
							Var.Credits--;
							Var.Credits--;
						}

					}
				}

			}
		}, 0, 10);

	}

}
