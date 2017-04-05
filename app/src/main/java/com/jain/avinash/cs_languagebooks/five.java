package com.jain.avinash.cs_languagebooks;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class five extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
    }

    public void Link7(View view) {
        Intent browser1Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://learning-python.com/python-lutz-class-description.pdf"));
        startActivity(browser1Intent);
    }

    public void Link8(View view) {
        Intent browser1Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.souravsengupta.com/int2pro2014/python/LPTHW.pdf"));
        startActivity(browser1Intent);
    }

    public void Link9(View view) {
        Intent browser1Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://greenteapress.com/thinkpython/thinkpython.pdf "));
        startActivity(browser1Intent);
    }



}
