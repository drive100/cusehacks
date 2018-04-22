package com.example.danielr258.cusewalks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Second_Activity extends AppCompatActivity {

    Button nextPage2, submit;

    Intent intent = getIntent();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_);

        nextPage2 = (Button) findViewById(R.id.nextPage2);
        submit = (Button) findViewById(R.id.button2);
        //
        // nextPage.setOnClickListener(nextPageOnClickListener);

        //textbox = (TextView) findViewById(R.id.textView);


        nextPage2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(this, Second_Activity.class);
                //setNextPage(v);
                //textbox.setText("booped");
                setNextPage(v);

            }
        });

        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(this, Second_Activity.class);
                //setNextPage(v);
                //textbox.setText("booped");
                setNextPage(v);

            }
        });
    }

    public void setNextPage(View view) {
        Intent intent = new Intent(this, Third_Activity.class);
        //EditText editText = (EditText) findViewById(R.id.editText);
        // String message = editText.getText().toString();
        // intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }


}
