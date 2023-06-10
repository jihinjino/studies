public class Program2 {
	void test(int count){
		if(count==5){
			return;
		}
		System.out.println("B4 Test Method---->"+count);
		test(count-1);
		System.out.println("  After Test Method---->"+count);
	}
	public static void main(String[] args) {
		new Program2().test(10);
	}

}
