package com.example.conversion2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText Euros,Dolares;
    Button ButtonConvertir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Euros=(EditText)findViewById(R.id.Euro1);
        Dolares= (EditText)findViewById(R.id.Dolar1);
        ButtonConvertir= (Button)findViewById((R.id.btnConvertir));
        ButtonConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String euro=Euros.getText().toString();
                Double eu=Double.parseDouble(euro);
                Double dol= eu*1.14;
                String dolar= String.valueOf(dol);
                Dolares .setText(dolar);
            }
        });

    }
}