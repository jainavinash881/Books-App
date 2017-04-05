package com.jain.avinash.cs_languagebooks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class second extends AppCompatActivity {

    public Button b_c;


    public void init() {

        b_c = (Button) findViewById(R.id.b_c);
        b_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(second.this, three.class);

                startActivity(toy);
            }
        });
    }

    public Button b_dsa;


    public void init1() {

        b_dsa = (Button) findViewById(R.id.b_dsa);
        b_dsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(second.this, four.class);

                startActivity(toy);
            }
        });
    }

    public Button b_python;


    public void init2() {

        b_python = (Button) findViewById(R.id.b_python);
        b_python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(second.this, five.class);

                startActivity(toy);
            }
        });
    }

    public Button b_java;


    public void init3() {

        b_java = (Button) findViewById(R.id.b_java);
        b_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(second.this, six.class);

                startActivity(toy);
            }
        });
    }

    public Button b_cp;


    public void init4() {

        b_cp = (Button) findViewById(R.id.b_cp);
        b_cp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(second.this, sevan.class);

                startActivity(toy);
            }
        });
    }

    public Button b_html;


    public void init5() {

        b_html = (Button) findViewById(R.id.b_html);
        b_html.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(second.this, eight.class);

                startActivity(toy);
            }
        });
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        init();
        init1();
        init2();
        init3();
        init4();
        init5();

    }


}
