package com.jain.avinash.cs_languagebooks;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class four extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
    }


    public void Link4(View view) {
        Intent browser1Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://ce.bonabu.ac.ir/uploads/30/CMS/user/file/115/EBook/Introduction.to.Algorithms.3rd.Edition.Sep.2010.pdf\n "));
        startActivity(browser1Intent);
    }

    public void Link5(View view) {
        Intent browser1Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://lib.mdp.ac.id/ebook/Karya%20Umum/Dsa.pdf"));
        startActivity(browser1Intent);
    }

    public void Link6(View view) {
        Intent browser1Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.techtud.com/sites/default/files/public/share/algorithm-book-by-karumanchi.pdf"));
        startActivity(browser1Intent);
    }




}
