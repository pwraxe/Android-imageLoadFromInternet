package com.example.akshay.imageloadfrominternet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img1 = findViewById(R.id.img1);
        ImageView img2 = findViewById(R.id.img2);
        ImageView img3 = findViewById(R.id.img3);
        ImageView img4 = findViewById(R.id.img4);
        ImageView img5 = findViewById(R.id.img5);

        String urls[] = {
                "https://www.gettyimages.in/gi-resources/images/Embed/new/embed2.jpg",
                "https://d12m9erqbesehq.cloudfront.net/wp-content/uploads/sites/5150/2016/04/13100027/images-4.jpg",
                "https://resize.indiatvnews.com/en/centered/newbucket/715_431/2018/03/h6-1521531233.jpg",
                "http://kccsecurity.com/wp-content/uploads/2018/04/desktop-images.jpg",
                "https://cdn-images-1.medium.com/max/2000/1*Q9bfz0wD837_Irn20O-ERA.jpeg"};

        Glide.with(this).load(urls[0]).into(img1);
        Glide.with(this).load(urls[1]).into(img2);
        Glide.with(this).load(urls[2]).into(img3);
        Glide.with(this).load(urls[3]).into(img4);
        Glide.with(this).load(urls[4]).into(img5);

    }
}
