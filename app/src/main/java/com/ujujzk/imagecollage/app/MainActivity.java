package com.ujujzk.imagecollage.app;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    View collage;
    List<Bitmap> imgs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgs = new ArrayList<Bitmap>();
        imgs.add(BitmapFactory.decodeResource(getResources(), R.drawable.abraham_and_isaac));
        imgs.add(BitmapFactory.decodeResource(getResources(), R.drawable.abraham_entertaining_the_three_angels));
        imgs.add(BitmapFactory.decodeResource(getResources(), R.drawable.abrahams_sacrifice));
        imgs.add(BitmapFactory.decodeResource(getResources(), R.drawable.christ_and_the_woman_of_samaria_among_ruins));
        imgs.add(BitmapFactory.decodeResource(getResources(), R.drawable.christ_crowned_with_thorns));

        LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        ImageView img1, img2, img3, img4;
        TextView unseeingImgNum;

        switch (imgs.size()){

            case 0:
                break;

            case 1:

                collage = vi.inflate(R.layout.image_1_view, null);

                img1 = (ImageView) collage.findViewById(R.id.img);
                img1.setImageBitmap(imgs.get(0));

                break;

            case 2:

                collage = vi.inflate(R.layout.image_2_view, null);

                img1 = (ImageView) collage.findViewById(R.id.img1);
                img1.setImageBitmap(imgs.get(0));
                img2 = (ImageView) collage.findViewById(R.id.img2);
                img2.setImageBitmap(imgs.get(1));

                break;

            case 3:

                collage = vi.inflate(R.layout.image_3_view, null);

                img1 = (ImageView) collage.findViewById(R.id.img1);
                img1.setImageBitmap(imgs.get(0));
                img2 = (ImageView) collage.findViewById(R.id.img2);
                img2.setImageBitmap(imgs.get(1));
                img3 = (ImageView) collage.findViewById(R.id.img3);
                img3.setImageBitmap(imgs.get(2));

                break;

            case 4:

                collage = vi.inflate(R.layout.image_4_view, null);

                img1 = (ImageView) collage.findViewById(R.id.img1);
                img1.setImageBitmap(imgs.get(0));
                img2 = (ImageView) collage.findViewById(R.id.img2);
                img2.setImageBitmap(imgs.get(1));
                img3 = (ImageView) collage.findViewById(R.id.img3);
                img3.setImageBitmap(imgs.get(2));
                img4 = (ImageView) collage.findViewById(R.id.img4);
                img4.setImageBitmap(imgs.get(3));
                break;

            default:
                collage = vi.inflate(R.layout.image_5_view, null);

                img1 = (ImageView) collage.findViewById(R.id.img1);
                img1.setImageBitmap(imgs.get(0));
                img2 = (ImageView) collage.findViewById(R.id.img2);
                img2.setImageBitmap(imgs.get(1));
                img3 = (ImageView) collage.findViewById(R.id.img3);
                img3.setImageBitmap(imgs.get(2));
                img4 = (ImageView) collage.findViewById(R.id.img4);
                img4.setImageBitmap(imgs.get(3));
                unseeingImgNum = (TextView) collage.findViewById(R.id.last_img_num);
                unseeingImgNum.setText("+" + (imgs.size()-4));
                break;


        }
        setContentView(collage);





    }
}
