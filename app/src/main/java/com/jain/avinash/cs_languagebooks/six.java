package com.jain.avinash.cs_languagebooks;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class six extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);
    }


    public void Link10(View view) {
        Intent browser1Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://zimslifeintcs.files.wordpress.com/2011/12/head-first-java-2nd-edition.pdf "));
        startActivity(browser1Intent);
    }

    public void Link11(View view) {
        Intent browser1Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http:// www.hi.is/~snorri/097111-97/tjava.pdf"));
        startActivity(browser1Intent);
    }

    public void Link12(View view) {
        Intent browser1Intent = new Intent(Intent.ACTION_VIEW, Uri.parse(" "));
        startActivity(browser1Intent);
    }



}
