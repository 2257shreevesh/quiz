package quiz;

public class Medium {
	Integer n=10;
	String que[] = new String[n];
	Character ans[] = new Character[n];
	public Medium()
	{
		que[0] = "Which is considered as the biggest port of India ?"
				+ "\nA. Kolkata"
				+ "\nB. Chennai"
				+ "\nC. Mumbai"
				+ "\nD. Cochin";
		ans[0] = 'C';
		que[1] = "The chemical name of Chloroform is ?\n" + 
				"A.	Sulphuric acid\n" + 
				"B.	Sodium Chloride\n" + 
				"C.	Sodium Carbonate\n" + 
				"D.	Trichloromethane";
		ans[1] = 'D';
		que[2] = "'IC' chips of computers are usually made of ?\n" + 
				"A.	Lead\n" + 
				"B.	Chromium\n" + 
				"C.	Silicon\n" + 
				"D.	Platinum";
		ans[2] = 'C';
		que[3] = "Where is the headquarter of the ICC ?\n" + 
				"A.	London\n" + 
				"B.	Cape town\n" + 
				"C.	Sydney\n" + 
				"D.	Dubai";
		ans[3] = 'D';
		que[4] = "The largest river in India is ?\n" + 
				"A.	Mandovi\n" + 
				"B.	Brahmaputra\n" + 
				"C. Ganga\n" + 
				"D.	Yamuna";
				
		ans[4] = 'C';
		que[5] = "Which sport's competition is known as the FIBA 3×3 World Cup ?\n" + 
				"A.	Basketball\n" + 
				"B.	Baseball\n" + 
				"C.	Rugby\n" + 
				"D.	Football";
		ans[5] = 'A';
		que[6] = "The classical/folk dances namely Bharatnatyam and Kavadi belong to ?\n" + 
				"A. Arunachal Pradesh\n" + 
				"B.	Karnataka\n" + 
				"C.	Tamil Nadu\n" + 
				"D.	Jammu and Kashmir";
		ans[6] = 'C';
		que[7] = "What is 3/7 chicken, 2/3 cat and 2/4 goat?\n" + 
				"A.	Childbirth\n" + 
				"B.	Chiffon\n" + 
				"C.	Chicago\n" + 
				"D.	Chipmunk";
		ans[7] = 'C';
		que[8] = "I am a mother's child and a father's child but nobody's son. What am I ?\n" + 
				"A.	A grandson\n" + 
				"B.	A daughter\n" + 
				"C.	A father\n" + 
				"D.	An uncle";
		ans[8] = 'B';
		que[9] = "The first computer made available for commercial use was ...\n" + 
				"A.	MANIAC\n" + 
				"B.	ENIAC\n" + 
				"C.	UNIVAC\n" + 
				"D.	FANIAC";
		ans[9] = 'C';
		
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
