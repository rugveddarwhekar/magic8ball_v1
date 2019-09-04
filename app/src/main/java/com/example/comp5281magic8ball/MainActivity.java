package com.example.comp5281magic8ball;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getFortune(View view){
        String[] text_array = new String[] {"It is certain", "It is decidedly so", "Without a doubt", "Yes definitely", "You may rely on it", "As I see it yes", "Most likely", "Outlook good", "Yes", "Signs point to yes", "Reply hazy try again", "Ask again later", "Better not tell you now", "Cannot predict now", "Concentrate & ask again", "Don't count on it", "My reply is no", "My sources say no", "Outlook not so good", "Very doubtful"};
        double x = (int)(Math.random()*((19-0)+0))+0;
        TextView result = findViewById(R.id.textView_result);
        result.setText(text_array[(int) x]);
    }
}