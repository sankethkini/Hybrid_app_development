package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txt;
    Button click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=findViewById(R.id.editTextTextPersonName);
        click=findViewById(R.id.button);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = txt.getText().toString();
                Bundle b = new Bundle();
                b.putString("name", str);
                Intent it = new Intent(MainActivity.this, SecondActivity.class);
                it.putExtras(b);
                startActivity(it);
            }
        });

    }
}
