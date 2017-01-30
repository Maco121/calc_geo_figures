public class Obdlznik{
/**
 * @param a Zadaná strana a.
 * @param b Zadaná strana b.
 */   
private double a;
  private double b;
 /**
 * Konštruktor s parametrom ktorý oznaèuje stranu a v obdlžníku.
 * @param a Zadaná strana a.
 * @param b Zadaná strana b.
 */ 
 public  Obdlznik(double a,double b){
   this.a=a;
   this.b=b;
 }
 /**
  * Metóda ktorá zistí obvod obdlžníka.
  */
 public  double obvod(){
   return 2*(a+b);
 }
  /**
  * Metóda ktorá zistí obsah obdlžníka.
  */
 public double obsah(){
   return a*b;
 }
 /**
  * Metóda ktorá zistí polomer opísanej kružnice.
  */
 public double polomerKruzniceOpisanej(){
   return Math.sqrt((a*a)+(b*b))/2;
 }
 /**
  * Metóda ktorá zistí dåžku uhloprieèky. 
  */
 public double uhlopriecka(){
   return Math.sqrt((a*a)+(b*b));
 }

}