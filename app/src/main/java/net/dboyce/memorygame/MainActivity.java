package net.dboyce.memorygame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playclick(View v){
        System.out.println("Playclick happened");
        Intent intent = new Intent(this, playActivity.class);;
        startActivity(intent);


    }

    public void rulesclick(View v){
        System.out.println("Ruleclick happened");
        Intent intent = new Intent(this, rulesActivity.class);;
        startActivity(intent);

    }


}
