package com.bhram.radhakrishnavachanpk;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import androidx.viewpager2.widget.ViewPager2;

import android.content.Context;
import android.content.Intent;

import android.os.Bundle;

import android.os.Handler;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


import com.google.android.gms.ads.AdError;
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
import java.util.*;

public class MainActivity extends AppCompatActivity {


    public ArrayList<VideoItem> videoItems = new ArrayList<>();
    VideosAdapter test = new VideosAdapter(videoItems);
    public String ans = "Jai mata di";
    public Context context;

    //ads
    private ViewPager2 viewPager2;
    private VideosAdapter videosAdapter;
    private Runnable runnable;


    private AdView mAdView;
    final Handler handler = new Handler();

//    public Handler handler = new Handler();
    private InterstitialAd mInterstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //TimerSetting

        handler.postDelayed(new Runnable() {
                                               @Override
                                               public void run() {
                                                   interstitialShow();
                                                   handler.postDelayed(this,7000);
                                               }
                                           }, 7000
        );


        //Time setting

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
                //INter



                AdRequest adRequest = new AdRequest.Builder().build();

                InterstitialAd.load(MainActivity.this,"ca-app-pub-2979694091012217/8688794953", adRequest, new InterstitialAdLoadCallback() {
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




        //Swap feature
        final ViewPager2 videosViewPager =  findViewById(R.id.videosViewPager);


        VideoItem a = new VideoItem();
        VideoItem b= new VideoItem();
        VideoItem c= new VideoItem();
        VideoItem d= new VideoItem();
        VideoItem e= new VideoItem();
        VideoItem f= new VideoItem();
        VideoItem g= new VideoItem();
        VideoItem h= new VideoItem();
        VideoItem i= new VideoItem();


        a.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1613737604/4_bzx80p.mkv";
        b.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1613737590/1_jjwbtc.mkv";
        c.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1613737589/5_cirqvn.mkv";
        d.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1613737588/6_j6o84w.mkv";
        e.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1613737585/9_yg5gcr.mkv";
        f.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1613737585/8_jcxuqa.mkv";
        g.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1613737584/7_qgijyc.mkv";
        h.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1613737582/2_azeeal.mkv";
        i.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1613737580/3_l4zrfw.mkv";

        videoItems.add(a);
        videoItems.add(b);
        videoItems.add(c);
        videoItems.add(d);
        videoItems.add(e);
        videoItems.add(f);
        videoItems.add(g);
        videoItems.add(h);
        videoItems.add(i);


        VideoItem j= new VideoItem(); j.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373051/Latest/2021-05-05_13-53-33_ztxbgd.mkv";  videoItems.add(j);
        VideoItem l= new VideoItem(); l.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373053/Latest/2021-05-05_14-04-18_vuat92.mkv";  videoItems.add(l);
        VideoItem m= new VideoItem(); m.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373059/Latest/2021-05-05_14-22-24_u61sor.mkv";  videoItems.add(m);
        VideoItem n= new VideoItem(); n.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373051/Latest/2021-05-05_13-40-46_zfzkd0.mkv";  videoItems.add(n);
        VideoItem o= new VideoItem(); o.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373054/Latest/2021-05-05_14-10-33_e7kdjx.mkv";  videoItems.add(o);
        VideoItem p= new VideoItem(); p.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373059/Latest/2021-05-05_14-28-43_k5pwiv.mkv";  videoItems.add(p);
        VideoItem q= new VideoItem(); q.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373057/Latest/2021-05-05_14-01-25_op0gly.mkv";  videoItems.add(q);
        VideoItem r= new VideoItem(); r.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373056/Latest/2021-05-05_14-15-35_gi3duy.mkv";  videoItems.add(r);
        VideoItem s= new VideoItem(); s.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373058/Latest/2021-05-05_14-25-51_yuawlh.mkv";  videoItems.add(s);
        VideoItem t= new VideoItem(); t.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373052/Latest/2021-05-05_13-56-26_cgqkzu.mkv";  videoItems.add(t);
        VideoItem u= new VideoItem(); u.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373059/Latest/2021-05-05_14-31-30_zyki5o.mkv";  videoItems.add(u);
        VideoItem vv= new VideoItem(); vv.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373059/Latest/2021-05-05_14-31-30_zyki5o.mkv";  videoItems.add(vv);
        VideoItem w= new VideoItem(); w.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373049/Latest/2021-05-05_13-36-07_sbr2jq.mkv";  videoItems.add(w);
        VideoItem x= new VideoItem(); x.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373050/Latest/2021-05-05_13-44-28_q1dz5c.mkv";  videoItems.add(x);
        VideoItem y= new VideoItem(); y.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373050/Latest/2021-05-05_13-38-01_qpbpti.mkv";  videoItems.add(y);
        VideoItem z= new VideoItem(); z.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373047/Latest/2021-05-05_12-46-59_roxe9z.mkv";  videoItems.add(z);
        VideoItem qq= new VideoItem(); qq.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373044/Latest/2021-05-05_13-19-40_jtznrv.mkv";  videoItems.add(qq);
        VideoItem ww= new VideoItem(); ww.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373046/Latest/2021-05-05_13-17-15_ypg4hy.mkv";  videoItems.add(ww);
        VideoItem ee= new VideoItem(); ee.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373044/Latest/2021-05-05_12-42-55_lb1ifw.mkv";  videoItems.add(ee);
        VideoItem rr= new VideoItem(); rr.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373046/Latest/2021-05-05_13-21-48_oifvvd.mkv";  videoItems.add(rr);
        VideoItem tt= new VideoItem(); tt.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373046/Latest/2021-05-05_13-26-11_utyhlb.mkv";  videoItems.add(tt);
        VideoItem yy= new VideoItem(); yy.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373043/Latest/2021-05-05_12-48-51_kv8jsy.mkv";  videoItems.add(yy);
        VideoItem uu= new VideoItem(); uu.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373043/Latest/2021-05-05_12-57-14_v7t98w.mkv";  videoItems.add(uu);
        VideoItem ii= new VideoItem(); ii.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373042/Latest/2021-05-05_12-55-27_yod6lw.mkv";  videoItems.add(ii);
        VideoItem oo= new VideoItem(); oo.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373042/Latest/2021-05-05_12-59-38_nptpv8.mkv";  videoItems.add(oo);
        VideoItem pp= new VideoItem(); pp.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373041/Latest/2021-05-05_12-39-59_girl4b.mkv";  videoItems.add(pp);
        VideoItem aa= new VideoItem(); aa.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373039/Latest/2021-05-05_12-30-41_ljibu6.mkv";  videoItems.add(aa);
        VideoItem ss= new VideoItem(); ss.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373039/Latest/2021-05-05_12-37-01_xlikz0.mkv";  videoItems.add(ss);
        VideoItem dd= new VideoItem(); dd.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373038/Latest/2021-05-05_14-38-14_jxxq4f.mkv";  videoItems.add(dd);
        VideoItem ff= new VideoItem(); ff.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373037/Latest/2021-05-05_14-35-35_ao3zwx.mkv";  videoItems.add(ff);
        VideoItem gg= new VideoItem(); gg.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373037/Latest/2021-05-05_14-40-24_smfhpy.mkv";  videoItems.add(gg);
        VideoItem hh= new VideoItem(); hh.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373020/Latest/2021-05-05_14-13-28_d6wip2.mkv";  videoItems.add(hh);
        VideoItem jj= new VideoItem(); jj.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373025/Latest/2021-05-05_14-20-42_tt3iav.mkv";  videoItems.add(jj);
        VideoItem kk= new VideoItem(); kk.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373024/Latest/2021-05-05_14-18-13_nzav3k.mkv";  videoItems.add(kk);
        VideoItem ll= new VideoItem(); ll.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373014/Latest/2021-05-05_14-08-51_ufpwbj.mkv";  videoItems.add(ll);
        VideoItem zz= new VideoItem(); zz.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373012/Latest/2021-05-05_14-07-02_sgiimm.mkv";  videoItems.add(zz);
        VideoItem xx= new VideoItem(); xx.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373012/Latest/2021-05-05_14-07-02_sgiimm.mkv";  videoItems.add(xx);
        VideoItem cc= new VideoItem(); cc.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373008/Latest/2021-05-05_13-59-50_ycwbey.mkv";  videoItems.add(cc);
        VideoItem vvv= new VideoItem(); vvv.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373001/Latest/2021-05-05_13-47-37_hrx2eo.mkv";  videoItems.add(vvv);
        VideoItem bb= new VideoItem(); bb.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373002/Latest/2021-05-05_13-49-12_mtyrgs.mkv";  videoItems.add(bb);
        VideoItem nn= new VideoItem(); nn.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620373002/Latest/2021-05-05_13-51-21_clznjf.mkv";  videoItems.add(nn);
        VideoItem mm= new VideoItem(); mm.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620372997/Latest/2021-05-05_13-31-51_aghmko.mkv";  videoItems.add(mm);
        VideoItem qw= new VideoItem(); qw.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620372989/Latest/2021-05-05_13-33-44_pmedgm.mkv";  videoItems.add(qw);
        VideoItem we= new VideoItem(); we.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620372985/Latest/2021-05-05_13-29-42_qk2yie.mkv";  videoItems.add(we);
        VideoItem er= new VideoItem(); er.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620372985/Latest/2021-05-05_13-40-31_kzrzut.mkv";  videoItems.add(er);
        VideoItem rt= new VideoItem(); rt.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620372971/Latest/2021-05-05_13-14-56_w8gqxy.mkv";  videoItems.add(rt);
        VideoItem ty= new VideoItem(); ty.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620372968/Latest/2021-05-05_12-51-06_qxbkck.mkv";  videoItems.add(ty);
        VideoItem yu= new VideoItem(); yu.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620372968/Latest/2021-05-05_12-53-31_bvxexf.mkv";  videoItems.add(yu);
        VideoItem ui= new VideoItem(); ui.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620372985/Latest/2021-05-05_13-40-31_kzrzut.mkv";  videoItems.add(ui);

        //reels
        VideoItem uio= new VideoItem(); uio.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728544/Reels/RADHEY_1_psyyms.mp4";  videoItems.add(uio);
        VideoItem op= new VideoItem(); op.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728544/Reels/RADHAY_1_rl6gda.mp4";  videoItems.add(op);
        VideoItem pa= new VideoItem(); pa.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728544/Reels/RADHER_4_dxq6gb.mp4";  videoItems.add(pa);
        VideoItem as= new VideoItem(); as.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728544/Reels/Radhe_radhe_3_uzotph.mp4";  videoItems.add(as);
        VideoItem sd= new VideoItem(); sd.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728543/Reels/Radhe_radhe_6_i08xqb.mp4";  videoItems.add(sd);
        VideoItem df= new VideoItem(); df.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728542/Reels/RADHER_1_try9wc.mp4";  videoItems.add(df);
        VideoItem dfg= new VideoItem(); dfg.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728541/Reels/RAA0AD_1_w443mp.mp4";  videoItems.add(dfg);
        VideoItem fg= new VideoItem(); fg.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728541/Reels/RADHEK_4_uvkuxx.mp4";  videoItems.add(fg);
        VideoItem gh= new VideoItem(); gh.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728540/Reels/RADHEK_1_b1pzoh.mp4";  videoItems.add(gh);
        VideoItem hj= new VideoItem(); hj.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728540/Reels/RADHEK_3_olakgk.mp4";  videoItems.add(hj);
        VideoItem jk= new VideoItem(); jk.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728539/Reels/RADHEK_2_xkmsia.mp4";  videoItems.add(jk);
        VideoItem kl= new VideoItem(); kl.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728538/Reels/Jai_Shree_Krishna_2_xkvqdr.mp4";  videoItems.add(kl);
        VideoItem lz= new VideoItem(); lz.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728538/Reels/RADHE_1_ittzz6.mp4";  videoItems.add(lz);
        VideoItem xc= new VideoItem(); xc.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728538/Reels/Radhay_radhay_8_ant84e.mp4";  videoItems.add(xc);
        VideoItem cv= new VideoItem(); cv.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728537/Reels/Radha_ne_krishn_ko_dekh_liya_dau_jxzlrs.mp4";  videoItems.add(cv);
        VideoItem cvv= new VideoItem(); cvv.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728537/Reels/Radhay_radhay_6_z9l1lq.mp4";  videoItems.add(cvv);
        VideoItem vb= new VideoItem(); vb.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728536/Reels/MURLID_1_zpotef.mp4";  videoItems.add(vb);
        VideoItem bn= new VideoItem(); bn.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728535/Reels/MURLID_2_y2jufp.mp4";  videoItems.add(bn);
        VideoItem nm= new VideoItem(); nm.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728533/Reels/Jai_Shree_Krishna_radhay_radhay_wbug3w.mp4";  videoItems.add(nm);
        VideoItem qa= new VideoItem(); qa.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728533/Reels/154757831_115611643868950_8938604567233526787_n_j3fpik.mp4";  videoItems.add(qa);
        VideoItem ws= new VideoItem(); ws.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728532/Reels/160247715_742558433286357_1683344407520953386_n_rxrjpq.mp4";  videoItems.add(ws);
        VideoItem ed= new VideoItem(); ed.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728532/Reels/JAISHR_2_pdvb5x.mp4";  videoItems.add(ed);
        VideoItem rf= new VideoItem(); rf.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728531/Reels/HAREKR_1_pwgbzz.mp4";  videoItems.add(rf);
        VideoItem tg= new VideoItem(); tg.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728530/Reels/DOLIKE_1_chcxm7.mp4";  videoItems.add(tg);
        VideoItem yh= new VideoItem(); yh.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728530/Reels/96288871_533574930860202_6015663195520378306_n.mp4_zmtvq2.mp4";  videoItems.add(yh);
        VideoItem uj= new VideoItem(); uj.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728529/Reels/119206660_176091607396694_5008617973335764792_n.mp4_ntawhc.mp4";  videoItems.add(uj);
        VideoItem ik= new VideoItem(); ik.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728529/Reels/177674042_531774634859663_7578783723358216906_n_nj6m3s.mp4";  videoItems.add(ik);
        VideoItem ol= new VideoItem(); ol.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728528/Reels/159923843_424130105323955_4201893658006948443_n_ejunga.mp4";  videoItems.add(ol);
        VideoItem pl= new VideoItem(); pl.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728527/Reels/159844796_1151463228658861_5627008573323872653_n_btd0yj.mp4";  videoItems.add(pl);
        VideoItem az= new VideoItem(); az.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728526/Reels/_KANHA_1_kpy77a.mp4";  videoItems.add(az);
        VideoItem sx= new VideoItem(); sx.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728526/Reels/152726668_1115944628829189_9016766401158680_n_vtxknm.mp4";  videoItems.add(sx);
        VideoItem dc= new VideoItem(); dc.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728525/Reels/124329159_977616366095766_979696972929610387_n.mp4_zckk5j.mp4";  videoItems.add(dc);
        VideoItem fv= new VideoItem(); fv.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728525/Reels/139447876_546208580089504_5695379078425350062_n.mp4_yhbmwf.mp4";  videoItems.add(fv);
        VideoItem gb= new VideoItem(); gb.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728523/Reels/145821309_452177535911773_1155958689560898108_n.mp4_bkspvy.mp4";  videoItems.add(gb);
        VideoItem hn= new VideoItem(); hn.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728520/Reels/94231743_232143184700441_5473209172231541954_n.mp4-1_idffps.mp4";  videoItems.add(hn);
        VideoItem jm= new VideoItem(); jm.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728520/Reels/94102015_1061369840917002_6421248290884524447_n.mp4_eugi8n.mp4";  videoItems.add(jm);
        VideoItem km= new VideoItem(); km.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728520/Reels/93937448_104106621217107_4370376480459981133_n.mp4-1_dru8bk.mp4";  videoItems.add(km);
        VideoItem kmqs= new VideoItem(); kmqs.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728520/Reels/94231743_232143184700441_5473209172231541954_n.mp4_ozxpjr.mp4";  videoItems.add(kmqs);
        VideoItem qz= new VideoItem(); qz.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728519/Reels/_RADHA_KRISHNA__._zprlky.mp4";  videoItems.add(qz);
        VideoItem wx= new VideoItem(); wx.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728518/Reels/_RADHA_2_e6vlzm.mp4";  videoItems.add(wx);
        VideoItem ec= new VideoItem(); ec.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728518/Reels/93937448_104106621217107_4370376480459981133_n.mp4_nm4onv.mp4";  videoItems.add(ec);
        VideoItem rv= new VideoItem(); rv.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728518/Reels/90968343_2687000981572482_8070850882480198902_n.mp4_mh5f04.mp4";  videoItems.add(rv);
        VideoItem tb= new VideoItem(); tb.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728517/Reels/RADHE_1_x65tgx.mp4";  videoItems.add(tb);
        VideoItem yn= new VideoItem(); yn.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728515/Reels/B78A2_1_es4ggm.mp4";  videoItems.add(yn);
        VideoItem um= new VideoItem(); um.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728515/Reels/B6AF6_1_m3mcih.mp4";  videoItems.add(um);
        VideoItem iii= new VideoItem(); iii.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728514/Reels/BA6AB_1_hbqdhy.mp4";  videoItems.add(iii);
        VideoItem qp= new VideoItem(); qp.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728514/Reels/B519B_1_gjfily.mp4";  videoItems.add(qp);
        VideoItem wo= new VideoItem(); wo.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728514/Reels/BEATK_2_wulrgm.mp4";  videoItems.add(wo);
        VideoItem qi= new VideoItem(); qi.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728514/Reels/BDAF7_1_c2vj0j.mp4";  videoItems.add(qi);
        VideoItem qu= new VideoItem(); qu.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728513/Reels/B90B0_1_mibhzr.mp4";  videoItems.add(qu);
        VideoItem qy= new VideoItem(); qy.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728512/Reels/BEATK_4_rb8ets.mp4";  videoItems.add(qy);
        VideoItem qt= new VideoItem(); qt.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728512/Reels/B8111_1_jy1zwv.mp4";  videoItems.add(qt);
        VideoItem qr= new VideoItem(); qr.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728512/Reels/BEATK_3_twumoo.mp4";  videoItems.add(qr);
        VideoItem qe= new VideoItem(); qe.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728512/Reels/B1E99_1_hzxajy.mp4";  videoItems.add(qe);
        VideoItem wp= new VideoItem(); wp.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728512/Reels/B363E_1_aex8au.mp4";  videoItems.add(wp);
        VideoItem wi= new VideoItem(); wi.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728511/Reels/BEATK_1_dh3smw.mp4";  videoItems.add(wi);
        VideoItem wu= new VideoItem(); wu.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728509/Reels/BE4F8_1_hzlppd.mp4";  videoItems.add(wu);
        VideoItem wy= new VideoItem(); wy.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728509/Reels/R94FD_1_qwyzbs.mp4";  videoItems.add(wy);
        VideoItem wt= new VideoItem(); wt.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728509/Reels/RADHA_4_kdspgo.mp4";  videoItems.add(wt);
        VideoItem wr= new VideoItem(); wr.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728508/Reels/RADHA_3_oemkjg.mp4";  videoItems.add(wr);
        VideoItem wc= new VideoItem(); wc.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728507/Reels/B3F7F_1_me4c3q.mp4";  videoItems.add(wc);
        VideoItem ep= new VideoItem(); ep.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728504/Reels/RE8F6_1_bnm15b.mp4";  videoItems.add(ep);
        VideoItem eo= new VideoItem(); eo.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728503/Reels/MURLI_2_ffe3nv.mp4";  videoItems.add(eo);
        VideoItem ei= new VideoItem(); ei.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728502/Reels/RADHA_2_poyare.mp4";  videoItems.add(ei);
        VideoItem eu= new VideoItem(); eu.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728502/Reels/MURLI_1_kzetzk.mp4";  videoItems.add(eu);
        VideoItem ey= new VideoItem(); ey.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728539/Reels/RADHEK_2_xkmsia.mp4";  videoItems.add(ey);
        VideoItem et= new VideoItem(); et.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728499/Reels/MURLI_3_mqomjo.mp4";  videoItems.add(et);
        VideoItem rp= new VideoItem(); rp.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728499/Reels/RADHA_1_nterma.mp4";  videoItems.add(rp);
        VideoItem ro= new VideoItem(); ro.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728494/Reels/R8A45_1_feiw1l.mp4";  videoItems.add(ro);
        VideoItem ri= new VideoItem(); ri.videoURL = "https://res.cloudinary.com/dd7ydpm3j/video/upload/v1620728494/Reels/MURLI_4_vvwknx.mp4";  videoItems.add(ri);




        //many timesss
        Collections.shuffle(videoItems);
        videosViewPager.setAdapter(new VideosAdapter(videoItems));





    }
//Method of Ads
public void interstitialShow(){
    if (mInterstitialAd != null) {
        mInterstitialAd.show(MainActivity.this);
    } else {

    }
}
    //Share button
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId()){

            case R.id.share_button:
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(Intent.EXTRA_SUBJECT,"Radha Krishna");
                ans ="Radhe Krishna Vachan ♥️ \n"+ test.demo;
                sharingIntent.putExtra(Intent.EXTRA_TEXT, ans);


                startActivity(Intent.createChooser(sharingIntent,"Share Using"));





                 break;
        }
        return super.onOptionsItemSelected(item);
    }





}