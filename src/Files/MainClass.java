package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) throws IOException {
		new Draw();
		new Gui();
		new Var();
		new KeyHandler();
		new Movement();
		new Interactives();
		new MouseHandler();

	}

	public static void SaveState() throws IOException {

		File gameFolder = new File("gamefolder");
		File gameFile = new File("gamefolder/gamefile.txt");

		create(gameFolder, gameFile);

		read(gameFile);

		load(gameFile);

		save(gameFile);

	}

	public static void delete(File gameFile) {

		File gamefile = gameFile;

		if (gamefile.exists()) {
			gamefile.delete();
			System.out.println("[System] GAMEFILE WAS DELETED!");
		}

	}

	public static void load(File gameFile) throws FileNotFoundException {
		File gamefile = gameFile;

		if (gamefile.exists()) {
			Scanner sc2 = new Scanner(gamefile);
			if (sc2.hasNextLine()) {
				Var.HP = sc2.nextInt();
				Var.Credits = sc2.nextInt();
				Var.enemylv1x = sc2.nextInt();
				Var.enemylv2x1 = sc2.nextInt();
				Var.enemylv2x2 = sc2.nextInt();
				Var.enemylv2x3 = sc2.nextInt();
				Var.enemylv3x1 = sc2.nextInt();
				Var.enemylv3x2 = sc2.nextInt();
				Var.enemylv3x3 = sc2.nextInt();
				Var.enemylv3x4 = sc2.nextInt();
				Var.enemylv3x5 = sc2.nextInt();
				Var.Level1 = sc2.nextBoolean();
				Var.Level2 = sc2.nextBoolean();
				Var.Level3 = sc2.nextBoolean();
				Var.Johnnybuy = sc2.nextBoolean();
				Var.enemyExists = sc2.nextBoolean();
				Var.enemyExists2_1 = sc2.nextBoolean();
				Var.enemyExists2_2 = sc2.nextBoolean();
				Var.enemyExists2_3 = sc2.nextBoolean();
				Var.enemyExists3_1 = sc2.nextBoolean();
				Var.enemyExists3_2 = sc2.nextBoolean();
				Var.enemyExists3_3 = sc2.nextBoolean();
				Var.enemyExists3_4 = sc2.nextBoolean();
				Var.enemyExists3_5 = sc2.nextBoolean();
			}
		}

	}

	public static void read(File gameFile) throws FileNotFoundException {
		File gamefile = gameFile;

		if (gamefile.exists()) {
			Scanner sc = new Scanner(gamefile);

			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
		}

	}

	public static void save(File gameFile) throws IOException {
		File gamefile = gameFile;

		Integer KonvertHP = new Integer(Var.HP);
		Integer KonvertCredits = new Integer(Var.Credits);
		Integer Konvertel1x = new Integer(Var.enemylv1x);
		Integer Konvertel2x1 = new Integer(Var.enemylv2x1);
		Integer Konvertel2x2 = new Integer(Var.enemylv2x2);
		Integer Konvertel2x3 = new Integer(Var.enemylv2x3);
		Integer Konvertel3x1 = new Integer(Var.enemylv3x1);
		Integer Konvertel3x2 = new Integer(Var.enemylv3x2);
		Integer Konvertel3x3 = new Integer(Var.enemylv3x3);
		Integer Konvertel3x4 = new Integer(Var.enemylv3x4);
		Integer Konvertel3x5 = new Integer(Var.enemylv3x5);

		Boolean Konverterl1 = new Boolean(Var.Level1);
		Boolean Konverterl2 = new Boolean(Var.Level2);
		Boolean Konverterl3 = new Boolean(Var.Level3);
		Boolean KonverterlJohn = new Boolean(Var.Johnnybuy);
		Boolean Konvertee1 = new Boolean(Var.enemyExists);
		Boolean Konvertee21 = new Boolean(Var.enemyExists2_1);
		Boolean Konvertee22 = new Boolean(Var.enemyExists2_2);
		Boolean Konvertee23 = new Boolean(Var.enemyExists2_3);
		Boolean Konvertee31 = new Boolean(Var.enemyExists3_1);
		Boolean Konvertee32 = new Boolean(Var.enemyExists3_2);
		Boolean Konvertee33 = new Boolean(Var.enemyExists3_3);
		Boolean Konvertee34 = new Boolean(Var.enemyExists3_4);
		Boolean Konvertee35 = new Boolean(Var.enemyExists3_5);

		// ************************************************ //

		String shp = KonvertHP.toString();
		String scredits = KonvertCredits.toString();
		String exl1x = Konvertel1x.toString();
		String exl2x1 = Konvertel2x1.toString();
		String exl2x2 = Konvertel2x2.toString();
		String exl2x3 = Konvertel2x3.toString();
		String exl3x1 = Konvertel3x1.toString();
		String exl3x2 = Konvertel3x2.toString();
		String exl3x3 = Konvertel3x3.toString();
		String exl3x4 = Konvertel3x4.toString();
		String exl3x5 = Konvertel3x5.toString();

		String sl1 = Konverterl1.toString();
		String sl2 = Konverterl2.toString();
		String sl3 = Konverterl3.toString();
		String sjohn = KonverterlJohn.toString();
		String seel1x = Konvertee1.toString();
		String seel2x1 = Konvertee21.toString();
		String seel2x2 = Konvertee22.toString();
		String seel2x3 = Konvertee23.toString();
		String seel3x1 = Konvertee31.toString();
		String seel3x2 = Konvertee32.toString();
		String seel3x3 = Konvertee33.toString();
		String seel3x4 = Konvertee34.toString();
		String seel3x5 = Konvertee35.toString();

		// ************************************************ //

		String contentsToWrite = "[GAME SETTINGS]" + "\n" + "[HP] " + shp + "\n" + "[Credits] " + scredits + "\n"
				+ "[Level1] " + sl1 + "\n" + "[Level2] " + sl2 + "\n" + "[Level3] " + sl3 + "\n" + "[Johnny] " + sjohn
				+ "\n" + "[EnemyL1x]" + exl1x + "\n" + "[EnemyL2x1]" + exl2x1 + "\n" + "[EnemyL2x2]" + exl2x2 + "\n"
				+ "[EnemyL2x3]" + exl2x3 + "\n" + "[EnemyL3x1]" + exl3x1 + "\n" + "[EnemyL3x2]" + exl3x2 + "\n"
				+ "[EnemyL3x1]" + exl3x3 + "\n" + "[EnemyL3x4]" + exl3x4 + "\n" + "[EnemyL3x1]" + exl3x5 + "\n"
				+ "[EnemyL1e]" + seel1x + "\n" + "[EnemyL2e1]" + seel2x1 + "\n" + "[EnemyL2e2]" + seel2x2 + "\n"
				+ "[EnemyL2e3]" + seel2x3 + "\n" + "[EnemyL3e1]" + seel3x1 + "\n" + "[EnemyL3e2]" + seel3x2 + "\n"
				+ "[EnemyL3e3]" + seel3x3 + "\n" + "[EnemyL3e4]" + seel3x4 + "\n" + "[EnemyL3e5]" + seel3x5 + "\n";
		OutputStream outStream = new FileOutputStream(gameFile);
		outStream.write(contentsToWrite.getBytes());
		outStream.close();

	}

	public static void create(File gameFolder, File gameFile) {
		File gamefile = gameFile;
		File gamefolder = gameFolder;

		if (!gamefolder.exists()) {
			gamefolder.mkdirs();
			System.out.println("Game Folder successfully created!");
		} else {
			System.out.println("Game Folder already exists!");
		}
		if (!gamefile.exists()) {
			gamefolder.mkdir();
			System.out.println("Game File successfully created!");
		} else {
			System.out.println("Game File already exists!");
		}

	}
}
