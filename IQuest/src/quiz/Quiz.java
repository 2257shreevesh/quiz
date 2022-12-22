package quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz {
	Integer count=0,random_condition=0;
	
	Random rand = new Random();
	
	Scanner sc = new Scanner(System.in);
	public void start(User u1) {
		while(count < 11) 
		{
			Integer i = rand.nextInt(10);
			if(count < 3)
    		{
				Integer easy[] = new Integer[3],ec=0;
				//Integer i = rand.nextInt(10);
				
				Easy e = new Easy();
				for(Integer j=0;j<ec;j++)
				{
					if(i==easy[j])
						break;
					else
						random_condition++;
				}
				if(random_condition==ec)
				{
					easy[ec++]=i;
					count++;
					
					System.out.println("\n\n-----: Qustion No. : "+(count)+" :-----");
					e.display(i);
					
					System.out.print("Enter your correct option : ");
					Character a = sc.next().charAt(0);
					while(a<65 || a>68)
					{
						System.out.println("Invalid Option.\n");
						System.out.print("Enter your correct option : ");
						a = sc.next().charAt(0);
					}
					
					boolean ans = e.answer(a, i);
					
					if(ans)
					{
							System.out.println("\nCongratulation!!!\n");
							//point+=10;
							u1.setScore(u1.getScore()+10);
					}
					else
					{
						System.out.println("\nOOOPs!!! Incorrect Answer.");
						e.right(i);
					}
				}
    		}
			else if(count > 2 && count < 7) {
					Integer medium[] = new Integer[4];
					
					Integer random_condition=0,mc=0;
					Medium m = new Medium();
					for(Integer j=0;j<mc;j++)
					{
						if(i==medium[j])
							break;
						else
							random_condition++;
					}
					if(random_condition==mc)
					{
						medium[mc++]=i;
						count++;
						
						System.out.println("\n\n-----: Qustion No. : "+(count)+" :-----");
						m.display(i);
						
						System.out.print("Enter your correct option : ");
						Character a = sc.next().charAt(0);
						while(a<65 || a>68)
						{
							System.out.println("Invalid Option.\n");
							System.out.print("Enter your correct option : ");
							a = sc.next().charAt(0);
						}
						
						boolean ans = m.answer(a, i);
						
						if(ans)
						{
								System.out.println("\nCongratulation!!!\n");
								//point+=10;
								u1.setScore(u1.getScore()+20);
						}
						else
						{
							System.out.println("\nOOOPs!!! Incorrect Answer.");
							m.right(i);
						}
					}
				}
				else if(count > 6 && count < 10){
					Integer hard[] = new Integer[3];
					
					Integer random_condition=0,hc=0;
					Hard h = new Hard();
					for(Integer j=0;j<hc;j++)
					{
						if(i==hard[j])
							break;
						else
							random_condition++;
					}
					if(random_condition==hc)
					{
						hard[hc++]=i;
						count++;
						
						System.out.println("\n\n-----: Qustion No. : "+(count)+" :-----");
						h.display(i);
						
						System.out.print("Enter your correct option : ");
						Character a = sc.next().charAt(0);
						while(a<65 || a>68)
						{
							System.out.println("Invalid Option.\n");
							System.out.print("Enter your correct option : ");
							a = sc.next().charAt(0);
						}
						
						boolean ans = h.answer(a, i);
						
						if(ans)
						{
								System.out.println("\nCongratulation!!!\n");
								//point+=10;
								u1.setScore(u1.getScore()+30);
						}
						else
						{
							System.out.println("\nOOOPs!!! Incorrect Answer.");
							h.right(i);
						}
					}
				}
				else
				{
	    			System.out.println("================================================");
	    			System.out.println(u1.getName()+" Your final Score is : "+u1.getScore());
	    			System.out.println("================================================");
	    			DataWriter write = new DataWriter();
	    			write.writedata(u1);
	    			break;
				}
		}
	}	
}