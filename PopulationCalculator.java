import java.util.*;
class PopulationCalculator{
  final static int DAYS_IN_YEAR=365,SEC_IN_DAY=24*60*60;
  long currentPopulation,futurPopulation;
  int deathInSec,birthInSec,migrantInSec,periodInYear;

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     PopulationCalculator pc=new PopulationCalculator();
     System.out.println("please enter current population.");
     pc.currentPopulation=sc.nextLong();
     System.out.println("In how many sec 1 baby borns ?");
     pc.birthInSec=sc.nextInt();
     System.out.println("In how many sec 1 death occurs ?");
     pc.deathInSec=sc.nextInt();
     System.out.println("In how many sec 1 migrant come ?");
     pc.migrantInSec=sc.nextInt();
     System.out.println("please period in years.");
     pc.periodInYear=sc.nextInt();

      pc.calculatedPopulation();
      System.out.println("population after "+pc.periodInYear+"="+pc.futurPopulation);

  }
  void calculatedPopulation(){
    long totalSec =periodInYear*DAYS_IN_YEAR*SEC_IN_DAY;
    int totalDeath=(int)totalSec/deathInSec;
    int totalBirth=(int)totalSec/birthInSec;
    int totalMigant=(int)totalSec/migrantInSec;

    futurPopulation=(currentPopulation-totalDeath)+totalBirth+totalMigant;

  }
}
