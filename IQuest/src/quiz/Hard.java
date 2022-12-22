package quiz;

public class Hard {
	Integer n=10;
	String que[] = new String[n];
	Character ans[] = new Character[n];
	public Hard()
	{
		que[0] = "Which one of these lists contains only Java programming language keywords?"
				+ "\nA. class, if, void, long, Int, continue"
				+ "\nB. goto, instanceof, native, finally, default, throws"
				+ "\nC. try, virtual, throw, final, volatile, transient"
				+ "\nD. strictfp, constant, super, implements, do";
		ans[0] = 'B';
		que[1] = "Which is a valid keyword in java?\n" + 
				"A.	interface\n" + 
				"B.	string\n" + 
				"C.	Float\n" + 
				"D.	unsigned";
		ans[1] = 'A';
		que[2] = "Which is a reserved word in the Java programming language?\n" + 
				"A.	method\n" + 
				"B.	native\n" + 
				"C.	subclasses\n" + 
				"D.	reference";
		ans[2] = 'B';
		que[2] = "Which is a reserved word in the Java programming language?\n" + 
				"A.	method\n" + 
				"B.	native\n" + 
				"C.	subclasses\n" + 
				"D.	reference";
		ans[2] = 'B';
		que[3] = "Which of these statements is incorrect?\r\n" + 
				"A.	try block need not to be followed by catch block\r\n" + 
				"B.	try block can be followed by finally block instead of catch block\r\n" + 
				"C. try can be followed by both catch and finally block\r\n" + 
				"D.	try need not to be followed by anything";
				
		ans[3] = 'D';
		que[4] = "Which is a reserved word in the Java programming language?\n" + 
				"A.	method\n" + 
				"B.	native\n" + 
				"C.	subclasses\n" + 
				"D.	reference";
		ans[4] = 'B';
		que[5] = "Which is a reserved word in the Java programming language?\n" + 
				"A.	method\n" + 
				"B.	native\n" + 
				"C.	subclasses\n" + 
				"D.	reference";
		ans[5] = 'B';
		que[6] = "Which is a reserved word in the Java programming language?\n" + 
				"A.	method\n" + 
				"B.	native\n" + 
				"C.	subclasses\n" + 
				"D.	reference";
		ans[6] = 'B';
		que[7] = "Which is a reserved word in the Java programming language?\n" + 
				"A.	method\n" + 
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
