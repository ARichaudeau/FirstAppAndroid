package com.example.formation10.firstappandroid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    private TextView textViewScreenFirstName;
    private TextView textViewScreenName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);


        textViewScreenFirstName = findViewById(R.id.textView_screen_firstName);
        textViewScreenName = findViewById(R.id.textView_screen_name);
    }

    public void onFinishClicked(View v){
        this.finish();
    }

    public void onCallClicked(View v){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:0600000000"));
        startActivity(intent);
    }

    public void onSendMailClicked(View v){
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:toto@toto.toto"));
        startActivity(intent);
    }

    public void onSmsClicked(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("smsto:0600000000"));
        startActivity(intent);
    }


}
