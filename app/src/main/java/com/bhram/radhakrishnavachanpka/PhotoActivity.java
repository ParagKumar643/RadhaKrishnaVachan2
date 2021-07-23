package com.bhram.radhakrishnavachanpka;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PhotoActivity extends AppCompatActivity {

    ViewPager2 viewPager2;
    imageItem imageItem;
    List<imageItem> data;
    private InterstitialAd interstitialAd;

    private AdView mAdView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);



        //Ads
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        });

        mAdView = findViewById(R.id.adView);
        final AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                super.onAdLoaded();;
                // Code to be executed when an ad finishes loading.
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                super.onAdFailedToLoad(adError);
                mAdView.loadAd(adRequest);
                // Code to be executed when an ad request fails.
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
                super.onAdOpened();
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
                super.onAdClicked();
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }
        });
        //Ads


        viewPager2 = findViewById(R.id.view_pager_2);
        data = new ArrayList<>();

        data.add(new imageItem("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626118139/stories/WhatsApp_Image_2021-07-12_at_11.05.30_PM_kqkhqf.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626118137/stories/WhatsApp_Image_2021-07-12_at_11.48.45_PM_as0z4h.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626118137/stories/WhatsApp_Image_2021-07-12_at_11.48.46_PM_ebxerb.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626118138/stories/WhatsApp_Image_2021-07-12_at_11.48.47_PM_immuy9.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626118137/stories/WhatsApp_Image_2021-07-12_at_11.48.47_PM_1_dqdohu.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626118137/stories/WhatsApp_Image_2021-07-12_at_11.48.47_PM_3_uglkhs.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626118138/stories/WhatsApp_Image_2021-07-12_at_11.48.48_PM_mjlvyh.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626118138/stories/WhatsApp_Image_2021-07-12_at_11.48.48_PM_1_gh1jgd.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626118138/stories/WhatsApp_Image_2021-07-12_at_11.48.48_PM_2_rj2gdp.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626118139/stories/WhatsApp_Image_2021-07-12_at_11.48.49_PM_tobqsd.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626118139/stories/WhatsApp_Image_2021-07-12_at_11.48.49_PM_1_pr8uwz.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626118139/stories/WhatsApp_Image_2021-07-12_at_11.48.50_PM_bom9cy.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626118139/stories/WhatsApp_Image_2021-07-12_at_11.48.50_PM_1_kylij4.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626118139/stories/WhatsApp_Image_2021-07-12_at_11.48.50_PM_2_fazxdi.jpg"));




        photoAdapter adapter= new photoAdapter(data);

        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(3);
        viewPager2.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);

        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(40));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float r = 1 - Math.abs(position);
                page.setScaleY(0.85f + r * 0.15f);
            }
        });

        viewPager2.setAdapter(adapter);

    }

    }
