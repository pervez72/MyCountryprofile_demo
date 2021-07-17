package com.example.mycountryprofile_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        textView=findViewById(R.id.textViewId);
        imageView=findViewById(R.id.imageviewId);

        Bundle bundle=getIntent().getExtras();

        if(bundle!=null){

           String countryName= bundle.getString("name");
            showDetails(countryName);
        }


    }

    void showDetails(String countryName){

        if(countryName.equals("Bangladesh")){

            imageView.setImageResource(R.drawable.bangladeshpic);
            textView.setText(R.string.bangladesh_text);


        }

        else if(countryName.equals("India")){

            imageView.setImageResource(R.drawable.indiapic);
            textView.setText(R.string.india_text);
        }

        else if(countryName.equals("Pakistan")){
            imageView.setImageResource(R.drawable.pakistanpic);
            textView.setText(R.string.pakistan_text);
        }

    }
}