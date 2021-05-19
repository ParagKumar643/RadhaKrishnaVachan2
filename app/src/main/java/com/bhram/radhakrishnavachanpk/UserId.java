package com.bhram.radhakrishnavachanpk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class UserId extends AppCompatActivity {

Button videoBtn , photoBtn ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_id);




        videoBtn = findViewById(R.id.videobtn);
        photoBtn = findViewById(R.id.photobtn);

        videoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UserId.this,MainActivity.class));
                Toast.makeText(UserId.this,"Swipe up",Toast.LENGTH_SHORT).show();
            }
        });

        photoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UserId.this,"Swipe Right",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(UserId.this,PhotoActivity.class));            }
        });

}
}