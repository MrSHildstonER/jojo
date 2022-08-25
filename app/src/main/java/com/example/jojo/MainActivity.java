package com.example.jojo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    static int count = 0;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        button = findViewById(R.id.clickButton);
        textView = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                button.setText(count+"");

                if (count >100 && count <1000){
                    textView.setText("хороше начало");
                }
                if (count > 1000 && count < 5000){
                    textView.setText("Не устал?");
                }
                if (count > 5000 && count < 10000) {
                    textView.setText("автокликер?");
                }
                    if (count > 10000 && count < 15000){
                        textView.setText("ВЫРУБАЙ!");
                }

                if (count > 15000 && count < 30000){
                    textView.setText("я молчу");
                }
                if (count == 20){
                    Toast.makeText(getApplicationContext(), "Вы набрали 20 очков", Toast.LENGTH_LONG).show();
                }
            }
        });
        //обработчик нажатия
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

    }
}