package com.bhram.radhakrishnavachanpka.wallpaper;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bhram.radhakrishnavachanpka.MainActivity;
import com.bhram.radhakrishnavachanpka.R;
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

public class SecongPage extends AppCompatActivity {

    RecyclerView rcvMain;
    ArrayList<String> imgArrylist=new ArrayList<>();
    private InterstitialAd mInterstitialAd;
    final Handler handler = new Handler();
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secong_page);



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


        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114546/96090763_670640387033382_6813343597557059333_n_imhgj1.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114546/96827885_563346067924572_7118080475409867773_n_bhcam7.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114546/96869590_558262321556662_3397542297201961680_n_c2639b.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114546/96138589_537592727120427_5811339290068180115_n_my3oes.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114546/96040348_646527669526731_2729801971603541969_n_t1hhmz.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114545/95956412_162439108594984_7200719429875853674_n_wzhqxa.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114545/95986433_528157724518342_4207767378471307126_n_xw1yqk.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114545/95973879_182254529599550_3164823902457927910_n_un639c.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114545/95695755_713981832704184_7398922115758797147_n_b7m0ps.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114545/95904082_238841050682787_8015566541182930364_n_xy5vzw.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114545/95786132_529435514390454_2126468138631089293_n_ejrieu.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114545/95666452_1492712610917114_3392029738390775368_n_wzjswi.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114545/95464321_2308494029454556_1561790410495363613_n_lt3kkb.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114545/95663151_555894981995961_170674993284131926_n_j9zoey.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114545/95508885_931132304011796_441453470472162908_n_o0ikz7.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114544/95359486_114191583384863_7105455518254971081_n_esqzhx.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114544/95420078_1136405183380743_6535297177760141544_n_etvw67.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114544/95443723_235962447460583_1421466877714861584_n_jkoy8h.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114543/94833574_653644722082747_8896457998167781105_n_ts42zj.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114544/95025151_157128452447064_7081508854805378015_n_uibbaw.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114544/95345100_2587233201537341_7387832654594968861_n_ajrr7s.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114544/95233185_2786022671679168_3810535645168713841_n_dsgb5a.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114544/94440030_854073355097397_5952124245456534075_n-1_agu5wp.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114544/95294476_385243242433049_231480122375519368_n_pw4abe.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114544/95199059_237625500776754_8288032842047017348_n_hcp98u.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114544/95015629_270495013982436_6666234022230967922_n_rpoced.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/video/upload/v1626114543/94231743_232143184700441_5473209172231541954_n.mp4_cqlasj.mp4");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114542/94392933_249027306221500_4735758524569383614_n_ydawqe.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114543/94757917_238400277276896_1136264161486749378_n_zqtskm.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114543/94610987_353487088945318_795333900527563955_n_1_ciwa3q.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114543/94440030_854073355097397_5952124245456534075_n_pmnsx7.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114543/94425712_149416969910964_1189047733474053758_n_fj5eah.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114543/94392933_249027306221500_4735758524569383614_n-1_hhhfym.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114543/94392933_249027306221500_4735758524569383614_n-1_hhhfym.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114542/94236246_258884895250212_8781900082749088922_n_n5unyx.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114543/94376920_166484021267954_2669874546208318103_n_kgokjn.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114542/94236246_258884895250212_8781900082749088922_n-1_kabj3p.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114542/93944662_3876631949044076_6912388540965699560_n_x7x09a.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114542/93943774_232627324667650_1253350745582674573_n-1_apdv43.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114542/94228492_659542354868265_7124148113087010205_n_nzljyp.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114542/93944662_3876631949044076_6912388540965699560_n-1_nbaem2.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114541/93943774_232627324667650_1253350745582674573_n_nbckfh.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114542/93932292_160848058720099_4245566253255076451_n_mrjc2a.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114541/93897067_574272116561783_2857117000978823768_n_1_zwfegh.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114541/93857571_230764691469365_3174742044125318331_n_vn1nkz.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114541/93810455_107688780786463_4915186396240191117_n_cmfs4p.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114541/93794199_646694245919468_280445271156195118_n_qxb048.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114541/93777732_119566243040550_4797816800108137499_n_1_elq5x2.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114541/93672066_909566566183130_705689613167969760_n_1_g2mlqb.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114541/93803484_515328932466434_7334976502412652666_n_gebho1.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114540/93769519_2519742198289110_8274180882992586272_n_ar6drl.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114540/93576246_156132819138185_9079346495119113021_n_rbjdwu.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114540/93757973_155687202513827_2417111934845482048_n_xckgho.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114540/93494298_833368420504528_4911831804698252625_n_oyntw4.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114540/93517743_538359000442713_9041300786346238870_n_thlnb5.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114540/93460986_887141718421749_423892034172174651_n_qxsl4h.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114540/93457588_151833969666499_5006926452334614795_n_yjsy8j.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114540/93456324_918150818635288_2360882506335365397_n_fxp8rg.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114540/93441684_1339456972916804_4947418673244206377_n_te7phk.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114540/93412066_505967043618267_2956498067929748493_n_bubneo.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114539/93401681_546026169674480_706698623414632154_n_y9sbiu.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114539/152394951_935260223882738_4120800304439155840_n_g3hzpt.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114539/146133582_466403761025687_8606879973496530319_n_oaa5ln.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114539/145454499_2815867302016803_6664203672210813962_n_ffzqnq.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114539/146963075_244215247306613_7967137895842873106_n_awohsj.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114539/145210044_3991371547569361_2981240931018470811_n_tsyvur.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114539/93334300_226918825411059_5001391095893524663_n_kgvygx.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114539/144984375_1204992749916012_9035673995667643262_n_agnswg.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114539/144652328_109497544472975_3811146389666691940_n_qvoejf.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114538/144229330_911769292962005_5514745738900968274_n_b81whp.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114538/144041577_934387277369582_5817706800267400347_n_q7vhks.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114538/93386280_564406187533301_1736062907264632133_n_nvcvnw.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114538/144041577_239402154327948_1979156659909654746_n_fbd6dy.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114538/93381263_235688151109515_1138017921841046069_n_c00jf3.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114538/143566186_449284633114013_4632265225431891163_n_pxyece.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114538/143419219_417262142859405_6790449466385685577_n_up7vsj.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114538/143419219_417262142859405_6790449466385685577_n_up7vsj.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114537/93111086_160039198607060_521601244034145848_n_npv0rz.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114537/143298841_408109000466501_6288578466775937880_n_ake44c.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114537/93250888_243169743541035_2511296344236170984_n_ltndgu.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114537/142705010_242600594122797_4752947109313025475_n_bnuhf6.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114537/143000440_233171905021189_3152282343104995456_n_fsqd06.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114537/93062479_1098241067205898_8330812504384800868_n_o0tuhe.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114537/142540986_159834329241425_931522751644786159_n_fpoidl.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114537/141045924_507160406929118_226342412243133747_n_amlxen.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114537/141273994_442000350501690_2582096891001662440_n_jaghhi.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114536/132878373_734895814098709_7441318269299022871_n_rwyei7.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114536/133011969_127719779078943_6156268190468945852_n_kknwn2.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114537/141775899_3966368033407807_2331242259078898222_n_osssbv.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114536/132878373_734895814098709_7441318269299022871_n_rwyei7.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114537/141775899_3966368033407807_2331242259078898222_n_osssbv.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114536/132947240_719362925680458_8632009360894884200_n_s5jbrv.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114536/135508543_213429917169990_4093102751883558376_n_lfsk2j.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114536/132301532_1861878140634582_754214142246478097_n_ya3mkr.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114536/132261482_2224836224327508_5838686583118188899_n_xtxblu.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114536/133100644_225369825747306_3061881705667526391_n_zl130f.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114536/132027763_670960923601370_8079775276219598712_n_jnywci.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114535/131983709_184530646723691_6268729215256565808_n_vkjahg.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114535/131933586_713305592637990_6992951426977937312_n_tj2mtw.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114535/92849275_850333588804966_4751090158041100748_n_leuenr.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114534/124184138_127051745596080_7219467660719409723_n_jvhytv.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114535/131915457_791773015067946_5623875471232428083_n_w74szx.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114535/129761542_908963116540253_5420195707085208599_n_wdqhev.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114535/127110012_133310501605669_1198232860855161980_n_s8eb7j.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114535/124701682_198787571697345_8492606519673612552_n_osxtsc.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114535/92569459_154743092528912_7218564720138590068_n_kdqost.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114535/92801935_149570596474407_6677323975928199762_n_wjnwgp.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114534/123775738_481924959449818_3653121893218281965_n_qrsxes.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114534/92438694_2637330113253770_9208725990511931906_n_ycj9yk.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114534/123796811_113627413762920_5667601984179552681_n_si0vz3.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114535/124407892_411924933147299_1939116883393029443_n_cde8wd.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114534/124401379_186200589801581_3425546110368572512_n_odgxyx.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114533/92370494_3107928559227015_7370728714484723756_n_xwcmbz.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114534/123500657_3500334283346845_921586720535684049_n_rcjmt0.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114534/124394799_3574063002615000_6119407349031378555_n_jcoezp.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114534/123533382_685416362360521_5509818279705597362_n_b7qpwm.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114533/123361659_399550174758524_8941246153222471208_n_wwpnow.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114533/123245421_2449869468641928_2392097495430066878_n_z338iy.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114533/123127484_4075967955752998_7232492322833318727_n_ifmotz.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114531/92333708_130972278494608_5999356963203486091_n_goambo.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114531/92333708_130972278494608_5999356963203486091_n_goambo.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114533/121827305_645323082795965_790576900339457063_n_c3hnxq.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114533/122426426_377975130019831_1185105199693242254_n_iqvctu.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114532/121200687_188002919507496_7868488231481903670_n_gao3qn.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114532/119234161_635794170700905_4505955060665698124_n_i3odzx.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114533/121578565_768829147302700_6250475033472143713_n_oqutwq.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114532/121004844_627145161498217_5164366407920911425_n_o4jrdw.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114532/119682362_376589253744730_8512175728369597495_n_bfvsdw.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114532/119206530_1475838975953646_5594823321906990942_n_du1plp.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114532/119048487_657786608495364_3385431370960918079_n_btxvpk.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114531/117312651_167110451608308_7833939323242219547_n_rcafkr.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114532/119077928_362003454979171_7012521027206361303_n_uaf7ec.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114532/92129730_2968907779902743_337817914631409101_n_rmjgsk.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114532/119048058_375720333440395_1484523018220414936_n_p7c2ig.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114532/119071332_1519157624949275_3337666168556622660_n_oxa5gn.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114532/92369460_154355992727073_4163346330459611012_n_txv7wo.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114531/118953233_330901931482366_7744538999207721507_n_bdlhv3.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114531/117727395_634153563880346_9105621556540671313_n_x0rb15.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114531/116574157_574044999903220_708645092124760693_n_glsmug.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114531/92181093_256333458737872_908590920056173254_n_vashjk.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114531/117682811_698510127370381_2223800807705151159_n_psmzbt.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114531/115997722_3451556318197140_8402203912436132115_n_rcs5j8.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114530/115965330_293191115259250_1457571804867348932_n_ghpdnr.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114530/92243526_1329085587289955_4712858199019584619_n_ypyxug.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114530/115909632_1056354674782236_3133030393784617803_n_ymj8hu.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114530/115791711_285476126060146_1243538613462932493_n_vtp3r3.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114530/110559773_115687760033080_1749235470998193311_n_kmripc.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114530/114891772_693089454867592_1056675815134553797_n_x3g5fs.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114530/110307338_207659030625347_1805846611220732973_n_dgokgp.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114529/109341359_279685189763093_531842423255465358_n_rcuxu1.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114530/115430969_180071237016632_847628634009015094_n_omral8.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114530/109570838_1016960715413839_284059808367766501_n_afpvja.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114529/108862845_624356768474664_8873932035786138996_n_gns7kv.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114530/115430969_180071237016632_847628634009015094_n_omral8.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114529/108862845_624356768474664_8873932035786138996_n_gns7kv.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114529/92028386_722075541660490_9092881588018368787_n_rrcyur.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114529/109407712_323602012143106_7316503809656426774_n_zb9vv6.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114529/109407712_323602012143106_7316503809656426774_n_zb9vv6.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114529/108934345_1138485596508879_5214621401052444259_n_efgjou.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114529/108558209_157428222530568_7632272999828622552_n_ymhcrl.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114529/91711897_148129419918328_4589398360874021606_n_rwvims.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114528/91492318_133666834868994_1752361254282862752_n_nmt1hr.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114528/90089857_240321253677341_441721865494620522_n_m4bjcy.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114528/91530205_924018588051661_2126394028404659199_n_isfwoq.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114528/107915803_282076222853961_7223753670306313484_n_xckvuq.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114528/90089857_240321253677341_441721865494620522_n_m4bjcy.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114528/91530205_924018588051661_2126394028404659199_n_isfwoq.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114528/106719169_612172836093902_7385280950122371752_n_lujzzq.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114528/107376651_625219364764434_9050128438994773917_n_dqmmmm.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114528/106712556_162677111980642_5162449833134694744_n_up9pwl.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114526/103396631_317741329220425_7322654092849032605_n_tdfga8.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114527/91224223_261469061530555_3881905083554059133_n_1_izo0a9.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114527/106493790_651467185447334_5639202926725063165_n_o3wwuw.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114527/104418273_283643353008891_5570758969376844220_n_dwp1t1.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114527/103979164_758173801387021_3571789237063397057_n_z6s0yf.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114527/103823916_730850667481345_5542291606989472612_n_x2wzy1.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114527/103918077_1153258655034357_4948168413379443172_n_t5otpv.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114527/103431943_3434909583199568_7805189921061517298_n_eafl3u.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114526/103276651_267469067836509_5296029422484467585_n_dwje2g.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114526/103067079_259352765277050_7951211833783310887_n_z846kw.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114525/102873154_582031235784998_6450227634326983805_n_ge5aoo.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114525/102836932_266275577947133_6863569058925184043_n_nxrf2t.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114525/102815291_184426979688712_1646741560532848048_n_bfr2cn.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114525/91073688_672796049958798_6991501156431595136_n_nai7jc.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114525/102458172_278426446688503_8957086763011560635_n_alrpex.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114524/102407015_194981618395569_2868064584296833443_n_innuic.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114525/102677244_710430572833586_6261355223572047222_n_bwd0d8.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114524/90332273_2256239514684939_6662030624116531096_n_bz51ey.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114525/102652437_551645365500463_6087892705350442346_n_un03zv.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114524/102379070_181774979904723_4282654608447144733_n_bdxjmg.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114524/101986585_281374436378782_4366728202798483478_n_srp6bb.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114524/101941587_1456192674567579_6045427269145026746_n_yu8t5a.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114524/101940861_654881165102595_8020022872515006224_n_y9cy4h.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114523/90834874_2468295416833429_6410886339205598106_n_iomfbq.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114523/101547866_279721373399592_7738711905032382547_n_pckpjl.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114524/91061857_203310197783368_2529378057693394474_n_bsobqk.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114524/101562219_2959119550848923_2106488510795408167_n_o88tbp.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114523/101543183_881404729035701_9081214410006629457_n_brn6gp.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114523/101351797_346274756352154_5884149191039073577_n_rge2x7.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114522/98262536_248291369917789_4159803722126745648_n_zmua4o.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114523/101407858_274984417031850_6490760581777346377_n_uji3wu.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114523/101351797_346274756352154_5884149191039073577_n_rge2x7.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114522/98262536_248291369917789_4159803722126745648_n_zmua4o.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114523/90306543_1078138915899050_1794778317749676883_n_stmkn4.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114523/101407858_274984417031850_6490760581777346377_n_uji3wu.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114522/90481206_519567488602968_6622046991501553124_n_xd7uzs.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114522/97221318_666395444144162_5093384902625910356_n_n7rq46.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114521/97072794_241995223792470_2920510705210207599_n_vvrmmc.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114522/97148493_947974878991450_5474468267972302560_n_upw3kv.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114522/97160813_155150582687336_8955303703047446928_n_j8djdi.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114522/97968163_292924231724551_6429525564009968750_n_lep0hh.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114521/96936605_2624891057782182_7719094322882043687_n_ydzzcq.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114521/97142968_136219904650380_9066277796870559726_n_u6g6vk.jpg");
        imgArrylist.add("https://res.cloudinary.com/dsqmxzs9z/image/upload/v1626114521/97134271_275988010113672_417096261625316263_n_m8ncgk.jpg");



        rcvMain=findViewById(R.id.rcvMain);
        rcvMain.setLayoutManager(new GridLayoutManager(this,2));
        RecyclerViewAdapter recyclerViewAdapter=new RecyclerViewAdapter(SecongPage.this,imgArrylist);
        rcvMain.setAdapter(recyclerViewAdapter);
    }


    }
