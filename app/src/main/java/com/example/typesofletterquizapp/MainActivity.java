package com.example.typesofletterquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView txt,questiontext,resulttxt;
    Button skybutton,grassbutton,rootbutton;
    String [] sky={"b","d","f","h","k","l","t"};
    String [] grass={"a","c" ,"e","i","m","n","o","s","u","r","v","w","x","z"};
    String [] root={"p" ,"q","y","j","g"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=findViewById(R.id.text);
        resulttxt=findViewById(R.id.resulttext);
        questiontext=findViewById(R.id.quesText);
        skybutton=findViewById(R.id.skybtn);
        grassbutton=findViewById(R.id.grassbtn);
        rootbutton=findViewById(R.id.rootbtn);
        Random rand=new Random();
        int rnum= rand.nextInt(3);
        if(rnum==0) {
            int i = rand.nextInt(sky.length);
            txt.setText(sky[i]);
        }
        else if(rnum==1){
            int i=rand.nextInt(grass.length);
            txt.setText(grass[i]);
        }
        else{
            int i=rand.nextInt(root.length);
            txt.setText(root[i]);
        }
        skybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rnum==0)
                {
                    resulttxt.setText("Awesome!");
                }
                else{
                    resulttxt.setText("Wrong");
                }
            }
        });
        grassbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rnum==1)
                {
                    resulttxt.setText("Awesome!");
                }
                else{
                    resulttxt.setText("Wrong");
                }
            }
        });
        rootbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rnum==2)
                {
                    resulttxt.setText("Awesome!");
                }
                else{
                    resulttxt.setText("Wrong");
                }

            }
        });
    }
}