import java.util.Scanner;

import javax.swing.*;
import java.util.*;
public class App {
    public static void main(String[] args)  {
       //nested loop 


       //array

       String[] cars ={"Camaro","Tesla","Corvette","BWM"};
       cars[0]="Mustang";
       System.out.println(cars[3]);


       //write array 
       String[] cars1=new String[3];
       cars1[0]="Camaro";
       cars1[1]="Tesla";
       cars1[2]="Corvette";
       System.out.println(cars1[2]);
       for(int i =0; i<cars1.length;i++){
        System.out.println(cars[i]);
       }
    }
}
