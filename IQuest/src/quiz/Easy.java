package quiz;

public class Easy {
	Integer n=10;
	String que[] = new String[n];
	Character ans[] = new Character[n];
	public Easy()
	{
		que[0] = "The World's Largest desert is ?"
				+ "\nA. Thar"
				+ "\nB. Kalahari"
				+ "\nC. Sahara"
				+ "\nD. Sahara";
		ans[0] = 'C';
		que[1] = "Mount Everest is located in ?\n" + 
				"A.	India\n" + 
				"B.	Nepal\n" + 
				"C.	Tibet\n" + 
				"D.	China";
		ans[1] = 'B';
		que[2] = "The Gate way of India is located in ?\n" + 
				"A.	Chennai\n" + 
				"B.	Mumbai\n" + 
				"C.	Kolkata\n" + 
				"D.	New Delhi";
		ans[2] = 'B';
		que[2] = "Pink City in India is ?\n" + 
				"A.	Karnataka\n" + 
				"B.	Mysore\n" + 
				"C.	Jaipur\n" + 
				"D.	Hyderabad";
		ans[2] = 'C';
		que[3] = "The largest river in India is ?\r\n" + 
				"A.	Yamuna\r\n" + 
				"B.	Mandovi\r\n" + 
				"C. Ganga\r\n" + 
				"D.	Indus";
				
		ans[3] = 'C';
		que[4] = "Which of the following is NOT a computer programming language ?\n" + 
				"A.	PHP\n" + 
				"B.	C++\n" + 
				"C.	Java\n" + 
				"D.	Microsoft";
		ans[4] = 'D';
		que[5] = "What is the intersection of a column and a row on a worksheet called ?\n" + 
				"A.	Table\n" + 
				"B.	Value\n" + 
				"C.	Address\n" + 
				"D.	Cell";
		ans[5] = 'D';
		que[6] = "Normal Human blood pressure is ?\n" + 
				"A.	110/90\n" + 
				"B.	120/70\n" + 
				"C.	120/80\n" + 
				"D.	140/60";
		ans[6] = 'C';
		que[7] = "The hottest planet in the solar system ?\n" + 
				"A.	Earth\n" + 
				"B.	Venus\n" + 
				"C.	Mars\n" + 
				"D.	Jupiter";
		ans[7] = 'B';
		que[8] = "Which of the following generation of computers is associated with artificial intelligence?\n"
				+ "?\n" + 
				"A.	First\n" + 
				"B.	Third\n" + 
				"C.	Fifth\n" + 
				"D.	Seventh";
		ans[8] = 'C';
		que[9] = "What was the country that first played football??\n" + 
				"A.	China\n" + 
				"B.	England\n" + 
				"C.	Brazil\n" + 
				"D.	Italy";
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
