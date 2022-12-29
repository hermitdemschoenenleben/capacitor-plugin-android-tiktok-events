package app.blindmate.plugins.tiktokevents;

import android.util.Log;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;


@CapacitorPlugin(name = "AndroidTiktokEvents")
public class AndroidTiktokEventsPlugin extends Plugin {
    private static final String PLUGIN_TAG = "AndroidTiktokEvents";

    private AndroidTiktokEvents implementation = new AndroidTiktokEvents();

    @PluginMethod
    public void prepare(PluginCall call) {
        JSObject ret = new JSObject();

        String androidPackageName = getConfig().getString("androidPackageName");
        String tiktokAppID = getConfig().getString("tiktokAppID");

        Log.i(
          PLUGIN_TAG,
          "config is " + androidPackageName + tiktokAppID
        );

        implementation.prepare(
          this.getActivity().getApplicationContext(),
          androidPackageName,
          tiktokAppID
        );
        call.resolve(ret);
    }

    @PluginMethod
    public void logEvent(PluginCall call) {
        String event = call.getString("event");

        Log.i(PLUGIN_TAG, event);

        JSObject ret = new JSObject();
        implementation.logEvent(event);
        call.resolve(ret);
    }
}
