package zoho_round_2;
import java.util.*;

public class que4
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String[] arr=new String[6];
		
		int extras=0;
		int ts=0;
		int overs=1;
		System.out.println("Cricket Scoreboard");
		String[] player= {"Player1","Player2","Player3","Player4","Player5","Player6"};
		while(true)
		{
			int len=arr.length;
			System.out.println("Enter the Over:");
			for(int i=0;i<len;i++)
			{
				
				arr[i]=sc.nextLine();
				if(arr[i].equals("WD")||arr[i].equals("NB"))
				{
					extras++;
					ts+=extras;
					
				}
				else if(arr[i].charAt(0)>='0' && arr[i].charAt(0)<='6')
				{
					int ts2=Integer.parseInt(arr[i]);
					ts+=ts2;
				}
				else if(arr[i].equals("W"))
				{
					player[i]=player[i+1];
				}
				else
				{
					System.out.println("Enter Correct input");
					break;
				}
				
			}
			System.out.println("Team Score : "+ts);
			System.out.println("Overs Completed : "+overs);
			System.out.println("Extras : "+extras);
//			System.out.println("Batsman Scores :");
			
			overs++;
			
		}
		

	}

}
