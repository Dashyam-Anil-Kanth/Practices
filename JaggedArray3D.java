import java.util.Scanner;

public class JaggedArray3D {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int [][][]ar=new int[1][2][];
		ar[0][0]=new int[2];
		ar[0][1]=new int[3];
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				for(int k=0;k<ar[i][j].length;k++)
					{
						System.out.println("enter the values for " + i + " and " + j+ " and " + k );
						ar[i][j][k]=scn.nextInt();
					}
				
			}
		}
		
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				for(int k=0;k<ar[i][j].length;k++)
				{
					System.out.println("values of "+ i + " and " + j+ " and " + k +" is " + ar[i][j][k]);
				}
				
			}
		}
	}
}
