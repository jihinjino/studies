class Sample2
{
 	void test(int x)throws ArithmeticException
 	{
  		if(x<=20)
  		{
    			ArithmeticException ob=new ArithmeticException();
    			throw ob;
  		}
  		else
  		{
    			System.out.println(" Validation Success!");
  		}
 	}
}
//exception
class Program3
{
 	public static void main(String args[])
 	{
  		try
  		{
                        Sample2 s1=new Sample2();
                        s1.test(20);
  		}
  		catch(ArithmeticException ee)
  		{
   			System.out.println("Value should not < 20");
  		}

 	}
}

