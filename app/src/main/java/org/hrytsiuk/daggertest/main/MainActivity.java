package org.hrytsiuk.daggertest.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.hrytsiuk.daggertest.App;
import org.hrytsiuk.daggertest.R;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    DatabaseHelper databaseHelper;

    @Inject
    NetworkUtils networkUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        App.getComponent().injectsMainActivity(this);
    }
}
