package com.bhram.radhakrishnavachanpk;

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


    public Handler handler = new Handler();
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);

//Time Setting
        handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    interstitialShow();
                                }
                            }, 5000
        );

        //Ads
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
                //INter



                AdRequest adRequest = new AdRequest.Builder().build();

                InterstitialAd.load(PhotoActivity.this,"ca-app-pub-2979694091012217/3830741010", adRequest, new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        mInterstitialAd = interstitialAd;
                        Log.d("", "onAdLoaded");

                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                // Called when fullscreen content is dismissed.
                                Log.d("TAG", "The ad was dismissed.");
                                handler.postDelayed(new Runnable() {
                                                        @Override
                                                        public void run() {
                                                            interstitialShow();
                                                        }
                                                    }, 3000
                                );
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
                                mInterstitialAd = null;
                                Log.d("TAG", "The ad was shown.");
                            }
                        });
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        Log.d("", loadAdError.getMessage());
                        mInterstitialAd = null;
                    }
                });


                //inter
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

        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728431/Photos/95199059_237625500776754_8288032842047017348_n_zz3e5c.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728431/Photos/95233185_2786022671679168_3810535645168713841_n_npld0g.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728430/Photos/95025151_157128452447064_7081508854805378015_n_td7frq.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728430/Photos/94610987_353487088945318_795333900527563955_n_1_olo1hv.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728430/Photos/94440030_854073355097397_5952124245456534075_n-1_tspyle.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728430/Photos/95015629_270495013982436_6666234022230967922_n_byopyv.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728430/Photos/94833574_653644722082747_8896457998167781105_n_rzczfd.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728430/Photos/152394951_935260223882738_4120800304439155840_n_wwx7tt.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728430/Photos/94440030_854073355097397_5952124245456534075_n_i1hzmo.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728430/Photos/146963075_244215247306613_7967137895842873106_n_lwrqxz.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728430/Photos/94757917_238400277276896_1136264161486749378_n_wujzxt.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728429/Photos/145210044_3991371547569361_2981240931018470811_n_n4n1b4.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728429/Photos/145454499_2815867302016803_6664203672210813962_n_c5suxy.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728429/Photos/144652328_109497544472975_3811146389666691940_n_cfsi5t.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728429/Photos/144984375_1204992749916012_9035673995667643262_n_lk6gjx.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728428/Photos/94425712_149416969910964_1189047733474053758_n_on9og7.jpg"));

        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728428/Photos/94392933_249027306221500_4735758524569383614_n_lfotgr.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728428/Photos/144229330_911769292962005_5514745738900968274_n_jrat27.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728428/Photos/94236246_258884895250212_8781900082749088922_n-1_gv3yck.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728428/Photos/94392933_249027306221500_4735758524569383614_n-1_laeszl.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728428/Photos/144041577_934387277369582_5817706800267400347_n_nthgmo.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728427/Photos/144041577_239402154327948_1979156659909654746_n_hembuj.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728427/Photos/143298841_408109000466501_6288578466775937880_n_ggvp8k.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728426/Photos/142540986_159834329241425_931522751644786159_n_hg7krp.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728425/Photos/93943774_232627324667650_1253350745582674573_n_vey9gh.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728425/Photos/93944662_3876631949044076_6912388540965699560_n-1_jzrrn8.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728425/Photos/133100644_225369825747306_3061881705667526391_n_mouoce.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728424/Photos/131933586_713305592637990_6992951426977937312_n_zxih3g.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728423/Photos/127110012_133310501605669_1198232860855161980_n_dod0br.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728423/Photos/93803484_515328932466434_7334976502412652666_n_qfxb6l.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728422/Photos/124701682_198787571697345_8492606519673612552_n_ub8aqe.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728422/Photos/124184138_127051745596080_7219467660719409723_n_ghn2j0.jpg"));

        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728422/Photos/124394799_3574063002615000_6119407349031378555_n_mf8ysk.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728420/Photos/123361659_399550174758524_8941246153222471208_n_qzriz6.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728419/Photos/121004844_627145161498217_5164366407920911425_n_zp4yot.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728419/Photos/119682362_376589253744730_8512175728369597495_n_ach9ie.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728418/Photos/119048058_375720333440395_1484523018220414936_n_hut3js.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728417/Photos/117312651_167110451608308_7833939323242219547_n_harvea.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728414/Photos/93441684_1339456972916804_4947418673244206377_n_qwqftm.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728414/Photos/93401681_546026169674480_706698623414632154_n_yol9ls.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728414/Photos/109407712_323602012143106_7316503809656426774_n_lezeov.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728411/Photos/104418273_283643353008891_5570758969376844220_n_kdjknh.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728409/Photos/92438694_2637330113253770_9208725990511931906_n_stpoes.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728405/Photos/98262536_248291369917789_4159803722126745648_n_yiak6r.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728400/Photos/91530205_924018588051661_2126394028404659199_n_xo8uxn.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728396/Photos/95345100_2587233201537341_7387832654594968861_n_ztzun5.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728396/Photos/95420078_1136405183380743_6535297177760141544_n_mcnvag.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728395/Photos/90306543_1078138915899050_1794778317749676883_n_wussng.jpg"));

        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728395/Photos/90089857_240321253677341_441721865494620522_n_cwklpn.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728395/Photos/90332273_2256239514684939_6662030624116531096_n_nnrwul.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728395/Photos/95294476_385243242433049_231480122375519368_n_c8txkf.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728397/Photos/95695755_713981832704184_7398922115758797147_n_miwfer.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728397/Photos/95786132_529435514390454_2126468138631089293_n_qrxule.jpg"));
        data.add(new imageItem("https://res.cloudinary.com/dd7ydpm3j/image/upload/v1620728397/Photos/95904082_238841050682787_8015566541182930364_n_lmgqde.jpg"));

        Collections.shuffle(data);

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

    //Method of Ads
    public void interstitialShow(){
        if (mInterstitialAd != null) {
            mInterstitialAd.show(PhotoActivity.this);
        } else {

        }
    }
}