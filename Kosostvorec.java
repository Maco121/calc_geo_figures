public class Kosostvorec{
/**
 * @param a Zadan� strana a.
 * @param vyska Zadan� v��ka.
 */  
private double a;
  private double vyska;
 /**
 * Kon�truktor s parametrom ktor� ozna�uje stranu a v Koso�tvorci.
 * @param a Zadan� strana a.
 * @param vyska Zadan� v��ka.
 */
  public Kosostvorec(double a,double vyska){
   this.a=a;
   this.vyska=vyska;
 }
  /**
  * Met�da ktor� zist� obvod koso�tvorca.
  */
 public double obvod(){
   return 4*a;
 }
  /**
  * Met�da ktor� zist� obsah koso�tvorca.
  */
 public double obsah(){
   return a*vyska;
 }
}
