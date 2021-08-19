
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* Calculator Tester. 
* 
* @author <Authors name> 
* @since <pre>08/19/2021</pre> 
* @version 1.0 
*/
public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        if (calculator.add(8, 2) == 10) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }

        if (calculator.sub(8, 2) == 6) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }

        if (calculator.mul(8, 2) == 16) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }

        if (calculator.div(8, 2) == 4) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }
    }
}
