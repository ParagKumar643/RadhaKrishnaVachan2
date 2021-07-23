package com.bhram.radhakrishnavachanpka;

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

//    final Handler handler = new Handler();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //TimerSetting

//        handler.postDelayed(new Runnable() {
//                                               @Override
//                                               public void run() {
//                                                   interstitialShow();
//                                                   handler.postDelayed(this,7000);
//                                               }
//                                           }, 10000
//        );


        //Time setting




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


        a.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119425/2021-05-05_14-01-25_urn5j3.mkv";
        b.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119421/2021-05-05_14-31-30_qilt8g.mkv";
        c.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119420/2021-05-05_14-22-24_ut5vmm.mkv";
        d.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119420/2021-05-05_14-28-43_mpgfni.mkv";
        e.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119419/2021-05-05_14-25-51_thldvw.mkv";
        f.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119418/2021-05-05_14-15-35_k6vo7m.mkv";
        g.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119417/2021-05-05_14-10-33_goevcq.mkv";
        h.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119415/2021-05-05_13-56-26_l12qmp.mkv";
        i.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119415/2021-05-05_14-04-18_czl6qy.mkv";

        videoItems.add(a);
        videoItems.add(b);
        videoItems.add(c);
        videoItems.add(d);
        videoItems.add(e);
        videoItems.add(f);
        videoItems.add(g);
        videoItems.add(h);
        videoItems.add(i);


        VideoItem j= new VideoItem(); j.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119415/2021-05-05_13-40-46_uhdikb.mkv";  videoItems.add(j);
        VideoItem l= new VideoItem(); l.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119414/2021-05-05_13-53-33_bzdzwb.mkv";  videoItems.add(l);
        VideoItem m= new VideoItem(); m.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119413/2021-05-05_13-44-28_v792ha.mkv";  videoItems.add(m);
        VideoItem n= new VideoItem(); n.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119414/2021-05-05_13-38-01_cotcvf.mkv";  videoItems.add(n);
        VideoItem o= new VideoItem(); o.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119412/2021-05-05_13-36-07_mxxems.mkv";  videoItems.add(o);
        VideoItem p= new VideoItem(); p.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119411/2021-05-05_12-37-01_jzupxa.mkv";  videoItems.add(p);
        VideoItem q= new VideoItem(); q.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119409/2021-05-05_12-42-55_cixarl.mkv";  videoItems.add(q);
        VideoItem r= new VideoItem(); r.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119410/2021-05-05_13-19-40_egttl1.mkv";  videoItems.add(r);
        VideoItem s= new VideoItem(); s.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119410/2021-05-05_13-26-11_qabosb.mkv";  videoItems.add(s);
        VideoItem t= new VideoItem(); t.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119410/2021-05-05_13-21-48_hpdzkd.mkv";  videoItems.add(t);
        VideoItem u= new VideoItem(); u.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119409/2021-05-05_13-17-15_stg8cg.mkv";  videoItems.add(u);
        VideoItem vv= new VideoItem(); vv.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119406/2021-05-05_12-55-27_dcq7ug.mkv";  videoItems.add(vv);
        VideoItem w= new VideoItem(); w.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119407/2021-05-05_12-30-41_dofxr2.mkv";  videoItems.add(w);
        VideoItem x= new VideoItem(); x.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119406/2021-05-05_12-59-38_rnvn36.mkv";  videoItems.add(x);
        VideoItem y= new VideoItem(); y.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119406/2021-05-05_12-48-51_hcawxq.mkv";  videoItems.add(y);
        VideoItem z= new VideoItem(); z.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119405/2021-05-05_12-57-14_qjlo0x.mkv";  videoItems.add(z);
        VideoItem qq= new VideoItem(); qq.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119402/2021-05-05_12-46-59_zjhd1j.mkv";  videoItems.add(qq);
        VideoItem ww= new VideoItem(); ww.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119403/2021-05-05_14-40-24_qj7ixb.mkv";  videoItems.add(ww);
        VideoItem ee= new VideoItem(); ee.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119402/2021-05-05_12-39-59_yvktwe.mkv";  videoItems.add(ee);
        VideoItem rr= new VideoItem(); rr.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119401/2021-05-05_14-38-14_pkyyrz.mkv";  videoItems.add(rr);
        VideoItem tt= new VideoItem(); tt.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119399/2021-05-05_14-35-35_zbzfve.mkv";  videoItems.add(tt);
        VideoItem yy= new VideoItem(); yy.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119389/2021-05-05_14-18-13_hpwi8n.mkv";  videoItems.add(yy);
        VideoItem uu= new VideoItem(); uu.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119388/2021-05-05_14-20-42_uenxpn.mkv";  videoItems.add(uu);
        VideoItem ii= new VideoItem(); ii.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119386/2021-05-05_14-13-28_hpxtic.mkv";  videoItems.add(ii);
        VideoItem oo= new VideoItem(); oo.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119381/2021-05-05_14-07-02_qxiqie.mkv";  videoItems.add(oo);
        VideoItem pp= new VideoItem(); pp.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119378/2021-05-05_14-08-51_wcgfqd.mkv";  videoItems.add(pp);
        VideoItem aa= new VideoItem(); aa.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119372/2021-05-05_13-59-50_cvunb5.mkv";  videoItems.add(aa);
        VideoItem ss= new VideoItem(); ss.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119372/2021-05-05_13-51-21_n48zup.mkv";  videoItems.add(ss);
        VideoItem dd= new VideoItem(); dd.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119370/2021-05-05_13-49-12_kubtok.mkv";  videoItems.add(dd);
        VideoItem ff= new VideoItem(); ff.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119367/2021-05-05_13-47-37_cxau2d.mkv";  videoItems.add(ff);
        VideoItem gg= new VideoItem(); gg.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119357/2021-05-05_13-33-44_s1pals.mkv";  videoItems.add(gg);
        VideoItem hh= new VideoItem(); hh.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119354/2021-05-05_13-31-51_iyun3q.mkv";  videoItems.add(hh);
        VideoItem jj= new VideoItem(); jj.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119355/2021-05-05_13-40-31_shspuo.mkv";  videoItems.add(jj);
        VideoItem kk= new VideoItem(); kk.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119352/2021-05-05_13-29-42_ahrakx.mkv";  videoItems.add(kk);
        VideoItem ll= new VideoItem(); ll.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119341/2021-05-05_13-14-56_hpj4in.mkv";  videoItems.add(ll);
        VideoItem zz= new VideoItem(); zz.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119333/2021-05-05_12-53-31_bsuhg7.mkv";  videoItems.add(zz);
        VideoItem xx= new VideoItem(); xx.videoURL = "https://res.cloudinary.com/dkt6cdroa/video/upload/v1626119324/2021-05-05_12-51-06_wnzq2q.mkv";  videoItems.add(xx);
        VideoItem cc= new VideoItem(); cc.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120708/RADHAY_1_dv42mc.mp4";  videoItems.add(cc);
        VideoItem vvv= new VideoItem(); vvv.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120708/RADHEY_1_vpopne.mp4";  videoItems.add(vvv);
        VideoItem bb= new VideoItem(); bb.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120707/Radhe_radhe_6_aprmg7.mp4";  videoItems.add(bb);
        VideoItem nn= new VideoItem(); nn.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120707/RADHE_1_numjg9.mp4";  videoItems.add(nn);
        VideoItem mm= new VideoItem(); mm.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120707/Radhe_radhe_3_fa9et2.mp4";  videoItems.add(mm);
        VideoItem qw= new VideoItem(); qw.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120706/RADHER_4_eogwin.mp4";  videoItems.add(qw);
        VideoItem we= new VideoItem(); we.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120707/RAA0AD_1_drcfud.mp4";  videoItems.add(we);
        VideoItem er= new VideoItem(); er.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120706/RADHER_1_jhuob6.mp4";  videoItems.add(er);
        VideoItem rt= new VideoItem(); rt.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120705/RADHEK_3_wvtwos.mp4";  videoItems.add(rt);
        VideoItem ty= new VideoItem(); ty.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120705/RADHEK_2_xbwr5i.mp4";  videoItems.add(ty);
        VideoItem yu= new VideoItem(); yu.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120706/RADHER_1_jhuob6.mp4";  videoItems.add(yu);
        VideoItem ui= new VideoItem(); ui.videoURL = "";  videoItems.add(ui);

        //reels
        VideoItem uio= new VideoItem(); uio.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120705/RADHEK_3_wvtwos.mp4";  videoItems.add(uio);
        VideoItem op= new VideoItem(); op.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120705/RADHEK_2_xbwr5i.mp4";  videoItems.add(op);
        VideoItem pa= new VideoItem(); pa.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120705/RADHEK_4_wekbdz.mp4";  videoItems.add(pa);
        VideoItem as= new VideoItem(); as.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120704/RADHEK_1_ibxv4n.mp4";  videoItems.add(as);
        VideoItem sd= new VideoItem(); sd.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120704/Radhay_radhay_6_yhwj44.mp4";  videoItems.add(sd);
        VideoItem df= new VideoItem(); df.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120703/MURLID_2_unjjrp.mp4";  videoItems.add(df);
        VideoItem dfg= new VideoItem(); dfg.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120703/Radha_ne_krishn_ko_dekh_liya_dau_wxpzfm.mp4";  videoItems.add(dfg);
        VideoItem fg= new VideoItem(); fg.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120703/Radhay_radhay_8_whvtyf.mp4";  videoItems.add(fg);
        VideoItem gh= new VideoItem(); gh.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120703/MURLI_1_ar8fyz.mp4";  videoItems.add(gh);
        VideoItem hj= new VideoItem(); hj.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120702/159923843_424130105323955_4201893658006948443_n_fygkwg.mp4";  videoItems.add(hj);
        VideoItem jk= new VideoItem(); jk.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120701/Jai_Shree_Krishna_2_iprd9s.mp4";  videoItems.add(jk);
        VideoItem kl= new VideoItem(); kl.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120701/MURLID_1_k37tvu.mp4";  videoItems.add(kl);
        VideoItem lz= new VideoItem(); lz.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120701/Jai_Shree_Krishna_radhay_radhay_xzpitm.mp4";  videoItems.add(lz);
        VideoItem xc= new VideoItem(); xc.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120699/152726668_1115944628829189_9016766401158680_n_lvuyvd.mp4";  videoItems.add(xc);
        VideoItem cv= new VideoItem(); cv.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120697/159844796_1151463228658861_5627008573323872653_n_blgqwy.mp4";  videoItems.add(cv);
        VideoItem cvv= new VideoItem(); cvv.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120700/JAISHR_2_j3ax5y.mp4";  videoItems.add(cvv);
        VideoItem vb= new VideoItem(); vb.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120698/160247715_742558433286357_1683344407520953386_n_xrgwdc.mp4";  videoItems.add(vb);
        VideoItem bn= new VideoItem(); bn.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120699/DOLIKE_1_jamkzu.mp4";  videoItems.add(bn);
        VideoItem nm= new VideoItem(); nm.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120699/HAREKR_1_ujhwvd.mp4";  videoItems.add(nm);
        VideoItem qa= new VideoItem(); qa.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120698/177674042_531774634859663_7578783723358216906_n_lysaiz.mp4";  videoItems.add(qa);
        VideoItem ws= new VideoItem(); ws.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120697/154757831_115611643868950_8938604567233526787_n_woeucc.mp4";  videoItems.add(ws);
        VideoItem ed= new VideoItem(); ed.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120695/139447876_546208580089504_5695379078425350062_n.mp4_c5v6cl.mp4";  videoItems.add(ed);
        VideoItem rf= new VideoItem(); rf.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120696/119206660_176091607396694_5008617973335764792_n.mp4_sor3tg.mp4";  videoItems.add(rf);
        VideoItem tg= new VideoItem(); tg.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120695/96288871_533574930860202_6015663195520378306_n.mp4_lll3hn.mp4";  videoItems.add(tg);
        VideoItem yh= new VideoItem(); yh.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120695/124329159_977616366095766_979696972929610387_n.mp4_wp89sl.mp4";  videoItems.add(yh);
        VideoItem uj= new VideoItem(); uj.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120695/145821309_452177535911773_1155958689560898108_n.mp4_jnsuft.mp4";  videoItems.add(uj);
        VideoItem ik= new VideoItem(); ik.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120694/94231743_232143184700441_5473209172231541954_n.mp4-1_cjltll.mp4";  videoItems.add(ik);
        VideoItem ol= new VideoItem(); ol.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120693/_RADHA_2_ksamcf.mp4";  videoItems.add(ol);
        VideoItem pl= new VideoItem(); pl.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120694/94102015_1061369840917002_6421248290884524447_n.mp4_ndtsfc.mp4";  videoItems.add(pl);
        VideoItem az= new VideoItem(); az.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120694/94231743_232143184700441_5473209172231541954_n.mp4_xaey8v.mp4";  videoItems.add(az);
        VideoItem sx= new VideoItem(); sx.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120694/94231743_232143184700441_5473209172231541954_n.mp4_xaey8v.mp4";  videoItems.add(sx);
        VideoItem dc= new VideoItem(); dc.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120692/90968343_2687000981572482_8070850882480198902_n.mp4_ypgl9f.mp4";  videoItems.add(dc);
        VideoItem fv= new VideoItem(); fv.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120692/93937448_104106621217107_4370376480459981133_n.mp4-1_qhgavq.mp4";  videoItems.add(fv);
        VideoItem gb= new VideoItem(); gb.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120692/_RADHA_KRISHNA__._xyhaob.mp4";  videoItems.add(gb);
        VideoItem hn= new VideoItem(); hn.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120692/93937448_104106621217107_4370376480459981133_n.mp4_gkkz9s.mp4";  videoItems.add(hn);
        VideoItem jm= new VideoItem(); jm.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120691/_KANHA_1_rvk75g.mp4";  videoItems.add(jm);
        VideoItem km= new VideoItem(); km.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120690/RADHE_1_lfyxhe.mp4";  videoItems.add(km);
        VideoItem kmqs= new VideoItem(); kmqs.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120690/RADHE_1_lfyxhe.mp4";  videoItems.add(kmqs);
        VideoItem qz= new VideoItem(); qz.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120690/B78A2_1_skabzl.mp4";  videoItems.add(qz);
        VideoItem wx= new VideoItem(); wx.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120690/B6AF6_1_bgcrpz.mp4";  videoItems.add(wx);
        VideoItem ec= new VideoItem(); ec.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120689/BA6AB_1_m1jbns.mp4";  videoItems.add(ec);
        VideoItem rv= new VideoItem(); rv.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120689/BEATK_2_yrplzx.mp4";  videoItems.add(rv);
        VideoItem tb= new VideoItem(); tb.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120689/BA6AB_1_m1jbns.mp4";  videoItems.add(tb);
        VideoItem yn= new VideoItem(); yn.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120688/BDAF7_1_hjqsjw.mp4";  videoItems.add(yn);
        VideoItem um= new VideoItem(); um.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120688/B90B0_1_hup1rd.mp4";  videoItems.add(um);
        VideoItem iii= new VideoItem(); iii.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120688/B519B_1_e0e2qm.mp4";  videoItems.add(iii);
        VideoItem qp= new VideoItem(); qp.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120687/B1E99_1_bjxf5n.mp4";  videoItems.add(qp);
        VideoItem wo= new VideoItem(); wo.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120687/BEATK_4_bvbjwr.mp4";  videoItems.add(wo);
        VideoItem qi= new VideoItem(); qi.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120687/BEATK_1_dpqbgt.mp4";  videoItems.add(qi);
        VideoItem qu= new VideoItem(); qu.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120687/B363E_1_jgbzob.mp4";  videoItems.add(qu);
        VideoItem qy= new VideoItem(); qy.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120686/BE4F8_1_lu2lxh.mp4";  videoItems.add(qy);
        VideoItem qt= new VideoItem(); qt.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120687/BEATK_3_xggftk.mp4";  videoItems.add(qt);
        VideoItem qr= new VideoItem(); qr.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120686/B8111_1_dh0kaz.mp4";  videoItems.add(qr);
        VideoItem qe= new VideoItem(); qe.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120685/R94FD_1_fnsymr.mp4";  videoItems.add(qe);
        VideoItem wp= new VideoItem(); wp.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120685/RE8F6_1_ciicvc.mp4";  videoItems.add(wp);
        VideoItem wi= new VideoItem(); wi.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120685/B3F7F_1_yymvhg.mp4";  videoItems.add(wi);
        VideoItem wu= new VideoItem(); wu.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120684/RADHA_2_ugu40z.mp4";  videoItems.add(wu);
        VideoItem wy= new VideoItem(); wy.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120684/RADHA_3_xl9boo.mp4";  videoItems.add(wy);
        VideoItem wt= new VideoItem(); wt.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120684/RADHA_4_kce49t.mp4";  videoItems.add(wt);
        VideoItem wr= new VideoItem(); wr.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120682/MURLI_3_vcmxft.mp4";  videoItems.add(wr);
        VideoItem wc= new VideoItem(); wc.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120683/MURLI_2_quwpzy.mp4";  videoItems.add(wc);
        VideoItem ep= new VideoItem(); ep.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120683/R8A45_1_jgazif.mp4";  videoItems.add(ep);
        VideoItem eo= new VideoItem(); eo.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120682/MURLI_4_q33lrj.mp4";  videoItems.add(eo);
        VideoItem ei= new VideoItem(); ei.videoURL = "https://res.cloudinary.com/dd2uutffb/video/upload/v1626120683/RADHA_1_i1elxs.mp4";  videoItems.add(ei);





        //many timesss
        Collections.shuffle(videoItems);
        videosViewPager.setAdapter(new VideosAdapter(videoItems));

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