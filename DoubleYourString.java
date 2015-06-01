import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoubleYourString {

	/**
	 * This program duplicates a given string
	 */
	public void getString(){

		try{
			String yourString = "";
			 		      
			 System.out.println("This porgram reads in a string and duplicates it");
			 System.out.print("Please type in your string and press enter");
	 	       BufferedReader in =  new BufferedReader (new InputStreamReader(System.in));
		      yourString = in.readLine();
		      	  
		      char[] stringArray;
		      stringArray = yourString.toCharArray();
		      		      
		      for(int i=0; i<stringArray.length; i++){
		    	String str = stringArray[i] + ""+stringArray[i];
		    	  System.out.print(str);
		      }
			}catch(IOException e){
			   	   System.out.println(e.getMessage());
				}
		 
		  }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleYourString getYourString = new DoubleYourString();
		getYourString.getString();
	}

}
