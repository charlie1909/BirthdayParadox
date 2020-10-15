import sun.security.krb5.internal.PAData;

public class BirthdayParadoxDriver {

    public static void main(String[] args){
        //With 23 people, the chance of a match is 50%
        new ParadoxCalculation(23).basicCalculation();
        //with 5 people, the chance of a match is 2.7%
        new ParadoxCalculation(5).basicCalculation();
        //with 10 people, the chance of a match is 11.6%
        new ParadoxCalculation(10).basicCalculation();
        new ParadoxCalculation(0, 100);
        ParadoxCalculation userInputCalc = new ParadoxCalculation();
        userInputCalc.basicCalculation();
        userInputCalc.goAgain();
    }
}
