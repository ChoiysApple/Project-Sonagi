package com.example.price_this.sonagi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RadioButton;


public class SecondActivity extends AppCompatActivity {

    RadioButton toilet;
    RadioButton trashCan;
    RadioButton vending;
    RadioGroup radioGroup;

    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        toilet = (RadioButton) findViewById(R.id.radioToilet);
        trashCan = (RadioButton) findViewById(R.id.radioTrash);
        vending = (RadioButton) findViewById(R.id.radioVending);
        radioGroup = (RadioGroup) findViewById(R.id.category);

        int radioId = radioGroup.getCheckedRadioButtonId();
        if (toilet.getId() == radioId) name = "화장실";
        else if (trashCan.getId() == radioId) name = "쓰레기통";
        else if (vending.isChecked()) name = "자판기";


    }


}
