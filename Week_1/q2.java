import java.util.*;
public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random random = new Random();
		int i;
		char ch=' ';
		char pcch[]= {'R','P','S'};
		char pcch1 = ' ';
		int p=0, u=0;
		char input=' ';
		for(i=1; i<=3;i++)
			{
				int pcc=0, userc=0;
				System.out.println("ROUND " + i);
				System.out.println("Enter User's Choice : ");
				ch=sc.next().charAt(0);
				ch=Character.toUpperCase(ch);
				pcch1=pcch[random.nextInt(pcch.length)];
				System.out.println("Computer's Choice (randomly generated) :" + pcch1);
				
				
				if((ch=='R' && pcch1=='R') || (ch=='P' && pcch1=='P') || (ch=='S' && pcch1=='S'))
				{
					pcc++;
					userc++;
				}
				else if((ch=='R' && pcch1=='S') || (ch=='P' && pcch1=='R') || (ch=='S' && pcch1=='P'))
					userc++;
				else if((ch=='R' && pcch1=='P') || (ch=='P' && pcch1=='S') || (ch=='S' && pcch1=='R'))
					pcc++;
				
				if(pcc>userc)
					System.out.println("Computer won the round");
				if(pcc<userc)
					System.out.println("User won the round");
				if(pcc==userc)
					System.out.println("Round of tie");
				
				
				p=p+pcc;
				u=u+userc;
			}
			
			if(p>u)
				System.out.println("3 Rounds over, Computer scored = "+ p + ",Computer won the game");
			if(p<u)
				System.out.println("3 Rounds over, User scored = "+ u + ",User won the game");
			if(p==u)
				System.out.println("3 Rounds over, User and Computer scored same, Game Tie");
				
				
			}
		
	}
