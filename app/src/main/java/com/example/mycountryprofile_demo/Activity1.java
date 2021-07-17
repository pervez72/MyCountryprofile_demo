package com.example.mycountryprofile_demo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity1 extends AppCompatActivity implements View.OnClickListener {

    private Button BangladeshButton,IndiaButton,PakistanButton;

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BangladeshButton=findViewById(R.id.BangladeshId);
        IndiaButton=findViewById(R.id.IndiaId);
        PakistanButton=findViewById(R.id.PakistanButtonId);

        BangladeshButton.setOnClickListener(this);
        IndiaButton.setOnClickListener(this);
        PakistanButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.BangladeshId){
           intent=new Intent(Activity1.this,ProfileActivity.class);
           intent.putExtra("name","Bangladesh");
           startActivity(intent);
        }

        else if(v.getId()==R.id.IndiaId){

            intent=new Intent(Activity1.this,ProfileActivity.class);
            intent.putExtra("name","India");
            startActivity(intent);
        }

        else if(v.getId()==R.id.PakistanButtonId){
            intent=new Intent(Activity1.this,ProfileActivity.class);
            intent.putExtra("name","Pakistan");
            startActivity(intent);
        }



    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder AlertdialogBuilder;
        AlertdialogBuilder =new AlertDialog.Builder(Activity1.this);

        AlertdialogBuilder.setIcon(android.R.drawable.stat_sys_warning);
        AlertdialogBuilder.setTitle(R.string.Tittle_text);
        AlertdialogBuilder.setMessage(R.string.massage_text);
        AlertdialogBuilder.setCancelable(true);

        AlertdialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();

            }
        });

        AlertdialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
               dialog.cancel();
            }
        });

    }
}