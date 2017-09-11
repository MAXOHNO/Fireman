package Files;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Draw extends JLabel {

	protected void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		// Wenn Ingame ist,...
		if (Var.ingame == true) {
			// Wenn Level 1 ist...
			if (Var.Level1 == true) {
				// Background und Level Reached malen
				g.drawImage(Var.BackLvl1, Var.backx, 0, 3840, 720, null);
				g.drawImage(Var.gifLvl1Rched, Var.lv1rchdx, Var.lv1rchdy, 256, 256, null);

				// Wenn Gegner existiert oder Tot ist, folgendes malen.
				if (Var.enemyExists == true && Var.Level1 == true) {
					g.drawImage(Var.gifEnemystand, Var.enemylv1x, Var.enemylv1y, 256, 256, null);
				} else if (Var.enemyIsDying == true) {
					g.drawImage(Var.gifEnemydying, Var.enemylv1x, Var.enemylv1y, 256, 256, null);
				}
				if (Var.enemyAttacks == true && Var.Level1 == true && Var.Level2 == false) {
					g.drawImage(Var.gifEnemyattacks, Var.enemylv1x, Var.enemylv1y, 256, 256, null);
				}
			} else if (Var.Level2 == true) {
				g.drawImage(Var.BackLvl2, Var.backx, 0, 7680, 720, null);
			}
			// Player Gifs malen
			if (Var.standstill == true && Var.moveright == false && Var.moveleft == false && Var.CharDead == false) {
				g.drawImage(Var.gifStandstill, Var.x, Var.y, Var.Charwitdh, Var.Charheight, null);
			}
			if (Var.moveright == true && Var.moveleft == false) {
				g.drawImage(Var.gifAnimright, Var.x, Var.y, Var.Charwitdh, Var.Charheight, null);
			}

			if (Var.moveleft == true && Var.moveright == false) {
				g.drawImage(Var.gifAnimleft, Var.x, Var.y, Var.Charwitdh, Var.Charheight, null);
			}

			if (Var.attack == true) {
				g.drawImage(Var.gifAttack, Var.x, Var.y, 384, 256, null);
			}
			if (Var.CharDead == true) {
				Var.standstill = false;
				Var.moveright = false;
				Var.moveleft = false;
				g.drawImage(Var.gifChardead, Var.x, Var.y, 256, 256, null);
				try {
					Thread.sleep(5100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Var.backx = -6;
				Var.x = 740;
				Var.y = 340;
				Var.enemylv1x = 2300;
				Var.lv1rchdx = 3500;
				Var.CharDead = false;
				Var.HP = 3;
				Var.standstill = true;
				Var.Level1 = true;
				Var.Level2 = false;
				Var.enemyExists = true;
			}
			// Johnny (Erdem) malen.
			if (Var.Johnnyenable == true) {
				if (Var.Johnnystand == true) {
					if (Var.moveleft == true) {
						g.drawImage(Var.JohnnyStand, Var.x + 300, Var.y, 256, 256, null);
					} else {
						g.drawImage(Var.JohnnyStand, Var.x - 300, Var.y, 256, 256, null);
					}
				} else if (Var.Johnnymove == true) {
					if (Var.moveleft == true) {
						g.drawImage(Var.JohnnyBorad, Var.x + 300, Var.y - 64, 256, 320, null);
					} else {
						g.drawImage(Var.JohnnyBorad, Var.x - 300, Var.y - 64, 256, 320, null);
					}
				}
			}
		}

		// Wenn in Escape
		if (Var.escape == true) {
			g.drawImage(Var.ESCscreen, 0, 0, Var.screenwidth, Var.screenheight, null);

			if (Var.Hoverexit == false) {
				g.drawImage(Var.BTNexit, 0, 550, 256, 124, null);
			}
			if (Var.Hoversettings == false) {
				g.drawImage(Var.BTNsettings, 384, 160, 512, 124, null);
			}
			if (Var.Hovershop == false) {
				g.drawImage(Var.BTNshop, 384, 300, 512, 124, null);
			}
			if (Var.Hoverinfo == false) {
				g.drawImage(Var.BTNinfo, 384, 460, 512, 124, null);
			}
		}
		// Wenn in Startscreen
		if (Var.startscreen == true) {
			g.drawImage(Var.gifStartscreen, 0, 0, Var.screenwidth, Var.screenheight, null);

		}

		// Koordinaten
		g.drawString("BackX: " + Var.backx, 20, 20);
		g.drawString("Var.x: " + Var.x, 20, 40);
		g.drawString("HP: " + Var.HP, 20, 60);
		g.drawString("Credits: " + Var.Credits, 20, 80);

		repaint();

	}

}
