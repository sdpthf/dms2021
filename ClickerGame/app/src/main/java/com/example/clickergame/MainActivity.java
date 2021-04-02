package com.example.clickergame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    TextView result = null;
    Button up = null;
    Button down = null;
    ImageView imageview = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        up = (Button) findViewById(R.id.up_btn);
        down = (Button) findViewById(R.id.down_btn);
        result = (TextView) findViewById(R.id.result_tv);
        imageview = (ImageView) findViewById(R.id.imageView);

      View.OnClickListener clickListener = new View.OnClickListener(){
          @Override
          public void onClick(View v) {
              switch (v.getId()) {

                  case R.id.up_btn :
                      count++;
                      result.setText(""+count);
                      break;

                  case R.id.down_btn :
                      count--;
                      result.setText(""+count);
                      break;

              }

              if(count == 10) {
                  Toast.makeText(MainActivity.this, "알이 부화 중 입니다", Toast.LENGTH_SHORT).show();
                  imageview.setImageResource(R.drawable.egg);
              }

              else if(count == 20) {
                  Toast.makeText(MainActivity.this, "병아리가 나왔습니다", Toast.LENGTH_SHORT).show();
                  imageview.setImageResource(R.drawable.chicken);
              }

              else if(count == 30) {
                  Toast.makeText(MainActivity.this, "치킨이 되었습니다", Toast.LENGTH_SHORT).show();
                  imageview.setImageResource(R.drawable.chicken2);
              }

          }

      };
      up.setOnClickListener(clickListener);
      down.setOnClickListener(clickListener);

    }
}