
public class SumOfDIgitsInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 4646454;
		int sum = 0;
		while(number!=0) {
			sum = sum + number%10;
			number =number/10;
		}
		System.out.println("SUM =" + sum);
	}

}
