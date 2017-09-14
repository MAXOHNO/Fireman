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

				// Wenn Boss tot ist.
				if (Var.bosslv2HP == 0) {
					Var.BossIsDying2 = true;
					Var.BossExists2 = false;
				}

				// Char attacks EnemyLVL1
				if (Var.Level1 == true) {
					if (Var.enemyExists == true && Var.Level1 == true && Var.ingame == true) {
						if (Var.inAttack == true) {
							if (Var.enemylv1x - Var.x <= 350) {
								Var.enemyExists = false;
								Var.enemyIsDying = true;
								int rndm = (int) (Math.random() * 50);
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

				// Char attacks Enemy Level 2 - 1
				if (Var.Level2 == true) {
					if (Var.enemyExists2_1 == true && Var.ingame == true) {
						if (Var.inAttack == true) {
							if (Var.enemylv2x1 - Var.x <= 350) {
								Var.enemyExists2_1 = false;
								Var.enemyIsDying2_1 = true;
								int rndm = (int) (Math.random() * 50);
								Var.Credits += rndm;
								System.out.println("Credits: " + Var.Credits);
								try {
									Thread.sleep(1600);
								} catch (InterruptedException e) {

									e.printStackTrace();
								}
								Var.enemyIsDying2_1 = false;
							}

						}
					}
				}

				// Char attacks Enemy Level 2 - 2
				if (Var.Level2 == true) {
					if (Var.enemyExists2_2 == true && Var.ingame == true) {
						if (Var.inAttack == true) {
							if (Var.enemylv2x2 - Var.x <= 350) {
								Var.enemyExists2_2 = false;
								Var.enemyIsDying2_2 = true;
								int rndm = (int) (Math.random() * 50);
								Var.Credits += rndm;
								System.out.println("Credits: " + Var.Credits);
								try {
									Thread.sleep(1600);
								} catch (InterruptedException e) {

									e.printStackTrace();
								}
								Var.enemyIsDying2_2 = false;
							}

						}
					}
				}

				// Char attacks Enemy Level 2 - 3
				if (Var.Level2 == true) {
					if (Var.enemyExists2_3 == true && Var.ingame == true) {
						if (Var.inAttack == true) {
							if (Var.enemylv2x3 - Var.x <= 350) {
								Var.enemyExists2_3 = false;
								Var.enemyIsDying2_3 = true;
								int rndm = (int) (Math.random() * 50);
								Var.Credits += rndm;
								System.out.println("Credits: " + Var.Credits);
								try {
									Thread.sleep(1600);
								} catch (InterruptedException e) {

									e.printStackTrace();
								}
								Var.enemyIsDying2_3 = false;
							}

						}
					}
				}

				// Char attacks Boss2
				if (Var.Level2 == true) {
					if (Var.BossExists2 == true && Var.Level2 == true && Var.ingame == true) {
						if (Var.inAttack == true) {
							if (Var.bosslv2x - Var.x <= 350) {
								Var.bosslv2HP--;
								Var.BossIsAttacked2 = true;
								int rndm = (int) (Math.random() * 100);
								Var.Credits += rndm;
								System.out.println("Credits: " + Var.Credits);
							}

						}
					}
				}

				// Boss2 attacks Char
				if (Var.Level2 == true) {
					if (Var.BossExists2 == true && Var.CharDead == false && Var.ingame == true) {
						if (Var.bosslv2x - Var.x <= 350 && Var.bosslv2x - Var.x >= 20) {
							Var.HP--;
							Var.BossAttacks2 = true;
							try {
								Thread.sleep(500);
							} catch (InterruptedException e) {

								e.printStackTrace();
							}
							Var.BossAttacks2 = false;
						}
					}
				}

				// Enemy attacks Char Level 1 - 1
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

				// Enemy attacks Char Level 2 - 1
				if (Var.Level2 == true) {
					if (Var.enemyExists2_1 == true && Var.CharDead == false && Var.Level2 == true
							&& Var.ingame == true) {
						if (Var.enemylv2x1 - Var.x <= 150 && Var.enemylv2x1 - Var.x >= 100) {
							Var.HP--;
							Var.enemyAttacks2_1 = true;
							try {
								Thread.sleep(500);
							} catch (InterruptedException e) {

								e.printStackTrace();
							}
							Var.enemyAttacks2_1 = false;
						}
					}
				}

				// Enemy attacks Char Level 2 - 2
				if (Var.Level2 == true) {
					if (Var.enemyExists2_2 == true && Var.CharDead == false && Var.Level2 == true
							&& Var.ingame == true) {
						if (Var.enemylv2x2 - Var.x <= 150 && Var.enemylv2x2 - Var.x >= 100) {
							Var.HP--;
							Var.enemyAttacks2_2 = true;
							try {
								Thread.sleep(500);
							} catch (InterruptedException e) {

								e.printStackTrace();
							}
							Var.enemyAttacks2_2 = false;
						}
					}
				}

				// Enemy attacks Char Level 2 - 3
				if (Var.Level2 == true) {
					if (Var.enemyExists2_3 == true && Var.CharDead == false && Var.Level2 == true
							&& Var.ingame == true) {
						if (Var.enemylv2x3 - Var.x <= 150 && Var.enemylv2x3 - Var.x >= 100) {
							Var.HP--;
							Var.enemyAttacks2_3 = true;
							try {
								Thread.sleep(500);
							} catch (InterruptedException e) {

								e.printStackTrace();
							}
							Var.enemyAttacks2_3 = false;
						}
					}
				}

			}
		}, 0, 500);

		lvlrchd = new Timer();
		lvlrchd.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {

				// Level 1 to Level 2
				if (Var.Level1 == true && Var.ingame == true) {
					if (Var.x >= 900 && Var.x <= 1006 && Var.backx <= -2550) {
						Var.Level1 = false;
						Var.Level2 = true;
						Var.x = 640;
						Var.backx = 0;
						Var.HP = 3;
						Var.enemyExists = false;
						Var.enemyExists2_1 = true;
						Var.enemyExists2_2 = true;
						Var.enemyExists2_3 = true;
						Var.BossExists2 = true;
						System.out.println("Level 1 Completed!");
					}
				}
				if (Var.Level2 == true && Var.ingame == true) {
					if (Var.x >= 800 && Var.x <= 1006) {
						if (Var.backx == -6402) {
							if (Var.BossExists2 == false) {
								Var.Level2 = false;
								Var.Level3 = true;
								Var.x = 640;
								Var.backx = 0;
								Var.HP = 3;
							}
						}
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
						Var.Score = 0;
						Var.Deaths += 1;
						if (Var.Credits >= 10) {
							Var.Credits--;
							Var.Credits--;
							Var.Credits--;
							Var.Credits--;
							Var.Credits--;
							if (Var.Level2 == true) {
								Var.enemyExists2_1 = true;
								Var.enemyExists2_2 = true;
								Var.enemyExists2_3 = true;
								Var.BossExists2 = true;

								Var.enemylv2x1 = 1900;
								Var.enemylv2x2 = 2500;
								Var.enemylv2x3 = 3100;
								
								Var.bosslv2x = 5000;
								Var.bosslv2HP = 9;
							}
						}

					}
				}

			}
		}, 0, 10);

	}

}
