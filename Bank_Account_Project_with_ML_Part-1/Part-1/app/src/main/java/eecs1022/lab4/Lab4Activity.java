package eecs1022.lab4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Lab4Activity extends AppCompatActivity
{
    Bank g;
    Account j;
    String c1Name;
    String c2Name;
    String c3Name;
    String c1;
    String c2;
    String c3;
    String spinter1;
    String spinter2;
    String spinter3;




    double c1Balance;
    double c2Balance;
    double c3Balance;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab4);
        g = new Bank();
        j = new Account();

    }

    private  String getInputOfTextField(int id) {
        View view = findViewById(id);
        EditText editText = (EditText) view;
        String input = editText.getText().toString();
        return input;
    }

    private void  setContentsOfTextView(int id, String newContents){
        View view = findViewById(id);
        TextView textView = (TextView) view;
        textView.setText(newContents);
    }

    public String getItemSelected(int id) {
        View view = findViewById(id);
        Spinner spinner = (Spinner) view;
        String string = spinner.getSelectedItem().toString();
        return string;
    }

    public void CreateAccountsCliked(View view) {

        c1Name = getInputOfTextField(R.id.NameC1);
        c2Name = getInputOfTextField(R.id.nameC2);
        c3Name = getInputOfTextField(R.id.nameC3);
        c1 = getInputOfTextField(R.id.balanceC1);
        c2 = getInputOfTextField(R.id.balanceC2);
        c3 = getInputOfTextField(R.id.balanceC3);

        c1Balance  = Double.parseDouble(c1);
        c2Balance  = Double.parseDouble(c2);
        c3Balance  = Double.parseDouble(c3);


        setContentsOfTextView(R.id.textView11,j.StartAcc(c1Name,c2Name,c3Name,c1Balance,c2Balance,c3Balance));
        g.Receive(c1Name,c2Name,c3Name,c1Balance,c2Balance,c3Balance);
    }

    public void TransactionCliked(View view) {
        double amount;
        String am;
         spinter1 = getItemSelected(R.id.spinner1);
         spinter2 = getItemSelected(R.id.spinner2);
         spinter3 = getItemSelected(R.id.spinner3);

        am = getInputOfTextField(R.id.Amount);

        amount  = Double.parseDouble(am);



        setContentsOfTextView(R.id.textView11,g.BankChange(spinter1,spinter2,spinter3, amount));


    }


}
