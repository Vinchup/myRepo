
public class RemoveSringWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Using Built in method");
	String withWhiteSpaces = "P  a r a   g ";
	String withoutWhiteSpaces1 = withWhiteSpaces.replaceAll("\\s", ""); 
	System.out.println(withoutWhiteSpaces1);
	char[] charArray = withWhiteSpaces.toCharArray();
	StringBuffer withoutWhiteSpaces2 = new StringBuffer();
	for(int i= 0;i<charArray.length;i++) {
		if(charArray[i] != ' ' && charArray[i]!= '\t') {
			withoutWhiteSpaces2.append(charArray[i]);
		}
	}
	System.out.println("\nUsing StringBuffer and Character Array");
	System.out.println(withoutWhiteSpaces2);
	}

}
