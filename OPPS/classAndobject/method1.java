package OPPS.classAndobject;

class pen {
    String color;
    String type;
    public void write(){//this is the method
        System.out.println("writing something");
    }
    public void print_color(){
        System.out.println(this.color);
    }
}
public class method1 {
    public static void main(String[] args) {
        pen pen1=new pen();
        pen1.color="blue";
        pen1.type="gel";
        pen1.print_color();
        pen1.write();

        pen pen2=new pen();
        pen2.color="black";
        pen2.type="ball pen";
        pen2.print_color();
        pen2.write();
    }
}
