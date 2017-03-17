package top.alision.hybridframework;

import com.dynamicload.framework.framework.VivaApplication;
import com.dynamicload.framework.util.FrameworkUtil;
import com.vivavideo.mobile.h5api.api.H5Service;

import android.app.Application;

/**
 * Description:
 * Data：17/03/2017-2:25 PM
 * Author: Mark
 */

public class HybridFrameworkApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FrameworkUtil.setContext(getApplicationContext());
        FrameworkUtil.prepare();
    }

    public H5Service getH5Service() {
        return VivaApplication.getInstance().getMicroApplicationContext()
                .findServiceByInterface(H5Service.class.getName());
    }
}
