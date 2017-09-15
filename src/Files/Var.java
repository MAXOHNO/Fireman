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
	static int Score = 0, Deaths = 0;
	static int Timer1 = 0;

	// Me Integers
	static int Charwitdh = 256, Charheight = 256;
	static int x = 740, y = 340;
	static int HP = 3;
	static int Credits = 0;

	// Enemy Integers Level 1
	static int enemylv1x = 2300, enemylv1y = 340;

	// Enemy Integers Level 2
	static int enemylv2x1 = 1900, enemylv2x2 = 2500, enemylv2x3 = 3100;

	// Boss Integers Level 2
	static int bosslv2x = 5000, bosslv2HP = 9, TimerBoss2Die = 0;
	
	// Boss Integers Level 3
	static int bosslv3x = 5000, bosslv3HP = 11;

	// Level Integers
	static int lv1rchdx = 3500, lv1rchdy = 340;
	static int lv2rchdx = 7300, lv2rchdy = 340;

	// Game Booleans
	static boolean ingame = false, startscreen = true, escape = false;
	static boolean Level1 = false, Level2 = false, Level3 = false;
	static boolean inShop = false, inSettings = false, inInfo = false, onExit = false;

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

	// Enemy Level 2
	static boolean enemyExists2_1 = false, enemyExists2_2 = false, enemyExists2_3 = false;
	static boolean enemyIsDying2_1 = false, enemyIsDying2_2 = false, enemyIsDying2_3 = false;
	static boolean enemyAttacks2_1 = false, enemyAttacks2_2 = false, enemyAttacks2_3 = false;

	// Boss Level 2
	static boolean BossExists2 = false, BossIsDying2 = false, BossAttacks2 = false, BossIsAttacked2 = false;
	
	// Boss Level 3
	static boolean BossExists3 = false, BossIsDying3 = false, BossAttacks3 = false, BossIsAttacked3 = false;

	static BufferedImage BackLvl1, BackLvl2, BackLvl3, ESCscreen;
	static Image gifAnimright, gifAnimleft, gifStandstill, gifAttack, gifChardead;
	static Image gifJohnny, JohnnyBorad, JohnnyStand;
	static Image gifStartscreen, gifLvl1Rched, gifLvl2Rched;
	static Image gifEnemystand, gifEnemydying, gifEnemyattacks;
	static Image gifBossStandstill2, gifBossIsAttack2, gifBossGetAttacked2, gifBossIsDying;
	static Image gifBossStandstill3, gifBossIsAttack3;

	// Buttons JButton
	static JButton btndone, btnsettings, btnshop, btnexit, btninfo;

	public Var() {

		// Images
		try {

			BackLvl3 = ImageIO.read(new File("src/Pics/BackLvl3.png"));
			BackLvl2 = ImageIO.read(new File("src/Pics/BackLvl2.png"));
			BackLvl1 = ImageIO.read(new File("src/Pics/BackLvl1.png"));
			JohnnyBorad = ImageIO.read(new File("src/Pics/JohnnyOnBoard.png"));
			JohnnyStand = ImageIO.read(new File("src/Pics/JohnnyStand.png"));
			ESCscreen = ImageIO.read(new File("src/Pics/Escapescreen.png"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		gifBossIsAttack3 = Toolkit.getDefaultToolkit().createImage("src/Pics/hyperattack.gif");
		gifBossStandstill3 = Toolkit.getDefaultToolkit().createImage("src/Pics/Hyperhand.gif");
		gifBossIsDying = Toolkit.getDefaultToolkit().createImage("src/Pics/Boss2IsDying.gif");
		gifBossGetAttacked2 = Toolkit.getDefaultToolkit().createImage("src/Pics/Boss2Attacked.gif");
		gifBossIsAttack2 = Toolkit.getDefaultToolkit().createImage("src/Pics/bossAttack.gif");
		gifBossStandstill2 = Toolkit.getDefaultToolkit().createImage("src/Pics/bossStandstill.gif");
		gifLvl1Rched = Toolkit.getDefaultToolkit().createImage("src/Pics/Level1Reached.gif");
		gifLvl2Rched = Toolkit.getDefaultToolkit().createImage("src/Pics/Level2Reached.gif");
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
