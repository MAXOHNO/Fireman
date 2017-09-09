package Files;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Var {

	static JFrame jf1;
	static int screenheight = 720, screenwidth = 1280;
	static int backx = 0;

	static int x = 740, y = 340;
	static int enemyx = 2300, enemyy = 340;
	static int Charwitdh = 256, Charheight = 256;
	
	static boolean Johnnymove = false, Johnnystand = false;
	static boolean enemyExists = false, enemyIsDying;
	static boolean attack = false, block = false, inAttack = false;
	static boolean ingame = false, startscreen = true;
	static boolean standstill = true;
	static boolean moveleft = false, moveright = false;
	static boolean animleft = false, animright = false;
	static boolean sprint = false;

	static BufferedImage BackLvl1, JohnnyBorad, JohnnyStand;
	static Image gifAnimright, gifAnimleft, gifStandstill, gifStartscreen, gifAttack, gifJohnny;
	static Image gifEnemystand, gifEnemydying;
	

	public Var() {

		
			// Images
			try {
				
				BackLvl1 = ImageIO.read(new File("src/Pics/BackLvl1.png"));
				JohnnyBorad = ImageIO.read(new File("src/Pics/JohnnyOnBoard.png"));
				JohnnyStand = ImageIO.read(new File("src/Pics/JohnnyStand.png"));
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
			// Animright
			gifEnemydying = Toolkit.getDefaultToolkit().createImage("src/Pics/enemyDying.gif");
			gifEnemystand = Toolkit.getDefaultToolkit().createImage("src/Pics/enemystand.gif");
			gifStartscreen = Toolkit.getDefaultToolkit().createImage("src/Pics/startscreen.gif");
			gifAnimright = Toolkit.getDefaultToolkit().createImage("src/Pics/animright.gif");
			gifAnimleft = Toolkit.getDefaultToolkit().createImage("src/Pics/animleft.gif");
			gifStandstill = Toolkit.getDefaultToolkit().createImage("src/Pics/standstill.gif");
			gifAttack = Toolkit.getDefaultToolkit().createImage("src/Pics/attack.gif");
			gifJohnny = Toolkit.getDefaultToolkit().createImage("src/Pics/JohnnySkateboard.gif");
			System.out.println("System: Pictures successfully loaded!");

		

	}

}
