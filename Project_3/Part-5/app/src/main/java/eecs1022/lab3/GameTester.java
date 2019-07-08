package eecs1022.lab3;


public class GameTester
{
    public static void main(String[] args){
        int c1 = 0;
        int c2 = 0;
        String choice1 = "Paper";
        String choice2 = "Scissors";
        Game round1 = new Game(choice1, choice2);

        String result = round1.playGame();

        if (result.equals("Winner")){
            c1++;
        } else if (result.equals("Loser")){
            c2++;
        }

        String result1 = "Player One has " + c1 + " points";
        String result2 = "Player One has " + c2 + " points";
        System.out.println(result1);
        System.out.println(result2);
    }
}
