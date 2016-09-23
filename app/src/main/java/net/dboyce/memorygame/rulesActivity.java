package net.dboyce.memorygame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class rulesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);
    }

    public void backClick(View v){
        System.out.println("Back from rules happened");
        Intent intent = new Intent(this, MainActivity.class);;
        startActivity(intent);
    }
}
