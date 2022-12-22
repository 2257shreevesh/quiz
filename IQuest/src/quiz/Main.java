package quiz;
import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public void loop() {
		
		System.out.println("---------------------------------");
		System.out.println("|\tWelcome to Java Quiz\t|");
		System.out.println("---------------------------------");
		System.out.println("\t1.Start\n\t2.Leaderboard\n");
		System.out.println("Enter choice:");
		try (Scanner sc = new Scanner(System.in)) {
			Integer ch = sc.nextInt();
			
				switch(ch) {
				case 1:	start();
						loop();
						break;
				case 2: leaderboard();
						loop();
						break;
				default:System.out.println("Invalid input");;
						break;
				}
		}
}
	
	public static void start() {
		// TODO Auto-generated method stub
		Rules r = new Rules();
		System.out.println("=================================================================");
        System.out.println("|                      Welcome to Java Quiz                     |");
        System.out.println("=================================================================\n");
        System.out.println("\n-----: Rules of quiz :-----\n");
		r.display();

		User u1 = new User();
		System.out.println("Enter your name: ");
		sc = new Scanner(System.in);
		u1.setName(sc.nextLine());
		u1.setScore(0);
		System.out.print("Glad to see you, " +u1.getName()+"!!\nLets start");
		System.out.println("\nPress Enter key to continue........");
        try{
        	sc.nextLine();
    	}
    	catch(Exception ex)
    	{}
        System.out.println();
        
        Quiz quiz = new Quiz();
        quiz.start(u1);
	}

	public static void leaderboard() {
		// TODO Auto-generated method stub
		Leaderboard l = new Leaderboard();
		
		System.out.println("|\tLeadeboard\t|");
		System.out.println("---------------------------------");
		l.show();
		System.out.println("---------------------------------");
	}
}
