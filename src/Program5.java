public class Program5{
    int s=0;
    void check(int x,int s){
        s++;

        if(x==1)
            return;
        
        System.out.println("Before Check  "+x+"  "+s);
        check(x-1,s);
        System.out.println("  After Check  "+x+"  "+s);
    }
    //find recursion
    public static void main(String[] args) {
        
        new Program5().check(10,0);
    }
}

