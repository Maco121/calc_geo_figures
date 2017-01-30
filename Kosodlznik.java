public class Kosodlznik{
/**
 * @param a Zadaná strana a.
 * @param b Zadaná strana b.
 * @param vyska Zadaná strana vyska.
 */   
  private double a;
  private double b;
  private double vyska;
 /**
 * Konštruktor s parametrom ktorý oznaèuje strany a a b a výšku.
 * @param a Zadaná strana a.
 * @param b Zadaná strana b.
 * @param vyska Zadaná strana vyska.
 */ 
 public Kosodlznik(double a,double b,double vyska){
   this.a=a;
   this.b=b;
   this.vyska=vyska;
 }
  /**
  * Metóda ktorá zistí obvod kosodlžníka.
  */
 public double obvod(){
   return 2*(a+b);
 }
  /**
  * Metóda ktorá zistí obsah kosodlžníka.
  */
 public double obsah(){
   return a*vyska;
 }
}

