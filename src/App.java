import java.util.Scanner;

import javax.swing.*;
public class App {
    public static void main(String[] args)  {
    double x= 3.14;
    double y = 10;
    double z= Math.max(x, y);
    double t= Math.min(x, y);
    double q= Math.abs(y);//tim gia tri tuyet doi
    double w= Math.sqrt(y);//tim gia tri tuyet doi
    System.out.println(z);
    System.out.println(t);
    System.out.println(q);

    //Math : round , ceil,floor,

    //lab
    //a,b,c
    Scanner scanner= new Scanner(System.in);
    double canhVuong1= scanner.nextDouble();
    double canhVuong2= scanner.nextDouble();
    double canhHuyen= Math.sqrt(canhVuong1*canhVuong1 + canhVuong2*canhVuong2);
    System.out.println(canhHuyen);
    scanner.close();
    }
}
