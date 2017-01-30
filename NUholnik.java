public class NUholnik{
/**
 * @param a Zadaná strana a.
 * @param pocetStran Poèet stran v n-uholniku.
 * @param vyska Výška v n-uholníku
   */  
private double a;
  private int pocetStran;
  double vyska;
 /**
 * Konštruktor s parametrom.
 * @param a Zadaná strana a.
 * @param pocetStran Poèet stran v n-uholniku.
 */
 public NUholnik(double a,int pocetStran){
  this.a=a;
  this.pocetStran=pocetStran;
 }
 /**
  * Metóda ktorá zistí obvod n-uholníka.
  */
 public double obvod(){
   return pocetStran*a;
 }
 /**
   * Metóda ktorá zistí výšku n-uholníka.
   */
 public double vyska(){
   vyska= Math.sqrt((a*a)-(a/2*a/2));
   return vyska;    
 }
 /**
  * Metóda ktorá zistí obsah n-uholníka.
  */
 public double obsah(){
     return pocetStran*((a*vyska)/2);
    } 
 /**
  * Metóda ktorá zistí pocet uhloprieèok.
  */
 public double pocetUhlopriecok(){
   return (pocetStran*(pocetStran-3))/2;
 }
 /**
  * Metóda ktorá zistí uhol medzi dvoma uhloprieèkami.
  */
 public double stredovyUhol(){
   return 360/pocetStran ;
 }
 /**
  * Metóda ktorá zistí uhol medzi uhloprieèkou a stranou.
  */
 public double vnutornyUhol(){
    return 180-(90+(stredovyUhol()/2));
    }
}