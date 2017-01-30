public class Lichobeznik{
 /**
  * @param a Zadan� strana a.
  * @param b Zadan� strana b.
  * @param c Zadan� strana c.
  * @param d Zadan� strana d.
  * @param vyska Zadan� vyska.
  */  
private double a=0;
  private double b=0;
  private double c=0;
  private double d=0;
  private double vyska=0;
 /**
  * Kon�truktor s parametrom ktor� ozna�uje stranu a stranu b stranu c stranu d  a v��ku v lichobe�n�ku.
  * @param a Zadan� strana a.
  * @param b Zadan� strana b.
  * @param c Zadan� strana c.
  * @param d Zadan� strana d.
  * @param vyska Zadan� vyska.
  */
 public Lichobeznik(double a,double b,double c,double d,double vyska){
   this.a=a;
   this.b=b;
   this.c=c;
   this.d=d;
   this.vyska=vyska;
 }
 /**
  * Met�da ktor� zist� obsah lichobe�n�ka.
  */
 public double obsah(){
  return ((a+c)/2)*vyska;
 }
 /**
  * Met�da ktor� zist� obvod lichobe�n�ka.
  */
 public double obvod(){
  return a+b+c+d;
 }
}