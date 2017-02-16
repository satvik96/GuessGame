package com.example.satvik.guess_game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
int n;
    Random rand=new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n=rand.nextInt(20)+1;
    }

    public void click (View view)
{
    EditText guess=(EditText)findViewById(R.id.guess);
int guessInt=Integer.parseInt(guess.getText().toString());

    if(guessInt>n)
    {
        Toast.makeText(MainActivity.this,"Go Lower", Toast.LENGTH_SHORT).show();
    }
    else if(guessInt<n)
    {

        Toast.makeText(MainActivity.this, "Go Higher", Toast.LENGTH_SHORT).show();
    }

    else
    {
        Toast.makeText(MainActivity.this, "Right Guess.", Toast.LENGTH_SHORT).show();
        n=rand.nextInt(20)+1;
    }
    //Toast.makeText(MainActivity.this, n, Toast.LENGTH_SHORT).show();
    //.makeText(MainActivity.this, guess.getText().toString(), Toast.LENGTH_SHORT).show();
    //Log.i("Guess",n);

}


}
