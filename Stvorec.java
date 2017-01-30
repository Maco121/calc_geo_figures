public class Stvorec{
  private double stranaA;
 /**
 * Kon�truktor s parametrom ktor� ozna�uje stranu a na �tvorci.
 * @param a Zadan� strana a.
 */
 public Stvorec(double a){
   this.stranaA=a;
 }
 /**Konstruktor bez parametra ktor� je nastaven� na hodnotu strany 5
  * 
  */
 public Stvorec(){
   this(5);
 }
 /**
  * Met�da ktor� zist� obsah �tvorca.
  */
 public double obsah(){
  return stranaA*stranaA;
 }
 /**
  * Met�da ktor� zist� obvod �tvorca.
  */
 public double obvod(){
   return 4*stranaA;
 }
 /**
  * Met�da ktor� zist� d�ku uhloprie�ky. 
  */
 public double uhlopriecka(){
   return stranaA*Math.sqrt(2);
 }
 /**
  * Met�da ktor� zist� polomer op�sanej kru�nice.
  */
 public double polomerKruzniceOpisanej(){
   return (stranaA/2)*Math.sqrt(2);
 }
 /**
  * Met�da ktor� zist� polomer vp�sanej kru�nice
  */
 public double polomerKruzniceVpisanej(){
   return stranaA/2;
 }
}