class Rect{
    private int width;
    private int height;
    public Rect(int width,int height){
        this.width=width;
        this.height=height;
    }
    public int getArea(){
        return width*height;
    }
    public int getPerimeter(){
        return 2*(height+width);
    }
}
public class Program1 {
    public static void main(String[]args){
        Rect rectangle=new Rect(10,20);
        System.out.println("The area is "+rectangle.getArea());
        System.out.println("The peremeter is "+rectangle.getPerimeter());
    }
}