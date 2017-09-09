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

	static int x = 740, y = 360;
	static int Charwitdh = 256, Charheight = 256;
	
	static boolean ingame = false;
	static boolean standstill = true;
	static boolean moveleft = false, moveright = false;
	static boolean animleft = false, animright = false;
	static boolean jump = false, crouch = false, sprint = false, fall = false;

	static BufferedImage BackLvl1;
	static Image gifAnimright, gifAnimleft, gifStandstill;
	

	public Var() {

		
			// Images
			try {
				
				BackLvl1 = ImageIO.read(new File("src/Pics/BackLvl1.png"));
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
			// Animright
			gifAnimright = Toolkit.getDefaultToolkit().createImage("src/Pics/animright.gif");
			gifAnimleft = Toolkit.getDefaultToolkit().createImage("src/Pics/animleft.gif");
			gifStandstill = Toolkit.getDefaultToolkit().createImage("src/Pics/standstill.gif");
			System.out.println("System: Pictures successfully loaded!");

		

	}

}
