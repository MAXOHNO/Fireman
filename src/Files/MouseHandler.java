package Files;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseHandler implements MouseListener {

	public MouseHandler() {

	}

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (Var.ingame == true && Var.attack == false && Var.startscreen == false && Var.CharDead == false) {
			Var.attack = true;
			Var.inAttack = true;
			Var.standstill = false;
			Var.moveright = false;
			Var.moveleft = false;
		}
		if (Var.ingame == false && Var.startscreen == true) {
			Var.startscreen = false;
			Var.ingame = true;
			Var.Level1 = true;
			Var.Johnnystand = true;
			Var.enemyExists = true;
			Var.standstill = true;
			Var.escape = false;
		}

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (Var.ingame == true && Var.attack == true && Var.startscreen == false && Var.CharDead == false) {
			Var.standstill = true;
			Var.inAttack = false;
			Var.attack = false;
		}

	}

}
