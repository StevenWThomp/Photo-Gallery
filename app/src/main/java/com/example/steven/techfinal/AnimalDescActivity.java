package com.example.steven.techfinal;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AnimalDescActivity extends AppCompatActivity {

    // TODO: 4/30/18 Turn imageViews into imageButtons that take the user to this activity when tapped
    public static Intent newIntent(Context packageContext, int pictureId) {
        Intent intent = new Intent(packageContext, AnimalDescActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_desc);
    }
}
