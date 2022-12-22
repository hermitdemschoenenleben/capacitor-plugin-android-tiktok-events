package app.blindmate.plugins.tiktokevents;

import com.tiktok.TiktokBusinessSdk;
import com.tiktok.TiktokBusinessSdk.TTConfig;


import android.util.Log;

public class AndroidTiktokEvents {

    public String echo(String value) {
        Log.i("Echo", value);
        return value;
    }

    public prepare() {
        Log.i("Initialize Tiktok Events Bridge");
        // Set AppId & TikTok App ID in application code, and customize the
        // configurations.

        TTConfig ttConfig = new TTConfig(getApplicationContext())
                .setAppId("eu.appiphany.blindmate") // Android package name or iOS listing ID, eg: com.sample.app (from EM) or 9876543 (from EM)
                .setTTAppId(THE_TT_APP_ID) // TikTok App ID from EM
                //.disableAdvertiserIDCollection() // disables gaid collection
                .disableAutoEvents() // opt out of automatically tracking InstallApp, LaunchApp, and 2Dretention events
                //.disableInstallLogging() // Disable auto tracking InstallApp
                //.disableLaunchLogging() // Disable auto tracking LaunchApp
                //.disableRetentionLogging() // Disable auto tracking 2Dretention
                .setLogLevel(TikTokBusinessSdk.LogLevel.DEBUG); // prints debug log

        TiktokBusinessSdk.initializeSdk(ttConfig);

        // TikTok business SDK will actually start sending app events to
        // marketing API when startTrack() function is called. Before this
        // function is called, app events are merely stored locally. Delay
        // calling this function if you need to let the user agree to data terms
        // before actually sending the app events to TikTok.
        TiktokBusinessSdk.startTrack();
    }

    public logEvent(String event) {
      Log.i("Tiktok Events Bridge: Log", event);

      TiktokBusinessSdk.trackEvent(event);
    }
}
