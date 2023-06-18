package com.example.dicegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button b_role;
    TextView tv_rolled;
    ImageView iv_dice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b_role = findViewById(R.id.b_role);
        tv_rolled = findViewById(R.id.tv_rolled);
        iv_dice = findViewById(R.id.iv_dice);

        b_role.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                int random = r.nextInt(6) + 1;
                tv_rolled.setText("You got: " + random);
                if(random == 1) {
                    iv_dice.setImageResource(R.drawable.dice1);
                } else if (random == 2) {
                    iv_dice.setImageResource(R.drawable.dice2);
                } else if (random == 3) {
                    iv_dice.setImageResource(R.drawable.dice3);
                } else if (random == 4) {
                    iv_dice.setImageResource(R.drawable.dice4);
                } else if (random == 5) {
                    iv_dice.setImageResource(R.drawable.dice5);
                } else if (random == 6) {
                    iv_dice.setImageResource(R.drawable.dice6);
                }
            }
        });
    }
}