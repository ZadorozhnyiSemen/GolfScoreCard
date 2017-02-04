package com.example.anastasia.golfscorecard;

import android.app.ListActivity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

public class MainActivity extends ListActivity {

    private static final String PREFS_FILE = "bla.bla.preferences";
    private Hole[] mHoles = new Hole[18];
    private ListAdapter mListAdapter;
    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor mEditor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSharedPreferences = getSharedPreferences(PREFS_FILE, Context.MODE_PRIVATE);
        mEditor = mSharedPreferences.edit();

        int strokes = 0;
        for (int i = 0; i < mHoles.length; i++) {
            mHoles[i] = new Hole("Hole " + (i + 1) + " :", strokes);

            mListAdapter = new ListAdapter(this, mHoles);
            setListAdapter(mListAdapter);
        }
    }
}
