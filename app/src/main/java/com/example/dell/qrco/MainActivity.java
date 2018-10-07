package com.example.dell.qrco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button2,button3,button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);



        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ocr();
            }
        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qrScan();
            }
        });


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                qrGenerator();
            }
        });
    }

    public void qrGenerator() {
        Intent intent = new Intent(this,QRGenerator.class);
        startActivity(intent);

    }

    public void qrScan() {
        Intent intent = new Intent(this,QRCode.class);
        startActivity(intent);
    }

    public void ocr() {
        Intent intent = new Intent(this,OCR.class);
        startActivity(intent);
    }
}
