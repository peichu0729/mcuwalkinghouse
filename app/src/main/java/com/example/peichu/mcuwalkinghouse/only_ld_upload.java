package com.example.peichu.mcuwalkinghouse;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class only_ld_upload extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_only_ld_upload);
    }
    public void gotopicture(View v){
        Intent it=new Intent(this,only_ld_picture.class);
        startActivity(it);
    }

}
