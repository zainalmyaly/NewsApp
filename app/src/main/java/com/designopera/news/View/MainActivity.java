package com.designopera.news.View;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.designopera.news.R;

  //activity have 2 button to go to 2 different screens

public class MainActivity extends AppCompatActivity {
     //connect xml file with java code

    private Button openNewsActivityBtn,openUploadActivityBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        openNewsActivityBtn = findViewById ( R.id.openNewsActivityBtn);
        openUploadActivityBtn = findViewById ( R.id.openUploadActivityBtn );


        //on click in this button you will go to news activity
        openNewsActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ItemsActivity.class);
                startActivity(i);
            }
        });
        //on click in this button you will go to upload activity


        openUploadActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, UploadActivity.class);
                startActivity(i);
            }
        });

    }


}

