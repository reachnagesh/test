public class PrintRhombus {

	
	public static void  printNum(int i, int num){

			int currentNumPlaces = i + i-1;
			int maxNumPlaces = num + num-1;
			int diffInPlaces = maxNumPlaces - currentNumPlaces;

			//first loop, to print spaces in the beginning of each row
			for (int j=1; j<=diffInPlaces/2; j++){
				System.out.print(" " + " ");
			}
			
			//second loop, to print the numbers in ascending order (1, 2, 3, 4...etc.) in each row
			for (int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}

			//third loop, to print the numbers in descending order (4, 3, 2, 1...etc.) in each row
			for (int k=i-1; k >=1; k--) {
				System.out.print(k+" ");
			}

			//fourth loop, to print the spaces at the end of each row
			for (int j=1; j<=diffInPlaces/2; j++){
				System.out.print(" " + " ");
			}
			System.out.println("");
		}
	/**
	 * Run the program as: java PrintRhombus <number>
	 */
	public static void main(String[] args) {
		int num = 5; //default length of the row
		if (args.length > 0) {
			try {
				num = Integer.parseInt(args[0]);
			} catch(Exception ex) {
				//do nothing
			}
		}
		
		//outer loop, to print rows in increasing length
		for (int i=1; i <= num; i++){
			printNum(i, num);
		}
		
		//outer loop, to print rows in decreasing length
		for (int i=num-1; i >= 1; i--) {
			printNum(i, num);
		}
	}

}
