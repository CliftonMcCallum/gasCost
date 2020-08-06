
/**
 * Tester class for GasCost
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
   public static void main(String[] args) {
     GasCost newYorkTrip = new GasCost(19.5, 2.29);
     double cost = newYorkTrip.totalDollar(105);
     System.out.println("Cost of trip to New York is $" + cost);
    }
}
