public class FibbonicciSeries {
	public static void main(String[] args) {
		int[] x = new int[20];
		x[0]=0;x[1]=1;
		for(int i=0;i<18;i++) {
			x[i+2]=x[i]+x[i+1];
			System.out.print(x[i+1]+" ");
		}
	}
}
