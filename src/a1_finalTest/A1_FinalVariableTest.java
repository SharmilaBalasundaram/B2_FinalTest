package a1_finalTest;

public class A1_FinalVariableTest {
	
	public static void main(String[] args) {
		
		//additional rate - allowed to change
		int ai=1;
		ai=ai+1;
		System.out.println(ai);
		
		//basic interest - not allowed to change
		final int bi=1;
		//bi=bi+1;
		System.out.println(bi);
		
		// final keyword - at variable level - can only accept to read the value, not accept to change the value
		
	}

}
