package top.alision.hybridframework;

import com.vivavideo.mobile.h5api.api.H5Bundle;
import com.vivavideo.mobile.h5api.api.H5Context;
import com.vivavideo.mobile.h5api.api.H5Param;
import com.vivavideo.mobile.h5api.api.H5PluginConfig;
import com.vivavideo.mobile.h5api.api.H5Service;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import top.alision.hybridframework.coustom.H5CustomPlugin;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.start_page).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HybridFrameworkApplication hybridFrameworkApplication = (HybridFrameworkApplication) getApplication();
                H5Service h5Service = hybridFrameworkApplication.getH5Service();
                H5Bundle h5Bundle = new H5Bundle();
                Bundle bundle = new Bundle();
                bundle.putString(H5Param.LONG_URL,"http://192.168.2.40:8000/hybrid/");
                bundle.putBoolean(H5Param.LONG_PULL_REFRESH,true);
                h5Bundle.setParams(bundle);
                h5Service.startPage(new H5Context(getApplicationContext()),h5Bundle);
            }
        });

        findViewById(R.id.coustom_start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 1. 获取到H5Service
                HybridFrameworkApplication hybridFrameworkApplication = (HybridFrameworkApplication) getApplication();
                H5Service h5Service = hybridFrameworkApplication.getH5Service();

                // 2. inspect Custom Plugin
                H5PluginConfig h5PluginConfig = new H5PluginConfig();
                h5PluginConfig.className = H5CustomPlugin.class.getName();
                h5Service.addPluginConfig(h5PluginConfig);
                // 3. 准备好启动参数
                H5Bundle h5Bundle = new H5Bundle();
                Bundle bundle = new Bundle();
                bundle.putString(H5Param.LONG_URL,"http://192.168.2.40:8000/custom/");
                bundle.putBoolean(H5Param.LONG_PULL_REFRESH,true);
                h5Bundle.setParams(bundle);
                // 4. startPage
                h5Service.startPage(new H5Context(getApplicationContext()),h5Bundle);
            }
        });
    }
}
