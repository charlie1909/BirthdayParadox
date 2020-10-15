import java.util.Scanner;

//https://betterexplained.com/articles/understanding-the-birthday-paradox/
//By using the explanation given from the birthday paradox on this site, I have came up with this simple program.
//it isn't very complex, but it makes sense to me
public class ParadoxCalculation {

    private int people;
    private Scanner scanner = new Scanner(System.in);

    public ParadoxCalculation(int people){
        this.people = people;
    }

    public ParadoxCalculation(){
        System.out.println("Enter in the number of people in the room");
        people = scanner.nextInt();
    }

    public ParadoxCalculation(int start, int end){
        for(int i = start; i < end;i+=5){
            people = people + 5;
            new ParadoxCalculation(people).basicCalculation();
        }
    }

    public void basicCalculation(){
        //a pair is how many combinations of the birthdays can we have.
        System.out.println("People: "+ people);

        float pairs = (people * (people - 1) / 2);
        System.out.println("Pairs: " + pairs);

        float chancePerPair = (pairs / 365);
        System.out.println("Chance of same birthday per pair: "+ chancePerPair);

        float chanceDifference = (float) (Math.exp(-chancePerPair) * 100);
        System.out.println("Chance of difference: " + chanceDifference);

        float chanceMatch = (100 - chanceDifference);
        System.out.println("Chance of match : " + chanceMatch);
        System.out.println();
    }

    public void goAgain() {
        System.out.println("Would you like to try another number? ");
        System.out.println("y/n");
        String choice = scanner.next();
        switch(choice){
            case "y":
                new ParadoxCalculation().basicCalculation();
                goAgain();
                break;
            case "n":
                System.exit(0);
        }
    }
}
