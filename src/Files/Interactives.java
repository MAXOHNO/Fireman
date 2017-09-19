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
					Var.bosslv2HP -= 1;
				}

				// Char attacks EnemyLVL1
				if (Var.Level1 == true) {
					if (Var.enemyExists == true && Var.Level1 == true && Var.ingame == true) {
						if (Var.inAttack == true) {
							if (Var.enemylv1x - Var.x <= 350) {
								Var.Killcount++;
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
								Var.Killcount++;
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
								Var.Killcount++;
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
								Var.Killcount++;
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
							if (Var.bosslv2x - Var.x <= 550 && Var.bosslv2x - Var.x >= 10) {
								Var.Killcount++;
								Var.bosslv2HP--;
								Var.BossIsAttacked2 = true;
								int rndm = (int) (Math.random() * 100);
								Var.Credits += rndm;
								try {
									Thread.sleep(500);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								Var.BossIsAttacked2 = false;
								System.out.println("Credits: " + Var.Credits);
							}

						}
					}
				}

				// Char attacks Boss3
				if (Var.Level3 == true) {
					if (Var.BossExists3 == true && Var.ingame == true) {
						if (Var.inAttack == true) {
							if (Var.bosslv3x - Var.x <= 200) {
								Var.Killcount++;
								Var.bosslv3HP--;
								Var.BossIsAttacked3 = true;
								int rndm = (int) (Math.random() * 200);
								Var.Credits += rndm;
								try {
									Thread.sleep(500);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								Var.BossIsAttacked3 = false;
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

				// Boss3 attacks Char
				if (Var.Level3 == true) {
					if (Var.BossExists3 == true && Var.CharDead == false && Var.ingame == true) {
						if (Var.bosslv3x - Var.x <= 200 && Var.bosslv3x - Var.x >= 20) {
							Var.HP--;
							Var.BossAttacks3 = true;
							try {
								Thread.sleep(500);
							} catch (InterruptedException e) {

								e.printStackTrace();
							}
							Var.BossAttacks3 = false;
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

				if (Var.Level2 == true) {
					// Enemy attacks Char Level 2 - 1
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

					// Enemy attacks Char Level 2 - 2
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

					// Enemy attacks Char Level 2 - 3
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

				if (Var.Level3 == true) {

					// Enemy Attacks Level 3
					if (Var.enemyExists3_1 == true && Var.CharDead == false && Var.ingame == true) {
						if (Var.enemylv3x1 - Var.x <= 550 && Var.enemylv3x1 - Var.x >= 10) {
							Var.HP--;
							Var.enemyAttacks3_1 = true;
							try {
								Thread.sleep(500);
							} catch (InterruptedException e) {

								e.printStackTrace();
							}
							Var.enemyAttacks3_1 = false;
						}
					}
					if (Var.enemyExists3_2 == true && Var.CharDead == false && Var.ingame == true) {
						if (Var.enemylv3x2 - Var.x <= 550 && Var.enemylv3x2 - Var.x >= 10) {
							Var.HP--;
							Var.enemyAttacks3_2 = true;
							try {
								Thread.sleep(500);
							} catch (InterruptedException e) {

								e.printStackTrace();
							}
							Var.enemyAttacks3_2 = false;
						}
					}
					if (Var.enemyExists3_3 == true && Var.CharDead == false && Var.ingame == true) {
						if (Var.enemylv3x3 - Var.x <= 550 && Var.enemylv3x3 - Var.x >= 10) {
							Var.HP--;
							Var.enemyAttacks3_3 = true;
							try {
								Thread.sleep(500);
							} catch (InterruptedException e) {

								e.printStackTrace();
							}
							Var.enemyAttacks3_3 = false;
						}
					}
					if (Var.enemyExists3_4 == true && Var.CharDead == false && Var.ingame == true) {
						if (Var.enemylv3x4 - Var.x <= 550 && Var.enemylv3x4 - Var.x >= 10) {
							Var.HP--;
							Var.enemyAttacks3_4 = true;
							try {
								Thread.sleep(500);
							} catch (InterruptedException e) {

								e.printStackTrace();
							}
							Var.enemyAttacks3_4 = false;
						}
					}
					if (Var.enemyExists3_5 == true && Var.CharDead == false && Var.ingame == true) {
						if (Var.enemylv3x5 - Var.x <= 550 && Var.enemylv3x5 - Var.x >= 10) {
							Var.HP--;
							Var.enemyAttacks3_5 = true;
							try {
								Thread.sleep(500);
							} catch (InterruptedException e) {

								e.printStackTrace();
							}
							Var.enemyAttacks3_5 = false;
						}
					}
				}

				// Char Attacks Level 3
				if (Var.enemyExists3_1 == true && Var.ingame == true) {
					if (Var.inAttack == true) {
						if (Var.enemylv3x1 - Var.x <= 350 && Var.enemylv3x1 - Var.x >= 10) {
							Var.enemyExists3_1 = false;
							Var.enemyIsDying3_1 = true;
							int rndm = (int) (Math.random() * 50);
							Var.Credits += rndm;
							System.out.println("Credits: " + Var.Credits);
							try {
								Thread.sleep(1600);
							} catch (InterruptedException e) {

								e.printStackTrace();
							}
							Var.enemyIsDying3_1 = false;
						}

					}
				}
				if (Var.enemyExists3_2 == true && Var.ingame == true) {
					if (Var.inAttack == true) {
						if (Var.enemylv3x2 - Var.x <= 350 && Var.enemylv3x2 - Var.x >= 10) {
							Var.enemyExists3_2 = false;
							Var.enemyIsDying3_2 = true;
							int rndm = (int) (Math.random() * 50);
							Var.Credits += rndm;
							System.out.println("Credits: " + Var.Credits);
							try {
								Thread.sleep(1600);
							} catch (InterruptedException e) {

								e.printStackTrace();
							}
							Var.enemyIsDying3_2 = false;
						}

					}
				}
				if (Var.enemyExists3_3 == true && Var.ingame == true) {
					if (Var.inAttack == true) {
						if (Var.enemylv3x3 - Var.x <= 350 && Var.enemylv3x3 - Var.x >= 10) {
							Var.enemyExists3_3 = false;
							Var.enemyIsDying3_3 = true;
							int rndm = (int) (Math.random() * 50);
							Var.Credits += rndm;
							System.out.println("Credits: " + Var.Credits);
							try {
								Thread.sleep(1600);
							} catch (InterruptedException e) {

								e.printStackTrace();
							}
							Var.enemyIsDying3_3 = false;
						}

					}
				}
				if (Var.enemyExists3_4 == true && Var.ingame == true) {
					if (Var.inAttack == true) {
						if (Var.enemylv3x4 - Var.x <= 350 && Var.enemylv3x4 - Var.x >= 10) {
							Var.enemyExists3_4 = false;
							Var.enemyIsDying3_4 = true;
							int rndm = (int) (Math.random() * 50);
							Var.Credits += rndm;
							System.out.println("Credits: " + Var.Credits);
							try {
								Thread.sleep(1600);
							} catch (InterruptedException e) {

								e.printStackTrace();
							}
							Var.enemyIsDying3_4 = false;
						}

					}
				}
				if (Var.enemyExists3_5 == true && Var.ingame == true) {
					if (Var.inAttack == true) {
						if (Var.enemylv3x5 - Var.x <= 350 && Var.enemylv3x5 - Var.x >= 10) {
							Var.enemyExists3_5 = false;
							Var.enemyIsDying3_5 = true;
							int rndm = (int) (Math.random() * 50);
							Var.Credits += rndm;
							System.out.println("Credits: " + Var.Credits);
							try {
								Thread.sleep(1600);
							} catch (InterruptedException e) {

								e.printStackTrace();
							}
							Var.enemyIsDying3_5 = false;
						}

					}
				}

			}
		}, 0, 500);

		lvlrchd = new Timer();
		lvlrchd.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {

				// Level 1 zu Level 2
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

				// Level 2 zu Level 3
				if (Var.Level2 == true && Var.ingame == true) {
					if (Var.x >= 799 && Var.x <= 1006) {
						if (Var.backx <= -6400) {
							if (Var.BossExists2 == false) {
								Var.Level2 = false;
								Var.Level3 = true;
								Var.x = 640;
								Var.backx = 0;
								Var.HP = 30;
								Var.BossExists3 = true;
								Var.enemyExists3_1 = true;
								Var.enemyExists3_2 = true;
								Var.enemyExists3_3 = true;
								Var.enemyExists3_4 = true;
								Var.enemyExists3_5 = true;
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

				// Wenn Tot
				if (Var.ingame == true) {
					if (Var.HP == 0 || Var.HP <= 0) {

						Var.CharDead = true;
						Var.x = 740;
						Var.backx = 0;
						Var.Score = 0;
						Var.HP = 5;
						Var.Deaths++;

						Var.enemylv1x = 2300;
						Var.enemyExists = true;

						Var.enemylv2x1 = 1900;
						Var.enemylv2x2 = 2500;
						Var.enemylv2x3 = 3100;
						Var.bosslv2x = 5000;
						Var.bosslv2HP = 7;
						Var.enemyExists2_1 = false;
						Var.enemyExists2_2 = false;
						Var.enemyExists2_3 = false;
						Var.BossExists2 = false;

						Var.enemylv3x1 = 1500;
						Var.enemylv3x2 = 1900;
						Var.enemylv3x3 = 2500;
						Var.enemylv3x4 = 2900;
						Var.enemylv3x5 = 3400;
						Var.bosslv3x = 5000;
						Var.bosslv3HP = 9;
						Var.enemyExists3_1 = false;
						Var.enemyExists3_2 = false;
						Var.enemyExists3_3 = false;
						Var.enemyExists3_4 = false;
						Var.enemyExists3_5 = false;
						Var.BossExists3 = false;

						Var.lv1rchdx = 3500;
						Var.lv2rchdx = 7300;
						Var.Level1 = true;
						Var.Level2 = false;
						Var.Level3 = false;

						Var.standstill = true;
						Var.attack = false;
						Var.sprint = false;
						Var.moveright = false;
						Var.moveleft = false;
						
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}
				}

			}
		}, 0, 10);

		System.out.println("System: Interactives successfully loaded!");

	}

}
