package com.bhram.radhakrishnavachanpka;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bhram.radhakrishnavachanpka.shlokas.shlokas;
import com.bhram.radhakrishnavachanpka.wallpaper.SecongPage;
import com.bhram.radhakrishnavachanpka.wallpaper.WallpaperMain;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.nabinbhandari.android.permissions.PermissionHandler;
import com.nabinbhandari.android.permissions.Permissions;

import java.io.File;
import java.util.ArrayList;


public class Home extends AppCompatActivity {

    Button videoBtn, photoBtn, shlok, wallpaper;
    private InterstitialAd mInterstitialAd1 ,mInterstitialAd2 , mInterstitialAd3 ,mInterstitialAd4;


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);


        //Advertisements
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

                //VideoInterstitial
                AdRequest adRequest = new AdRequest.Builder().build();

                InterstitialAd.load(Home.this,"ca-app-pub-2979694091012217/6692121349", adRequest, new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        mInterstitialAd1 = interstitialAd;
                        Log.d("", "onAdLoaded");

                        mInterstitialAd1.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                // Called when fullscreen content is dismissed.
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(AdError adError) {
                                // Called when fullscreen content failed to show.
                                Log.d("TAG", "The ad failed to show.");
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when fullscreen content is shown.
                                // Make sure to set your reference to null so you don't
                                // show it a second time.
                                mInterstitialAd1 = null;
                                Log.d("TAG", "The ad was shown.");
                            }
                        });
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        Log.d("", loadAdError.getMessage());
                        mInterstitialAd1 = null;
                    }
                });

               //Wallpaper Interstitial

                InterstitialAd.load(Home.this,"ca-app-pub-2979694091012217/4868986322", adRequest, new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        mInterstitialAd2 = interstitialAd;
                        Log.d("", "onAdLoaded");

                        mInterstitialAd2.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                // Called when fullscreen content is dismissed.
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(AdError adError) {
                                // Called when fullscreen content failed to show.
                                Log.d("TAG", "The ad failed to show.");
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when fullscreen content is shown.
                                // Make sure to set your reference to null so you don't
                                // show it a second time.
                                mInterstitialAd2 = null;
                                Log.d("TAG", "The ad was shown.");
                            }
                        });
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        Log.d("", loadAdError.getMessage());
                        mInterstitialAd2 = null;
                    }
                });

                //Moral Stories

                InterstitialAd.load(Home.this,"ca-app-pub-2979694091012217/6918038978", adRequest, new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        mInterstitialAd3 = interstitialAd;
                        Log.d("", "onAdLoaded");

                        mInterstitialAd3.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                // Called when fullscreen content is dismissed.
                                Log.d("TAG", "The ad was dismissed.");

                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(AdError adError) {
                                // Called when fullscreen content failed to show.
                                Log.d("TAG", "The ad failed to show.");
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when fullscreen content is shown.
                                // Make sure to set your reference to null so you don't
                                // show it a second time.
                                mInterstitialAd3 = null;
                                Log.d("TAG", "The ad was shown.");
                            }
                        });
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        Log.d("", loadAdError.getMessage());
                        mInterstitialAd3 = null;
                    }
                });


                //Shloks

                InterstitialAd.load(Home.this,"ca-app-pub-2979694091012217/8808231331", adRequest, new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        mInterstitialAd4 = interstitialAd;
                        Log.d("", "onAdLoaded");

                        mInterstitialAd4.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                // Called when fullscreen content is dismissed.
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(AdError adError) {
                                // Called when fullscreen content failed to show.
                                Log.d("TAG", "The ad failed to show.");
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when fullscreen content is shown.
                                // Make sure to set your reference to null so you don't
                                // show it a second time.
                                mInterstitialAd4 = null;
                                Log.d("TAG", "The ad was shown.");
                            }
                        });
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        Log.d("", loadAdError.getMessage());
                        mInterstitialAd4 = null;
                    }
                });




            }
        });


        //Advertisements






                videoBtn = findViewById(R.id.videobtn);
                photoBtn = findViewById(R.id.photobtn);
                shlok = findViewById(R.id.shlokas);
                wallpaper = findViewById(R.id.wallpaper);

                videoBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(Home.this, MainActivity.class));
                        if (mInterstitialAd1 != null) {
                            mInterstitialAd1.show(Home.this);
                        } else {

                        }
                        Toast.makeText(Home.this, "Swipe up", Toast.LENGTH_SHORT).show();
                    }
                });

                photoBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        startActivity(new Intent(Home.this, PhotoActivity.class));
                        if (mInterstitialAd3 != null) {
                            mInterstitialAd3.show(Home.this);
                        } else {

                        }
                        Toast.makeText(Home.this, "Swipe Right", Toast.LENGTH_SHORT).show();
                    }
                });


                shlok.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(Home.this, shlokas.class));
                        if (mInterstitialAd4 != null) {
                            mInterstitialAd4.show(Home.this);
                        } else {

                        }
                    }
                });

                wallpaper.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(Home.this, SecongPage.class));
                        if (mInterstitialAd2 != null) {
                            mInterstitialAd2.show(Home.this);
                        } else {

                        }
                    }
                });


            }


    }
