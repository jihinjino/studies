class Sample{
	void test1(){
		System.out.println("  Test1 Method");
	}
	void test2(){
		test1();
		System.out.println("    Test2 Method");
	}
	void test3(){
		test2();
		System.out.println("      Test3 Method");
	}
}
//method
public class program4 {
	public static void main(String[] args) {
		Sample s1 = new Sample();
		s1.test3();
		System.out.println("	End of main method");

	}

}
