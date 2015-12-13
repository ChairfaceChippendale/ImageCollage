package com.ujujzk.imagecollage.app;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.*;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    LinearLayout collage;
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

        collage = (LinearLayout) findViewById(R.id.collage);
        collage.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 700));
        collage.setPadding(3,3,3,3);

        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT,1);
        lp.setMargins(3,3,3,3);

        ImageView img1 = new ImageView(this);
        ImageView img2 = new ImageView(this);
        ImageView img3 = new ImageView(this);
        ImageView img4 = new ImageView(this);
        LinearLayout bottomRow = new LinearLayout(this);


        switch (imgs.size()){

            case 0:
                break;

            case 1:

                img1 = new ImageView(this);
                img1.setImageBitmap(imgs.get(0));
                img1.setScaleType(ImageView.ScaleType.CENTER_CROP);
                img1.setLayoutParams(lp);
                collage.addView(img1);
                break;

            case 2:

                img1.setImageBitmap(imgs.get(0));
                img1.setScaleType(ImageView.ScaleType.CENTER_CROP);
                img1.setLayoutParams(lp);
                collage.addView(img1);

                img2.setImageBitmap(imgs.get(1));
                img2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                img2.setLayoutParams(lp);
                collage.addView(img2);
                break;

            case 3:

                collage.setOrientation(LinearLayout.VERTICAL);

                img1.setImageBitmap(imgs.get(0));
                img1.setScaleType(ImageView.ScaleType.CENTER_CROP);
                img1.setLayoutParams(lp);
                collage.addView(img1);

                bottomRow.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT,1));
                bottomRow.setOrientation(LinearLayout.HORIZONTAL);

                img2.setImageBitmap(imgs.get(1));
                img2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                img2.setLayoutParams(lp);
                bottomRow.addView(img2);

                img3.setImageBitmap(imgs.get(2));
                img3.setScaleType(ImageView.ScaleType.CENTER_CROP);
                img3.setLayoutParams(lp);
                bottomRow.addView(img3);

                collage.addView(bottomRow);
                break;

            case 4:

                collage.setOrientation(LinearLayout.VERTICAL);

                img1.setImageBitmap(imgs.get(0));
                img1.setScaleType(ImageView.ScaleType.CENTER_CROP);
                img1.setLayoutParams(lp);
                collage.addView(img1);

                bottomRow.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT,1));
                bottomRow.setOrientation(LinearLayout.HORIZONTAL);

                collage.addView(bottomRow);

                img2.setImageBitmap(imgs.get(1));
                img2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                img2.setLayoutParams(lp);
                bottomRow.addView(img2);

                img3.setImageBitmap(imgs.get(2));
                img3.setScaleType(ImageView.ScaleType.CENTER_CROP);
                img3.setLayoutParams(lp);
                bottomRow.addView(img3);

                img4.setImageBitmap(imgs.get(3));
                img4.setScaleType(ImageView.ScaleType.CENTER_CROP);
                img4.setLayoutParams(lp);
                bottomRow.addView(img4);
                break;

            default:
                break;
        }




    }
}
