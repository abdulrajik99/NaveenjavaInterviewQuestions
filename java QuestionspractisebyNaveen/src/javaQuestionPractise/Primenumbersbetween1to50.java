package javaQuestionPractise;

public class Primenumbersbetween1to50
{

	public static void main(String[] args)
	{
			//2,3,5,7,11,13,17,19
		int lastnum=50;
	
		int n=2;
		System.out.println("n = "+n);
		for(int i=20;i<=lastnum;i++)
		{
			int count=0;
			for(int j=i;j>=1;j--)
			{
				if(i%j==0)
				{
					count=count+1;
				}
			}
			if(count==2)
			{
				System.out.println(" prime numbers are "+i);
			}
		}
	}

}
