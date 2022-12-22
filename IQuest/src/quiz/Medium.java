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
		que[2] = "Where is the headquarter of the ICC ?\n" + 
				"A.	London\n" + 
				"B.	Cape town\n" + 
				"C.	Sydney\n" + 
				"D.	Dubai";
		ans[2] = 'D';
		que[3] = "Which of these statements is incorrect?\r\n" + 
				"A.	try block need not to be followed by catch block\r\n" + 
				"B.	try block can be followed by finally block instead of catch block\r\n" + 
				"C. try can be followed by both catch and finally block\r\n" + 
				"D.	try need not to be followed by anything";
				
		ans[3] = 'D';
		que[4] = "Which sport's competition is known as the FIBA 3×3 World Cup ?\n" + 
				"A.	Basketball\n" + 
				"B.	Baseball\n" + 
				"C.	Rugby\n" + 
				"D.	Football";
		ans[4] = 'A';
		que[5] = "The classical/folk dances namely Bharatnatyam and Kavadi belong to ?\n" + 
				"A. Arunachal Pradesh\n" + 
				"B.	Karnataka\n" + 
				"C.	Tamil Nadu\n" + 
				"D.	Jammu and Kashmir";
		ans[5] = 'C';
		que[6] = "What is 3/7 chicken, 2/3 cat and 2/4 goat?\n" + 
				"A.	Childbirth\n" + 
				"B.	Chiffon\n" + 
				"C.	Chicago\n" + 
				"D.	Chipmunk";
		ans[6] = 'C';
		que[7] = "I am a mother's child and a father's child but nobody's son. What am I ?\n" + 
				"A.	A grandson\n" + 
				"B.	native\n" + 
				"C.	subclasses\n" + 
				"D.	reference";
		ans[7] = 'B';
		que[8] = "Which is a reserved word in the Java programming language?\n" + 
				"A.	method\n" + 
				"B.	native\n" + 
				"C.	subclasses\n" + 
				"D.	reference";
		ans[8] = 'B';
		que[9] = "Which is a reserved word in the Java programming language?\n" + 
				"A.	method\n" + 
				"B.	native\n" + 
				"C.	subclasses\n" + 
				"D.	reference";
		ans[9] = 'B';
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
