package com.example.gal.test;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.ChangeBounds;
import android.transition.Explode;
import android.transition.Fade;
import android.view.View;
import android.view.Window;

/**
 * Created by gal on 15/03/2016.
 */
public class Bla extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        setContentView(R.layout.bla);
    }
    public void bla(View v){
        getWindow().setExitTransition(new ChangeBounds());
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent,
                ActivityOptions
                        .makeSceneTransitionAnimation(this).toBundle());
    }
}
