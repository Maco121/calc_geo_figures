import java.util.*;
public class Main{
/**
 * Hlavn� trieda ktor� ma za ulohu spustenie celeho programu pozostavajucich z tried a metod ktor� su v nich ale aj ktor� su v in�ch triedach.
 * Na �vod sa spust� hlavn� menu z ktor�ho si vyberieme jeden v�ber a nasledne n�m to uka�e dal�ie menu alebo si i�tancia Scanner za�ne p�ta� hodnoty
 * ktor� m� ulo�i� do zadefinovan�ch parametrov.
 * V�ber sa nasledne o�etr� pomocou metody.
 * Na��tanie 
 * Cyklus while ktor� sa nach�dza na konci sl��i na vybratie si mo�nosti ukon�it program alebo ho za�at odznova.
 * System.exit(parameter)-sl��i na ukon�enie programu. 
 * @param a parameter ktor� sl��i na na�itanie hodnoty strany a v danom geometrickom zobrazeni.
 * @param b parameter ktor� sl��i na na�itanie hodnoty strany b v danom geometrickom zobrazeni.
 * @param c parameter ktor� sl��i na na�itanie hodnoty strany c v danom geometrickom zobrazeni.
 * @param d parameter ktor� sl��i na na�itanie hodnoty strany d v danom geometrickom zobrazeni.
 * @param vyska parameter ktor� sl��i na na�itanie hodnoty v��ky v danom geometrickom zobrazeni.
 * @param volba2 parameter ktor� sl��i na na�itanie hodnoty kter� sa zobrazia na obrazovke.
 * @param pocetStran parameter ktor� sl��i na na�itanie hodnoty po�tu str�n v n-uholniku.
 * @param podtrieda parameter ktor� sl��i na na�itanie hodnoty ktor� ur�uje v�ber podtriedy v �tvoruholn�koch.
 * @param volba3 parameter ktor� sl��i na na�itanie hodnoty �i chce u�ivatel pokra�ova� alebo nie.
 */
 public static void main(String arg[]){
   double a=0;
   double b=0;
   double c=0;
   double d=0;
   double vyska=0;
   int volba2;
   int pocetStran=1;
   Scanner klav=new Scanner(System.in);
   int podtrieda;
   int volba3;
    do{
        System.out.println("\fDobr� de� , v�tam V�s v programe S.N-U. ");
        System.out.println("Tento program sl��i na v�po�et niektor�ch vlastnost� n-uholn�kov. ");
        System.out.println();
        System.out.println("OBSAH :");
        System.out.println();
        System.out.println("[1]:Trojuholnik");
        System.out.println("[2]: �tvoruholn�k");
        System.out.println("[3]: N-Uholn�k");
        System.out.println("[0]: Koniec");

    do{
        System.out.println("Zadaj volbu : ");
        volba2=osetrenieVstupuPreInt(0,3);
    }while(volba2<0||volba2>3);
   
    switch(volba2){
        case 1:
            System.out.println("Vybrali ste si trojuholn�k - n=3");
            do{
                System.out.println("Zadajte stranu a: ");
                a=osetrenieVstupuPreDouble(0);
                System.out.println("Zadajte stranu b: ");
                b=osetrenieVstupuPreDouble(0);
                System.out.println("Zadajte stranu c: ");
                c=osetrenieVstupuPreDouble(0);
            }while((a<0)&&(b<0)&&(c<0));
            Trojuholnik a3=new Trojuholnik(a,b,c);
            System.out.println("\f");
            if(a3.daSaZostrojitTrojuholnik()==true){
            System.out.printf("Obvod je:                       %.2f\n",a3.obvod());
            System.out.printf("Obsah je:                       %.2f\n",a3.obsah());
            System.out.printf("Polomer Kruznice Opisanej je:   %.2f\n",a3.polomerOpisanejKruznice());
            System.out.printf("Polomer kruznice vpisanej je:   %.2f\n",a3.polomerVpisanejKruznice());
            System.out.printf("Vysky= v1:                      %.2f\n",a3.vyskaNaA());
            System.out.printf("Vysky= v2:                      %.2f\n",a3.vyskaNaB());
            System.out.printf("Vysky= v3:                      %.2f\n",a3.vyskaNaC());
            System.out.printf("Uhly=  u1:                      %.2f\n",a3.alfa());
            System.out.printf("Uhly=  u2:                      %.2f\n",a3.beta());
            System.out.printf("Uhly=  u3:                      %.2f\n",a3.gama());
        }
        break;
        case 2:
            System.out.println("\fVybrali ste si �tvoruholn�k - n=4");
            do{
                System.out.println("OBSAH : ");
                System.out.println();
                System.out.println("[21] �tvorec");
                System.out.println("[22] Obdl�n�k");
                System.out.println("[23] Koso�tvorec");
                System.out.println("[24] Kosodl�n�k");
                System.out.println("[25] Lichobe�n�k");
                System.out.println();
                System.out.println("Vyberte si podtriedu : ");
                podtrieda=osetrenieVstupuPreInt(21,25);
                    switch(podtrieda){

                        case 21:
                            do{
                                System.out.println("Zadajte stranu �tvorca: ");
                                a=osetrenieVstupuPreDouble(0);
                            }while(a<0);
                            Stvorec a1=new Stvorec(a);
                            System.out.printf("Obvod je:                    %.2f\n",a1.obvod());
                            System.out.printf("Obsah je:                    %.2f\n",a1.obsah());
                            System.out.printf("Uhlopriecka =                %.2f\n",a1.uhlopriecka());
                            System.out.printf("Polomer Kruznice Opisanej je:%.2f\n",a1.polomerKruzniceOpisanej());
                            System.out.printf("Polomer kruznice vpisanej je:%.2f\n",a1.polomerKruzniceVpisanej());
                            break;
                        case 22:
                            do{
                               System.out.println("Zadajte stranu a v obdlzniku : ");
                               a=osetrenieVstupuPreDouble(0);
                               System.out.println("Zadajte stranu b v obdlzniku : ");
                               b=osetrenieVstupuPreDouble(0);
                            }while((a<0)&&(b<0));
                            Obdlznik a2=new Obdlznik(a,b);
                            System.out.printf("\fObvod je:                     %.2f\n",a2.obvod());
                            System.out.printf("Obsah je:                     %.2f\n  ",a2.obsah());
                            System.out.printf("Uhlopriecka =                 %.2f\n  ",a2.uhlopriecka());
                            System.out.printf("Polomer opisanej kruznice je: %.2f\n  ",a2.polomerKruzniceOpisanej());
                            break;
                        case 23:
                            do{
                                System.out.println("Zadajte stranu koso�tvorca: ");
                                a=osetrenieVstupuPreDouble(0);
                            }while(a<0);
                            do{
                                System.out.println("Zadajte v��ku koso�tvorca: ");
                                vyska=osetrenieVstupuPreDouble(0);
                            }while(vyska<0);
                            Kosostvorec a4=new Kosostvorec(a,vyska);
                            if(vyska<=a){
                            System.out.printf("Obvod je: %.2f\n",a4.obvod());
                            System.out.printf("Obsah je: %.2f\n",a4.obsah());
                        }
                        else
                        System.out.println("Neda sa zostrojit!!!");
                            break;
                        case 24:System.out.println("24 Kosodl�n�k");
                            do{
                                System.out.println("Zadajte stranu a v kosodl�n�ku: ");
                                a=osetrenieVstupuPreDouble(0);
                            }while(a<0);
                            do{
                                System.out.println("Zadajte stranu b v kosodl�n�ku: ");
                                a=osetrenieVstupuPreDouble(0);
                            }while(a<0);
                             do{
                                System.out.println("Zadajte v��ku kosodl�n�ka: ");
                                vyska=osetrenieVstupuPreDouble(0);
                            }while(vyska<0);
                            Kosodlznik a5=new Kosodlznik(a,b,vyska);
                            if(vyska<=b){
                            System.out.printf("Obvod je:   %.2f\n",a5.obvod());
                            System.out.printf("Obsah je:   %.2f\n",a5.obsah());
                        }
                        else
                        System.out.println("Neda sa zostrojit!!!");
                            break;
                        case 25:System.out.println("25 Lichobe�n�k");
                            do{
                                System.out.println("Zadajte stranu a v lichobe�n�ku: ");
                                a=osetrenieVstupuPreDouble(0);
                            }while(a<0);
                            do{
                                System.out.println("Zadajte stranu b v lichobe�n�ku: ");
                                b=osetrenieVstupuPreDouble(0);
                            }while(b<0);
                            do{
                                System.out.println("Zadajte stranu b v lichobe�n�ku: ");
                                c=osetrenieVstupuPreDouble(0);
                            }while(c<0);
                            do{
                                System.out.println("Zadajte stranu d v lichobe�n�ku: ");
                                d=osetrenieVstupuPreDouble(0);
                            }while(d<0);
                             do{
                                System.out.println("Zadajte v��ku lichobe�n�ka: ");
                                vyska=osetrenieVstupuPreDouble(0);
                            }while(vyska<0);
                            Lichobeznik a6=new Lichobeznik(a,b,c,d,vyska);
                            System.out.printf("Obvod je:   %.2f\n",a6.obvod());
                            System.out.printf("Obsah je:   %.2f\n",a6.obsah());
                            
                            break;

                    }
                  
            }while((podtrieda>25)||(podtrieda<21));
            break;
        case 3:
                            System.out.println("Vybrali ste si n-Uholn�k - n>4" );
                            do{
                                System.out.println("Zadajte stranu a v n-Uholniku: ");
                                a=osetrenieVstupuPreDouble(0);
                            }while(a<0);
                            do{
                                System.out.println("Zadajte pocet stran a v n-Uholniku: ");
                                pocetStran=osetrenieVstupuPreInt(5,101);
                            }while(pocetStran<0);
                            NUholnik a7=new NUholnik(a,pocetStran);
                            System.out.printf( "Obvod je:             %.2f\n",a7.obvod());
                            System.out.printf( "Vyska je:             %.2f\n",a7.vyska());
                            System.out.printf ("Obsah je:             %.2f\n",a7.obsah());
                            System.out.printf( "Pocet uhlopriecok je: %.2f\n",a7.pocetUhlopriecok());
                            System.out.printf( "Stredov� uhol je:     %.2f\n",a7.stredovyUhol());
                            System.out.printf( "Obvodov� uhol je:     %.2f\n",a7.vnutornyUhol());
                                                     
            break;
       case 0: System.exit(volba2);
      break;
    }
           System.out.println();
           System.out.println("Chcete pokracovat? ");
           System.out.print("Ak ano zadajte [1] ak nie zadajte [0]: ");
           volba3=osetrenieVstupuPreInt(0,1);
           if(volba3==0)
           System.exit(volba3);
        }while(volba3!=1||volba3!=0);

}
/**
 * Met�da ktor� sl��i na o�etrenie zadaneho vstupu v rozsahu cisel typu Int.
 *  Vstup na��tame ako string potom to prevedieme na integer ak sa prevod nepodari alebo ��slo nebude tak� ak� ma by� vyhod� v�nimku .
 * @param min Je to ��slo ktor� sl��i ako minimum v rosahu.
 * @param max Je to ��slo ktor� sl��i ako maximum v rosahu.
 */
public static int osetrenieVstupuPreInt(int min,int max){
 boolean vstupOK = false;
 java.util.Scanner klav = new java.util.Scanner(System.in);
 int volba=0;
 
      while ( ! vstupOK )
      {
          try {
      
              String vstupStr = klav.nextLine();      // nacitanie retazca
              volba = Integer.parseInt(vstupStr);      // pokus o konverziu
              if (volba<min || volba>max)
                     throw new java.util.InputMismatchException("Vstup mimo povoleny rozsah");
                                            //vyhodi vlastnu vynimku
              vstupOK = true;               // ak sa vsetko podarilo
             } 
          catch (java.lang.NumberFormatException  ex ) //chyba pri konverzii
              { 
              System.out.println("Zle zadane cele cislo - zadajte znova" );  
              }
          catch (java.util.InputMismatchException  ex ) //zachytenie vlastnej 
                                                        //vyhodenej vynimky
              { 
              System.out.println("Chyba: "+ex.getMessage()
                                 +" - zadajte znova" );//oznam o vzniku chyby
              }
      }
      return volba;
}
/**
 * Met�da ktor� sl��i na o�etrenie zadaneho vstupu v rozsahu cisel typu Double.
 * Vstup na��tame ako string potom to prevedieme na double ak sa prevod nepodari alebo ��slo nebude tak� ak� ma by� vyhod� v�nimku .
 * @param min Je to ��slo ktor� sl��i ako minimum v rosahu.
 */
public static double osetrenieVstupuPreDouble(double min){
 boolean vstupOK = false;
 java.util.Scanner klav = new java.util.Scanner(System.in);
 double volba=0;
 
      while ( ! vstupOK )
      {
          try {
      
              String vstupStr = klav.nextLine();      // @nacitanie retazca
              volba = Double.parseDouble(vstupStr);      //@pokus o konverziu
              if (volba<min)
                     throw new java.util.InputMismatchException("Vstup mimo povoleny rozsah");
                                            //@vyhodi vlastnu vynimku
              vstupOK = true;               //@ ak sa vsetko podarilo
             } 
          catch (java.lang.NumberFormatException  ex ) //chyba pri konverzii
              { 
              System.out.println("Zle zadane cele cislo - zadajte znova" );  
              }
          catch (java.util.InputMismatchException  ex ) //zachytenie vlastnej 
                                                        //vyhodenej vynimky
              { 
              System.out.println("Chyba: "+ex.getMessage()
                                 +" - zadajte znova" );//oznam o vzniku chyby
              }
      }
      return volba;
}
}