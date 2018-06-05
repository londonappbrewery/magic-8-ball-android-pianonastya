package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView BallDisplay = (ImageView) findViewById(R.id.image_eightBall);
        //Create a variable called ballArray.
        // Set ballArray to contain the references to the 5 images in the drawable folder.
        // Refer to the ball pictures using R.drawable.ball1, R.drawable.ball2 ...etc.

        final int [] ballArray = new int[]{
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };

        //Link the askButton in the layout to the Java code. Store the button in a variable called myButton.u
        Button myButton = findViewById(R.id.askButton);

        //Set a Listener on myButton using the dot (.) notation.
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumberGenerator = new Random();
                //Use the random object’s nextInt() method to generate a random number and store it in a new variable called number.
                //Recall there are 5 dice images and programmers like to start counting from 0.
                int number = randomNumberGenerator.nextInt(5);
                //Use setImageResource(), the ballArray, and the number to give the ballDisplay a random 8 ball image to display.
                BallDisplay.setImageResource(ballArray[number]);
            }
        });
    }
}
