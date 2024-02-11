import javax.swing.*;
public class App {
    public static void main(String[] args)  {

        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " +name );
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "I am " +age + "years old." );
        double heigt = Double.parseDouble(JOptionPane.showInputDialog("Enter your heigt"));
        JOptionPane.showMessageDialog(null, "I am " +heigt + "cm" );



    }
}
