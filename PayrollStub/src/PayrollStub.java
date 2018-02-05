import javax.swing.JOptionPane;
import java.awt.*;

public class PayrollStub
    {
        public static void main (String[] args)
        {
            String fn, sIncome;
            int grossIncome;

            fn = JOptionPane.showInputDialog("Enter your first name:"); //function or method, give it information
            sIncome = JOptionPane.showInputDialog("Enter your gross income:"); //pass it as a string, display it
            grossIncome = Integer.parseInt(sIncome);

//            System.out.println("Hello "+s1);
            JOptionPane.showMessageDialog(null,"Hello " + fn +" " + ln); //asking for a string, Hello, fn and ln are strings.
        }

    }

