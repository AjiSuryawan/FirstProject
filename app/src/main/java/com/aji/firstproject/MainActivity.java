package com.aji.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //deklarasi elemen2nya
    EditText txtusername;
    EditText txtpassword;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtusername = findViewById(R.id.txtusername);
        txtpassword = findViewById(R.id.txtpassword);
        btnlogin = findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            //not here
            @Override
            public void onClick(View v) {
                if (txtusername.getText().toString().isEmpty() ||
                        txtpassword.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "harus terisi semua", Toast.LENGTH_SHORT).show();
                }else{

                    if (txtusername.getText().toString().equals("aji")
                            && txtpassword.getText().toString().equals("aji")){
                        Toast.makeText(MainActivity.this, "Sukses login", Toast.LENGTH_SHORT).show();
                        //pindah activity ke activity kalkulator
                        Intent intenku = new Intent(MainActivity.this, Kalkulator.class);
                        startActivity(intenku);
                    }else {
                        Toast.makeText(MainActivity.this, "gagal Login", Toast.LENGTH_SHORT).show();
                    }

                }
            }
            //not here
        });

    }
}