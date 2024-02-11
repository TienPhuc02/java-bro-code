import java.util.Scanner;

import javax.swing.*;
import java.util.*;
public class App {
    public static void main(String[] args)  {
       //logic operator:&& ,|| , !


       // while loop 
       Scanner scanner = new Scanner(System.in);
       String name ="";
       String name1="";
       while(name.isBlank()){
        System.out.println("Enter your name :");
        name =scanner.nextLine();
       }

       //do while -> thuc hien truoc kiem tra sau
       do {
        System.out.println("Enter your name :");
        name1 =scanner.nextLine();
       }while(name1.isBlank());
       System.out.println("hello " + name);
    }
}
