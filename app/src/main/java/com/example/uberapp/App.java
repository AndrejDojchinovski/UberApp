package com.example.uberapp;
import com.parse.Parse;
import android.app.Application;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("rOw4THNNgkqienTb7fuRs49VqRnHDgsd6LveE3mY")
                // if defined
                .clientKey("ZGeMDQXgn9zcuJQgHtuyTBNSuatNgDjxR9sScCyv")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}