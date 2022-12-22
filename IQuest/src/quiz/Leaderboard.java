package quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Leaderboard {
	public void show() {
		File read = new File("leader.txt");
		try {
			Scanner reader = new Scanner(read);
			while (reader.hasNextLine())
			{
				String data = reader.nextLine();
				System.out.println(data);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}
}
