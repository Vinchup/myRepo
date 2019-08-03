
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int armNum = 407;
		int armSavedValue = armNum;
		int armLength = Integer.toString(153).length();
		int armValue = 0;
		int singleElementPowerValue;
		
		while(armNum!=0) {
			singleElementPowerValue = armNum%10;
			armValue = (int) (armValue + Math.pow(singleElementPowerValue,armLength));
			armNum = armNum/10;
		}
		if(armSavedValue == armValue) System.out.println("True");
		else System.out.println("False");
		
	}

}