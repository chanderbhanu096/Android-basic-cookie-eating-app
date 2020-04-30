package com.example.sampletesting;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Called when the cookie should be eaten.
     */
    @SuppressLint("WrongViewCast")
    public void eatCookie(View view) {


        // TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView imageview = findViewById(R.id.android_cookie_image_view);
        imageview.setImageResource(R.drawable.after_cookie);

        // TODO: Find a reference to the TextView in the layout. Change the text.
        TextView textView = findViewById(R.id.status_text_view);
        textView.setText(R.string.full);

        Button button = findViewById(R.id.button);
        button.setVisibility(View.INVISIBLE);
    }
}