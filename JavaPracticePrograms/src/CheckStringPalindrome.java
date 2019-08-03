
public class CheckStringPalindrome {
	
	public static void main(String[] args) {
		
		String string = "abcddcba";
		if(string!=null && string !="") {
			boolean isPalindrome= CheckPalindrome(string);
			if(isPalindrome) {
				System.out.println("Yes");
			}
			else System.out.println("No");
			}
		else
			System.out.println("please enter something");
	}
	public static boolean CheckPalindrome(String string) {
		int n = string.length();
		  for (int i = 0; i < n / 2; i++) {
			  if (string.charAt(i) != string.charAt(n - 1 - i)) {
				  return false;
		  }
		}
		 return true;
	}
}