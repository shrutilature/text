public class H1 {
    public static void main(String args[]) {
       sub obj = new sub();
       mul s = new mul();
       div v = new div();
       add m =new add();
       square r = new square();
       int c = obj.substraction(3,2);
       int d =s.multiplication(7,8);
       int e =v.division(4,2);
       int f =m.addition(7,1);
       int a =r.getsquare(45);
       System.out.println("Substraction: "+c);
       System.out.println("multiplication:"+d);
       System.out.println("division:"+e);
       System.out.println("addition:"+f);
       System.out.println("square:"+a);
    }
}
