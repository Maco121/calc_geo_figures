public class Obdlznik{
/**
 * @param a Zadan� strana a.
 * @param b Zadan� strana b.
 */   
private double a;
  private double b;
 /**
 * Kon�truktor s parametrom ktor� ozna�uje stranu a v obdl�n�ku.
 * @param a Zadan� strana a.
 * @param b Zadan� strana b.
 */ 
 public  Obdlznik(double a,double b){
   this.a=a;
   this.b=b;
 }
 /**
  * Met�da ktor� zist� obvod obdl�n�ka.
  */
 public  double obvod(){
   return 2*(a+b);
 }
  /**
  * Met�da ktor� zist� obsah obdl�n�ka.
  */
 public double obsah(){
   return a*b;
 }
 /**
  * Met�da ktor� zist� polomer op�sanej kru�nice.
  */
 public double polomerKruzniceOpisanej(){
   return Math.sqrt((a*a)+(b*b))/2;
 }
 /**
  * Met�da ktor� zist� d�ku uhloprie�ky. 
  */
 public double uhlopriecka(){
   return Math.sqrt((a*a)+(b*b));
 }

}