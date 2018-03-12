package com.avdey.loadimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView ivLoader;
    Button btnLoadImages;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivLoader = (ImageView) findViewById(R.id.ivLoader);
        btnLoadImages = (Button) findViewById(R.id.btnLoadImage);

        btnLoadImages.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Picasso.get()
                .load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQJoTNY_5EWCgRnKzkywtiBL_WVo1YnMPao4WycLLeuyDKTZcfDlw")
                .into(ivLoader);
    }
}
