package com.bhram.radhakrishnavachanpka.shlokas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.bhram.radhakrishnavachanpka.R;
import com.bhram.radhakrishnavachanpka.wallpaper.SecongPage;
import com.google.android.ads.nativetemplates.NativeTemplateStyle;
import com.google.android.ads.nativetemplates.TemplateView;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.nativead.NativeAd;

public class shlokas extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    final Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shlokas);


        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        });


        //native ads

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

//1
        AdLoader adLoader = new AdLoader.Builder(this, "ca-app-pub-2979694091012217/5131876052")
                .forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
                    @Override
                    public void onNativeAdLoaded(NativeAd nativeAd) {
                        NativeTemplateStyle styles = new
                                NativeTemplateStyle.Builder().build();
//                                .withMainBackgroundColor(background).build();
                        TemplateView template = findViewById(R.id.my_template);
                        template.setStyles(styles);
                        template.setNativeAd(nativeAd);
                    }
                })
                .build();

        adLoader.loadAd(new AdRequest.Builder().build());
//2
        AdLoader adLoader2 = new AdLoader.Builder(this, "ca-app-pub-2979694091012217/1284964537")
                .forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
                    @Override
                    public void onNativeAdLoaded(NativeAd nativeAd) {
                        NativeTemplateStyle styles = new
                                NativeTemplateStyle.Builder().build();
//                                .withMainBackgroundColor(background).build();
                        TemplateView template = findViewById(R.id.template1);
                        template.setStyles(styles);
                        template.setNativeAd(nativeAd);
                    }
                })
                .build();

        adLoader2.loadAd(new AdRequest.Builder().build());

        //3
        AdLoader adLoader3 = new AdLoader.Builder(this, "ca-app-pub-2979694091012217/6345719527")
                .forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
                    @Override
                    public void onNativeAdLoaded(NativeAd nativeAd) {
                        NativeTemplateStyle styles = new
                                NativeTemplateStyle.Builder().build();
//                                .withMainBackgroundColor(background).build();
                        TemplateView template = findViewById(R.id.my_template2);
                        template.setStyles(styles);
                        template.setNativeAd(nativeAd);
                    }
                })
                .build();

        adLoader3.loadAd(new AdRequest.Builder().build());
        //4
        AdLoader adLoader4 = new AdLoader.Builder(this, "ca-app-pub-2979694091012217/5032637851")
                .forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
                    @Override
                    public void onNativeAdLoaded(NativeAd nativeAd) {
                        NativeTemplateStyle styles = new
                                NativeTemplateStyle.Builder().build();
//                                .withMainBackgroundColor(background).build();
                        TemplateView template = findViewById(R.id.my_template3);
                        template.setStyles(styles);
                        template.setNativeAd(nativeAd);
                    }
                })
                .build();

        adLoader4.loadAd(new AdRequest.Builder().build());
        //5
        AdLoader adLoader5 = new AdLoader.Builder(this, "ca-app-pub-2979694091012217/8969681733")
                .forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
                    @Override
                    public void onNativeAdLoaded(NativeAd nativeAd) {
                        NativeTemplateStyle styles = new
                                NativeTemplateStyle.Builder().build();
//                                .withMainBackgroundColor(background).build();
                        TemplateView template = findViewById(R.id.my_template4);
                        template.setStyles(styles);
                        template.setNativeAd(nativeAd);
                    }
                })
                .build();

        adLoader5.loadAd(new AdRequest.Builder().build());




     //native

    }

    }
