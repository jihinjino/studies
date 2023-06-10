public class Class{
String name;
int rollno;
public void display(){
    System.out.println(name);
    System.out.println(rollno);
}    

public static void main(String args[])
{
Class obj = new Class();
obj.name="JIHIN";
obj.rollno=12;
obj.display();
}
}