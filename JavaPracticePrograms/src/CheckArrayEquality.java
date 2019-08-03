import java.util.Arrays;

public class CheckArrayEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array1 = {1,3,5,7,8};
		int [] array2 = {1,3,5,7,8};
		//iterative methods
		if(array1.length==array2.length){
			for(int i=0;i<array1.length;i++) {
				if(array1[i]!=array2[i]) {
					System.out.println("Not Equal");
					System.exit(0);
				}
			}
			System.out.println("Equal");
		}
		else System.out.println("not equal");
		
		// Arrays equals method
		System.out.println(Arrays.equals(array1,array2));
		
		//Use deepequals method to compare multi-dimentional arrays
	}
}
