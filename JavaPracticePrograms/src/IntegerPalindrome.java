
public class IntegerPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 121212;
		int y=x;
		int z=0;
		while(x!=0) {
			z=z*10;
			z=z+x%10;
			x=x/10;
		}
		if(y==z) {
			System.out.println("palindrome");
		}
		else
			System.out.println("not palindrome");

	}

}
