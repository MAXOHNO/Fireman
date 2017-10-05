package Files;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
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

		JButton btnDone = new JButton();
		btnDone.setSize(150, 50);
		btnDone.setBounds(1060, 600, 150, 50);
		btnDone.setFont(text);
		btnDone.setText("Done:");
		btnDone.setBackground(Color.GRAY);
		btnDone.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Var.inShop = false;
				Var.inSettings = false;
				Var.ingame = false;
				Var.escape = true;

			}
		});

		JButton btnJohnny = new JButton();
		btnJohnny.setSize(300, 50);
		btnJohnny.setBounds(500, 160, 300, 50);
		btnJohnny.setFont(text);
		btnJohnny.setText("Buy Johnny!");
		btnJohnny.setBackground(Color.GRAY);
		btnJohnny.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (Var.Johnnybuy == false && Var.Credits >= 150) {
					Var.Johnnybuy = true;
				}

			}
		});

		JButton btnBuyHP = new JButton();
		btnBuyHP.setSize(300, 50);
		btnBuyHP.setBounds(500, 260, 300, 50);
		btnBuyHP.setFont(text);
		btnBuyHP.setText("+5 HP Upgrade");
		btnBuyHP.setBackground(Color.GRAY);
		btnBuyHP.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (Var.hpbuyed == false && btnBuyHP.isEnabled() && Var.Credits >= 75) {
					Var.Credits -= 75;
					Var.HP += 5;
					btnBuyHP.isEnabled();
				}

			}
		});

		JButton btnsave = new JButton();
		btnsave.setSize(300, 50);
		btnsave.setBounds(500, 160, 300, 50);
		btnsave.setFont(text);
		btnsave.setText("Save the Game");
		btnsave.setBackground(Color.GREEN);
		btnsave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (btnsave.isEnabled()) {
					try {
						File gameFile = new File("gamefolder/gamefile.txt");

						MainClass.SaveState();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

			}
		});

		JButton btnreset = new JButton();
		btnreset.setSize(300, 50);
		btnreset.setBounds(500, 260, 300, 50);
		btnreset.setFont(text);
		btnreset.setText("RESET THE GAME");
		btnreset.setBackground(Color.RED);
		btnreset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (btnsave.isEnabled()) {

					File gameFile = new File("gamefolder/gamefile.txt");

					MainClass.delete(gameFile);
				}

			}
		});

		JButton btncraft = new JButton();
		btncraft.setSize(300, 50);
		btncraft.setBounds(850, 60, 300, 50);
		btncraft.setFont(text);
		btncraft.setText("Crafting!");
		btncraft.setBackground(Color.GRAY);
		btncraft.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Var.craft = true;
				Var.invent = false;
				Var.ingame = false;

			}
		});

		JButton btninv = new JButton();
		btninv.setSize(300, 50);
		btninv.setBounds(250, 60, 300, 50);
		btninv.setFont(text);
		btninv.setText("Inventory!");
		btninv.setBackground(Color.GRAY);
		btninv.setBorderPainted(false);
		btninv.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Var.invent = true;
				Var.craft = false;
				Var.ingame = false;

			}
		});

		JButton btnJohnny2 = new JButton();
		btnJohnny2.setSize(450, 50);
		btnJohnny2.setBounds(470, 160, 450, 50);
		btnJohnny2.setFont(text);
		btnJohnny2.setText("Craft Johnnyboard!");
		btnJohnny2.setBackground(Color.GRAY);
		btnJohnny2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (Var.Johnnybuy == false && Var.Credits >= 150) {
					Var.Johnnybuy = true;
				}

			}
		});
		
		JButton btnBack = new JButton();
		btnBack.setSize(150, 50);
		btnBack.setBounds(1060, 600, 150, 50);
		btnBack.setFont(text);
		btnBack.setText("Back!");
		btnBack.setBackground(Color.GRAY);
		btnBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Var.escape = false;
				Var.ingame = true;
				Var.craft = false;
				Var.invent = false;
				Var.jf1.requestFocus();

			}
		});

		Var.jf1.setBackground(Color.GREEN);
		Var.jf1.add(btnStg);
		Var.jf1.add(btnShp);
		Var.jf1.add(btnRestart);
		Var.jf1.add(btnExit);
		Var.jf1.add(btnRtrn);
		Var.jf1.add(btnDone);
		Var.jf1.add(btnBuyHP);
		Var.jf1.add(btnJohnny);
		Var.jf1.add(btnJohnny2);
		Var.jf1.add(btnsave);
		Var.jf1.add(btnreset);
		Var.jf1.add(btncraft);
		Var.jf1.add(btninv);
		Var.jf1.add(btnBack);

		Timer esc = new Timer();
		esc.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {

				if (Var.invent == false && Var.craft == false) {
					btncraft.setVisible(false);
					btninv.setVisible(false);
					btnJohnny2.setVisible(false);
					btnBack.setVisible(false);
				} else if (Var.invent == true && Var.craft == false) {
					btncraft.setVisible(true);
					btncraft.setBackground(Color.GREEN);
					btninv.setVisible(true);
					btninv.setBackground(Color.GRAY);
					btnJohnny2.setVisible(false);
					btnBack.setVisible(true);
				} else if (Var.invent == false && Var.craft == true && Var.inSettings == false) {
					btncraft.setVisible(true);
					btncraft.setBackground(Color.GRAY);
					btninv.setVisible(true);
					btninv.setBackground(Color.GREEN);
					btnJohnny2.setVisible(true);
					btnJohnny2.setVisible(true);

					if (Var.Johnnybuy == false) {
						btnJohnny2.setBackground(Color.GREEN);
					} else {
						btnJohnny2.setBackground(Color.GRAY);
					}
				}

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

				if (Var.inShop == true || Var.inSettings == true) {
					btnDone.setVisible(true);
				} else if (Var.inSettings == false && Var.inShop == false) {
					btnDone.setVisible(false);
				}

				if (Var.inShop == true && Var.escape == false && Var.ingame == false) {
					btnBuyHP.setVisible(true);
					btnJohnny.setVisible(true);
				} else if (Var.inShop == false) {
					btnBuyHP.setVisible(false);
					btnJohnny.setVisible(false);
				}

				if (Var.inSettings == true && Var.escape == false && Var.ingame == false) {
					btnsave.setVisible(true);
					btnreset.setVisible(true);
				} else if (Var.inSettings == false) {
					btnsave.setVisible(false);
					btnreset.setVisible(false);
				}

				if (Var.hpbuyed == false && Var.Credits <= 75) {
					btnBuyHP.setBackground(Color.RED);
				} else if (Var.hpbuyed == false && Var.Credits >= 75) {
					btnBuyHP.setBackground(Color.GREEN);
				}
				if (Var.Johnnybuy == true) {
					btnJohnny.setBackground(Color.YELLOW);
				} else if (Var.Johnnybuy == false && Var.Credits <= 150) {
					btnJohnny.setBackground(Color.RED);
				} else if (Var.Johnnybuy == false && Var.Credits >= 150) {
					btnJohnny.setBackground(Color.GREEN);
				}

			}
		}, 0, 15);

		System.out.println("System: Gui Loaded successfully!");
	}

}
