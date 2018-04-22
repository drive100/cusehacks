package com.example.danielr258.cusewalks;

import android.content.Intent;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    Button nextPage;
    TextView textbox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextPage = (Button) findViewById(R.id.nextPage);
        //
        // nextPage.setOnClickListener(nextPageOnClickListener);

        textbox = (TextView) findViewById(R.id.textView);


        nextPage.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(this, Second_Activity.class);
                //setNextPage(v);
                textbox.setText("booped");
                setNextPage(v);

            }
        });

    }

    public void setNextPage(View view) {
        Intent intent = new Intent(this, Second_Activity.class);
        //EditText editText = (EditText) findViewById(R.id.editText);
       // String message = editText.getText().toString();
       // intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }


}
