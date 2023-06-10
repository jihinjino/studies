public class Program6 {
    
    int test(int count){
        
        if(count==6){
            return 1;
        }
        System.out.println("Before Test Method -------> "+count);
        return 5 * test(count-1);
        //System.out.println(" After Test Method -------> "+count);
    }
    
    public static void main(String[] args) {
        
        int result = new Program6().test(10);
        
        System.out.println("  Result : "+result);
    }
}
