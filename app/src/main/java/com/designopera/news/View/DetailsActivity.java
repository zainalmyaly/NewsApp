package com.designopera.news.View;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.designopera.news.R;
import com.squareup.picasso.Picasso;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

   //Activity for display only item in full screen

public class DetailsActivity extends AppCompatActivity {

    TextView titleText,descriptionDetailTextView,dateDetailTextView;
    ImageView ImageView;

    private void initializeWidgets(){
        titleText = findViewById(R.id.nameDetailTextView);
        descriptionDetailTextView= findViewById(R.id.descriptionDetailTextView);
        dateDetailTextView= findViewById(R.id.dateDetailTextView);
        ImageView =findViewById(R.id.DetailImageView);
    }
    private String getDateToday(){
        DateFormat dateFormat=new SimpleDateFormat("yyyy/MM/dd");
        Date date=new Date();
        String today= dateFormat.format(date);
        return today;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        initializeWidgets();

        //RECEIVE DATA FROM ITEMSACTIVITY as INTENT
        Intent i=this.getIntent();
        String name=i.getExtras().getString("NAME_KEY");
        String description=i.getExtras().getString("DESCRIPTION_KEY");
        String imageURL=i.getExtras().getString("IMAGE_KEY");

        //SET RECEIVED DATA TO TEXTVIEWS AND IMAGEVIEWS
        titleText.setText(name);
        descriptionDetailTextView.setText(description);
        dateDetailTextView.setText("DATE: "+getDateToday());
        Picasso.with(this)
                .load(imageURL)
                .placeholder(R.drawable.placeholder)
                .fit()
                .centerCrop()
                .into(ImageView);

    }

}
