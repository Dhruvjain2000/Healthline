package com.example.android.healthline;

import android.os.AsyncTask;

import com.google.android.gms.maps.GoogleMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class GetNearbyPlaces extends AsyncTask<Object,String,String>{

    GoogleMap mMap;
    String url;
    StringBuilder stringBuilder;
    BufferedReader bufferedReader;
    InputStream is;
    String data;
    @Override
    protected String doInBackground(Object... params) {

        mMap=(GoogleMap)params[0];
        url=(String)params[1];

        URL myurl= null;
        try {
            myurl = new URL(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        HttpURLConnection httpURLConnection= null;
        try {
            httpURLConnection = (HttpURLConnection)myurl.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            httpURLConnection.connect();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            is=httpURLConnection.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        bufferedReader =new BufferedReader(new InputStreamReader(is));

    String line=" ";
    stringBuilder = new StringBuilder();

    data=stringBuilder.toString();


        return data;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }
}
