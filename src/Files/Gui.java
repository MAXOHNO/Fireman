package Files;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

		JButton btnRtrn = new JButton();
		btnRtrn.setSize(300, 50);
		btnRtrn.setBounds(500, 160, 300, 50);
		btnRtrn.setFont(text);
		btnRtrn.setText("Return!");
		btnRtrn.setBackground(Color.GRAY);
		btnRtrn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Var.escape = false;
				Var.ingame = true;
				Var.jf1.requestFocus();

			}
		});

		JButton btnStg = new JButton();
		btnStg.setSize(300, 50);
		btnStg.setBounds(500, 260, 300, 50);
		btnStg.setFont(text);
		btnStg.setText("Settings:");
		btnStg.setBackground(Color.GRAY);
		btnStg.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Var.inShop = false;
				Var.escape = false;
				Var.ingame = false;
				Var.inSettings = true;

			}
		});

		JButton btnShp = new JButton();
		btnShp.setSize(300, 50);
		btnShp.setBounds(500, 360, 300, 50);
		btnShp.setFont(text);
		btnShp.setText("Shop:");
		btnShp.setBackground(Color.GRAY);
		btnShp.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Var.inShop = true;
				Var.escape = false;
				Var.ingame = false;
				Var.inSettings = false;

			}
		});

		JButton btnRestart = new JButton();
		btnRestart.setSize(300, 50);
		btnRestart.setBounds(500, 460, 300, 50);
		btnRestart.setFont(text);
		btnRestart.setText("Restart!:");
		btnRestart.setBackground(Color.GRAY);
		btnRestart.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (btnRestart.isEnabled()) {

					Var.CharDead = true;
					Var.x = 740;
					Var.backx -= Var.backx;
					Var.Score = 0;
					Var.HP = 5;
					Var.Deaths++;

					Var.enemylv1x = 2300;
					Var.enemyExists = true;

					Var.enemylv2x1 = 1900;
					Var.enemylv2x2 = 2500;
					Var.enemylv2x3 = 3100;
					Var.bosslv2x = 5000;
					Var.bosslv2HP = 7;
					Var.enemyExists2_1 = false;
					Var.enemyExists2_2 = false;
					Var.enemyExists2_3 = false;
					Var.BossExists2 = false;

					Var.enemylv3x1 = 1500;
					Var.enemylv3x2 = 1900;
					Var.enemylv3x3 = 2500;
					Var.enemylv3x4 = 2900;
					Var.enemylv3x5 = 3400;
					Var.bosslv3x = 5000;
					Var.bosslv3HP = 9;
					Var.enemyExists3_1 = false;
					Var.enemyExists3_2 = false;
					Var.enemyExists3_3 = false;
					Var.enemyExists3_4 = false;
					Var.enemyExists3_5 = false;
					Var.BossExists3 = false;

					Var.lv1rchdx = 3500;
					Var.lv2rchdx = 7300;
					Var.Level1 = true;
					Var.Level2 = false;
					Var.Level3 = false;

					Var.standstill = true;
					Var.attack = false;
					Var.sprint = false;
					Var.moveright = false;
					Var.moveleft = false;

					Var.ingame = true;
					Var.escape = false;

					Var.jf1.requestFocus();

				}

			}
		});

		JButton btnExit = new JButton();
		btnExit.setSize(150, 50);
		btnExit.setBounds(1060, 600, 150, 50);
		btnExit.setFont(text);
		btnExit.setText("Quit:");
		btnExit.setBackground(Color.GRAY);
		btnExit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (btnExit.isEnabled()) {
					System.exit(1);
				}

			}
		});

		Var.jf1.add(btnStg);
		Var.jf1.add(btnShp);
		Var.jf1.add(btnRestart);
		Var.jf1.add(btnExit);
		Var.jf1.add(btnRtrn);

		Timer esc = new Timer();
		esc.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {

				if (Var.escape == true) {
					if (Var.ingame == false || Var.startscreen == false) {
						btnStg.setVisible(true);
						btnShp.setVisible(true);
						btnRestart.setVisible(true);
						btnExit.setVisible(true);
						btnRtrn.setVisible(true);
					}
				} else {
					if (Var.ingame == false || Var.startscreen == false) {
						btnStg.setVisible(false);
						btnShp.setVisible(false);
						btnRestart.setVisible(false);
						btnExit.setVisible(false);
						btnRtrn.setVisible(false);
					}
				}

			}
		}, 0, 15);

		System.out.println("System: Gui Loaded successfully!");
	}

}
