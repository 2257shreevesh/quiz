package quiz;

import java.io.BufferedWriter;
import java.io.FileWriter;

//1import readwrite.Mobile;

public class DataWriter {
	public void writedata(User u1) {
		//File read = new File("leader.txt");
		//FileWriter out = new FileWriter("leader.txt", true);
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("leader.txt", true));
			//out = new FileWriter(read);
			bw.append(u1.getName() + " - " + u1.getScore()+"\n");	
			bw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
