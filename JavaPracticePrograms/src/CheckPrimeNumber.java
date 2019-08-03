
public class CheckPrimeNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 51;
		for(int i=2;i<n;i++) {
			if(n%i == 0) 
				{
					System.out.println("Not Prime");
					System.exit(0);
				}
			else 
				continue;
		}
		System.out.println("prime");
     }
     
	}
