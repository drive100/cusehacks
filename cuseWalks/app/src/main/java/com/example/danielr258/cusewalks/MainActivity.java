package com.example.danielr258.cusewalks;

import android.content.Intent;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    Button nextPage, mapsPage, reports;
    TextView textbox;
    ImageView iv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextPage = (Button) findViewById(R.id.nextPage);
        mapsPage = (Button) findViewById(R.id.buttonMaps);
        reports = (Button) findViewById(R.id.buttonReports);

        //
        // nextPage.setOnClickListener(nextPageOnClickListener);

        textbox = (TextView) findViewById(R.id.textView);

        iv =(ImageView) findViewById(R.id.imageView2);
        iv.setVisibility(View.VISIBLE);

        nextPage.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(this, Second_Activity.class);
                //setNextPage(v);
                textbox.setText("booped");
                setNextPage(v);

            }
        });

        mapsPage.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(this, Second_Activity.class);
                //setNextPage(v);
                textbox.setText("beeped");
                setMapsPage(v);

            }
        });

        reports.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(this, Second_Activity.class);
                //setNextPage(v);
                textbox.setText("blooped");
                setReportsPage(v);

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

    public void setMapsPage(View view){
        Intent intent = new Intent(this, MapsActivity.class);

        startActivity(intent);
    }

    public void setReportsPage(View view){
        Intent intent = new Intent(this, Fourth_Activity.class);

        startActivity(intent);
    }

}
