package com.bhram.radhakrishnavachanpka.wallpaper;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.bhram.radhakrishnavachanpka.Home;
import com.bhram.radhakrishnavachanpka.R;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

import java.util.ArrayList;

public class WallpaerPagerActivity extends AppCompatActivity {

    int pos;
    ArrayList<String> allImageList=new ArrayList<>();
    ViewPager viewpager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpaer_pager);


        pos=getIntent().getIntExtra("pos",0);
        allImageList=getIntent().getStringArrayListExtra("list");
        viewpager=findViewById(R.id.viewPager);

       PagerAdapter pagerAdapter=new PagerAdapter(WallpaerPagerActivity.this,allImageList);
        viewpager.setAdapter(pagerAdapter);
        viewpager.setCurrentItem(pos);


    }
}