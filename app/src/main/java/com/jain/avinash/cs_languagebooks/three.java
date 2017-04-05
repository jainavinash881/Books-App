package com.jain.avinash.cs_languagebooks;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class three extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
    }


    public void Link1(View view) {
        Intent browser1Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cluster2.hostgator.co.in/files/writeable/.../file/letusc-yashwantkanetkar.pdf "));
        startActivity(browser1Intent);
    }

    public void Link2(View view) {
        Intent browser1Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mosaic-industries.com/embedded-systems/_media/c-ide-software-development/learning-c-programming-language/head-first-c-o-reilly-david-grifffiths-dawn-griffiths.pdf"));
        startActivity(browser1Intent);
    }

    public void Link3(View view) {
        Intent browser1Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.programesecure.com/programming-in-ansi-c-balaguruswamy-pdf/"));
        startActivity(browser1Intent);
    }

}
