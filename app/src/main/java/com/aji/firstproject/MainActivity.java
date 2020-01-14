package com.aji.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //list object
    EditText txtname;
    Button btnklik;
    TextView tvname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //link to xml
        txtname = findViewById(R.id.txtnama);
        tvname = findViewById(R.id.tvname);
        btnklik = findViewById(R.id.btnklik);
        btnklik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //order here
                //ambil nilai dari edittext, lalu tampilkan ke textview
                String name = txtname.getText().toString();
                tvname.setText("nama saya : "+name);
            }
        });

    }
}
