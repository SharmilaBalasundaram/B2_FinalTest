package a2_finalizeTest;

public class A1_FinalizeTest {

	protected void finalize() {
		System.out.println("finalized called...");
	}

	public static void main(String[] args) {

		A1_FinalizeTest a = new A1_FinalizeTest();
		A1_FinalizeTest b = new A1_FinalizeTest();
		A1_FinalizeTest c = new A1_FinalizeTest();
		A1_FinalizeTest d = new A1_FinalizeTest();

		a = null;
		b = null;
		c = null;
		d = null;

		System.gc();
		System.out.println("Completed");
		System.out.println(a);
		System.out.println(b);

	}

}
