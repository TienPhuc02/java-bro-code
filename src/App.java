import javax.swing.*;
import java.util.*;
public class App {
    public static void main(String[] args)  {
        String name ="Phuc";
        int age=22;
        hello(name,age); //phuong thuc tinh~ ko the tham chieu den phuong thuc khong tinh~

        int x=3;
        int y=4;
        int z = sum(x, y);
        System.out.println(z);
        System.out.println(sum(x,y));
    }
    static void hello(String name,int age){
     System.out.println("hello" + name + ".I am" + age + "years old");
    }

    static int sum (int x, int y){
        return (x+y);
    }
}
