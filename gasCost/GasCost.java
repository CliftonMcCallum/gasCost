
/**
 * Write a description of class GasCost here.
 *
 * @author (Clifton)
 * @version (02/04/2020)
 */
public class GasCost
{
   private double mpg;
   private double dpg;
   
   public GasCost(double mpg, double dpg){
      this.mpg = mpg;
      this.dpg = dpg;
    }
   
    public double totalDollar(double miles) {
        double totalGallon;
        totalGallon = miles/mpg;
        return dpg * totalGallon;
    }
    
}
