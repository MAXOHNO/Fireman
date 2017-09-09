package Files;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class Draw extends JLabel{

	
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		//Background
		g.drawImage(Var.BackLvl1, Var.backx, 0, 3840, 720, null);
		
		
		// SpielCharakter
		if (Var.standstill == true && Var.moveright == false && Var.moveleft == false){
			g.drawImage(Var.gifStandstill, Var.x, Var.y, Var.Charwitdh, Var.Charheight, null);
		}
		
		if(Var.moveright == true && Var.moveleft == false) {
			g.drawImage(Var.gifAnimright, Var.x, Var.y, Var.Charwitdh, Var.Charheight, null);
		}
		
		if(Var.moveleft == true && Var.moveright == false) {
			g.drawImage(Var.gifAnimleft, Var.x, Var.y, Var.Charwitdh, Var.Charheight, null);
		}
		
		
		
		repaint();
		
		
	}
	
}
