package Files;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

	public KeyHandler() {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (Var.ingame == true) {
			if (e.getKeyCode() == KeyEvent.VK_A) {
				Var.standstill = false;
				Var.moveleft = true;
				Var.animleft = true;
			} else if (e.getKeyCode() == KeyEvent.VK_D) {
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
			Var.ingame = true;
			Var.standstill = true;
			System.out.println("Mouse Clicked!");
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (Var.ingame == true) {
			if (e.getKeyCode() == KeyEvent.VK_A) {
				Var.standstill = true;
				Var.moveleft = false;
				Var.animleft = false;
			} else if (e.getKeyCode() == KeyEvent.VK_D) {
				Var.standstill = true;
				Var.moveright = false;
				Var.animright = false;
			} else if (e.getKeyCode() == KeyEvent.VK_SHIFT) {
				Var.sprint = false;
			}

		}
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

}
