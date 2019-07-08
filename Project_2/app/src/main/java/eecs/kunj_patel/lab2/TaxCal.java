package eecs.kunj_patel.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class TaxCal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tax_cal);

    }

    private void setContenttextview(int id, String newcontent) {
        View view = findViewById(id);
        TextView textView = (TextView) view;
        textView.setText(newcontent);
    }

    private String getInputoftextfield(int id){

    View view = findViewById(id);
    EditText editText = (EditText) view;
    String input = editText.getText().toString();
    return input;
}
    public void computetaxbuttononclick  (View view) {

        String textName = getInputoftextfield(R.id.inputName);
        String textincome = getInputoftextfield(R.id.inputIncome);
        String textStatus = getInputoftextfield(R.id.spinner2);

        if (textStatus == 0){ // Single

            if (textincome <= 8350)
                tax = textincome *0.10;
            else if (textincome <= 33950)
                tax = 8350 * 0.10 + (textincome - 8350) * 0.15 ;
            else if (textincome <= 82250)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (textincome - 33950) * 0.25;
            else
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (textincome - 82250) * 0.30;

        }

        if (textStatus == 1){ // Married
            if (textincome <= 167000)
                tax = textincome * 0.10;
            else if (textincome <= 67000)
                tax = 16700 * 0.10 + (textincome - 16700)* 0.15;
            else if (textincome <= 137050)
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (textincome - 67900) * 0.25;
            else
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (textincome - 137050) * 0.30;

        }

        if (textStatus == 2); {
            if (textincome <= 11950)
                tax = textincome * 0.10;
            else if (textincome <= 45500)
                tax = 11950 * 0.10 + (textincome - 11950) * 0.15;
            else if (textincome <= 117450)
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (textincome - 45500) * 0.25;
            else
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (textincome - 117450) * 0.3;
        }
        else {}

        //textAnswer = String.format("%.2f", d);




}
