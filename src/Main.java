import javax.swing.JOptionPane;
import java.util.Calendar;


public class Main {
    public static void main(String[] args) {

        //Gets the Current year from your computer
        int currYear = Calendar.getInstance().get(Calendar.YEAR);

        //Starts a simple Gui in which it asks for car year
        int CarYear = Integer.parseInt(JOptionPane.showInputDialog("What year is your car?"));

        //Car calculator getting the Car age and Mileage
        int carAge = currYear - CarYear;

        int carMileage = carAge * 12000;

        //Final Message to be sent to user.
        JOptionPane.showMessageDialog(null, "Your Car age is " + carAge + " And should have Roughly " + carMileage + " Miles.");

    }
}