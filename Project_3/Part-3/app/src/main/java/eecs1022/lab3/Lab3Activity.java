package eecs1022.lab3;

/*Lab 3: Rock papper scissors game */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Lab3Activity extends AppCompatActivity
{

    int counter1 = 0;
    int counter2 = 0;
    String gameOver = "Game is Over";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3);
    }


    public void setContentsOfTextView(int id, String newContents)
    {
        View view = findViewById(id);
        TextView textView = (TextView) view;
        textView.setText(newContents);
    }

    /*public void reset()
    {
        String result = "";
        setContentsOfTextView(R.id.result,result);
    }*/

    private String getInputOfTextField(int id){
        View view = findViewById(id);
        EditText editText = (EditText) view;
        String input = editText.getText().toString();
        return input;
    }

    private String getItemSelected(int id)
    {
        View view = findViewById(id);
        Spinner spinner = (Spinner) view;
        String string = spinner.getSelectedItem().toString();
        return string;
    }

    public void roundOneButton(View view)
    {

        String playerOne = getInputOfTextField(R.id.inputP1);
        String playerTwo = getInputOfTextField(R.id.inputP2);

        String choiceOne = getItemSelected(R.id.p1r1spinner);
        String choiceTwo = getItemSelected(R.id.p2r1spinner);
        String callOut = "Round 1 Finished: ";

        Game round1 = new Game(choiceOne, choiceTwo);
        String result = round1.playGame();
        if (result.equals("winner")){
            counter1 ++;
            callOut += "Winner is " + playerOne;
        } else if (result.equals("loser")){
            counter2 ++;
            callOut += "Winner is " + playerTwo;
        } else {
            callOut += "Tie between " + playerOne + " and " + playerTwo;
        }

        setContentsOfTextView(R.id.result, callOut);
        setContentsOfTextView(R.id.overError, "");


    }



    public void roundTwoButton(View view)
    {

        String playerOne = getInputOfTextField(R.id.inputP1);
        String playerTwo = getInputOfTextField(R.id.inputP2);

        String choiceOne = getItemSelected(R.id.p1r2spinner);
        String choiceTwo = getItemSelected(R.id.p2r2spinner);
        String callOut = "Round 2 Finished: ";

        Game round2 = new Game(choiceOne, choiceTwo);
        String result = round2.playGame();
        if (result.equals("winner")){
            counter1 ++;
        } else if (result.equals("loser")){
            counter2 ++;
        }

        if (counter1 == 2 ){
            callOut += "Winner is " + playerOne;
            setContentsOfTextView(R.id.overError, gameOver);
        } else if (counter2 == 2){
            callOut += "Winner is " + playerTwo;
            setContentsOfTextView(R.id.overError, gameOver);
        } else if(counter1 > counter2){
            callOut += "Tie this round, " + playerOne + " won the previous round";
        } else if(counter1 < counter2){
            callOut += "Tie this round, " + playerTwo + " won the previous round";
        }
        else{
            callOut += "Tie between " + playerOne + " and " + playerTwo;
        }

        setContentsOfTextView(R.id.result, callOut);
    }

    public void roundThreeButton(View view){

        String playerOne = getInputOfTextField(R.id.inputP1);
        String playerTwo = getInputOfTextField(R.id.inputP2);

        String choiceOne = getItemSelected(R.id.p1r3spinner);
        String choiceTwo = getItemSelected(R.id.p2r3spinner);
        String callOut = "Round 3 Finished: ";


        Game round3 = new Game(choiceOne, choiceTwo);
        String result = round3.playGame();
        if (counter1 == 2 || counter2 == 2){
            setContentsOfTextView(R.id.result, "");
            setContentsOfTextView(R.id.overError, "Error: Game is already over");
            return;
        } else if (result.equals("winner")){
            counter1 ++;
        } else if (result.equals("loser")){
            counter2 ++;
        }

        if (counter1 > counter2){
            setContentsOfTextView(R.id.result, callOut + "Winner is " + playerOne);
            setContentsOfTextView(R.id.overError, gameOver);
        } else if (counter1 < counter2) {
            setContentsOfTextView(R.id.result, callOut + "Winner is " + playerTwo);
            setContentsOfTextView(R.id.overError, gameOver);
        } else{
            setContentsOfTextView(R.id.result, callOut + "Tie between " + playerOne + " and " + playerTwo);
            setContentsOfTextView(R.id.overError, gameOver);
        }
    }

    public void resetButton(View view){
        setContentsOfTextView(R.id.result, "New Game Started.");
        setContentsOfTextView(R.id.overError, "Enter Names of Players.");
        counter1 = 0;
        counter2 = 0;
    }
}
