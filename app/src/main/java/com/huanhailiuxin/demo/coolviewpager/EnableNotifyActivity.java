package com.huanhailiuxin.demo.coolviewpager;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.huanhailiuxin.coolviewpager.CoolViewPager;

import java.util.ArrayList;
import java.util.List;

public class EnableNotifyActivity extends BaseActivity {
    private CoolViewPager vp;
    ActivityOrientation.MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN | WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_enable_notify);
        getSupportActionBar().hide();
        initViews();
    }

    private List<View> items;

    private void initViews() {
        items = new ArrayList<>();
        items.add(createImageView(R.mipmap.img3));
        items.add(createImageView(R.mipmap.img5));
        items.add(createImageView(R.mipmap.img6));
        items.add(createImageView(R.mipmap.img7));
        adapter = new ActivityOrientation.MyAdapter(items);
        //
        vp = findViewById(R.id.vp);
        vp.setScrollMode(CoolViewPager.ScrollMode.HORIZONTAL);
        vp.setAdapter(adapter);
    }

    public void buttonClick(View view) {
        items.clear();
        items.add(createImageView(R.mipmap.i1));
        items.add(createImageView(R.mipmap.i2));
        items.add(createImageView(R.mipmap.i5));
        items.add(createImageView(R.mipmap.i6));
        vp.notifyDataSetChanged();
    }
}
