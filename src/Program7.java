public class Program7 {
    
    int test(int count){
        System.out.println("  Fuction Called ");
        if(count==7){
            return 2;
        }

        int left = test(count-1);        
        int center = test(count-1);    
        int right = test(count-1);

        
        return left*center*right;
    }
    
    public static void main(String[] args) {
        
        int result = new Program7().test(10);
        
        System.out.println("  Result : "+result);
    }
}
