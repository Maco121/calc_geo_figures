public class Kosodlznik{
/**
 * @param a Zadan� strana a.
 * @param b Zadan� strana b.
 * @param vyska Zadan� strana vyska.
 */   
  private double a;
  private double b;
  private double vyska;
 /**
 * Kon�truktor s parametrom ktor� ozna�uje strany a a b a v��ku.
 * @param a Zadan� strana a.
 * @param b Zadan� strana b.
 * @param vyska Zadan� strana vyska.
 */ 
 public Kosodlznik(double a,double b,double vyska){
   this.a=a;
   this.b=b;
   this.vyska=vyska;
 }
  /**
  * Met�da ktor� zist� obvod kosodl�n�ka.
  */
 public double obvod(){
   return 2*(a+b);
 }
  /**
  * Met�da ktor� zist� obsah kosodl�n�ka.
  */
 public double obsah(){
   return a*vyska;
 }
}

