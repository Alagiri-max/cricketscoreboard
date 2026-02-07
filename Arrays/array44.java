package Arrays;

import java.util.Scanner;

public class array44 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr= {1,2,3,2,5,0,6,8,5};
		
		System.out.print("Enter the Target value:");
		int target=sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
			if(arr[i]==target)
			{
				target=i;
				break;
			}
		if(target>=0)
			System.out.println(target);
		else
			System.out.println("-1");
        
        
        
        

	}

}
