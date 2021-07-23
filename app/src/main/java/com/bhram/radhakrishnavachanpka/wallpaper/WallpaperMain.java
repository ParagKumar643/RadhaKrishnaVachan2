package com.bhram.radhakrishnavachanpka.wallpaper;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.bhram.radhakrishnavachanpka.R;
import com.nabinbhandari.android.permissions.PermissionHandler;
import com.nabinbhandari.android.permissions.Permissions;

import java.io.File;
import java.util.ArrayList;

public class WallpaperMain extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wallpapermain);

        String[] permissions = { Manifest.permission.WRITE_EXTERNAL_STORAGE};
        Permissions.check(this/*context*/, permissions, null/*rationale*/, null/*options*/, new PermissionHandler() {
            @Override
            public void onGranted() {
                File f = new File(Environment.getExternalStorageDirectory() + "Radhe Radhe");

                if (!f.exists()) {
                    f.mkdirs();
                    f.mkdir();
                }

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Intent mainintent = new Intent(WallpaperMain.this, SecongPage.class);
                        startActivity(mainintent);
                        finish();

                    }
                }, 2000);

            }

            @Override
            public void onDenied(Context context, ArrayList<String> deniedPermissions) {
                super.onDenied(context, deniedPermissions);
                finish();
            }
        });




    }
}