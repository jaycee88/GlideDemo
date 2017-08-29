package com.jaycee88.glidedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.image_view);
        Log.d("TAG", "imageView scaleType is " + imageView.getScaleType());
    }

    public void loadImage(View view) {
//        String url = "https://www.baidu.com/img/bd_logo1.png";
        String url = "http://cn.bing.com/az/hprichbg/rb/AvalancheCreek_ROW11173354624_1920x1080.jpg";
        Glide.with(this)
                .load(url)
//                .dontTransform()
//                .override(Target.SIZE_ORIGINAL, Target.SIZE_ORIGINAL)
//                .fitCenter()
                .override(500, 500)
                .centerCrop()
                .into(imageView);
    }
}
