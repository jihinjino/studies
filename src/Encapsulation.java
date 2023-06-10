class Main {
    String name;
    int rollno;
    public void display(){
        System.out.println(name);
        System.out.println(rollno);
    }
    public void setValues(String str, int num)
    {
        name=str;
        rollno = num;
    }
}
class Encapsulation{
    public static void main(String args[]){
        Main obj = new Main();
        obj.setValues("JIHIN",12);
        obj.display();
    }

}
