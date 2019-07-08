package eecs1022.lab3;




public class Game
{
    String x;
    String y;

    public Game(String choiceOne, String choiceTwo) {
        this.x = choiceOne;
        this.y = choiceTwo;
    }

    String playGame() {
        String resultP1;
        if (x.equals("Paper") && y.equals("Rock")) {
            resultP1 = "Winner";
        } else if (x.equals("Rock") && y.equals("Paper")) {
            resultP1 = "Loser";
        } else if (x.equals("Paper") && y.equals("Scissors")) {
            resultP1 = "Loser";
        } else if (x.equals("Scissors") && y.equals("Paper")) {
            resultP1 = "Winner";
        } else if (x.equals("Rock") && y.equals("Scissors")) {
            resultP1 = "Winner";
        } else if (x.equals("Scissors") && y.equals("Rock")) {
            resultP1 = "Loser";
        } else{
            resultP1 = "Tie";
        }
        return resultP1;
    }
}
