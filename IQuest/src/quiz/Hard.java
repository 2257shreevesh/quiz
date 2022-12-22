package quiz;

public class Hard {
	Integer n=10;
	String que[] = new String[n];
	Character ans[] = new Character[n];
	public Hard()
	{
		que[0] = "India played its first one day cricket in ?"
				+ "\nA. 1970"
				+ "\nB. 1971"
				+ "\nC. 1972"
				+ "\nD. 1974";
		ans[0] = 'D';
		que[1] = "When was the first Cricket World Cup held ?\n" + 
				"A.	1975\n" + 
				"B.	1953\n" + 
				"C.	1979t\n" + 
				"D.	1983";
		ans[1] = 'A';
		que[2] = "While passing over an obstacle a light ray slightly bends round the corner. The phenomenon is known as ...\n" + 
				"A.	Scattering\n" + 
				"B.	Polarisation\n" + 
				"C.	Diffraction\n" + 
				"D.	Refraction";
		ans[2] = 'C';
		que[3] = "Who is the founder of Wikipedia?\n" + 
				"A.	Peer Schneider\n" + 
				"B.	Byron Looper\n" + 
				"C.     Rickard Eriksson\n" + 
				"D.	Jimmy Wales";
				
		ans[3] = 'D';
		que[4] = "What flies when it's born, lies when it's alive, and runs when it's dead?\n" + 
				"A.	A grain of sand\n" + 
				"B.	An eaglet\n" + 
				"C.	A snowflake\n" + 
				"D.	A fruit fly";
		ans[4] = 'C';
		que[5] = "Who among the following wrote Sanskrit grammar ?\n" + 
				"A.	Kalidasa\n" + 
				"B.	Charak\n" + 
				"C.	Panini\n" + 
				"D.	Aryabhatt";
		ans[5] = 'C';
		que[6] = "Tsunamis are not caused by ...\n" + 
				"A.	Hurricanes\n" + 
				"B.	Earthquakes\n" + 
				"C.	Undersea Landslides\n" + 
				"D.	Volcanic Eruptions";
		ans[6] = 'A';
		que[7] = "Stapes, the smallest and the lightest bone in human body, is the part of which organ ?\n" + 
				"A.	Neck\n" + 
				"B.	Ear\n" + 
				"C.	Hand\n" + 
				"D.	Nose";
		ans[7] = 'B';
		que[8] = "Fatigue is of formation and depositing of which among the following acids in Muscles ?\n" + 
				"A.	Lactic Acid\n" + 
				"B.	Acetic Acid\n" + 
				"C.	Citric Acid\n" + 
				"D.	Pyruvic Acid";
		ans[8] = 'A';
		que[9] = "Who wrote the book By God's Decree?\n" + 
				"A.	Virat Kohli\n" + 
				"B.	Sachin Tendulkar\n" + 
				"C.	Rahul Dravid\n" + 
				"D.	Kapil Dev";
		ans[9] = 'D';
	}
	
	public void display(Integer i)
	{
		System.out.println("\n"+que[i]+"\n");
	}
	
	public boolean answer(Character a,Integer i)
	{
		if(a == ans[i])
			return true;
		else
			return false;
	}
	
	public void right(Integer i)
	{
		System.out.println("Right answer is : "+ans[i]);
	}
}
