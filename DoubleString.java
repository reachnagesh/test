public class DoubleString{
	public static void main(String[] args){
		String s= args[0];
		int l=s.length();
		System.out.println(l);
		for(int i=0; i<l; i++){
		char c = s.charAt(i);	
		System.out.print(c+""+c);	
		//System.out.print(c+c); I can not get out put  correctly,why? //there is bunch of number instead char
		}
	}
}