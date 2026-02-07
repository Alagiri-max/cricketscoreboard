package Pattern;

public class crossstring {
	public static void main(String[] args)
	{
		String str="zohoround";
		System.out.println("Actual String"+str);
		System.out.println("Cross String Follows:");
		 for(int i=0;i<str.length();i++)
		 {
			 for(int j=0;j<str.length();j++)
			 {
				 if(i==j || (i+j)==str.length()-1)
				 {
					 System.out.print(str.charAt(j));
				 }
				 else
					 System.out.print("");
				 
				 
			 }
			 System.out.println();
		 }
		
	}
}
