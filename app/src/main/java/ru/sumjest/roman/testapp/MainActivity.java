package ru.sumjest.roman.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {



    TextView age;
    Random rand = new Random();
    int clr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        age = (TextView) findViewById(R.id.age);
        age.setText(String.valueOf((rand.nextInt(11)+6)));
        if (rand.nextInt(2)==0)clr = 0xFFD54177;
        else clr = 0xff00ddff;
        age.setTextColor(clr);
    }

        public void onClickYes(View v) {
            TextView age = (TextView) findViewById(R.id.age);
            TextView points = (TextView) findViewById(R.id.points);
            Random rand = new Random();
            int count = Integer.parseInt(age.getText().toString());
            if((count>=6 && count <= 13 && clr==0xFFD54177)||((count<6 || count > 13) && clr==0xff00ddff))
            {
                points.setText(String.valueOf(Integer.parseInt(points.getText().toString())+2));
            }else
            {
                points.setText(String.valueOf(Integer.parseInt(points.getText().toString())-10));
            }
            age.setText(String.valueOf((rand.nextInt(11)+6)));
            if (rand.nextInt(2)==0)clr = 0xFFD54177;
            else clr = 0xff00ddff;
            age.setTextColor(clr);
        }
        public void onClickNo(View v) {

            TextView points = (TextView) findViewById(R.id.points);

            int count = Integer.parseInt(age.getText().toString());
            if((count>=6 && count <= 13 && clr==0xFFD54177)||((count<6 || count > 13) && clr==0xff00ddff))
            {
                points.setText(String.valueOf(Integer.parseInt(points.getText().toString())-10));
            }else
            {
                points.setText(String.valueOf(Integer.parseInt(points.getText().toString())+2));
            }
            age.setText(String.valueOf((rand.nextInt(11)+6)));
            if (rand.nextInt(2)==0)clr = 0xFFD54177;
            else clr = 0xff00ddff;
            age.setTextColor(clr);
        }
}
