package Files;

import java.awt.Font;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Gui {
	Timer esc;

	public Gui() {

		Font text = new Font("Courier", Font.BOLD, 32);

		Var.jf1 = new JFrame();
		Var.jf1.setSize(Var.screenwidth, Var.screenheight);
		Var.jf1.setVisible(true);
		Var.jf1.setResizable(false);
		Var.jf1.setTitle("Fireman! -MaxCodez");
		Var.jf1.setDefaultCloseOperation(3); // Exit_On_Close !
		Var.jf1.setLayout(null);
		Var.jf1.setLocationRelativeTo(null);
		Var.jf1.addKeyListener(new KeyHandler());
		Var.jf1.addMouseListener(new MouseHandler());
		Var.jf1.requestFocus();

		Draw lbldraw = new Draw();
		lbldraw.setBounds(0, 0, Var.screenwidth, Var.screenheight);
		lbldraw.setVisible(true);
		Var.jf1.add(lbldraw);

		JButton btnStg = new JButton();
		btnStg.setSize(300, 50);
		btnStg.setBounds(500, 160, 300, 50);
		btnStg.setFont(text);
		btnStg.setText("Settings:");

		JButton btnShp = new JButton();
		btnShp.setSize(300, 50);
		btnShp.setBounds(500, 260, 300, 50);
		btnShp.setFont(text);
		btnShp.setText("Shop:");
		
		JButton btnRestart = new JButton();
		btnRestart.setSize(300, 50);
		btnRestart.setBounds(500, 360, 300, 50);
		btnRestart.setFont(text);
		btnRestart.setText("Shop:");
		
		JButton btnExit = new JButton();
		btnExit.setSize(150, 50);
		btnExit.setBounds(680, 1000, 150, 50);
		btnExit.setFont(text);
		btnExit.setText("Shop:");

		Var.jf1.add(btnStg);
		Var.jf1.add(btnShp);
		Var.jf1.add(btnRestart);
		Var.jf1.add(btnExit);

		Timer esc = new Timer();
		esc.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {

				if (Var.escape == true) {
					btnStg.setVisible(true);
					btnShp.setVisible(true);
					btnRestart.setVisible(true);
					btnExit.setVisible(true);
				} else {
					btnStg.setVisible(false);
					btnShp.setVisible(false);
					btnRestart.setVisible(false);
					btnExit.setVisible(false);
				}

			}
		}, 0, 15);

		System.out.println("System: Gui Loaded successfully!");
	}

}
