package com.saisreenivas.inputcontrols.myradiobuttons;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends Activity{

    private RadioGroup radioGroupId;
    private Button radioBtn;
    private RadioButton radioChoiceButton;
    private TextView showText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroupId = (RadioGroup) findViewById(R.id.radioGroupId);
        radioBtn = (Button) findViewById(R.id.radioButton);
        showText = (TextView) findViewById(R.id.showText);

        radioBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int itemSelected = radioGroupId.getCheckedRadioButtonId();
                radioChoiceButton = (RadioButton) findViewById(itemSelected);
                showText.setText(radioChoiceButton.getText());
            }
        });
    }
}
