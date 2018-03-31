package com.aarushi.crime_mappingapp.utility;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by megha on 30/03/18.
 */

public class PreferenceManagerUtils {

    public static String PREFERENCE_NAME = "RakshakArohan";

    private SharedPreferences mPref;
    private SharedPreferences.Editor mEditor;
    private Context mContext;

    //Required constructor
    public PreferenceManagerUtils(Context mContext) {
        this.mContext = mContext;
        mPref = mContext.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE);
        mEditor = mPref.edit();
    }

    public void storeImagePath(String path){
        mEditor.putString("path", path);
        mEditor.apply();
    }

    public String getImagePath() {
        return mPref.getString("path",null);
    }

    public void login(String username){
        mEditor.putString("username", username);
        mEditor.putBoolean("logged_in", true);
        mEditor.apply();
    }

    public String getUsername(){
        return mPref.getString("username",null);
    }

    public boolean isLogin(){
        return mPref.getBoolean("logged_in", false);
    }

}
