package com.example.zn.finalcode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView min;
    TextView max;
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //int ran = ((int) Math.random() * 1000 + 1);
        final int ran=50;
        min=findViewById(R.id.min);
        max=findViewById(R.id.max);
        button=findViewById(R.id.button2);
        editText=findViewById(R.id.editText);

        button.setOnClickListener(new OnClickListener() {

            public int guass1;
            public int Rangemin=1;
            public int Rangemax=1000;

            @Override
            public void onClick(View view) {

                String guass=editText.getText().toString();
                guass1=Integer.parseInt(guass);
                if(guass1==ran)
                {
                    Intent intent = new Intent();
                    intent.setClass(Main2Activity.this,Main3Activity.class);

                    startActivity(intent);
                    finish();
                }
                else if (guass1<ran&&guass1>Rangemin)
                {
                    Rangemax=guass1;
                    min.setText(String.valueOf(Rangemax));
                }
                else if(guass1>ran&&guass1<Rangemax)
                {
                    Rangemax=guass1;
                    max.setText(String.valueOf(Rangemax));
                }

            }


        });



    }
}
