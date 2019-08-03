import java.util.*;
public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//My Method : 
		String string1 = "abcc";
		String string2 = "cadb";
		ArrayList<Character> arraylist1 = new ArrayList<Character>();
		ArrayList<Character> arraylist2 = new ArrayList<Character>();
		for(int i=0;i< string1.length() ; i++) {
			if(string1.charAt(i)!=' ') {
				arraylist1.add(string1.toLowerCase().charAt(i));
			}
		}
		Collections.sort(arraylist1);
		System.out.println(arraylist1);
		for(int j=0;j< string2.length() ; j++) {
			if(string2.charAt(j)!=' ') {
				arraylist2.add(string2.toLowerCase().charAt(j));
			}
		}
		Collections.sort(arraylist2);
		System.out.println(arraylist2);
		
		System.out.println(arraylist1.equals(arraylist2));
		
		// Method3 : Using iterative method :
				String copyOfString1 = string1.replaceAll("\\s", "").toLowerCase();
				String copyOfString2 = string2.replaceAll("\\s", "").toLowerCase();
				boolean status = true;
				if (copyOfString1.length()!=copyOfString2.length()) {
					status = false;
				}
				for(char c : copyOfString1.toCharArray()) {
					int index = copyOfString2.indexOf(c);
					if(index !=-1) {
						copyOfString2 = copyOfString2.substring(0, index) + copyOfString2.substring(index+1,copyOfString2.length());
					}
					else {
						status = false;
					}
					
				}
				if(status) {
					System.out.println("Anagram");
				}
				else System.out.println("Not Anagram");
				
		}
		//Method2 : Convert String to charArray using method toCharArray()  and use sort
	
		
		
		

}
