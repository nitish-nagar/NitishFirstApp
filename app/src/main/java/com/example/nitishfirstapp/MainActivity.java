package com.example.nitishfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView theTextView1 = (TextView) findViewById(R.id.heading);
        theTextView1.setText("Hello World! This is my story of how I found my passion in Android.");

        TextView theTextView2 = (TextView) findViewById(R.id.paragraph1);
        theTextView2.setText("Ever since I was in school I was fond of how computers work and I got excited whenever I got a new tech product with me and basically loved tinkering around with gadgets to find some useful insight on how it worked internally! \n " +
                "   Back then I had even made up my mind that I would love to have something related to this as my career! \n " +
                "   Fast forward to now and this is me today, as on creating this app: ");

        TextView theTextView3 = (TextView) findViewById(R.id.headingmini1);
        theTextView3.setText("My first encounter with Android: ");

        TextView theTextView4 = (TextView) findViewById(R.id.paragraph2);
        theTextView4.setText("It all started with my first smartphone which my uncle gifted, it was the Samsung Galaxy Ace Duos and it ran Android 2.3 Gingerbread. Those were the initial days of the era of smartphones. \n");
        TextView theTextView5 = (TextView) findViewById(R.id.paragraph2second);
        theTextView5.setText("I got the phone in 2012 and I was simply blown away by this Operating System, the fact that one could browse the web, click photos, call using a touchscreen right through their phone was phenomenal! \n \n" +
                "I had it in my DREAM LIST (or bucket list if you may) that I'll create stunning web apps and mobile apps that will impact many people positively! \n \n" +
                "And since then I've used phones like Motorola Moto G2 running Android 4.4 KitKat using which I started doing YouTube as a hobby since 2015 and then the Moto G5 Plus running Android 7.0 Nougat and 8.0 Oreo. \n");

        TextView theTextView6 = (TextView) findViewById(R.id.headingmini2);
        theTextView6.setText("My work:  \n");

        TextView theTextView7 = (TextView) findViewById(R.id.paragraph3);
        theTextView7.setText("I am a Computer Applications student who enjoys Software Development and also a Tech YouTuber who makes videos around product reviews and how to get the most out of your devices! \n" +
                "And thanks for reading through my first app ever! \n" +
                "I have linked my works here: \n");

        Button firstButton = (Button) findViewById(R.id.btn1);
        Button secondButton = (Button) findViewById(R.id.btn2);

        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/nitish-nagar"));
                startActivity(intent);
            }

        });

        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/c/android4lifenitish"));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.setPackage("com.google.android.youtube");
                startActivity(intent);
            }
        });
    }
}