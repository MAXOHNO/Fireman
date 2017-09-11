package Files;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Var {

	// Game Integers
	static JFrame jf1;
	static int screenheight = 720, screenwidth = 1280;
	static int backx = 0;

	// Me Integers
	static int Charwitdh = 256, Charheight = 256;
	static int x = 740, y = 340;
	static int HP = 3;
	static int Credits = 0;
	
	// Enemy Integers
	static int enemylv1x = 2300, enemylv1y = 340;
	
	// Level Integers
	static int lv1rchdx = 3500, lv1rchdy = 340;

	
	// Game Booleans
	static boolean ingame = false, startscreen = true, escape = false;
	static boolean Level1 = false, Level2 = false;
	
	// Graphical Booleans
	static boolean Hoverexit = false, Hoversettings = false, Hovershop = false, Hoverinfo = false;
	
	// Me Booleans
	static boolean attack = false, block = false, inAttack = false;
	static boolean standstill = true;
	static boolean moveleft = false, moveright = false;
	static boolean animleft = false, animright = false;
	static boolean sprint = false;
	static boolean CharDead = false;
	
	// Johnny Boolean
	static boolean Johnnyenable = false;
	static boolean Johnnymove = false, Johnnystand = false;
	
	// Enemy Level 1
	static boolean enemyExists = false, enemyIsDying, enemyAttacks;
	


	static BufferedImage BackLvl1, BackLvl2, ESCscreen, BTNexit, BTNsettings, BTNshop, BTNinfo;
	static Image gifAnimright, gifAnimleft, gifStandstill, gifAttack, gifChardead;
	static Image  gifJohnny, JohnnyBorad, JohnnyStand;
	static Image gifStartscreen, gifLvl1Rched;
	static Image gifEnemystand, gifEnemydying, gifEnemyattacks;
	

	public Var() {

		
			// Images
			try {
				
				BackLvl2 = ImageIO.read(new File("src/Pics/BackLvl2.png"));
				BTNexit = ImageIO.read(new File("src/Pics/btnexit.png"));
				BTNshop = ImageIO.read(new File("src/Pics/btnshop.png"));
				BTNsettings = ImageIO.read(new File("src/Pics/btnsettings.png"));
				BTNinfo = ImageIO.read(new File("src/Pics/btninfo.png"));
				BackLvl1 = ImageIO.read(new File("src/Pics/BackLvl1.png"));
				JohnnyBorad = ImageIO.read(new File("src/Pics/JohnnyOnBoard.png"));
				JohnnyStand = ImageIO.read(new File("src/Pics/JohnnyStand.png"));
				ESCscreen = ImageIO.read(new File("src/Pics/Escapescreen.png"));
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
			// Animright
			gifLvl1Rched = Toolkit.getDefaultToolkit().createImage("src/Pics/Level1Reached.gif");
			gifEnemyattacks = Toolkit.getDefaultToolkit().createImage("src/Pics/enemyattacks.gif");
			gifEnemydying = Toolkit.getDefaultToolkit().createImage("src/Pics/enemyDying.gif");
			gifEnemystand = Toolkit.getDefaultToolkit().createImage("src/Pics/enemystand.gif");
			gifStartscreen = Toolkit.getDefaultToolkit().createImage("src/Pics/startscreen.gif");
			gifAnimright = Toolkit.getDefaultToolkit().createImage("src/Pics/animright.gif");
			gifAnimleft = Toolkit.getDefaultToolkit().createImage("src/Pics/animleft.gif");
			gifStandstill = Toolkit.getDefaultToolkit().createImage("src/Pics/standstill.gif");
			gifAttack = Toolkit.getDefaultToolkit().createImage("src/Pics/attack.gif");
			gifChardead = Toolkit.getDefaultToolkit().createImage("src/Pics/chardead.gif");
			gifJohnny = Toolkit.getDefaultToolkit().createImage("src/Pics/JohnnySkateboard.gif");
			System.out.println("System: Pictures successfully loaded!");

		

	}

}
