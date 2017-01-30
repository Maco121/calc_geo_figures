public class Stvorec{
  private double stranaA;
 /**
 * Konštruktor s parametrom ktorý oznaèuje stranu a na štvorci.
 * @param a Zadaná strana a.
 */
 public Stvorec(double a){
   this.stranaA=a;
 }
 /**Konstruktor bez parametra ktorý je nastavení na hodnotu strany 5
  * 
  */
 public Stvorec(){
   this(5);
 }
 /**
  * Metóda ktorá zistí obsah štvorca.
  */
 public double obsah(){
  return stranaA*stranaA;
 }
 /**
  * Metóda ktorá zistí obvod štvorca.
  */
 public double obvod(){
   return 4*stranaA;
 }
 /**
  * Metóda ktorá zistí dåžku uhloprieèky. 
  */
 public double uhlopriecka(){
   return stranaA*Math.sqrt(2);
 }
 /**
  * Metóda ktorá zistí polomer opísanej kružnice.
  */
 public double polomerKruzniceOpisanej(){
   return (stranaA/2)*Math.sqrt(2);
 }
 /**
  * Metóda ktorá zistí polomer vpísanej kružnice
  */
 public double polomerKruzniceVpisanej(){
   return stranaA/2;
 }
}