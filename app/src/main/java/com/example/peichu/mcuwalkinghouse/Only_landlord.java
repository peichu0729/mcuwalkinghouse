package com.example.peichu.mcuwalkinghouse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Only_landlord extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_only_landlord);
    }
    public void gotomanage(View v){
        Intent it=new Intent(this,only_ld_manage.class);
        startActivity(it);
    }
    public void gotoupload(View v){
        Intent it=new Intent(this,only_ld_upload.class);
        startActivity(it);
    }
}
