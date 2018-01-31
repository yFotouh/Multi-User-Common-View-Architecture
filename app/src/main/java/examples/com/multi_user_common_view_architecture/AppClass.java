package examples.com.multi_user_common_view_architecture;

import android.app.Application;
import android.content.Context;

/**
 * Created by youssef2016 on 31/1/2018.
 */

public class AppClass extends Application {
    private static AppClass appClass;

    @Override
    public void onCreate() {
        super.onCreate();
        appClass = this;
    }

    public static final AppClass getAppClass() {
        return appClass;
    }
}
