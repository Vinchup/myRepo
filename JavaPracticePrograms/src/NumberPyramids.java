
public class NumberPyramids {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("********Pattern 1************");	
		for(int i=1;i<10;i++) {
			for(int j=1;j<10-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k);	//Replace i with k to print different pattern.
				System.out.print(" ");	//replace * with k to print differnt pattern 
			}
			System.out.println("");
		}
		System.out.println();
		System.out.println("********Pattern 2************");
		for(int i=1;i<10;i++) {
			for(int j=1;j<10-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k);
			}
			for(int k=i-1;k>=1;k--) {
				System.out.print(k);
			}
			System.out.println("");
		}
	System.out.println();
	System.out.println("********Pattern 3************");
		for(int i=1;i<10;i++) {
			for(int j=1;j<10-i;j++) {
				System.out.print(" ");
		}	
		for(int k=1;k<i;k++) {
			System.out.print(9-i+k);
		}
		System.out.print("9");	
		for(int m=8;m>9-i;m--) {
			System.out.print(m);
		}
		System.out.println();
		}
	}
}
