public class NUholnik{
/**
 * @param a Zadan� strana a.
 * @param pocetStran Po�et stran v n-uholniku.
 * @param vyska V��ka v n-uholn�ku
   */  
private double a;
  private int pocetStran;
  double vyska;
 /**
 * Kon�truktor s parametrom.
 * @param a Zadan� strana a.
 * @param pocetStran Po�et stran v n-uholniku.
 */
 public NUholnik(double a,int pocetStran){
  this.a=a;
  this.pocetStran=pocetStran;
 }
 /**
  * Met�da ktor� zist� obvod n-uholn�ka.
  */
 public double obvod(){
   return pocetStran*a;
 }
 /**
   * Met�da ktor� zist� v��ku n-uholn�ka.
   */
 public double vyska(){
   vyska= Math.sqrt((a*a)-(a/2*a/2));
   return vyska;    
 }
 /**
  * Met�da ktor� zist� obsah n-uholn�ka.
  */
 public double obsah(){
     return pocetStran*((a*vyska)/2);
    } 
 /**
  * Met�da ktor� zist� pocet uhloprie�ok.
  */
 public double pocetUhlopriecok(){
   return (pocetStran*(pocetStran-3))/2;
 }
 /**
  * Met�da ktor� zist� uhol medzi dvoma uhloprie�kami.
  */
 public double stredovyUhol(){
   return 360/pocetStran ;
 }
 /**
  * Met�da ktor� zist� uhol medzi uhloprie�kou a stranou.
  */
 public double vnutornyUhol(){
    return 180-(90+(stredovyUhol()/2));
    }
}