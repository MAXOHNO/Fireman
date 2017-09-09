package Files;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

	public KeyHandler() {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (Var.ingame == true && Var.inAttack == false) {
			if (e.getKeyCode() == KeyEvent.VK_A) {
				Var.standstill = false;
				Var.Johnnymove = true;
				Var.Johnnystand = false;
				Var.moveleft = true;
				Var.animleft = true;
			} else if (e.getKeyCode() == KeyEvent.VK_D) {
				Var.Johnnymove = true;
				Var.Johnnystand = false;
				Var.standstill = false;
				Var.moveright = true;
				Var.animright = true;
			} else if (e.getKeyCode() == KeyEvent.VK_SHIFT) {
				Var.sprint = true;
			}
			
			
		}
		if(Var.startscreen == true) {
			if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			Var.startscreen = false;
			Var.Johnnystand = true;
			Var.ingame = true;
			Var.enemyExists = true;
			Var.standstill = true;
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (Var.ingame == true && Var.inAttack == false) {
			if (e.getKeyCode() == KeyEvent.VK_A) {
				Var.Johnnymove = false;
				Var.Johnnystand = true;
				Var.standstill = true;
				Var.moveleft = false;
				Var.animleft = false;
			} else if (e.getKeyCode() == KeyEvent.VK_D) {
				Var.standstill = true;
				Var.moveright = false;
				Var.animright = false;
				Var.Johnnymove = false;
				Var.Johnnystand = true;
			} else if (e.getKeyCode() == KeyEvent.VK_SHIFT) {
				Var.sprint = false;
			}

		}
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

}
