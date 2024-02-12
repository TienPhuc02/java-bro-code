import javax.swing.*;
import java.util.*;
public class App {
    public static void main(String[] args)  {
   //array list 2d
   ArrayList<ArrayList<String>> groceryList =new ArrayList<ArrayList<String>>();
   ArrayList<String> bakeryList=new ArrayList<String>();
   bakeryList.add("pasta");
   bakeryList.add("parlic beard");
   bakeryList.add("donuts");
   ArrayList<String> productList=new ArrayList<String>();
   productList.add("tomatoes");
   productList.add("zucchini");
   productList.add("peppers");
   ArrayList<String> drinksList=new ArrayList<String>();
   drinksList.add("soda");
   drinksList.add("coffe");
   drinksList.add("peppers");
   System.out.println(drinksList.get(0));
   groceryList.add(bakeryList);
   groceryList.add(productList);
   groceryList.add(drinksList);

System.out.println(groceryList);
    }
}
