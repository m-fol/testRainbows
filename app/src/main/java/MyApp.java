import android.app.Application;

import com.ale.rainbowsdk.RainbowSdk;

public class MyApp extends Application {

    public void onCreate() {
        super.onCreate();
        RainbowSdk.instance().initialize(this, "YOUR_APP_ID", "YOUR_APP_SECRET");
    }
}
