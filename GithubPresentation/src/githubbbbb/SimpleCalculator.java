package githubbbbb;

public class SimpleCalculator implements CalculatorInterface{
	//create calculator
	public SimpleCalculator() {
		
	}

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		int result = num1 + num2;
		return result;
	}

	@Override
	public int subtract(int num1, int num2) {
		// TODO Auto-generated method stub
		int result = num1 - num2;
		return result;
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		int result = num1 / num2;
		return result;
	}

	@Override
	public int multiply(int num1, int num2) {
		// TODO Auto-generated method stub
		int result = num1 * num2;
		return result;
	}
	
	@Override
	public float modulo(float num1, float num2) {
		float result = num1 % num2;
		return result;
	}	
}