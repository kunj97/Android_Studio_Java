package ca.roumani.lab1_bmi_cal;

import android.content.pm.InstrumentationInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void setContentoftextview(int id, String newCotent)
    {
        View view = findViewById(id);
        TextView textView = (TextView) view;
        textView.setText(newCotent);
    }

    private String getInputofTextField(int id) {
        View view = findViewById(id);
    EditText editText = (EditText) view;
    String input = editText.getText().toString();
    return input;
}
    public void computeBMIclick (View view){

        String textName = getInputofTextField(R.id.inputName);
        String textWeight = getInputofTextField(R.id.inputWeight);
        String textHeight = getInputofTextField(R.id.inputHeight);

       //String contents = textName + " has weight  " + textWeight + " and height " + textHeight;
       // setContentoftextview(R.id.lableAnswer, contents);

        double weight = Double.parseDouble(textWeight);
        double height = Double.parseDouble(textHeight);
        double bmi = weight/(height * height);
        String contents = textName + " has BMI " + bmi;
        setContentoftextview(R.id.lableAnswer, contents);

    }

}
