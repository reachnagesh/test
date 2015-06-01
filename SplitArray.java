import java.util.*;

public class SplitArray{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int[] intArray = new int[5];

		System.out.println("Enter number of elements in the array");

		int i = scan.nextInt();
		int j=0,sum=0, sum1=0, sum2=0;
		boolean split = false;

		System.out.println("Enter the elements of the array");
		for(j=0;j<i;j++)
		{
			intArray[j] = scan.nextInt();
			sum += intArray[j];
		}

		j=0;
		while(split == false && j<i)
		{
			sum1 += intArray[j];
			sum2 = sum - sum1;
			if (sum1 == sum2)
				split = true;
			j++;
		}

		System.out.println(split);
	}
}