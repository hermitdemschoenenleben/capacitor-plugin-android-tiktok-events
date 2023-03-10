package app.blindmate.plugins.tiktokevents;

import android.util.Log;

import android.content.Context;
import com.tiktok.TikTokBusinessSdk;
import com.tiktok.TikTokBusinessSdk.TTConfig;


public class AndroidTiktokEvents {

    public void prepare(Context applicationContext, String androidPackageName, String tiktokAppID) {
        // Set AppId & TikTok App ID in application code, and customize the
        // configurations.

        TTConfig ttConfig = new TTConfig(applicationContext)
                .setAppId(androidPackageName) // Android package name or iOS listing ID, eg: com.sample.app (from EM) or 9876543 (from EM)
                .setTTAppId(tiktokAppID) // TikTok App ID from EM
                //.disableAdvertiserIDCollection() // disables gaid collection
                .disableAutoEvents() // opt out of automatically tracking InstallApp, LaunchApp, and 2Dretention events
                //.disableInstallLogging() // Disable auto tracking InstallApp
                //.disableLaunchLogging() // Disable auto tracking LaunchApp
                //.disableRetentionLogging() // Disable auto tracking 2Dretention
                .setLogLevel(TikTokBusinessSdk.LogLevel.NONE); // DEBUG to print debug log

        TikTokBusinessSdk.initializeSdk(ttConfig);

        // TikTok business SDK will actually start sending app events to
        // marketing API when startTrack() function is called. Before this
        // function is called, app events are merely stored locally. Delay
        // calling this function if you need to let the user agree to data terms
        // before actually sending the app events to TikTok.
        TikTokBusinessSdk.startTrack();
    }

    public void logEvent(String event) {
      TikTokBusinessSdk.trackEvent(event);
    }
}
