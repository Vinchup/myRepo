
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Converting a string to character array as strings are immutable.
		String string = "KGF";
		char[] charArray = string.toCharArray();
		int length = charArray.length;
		for(int i = 0; i<length/2; i++) {
			char temp;
			temp=charArray[i];
			charArray[i]=charArray[length-i-1];
			charArray[length-i-1]=temp;
		}
		System.out.println(charArray);
		
		// Using String buffer
		StringBuffer sbf = new StringBuffer("NotImmutable");
		System.out.println(sbf.reverse());
		
		//Using recursive Method
		String sting = "massi";
	    System.out.println(recursiveMethod(sting));
	}
	public static String recursiveMethod(String sting) {
		if(sting == null || sting.length()<=1) {
			return sting;
		}
		return recursiveMethod(sting.substring(1))+sting.charAt(0);
	}

}
