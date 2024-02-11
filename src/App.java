import java.util.Scanner;

import javax.swing.*;
import java.util.*;
public class App {
    public static void main(String[] args)  {
        Random random =new Random();
        int x  = random.nextInt(10); //0->10
        int y  = random.nextInt(10)+1; //1->10
        double z= random.nextDouble();
        boolean BOolean =random.nextBoolean();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(BOolean);
    
    }
}
