package app.blindmate.plugins.tiktokevents;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "AndroidTiktokEvents")
public class AndroidTiktokEventsPlugin extends Plugin {

    private AndroidTiktokEvents implementation = new AndroidTiktokEvents();

    @PluginMethod
    public void echo(PluginCall call) {
        String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("value", implementation.echo(value));
        call.resolve(ret);
    }

    @PluginMethod
    public void prepare(PluginCall call) {
        JSObject ret = new JSObject();
        implementation.prepare();
        call.resolve(ret);
    }

    @PluginMethod
    public void logEvent(PluginCall call) {
        String event = call.getString("event");
        JSObject ret = new JSObject();
        implementation.logEvent(event);
        call.resolve(ret);
    }
}
